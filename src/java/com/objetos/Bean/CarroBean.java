package com.objetos.Bean;

import com.objetos.entidades.Carro;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import src.DAO.CarroDAO;

@ManagedBean
@SessionScoped
public class CarroBean {
   
    private Carro carro = new Carro();
    private List<Carro> carros = new ArrayList<>();
    
    public void adicionar()  {
        
        try {
            carros.add(carro);
            new CarroDAO().salvar(carro);
            carro = new Carro();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarroBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarroBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    
    
    
    }
    
    
    
    
    

