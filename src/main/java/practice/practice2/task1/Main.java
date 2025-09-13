package practice.practice2.task1;

/**
 * Реализовать Singleton для управления конфигурацией приложения
 * Описание
 * В приложении необходимо создать класс ConfigurationManager, который будет управлять настройками приложения, такими как:
 *  - Параметры подключения к базе данных (например, URL базы данных, имя пользователя, пароль).
 *  - Путь к папке для хранения файлов.
 *  - Настройки логирования (например, уровень логирования, путь к лог-файлу).
 * Класс ConfigurationManager должен быть реализован по паттерну Singleton, чтобы в приложении был только один
 * экземпляр этого класса, который будет предоставлять доступ к конфигурационным данным.
 */

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();

        configManager1.setDatabaseUrl("jdbc:mysql://localhost:3306/mydb");
        configManager1.setDatabaseUsername("admin");
        configManager1.setDatabasePassword("password");
        configManager1.setFilesDirectory("/var/files");
        configManager1.setLogLevel("INFO");
        configManager1.setLogFilePath("/var/log/app.log");

        System.out.println(configManager1.getDatabaseUrl());
        System.out.println(configManager2.getDatabaseUrl());

        configManager1.displayConfiguration();
    }
}