package practice.complexTasks.task1;

import java.sql.*;

public class DatabaseUrlStorage implements UrlStorage {
    private static DatabaseUrlStorage instance;
    private final String url;
    private final String username;
    private final String password;

    private DatabaseUrlStorage(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        initializeDatabase();
    }

    public static synchronized DatabaseUrlStorage getInstance(String url, String username, String password) {
        if (instance == null) {
            instance = new DatabaseUrlStorage(url, username, password);
        }
        return instance;
    }

    @Override
    public void save(String longUrl, String shortUrl) {
        try (Connection conn = getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO urls (long_url, short_url) VALUES (?, ?)");
            stmt.setString(1, longUrl);
            stmt.setString(2, shortUrl);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getShortUrl(String longUrl) {
        try (Connection conn = getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("SELECT short_url FROM urls WHERE long_url = ?");
            stmt.setString(1, longUrl);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("short_url");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getLongUrl(String shortUrl) {
        try (Connection conn = getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("SELECT long_url FROM urls WHERE short_url = ?");
            stmt.setString(1, shortUrl);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("long_url");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    private void initializeDatabase() {
        try (Connection conn = getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("CREATE TABLE IF NOT EXISTS urls (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "long_url VARCHAR(2000) UNIQUE," +
                    "short_url VARCHAR(255) UNIQUE)");
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
