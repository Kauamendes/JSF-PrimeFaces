package carros.util;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;


public class FabricaConexao {
    
    private static Connection conexao;
    private static final String URL_CONEXAO="jdbc:postgresql://localhost:5432/jsf-primefaces";
    private static final String USUARIO="postgres";
    private static final String SENHA="branet1701";
    
    

    public static Connection getConexao() throws ClassNotFoundException, SQLException {
        if(conexao == null) {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection(URL_CONEXAO, USUARIO, SENHA);
        }
        return conexao;
    }
    
    public static void fecharConexao() {
        if(conexao !=null) {
            try {
                conexao.close();
                conexao = null;
            } catch (SQLException ex) {
                        
            }
 
        }
    }
    
}
