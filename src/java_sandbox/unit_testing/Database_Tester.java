package java_sandbox.unit_testing;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Example unit test for database transactions
 * @author christensenst
 */
public class Database_Tester
{
    public static void main(String[] args) throws SQLException
    {
        //uses try-with-resources, new in Java SE 7
        //ensure that the database driver jar is added to the project
        try
        (Connection conn = Backend.getConnection())
        {
            Statement stat = conn.createStatement();
            stat.execute("CREATE table Test (Name VARCHAR(20))");
            stat.execute("INSERT INTO Test VALUES ('Bruce')");
            ResultSet result = stat.executeQuery("SELECT * FROM Test");
            result.next();
            System.out.println(result.getString("Name"));
            stat.execute("DROP TABLE Test");
        }
    }
}
