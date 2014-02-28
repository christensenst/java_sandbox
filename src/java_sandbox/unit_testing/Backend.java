package java_sandbox.unit_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class contains url, username, and password for accessing a PostgreSQL
 * database used for exploring test doubles for database transactions.
 * @author christensenst
 */
public class Backend {
    private static String url;
    private static String username;
    private static String password;
    
    /*
     * Establish connect for PostgreSQL database
     */
    public static Connection getConnection() throws SQLException {
        url = "jdbc:postgresql://localhost:5432/java_sandbox_testing";
        username = "postgres";
        password = "postgres";
        return DriverManager.getConnection(url, username, password);
    }
}
