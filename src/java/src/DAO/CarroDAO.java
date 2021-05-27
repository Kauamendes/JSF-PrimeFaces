package src.DAO;

import carros.util.FabricaConexao;
import com.objetos.entidades.Carro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CarroDAO {
    
    public void salvar(Carro carro) throws ClassNotFoundException, SQLException {
        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement ps = conexao.prepareCall("INSERT INTO carros (modelo,cor,ano,fabricante`) VALUES (? ,? ,? ,?)" );
        ps.setString(1, carro.getModelo());
        ps.setString(1, carro.getFabricante());
        ps.setString(1, carro.getCor());
        ps.setInt(4, carro.getAno());
        ps.execute();
        FabricaConexao.fecharConexao();
    }
    
}
