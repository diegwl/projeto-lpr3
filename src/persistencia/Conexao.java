package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/java2";
    private static final String USER = "root";
    private static final String PASS = "root";
    public static Connection getConexao() {
        try {
            Connection c = DriverManager.getConnection(URL, USER, PASS);
            return c;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
