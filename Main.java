import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        // Database url
        String url = "jdbc:mysql://localhost:3306/students";

        //Database Credentials
        String Username = "root";
        String Password = "lotus";

        //Establish the connection
        try(Connection connection = DriverManager.getConnection(url,Username, Password)){
            System.out.println("Connected to the database");
            // Perform database opetations here

        }
        catch(SQLException e) {
            System.err.println("Connection Failed: "+ e.getMessage());

        }

        Exceptionhandling yu = new Exceptionhandling();
        yu.exp();
    }
}