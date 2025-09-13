package practice.practice2.task1;

/**
 * - Параметры подключения к базе данных (например, URL базы данных, имя пользователя, пароль).
 * - Путь к папке для хранения файлов.
 * - Настройки логирования (например, уровень логирования, путь к лог-файлу).
 */

public class ConfigurationManager {
    private String databaseUrl = "";
    private String databaseUsername = "";
    private String databasePassword = "";

    private String filesDirectory = "";

    private String logLevel = "INFO";
    private String logFilePath = "";

    private static ConfigurationManager instance;

    private ConfigurationManager() {

    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getDatabaseUsername() {
        return databaseUsername;
    }

    public void setDatabaseUsername(String databaseUsername) {
        this.databaseUsername = databaseUsername;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    public void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }

    public String getFilesDirectory() {
        return filesDirectory;
    }

    public void setFilesDirectory(String filesDirectory) {
        this.filesDirectory = filesDirectory;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public void loadConfigurationFromFile(String filePath) {
        System.out.println("Загрузка конфигурации из файла: " + filePath);
    }

    public void saveConfigurationToFile(String filePath) {
        System.out.println("Сохранения конфигурации в файл: " + filePath);
    }

    public void displayConfiguration() {
        System.out.println("=== Конфигурация приложения ===");
        System.out.println("Параметры БД:");
        System.out.println("  URL: " + databaseUrl);
        System.out.println("  Пользователь: " + databaseUsername);
        System.out.println("  Пароль: " + (databasePassword.isEmpty() ? "не задан" : "***"));

        System.out.println("Директория файлов: " +
                (filesDirectory.isEmpty() ? "не задана" : filesDirectory));

        System.out.println("Настройки логирования:");
        System.out.println("  Уровень: " + logLevel);
        System.out.println("  Путь к лог-файлу: " +
                (logFilePath.isEmpty() ? "не задан" : logFilePath));
        System.out.println("==============================");
    }


}