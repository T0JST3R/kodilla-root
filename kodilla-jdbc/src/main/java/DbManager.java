import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection conn;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException {
        Properties connectionprops = new Properties();
        connectionprops.put("user", "root");
        connectionprops.put("password", "Haslo");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodilla_advancedmysql?serverTimezone=Europe/Warsaw" + "&useSSL=False", connectionprops);
    }

    public static  DbManager getInstance() throws SQLException{
        if (dbManagerInstance == null){
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnection(){
        return conn;
    }
}
