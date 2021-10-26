import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJDBC {

    public static void main(String[] args) throws SQLException {

        String urlConnection = "jdbc:mysql://localhost/";
        Connection conn = null;

        try {
             conn = DriverManager.getConnection(urlConnection,"root","root");
            System.out.println("conectado");
        }catch (Exception e){
            System.out.println("falhou");
        }
        finally {
            conn.close();
        }

    }

}
