package br.edu.ifpb.tcc;

import conexao.ConnectionException;
import dao.JogadorDAOImpl;
import entidade.Jogador;
import interfaces.JogadorDAO;
import java.sql.Date;
import java.sql.SQLException;

/**
 * @author carlos
 */

public class App {
    public static void main(String[] args) throws ConnectionException, SQLException {
        Jogador jogador = new Jogador("Mestreee", 1, "memoria", 222,  new Date(1L));
        JogadorDAO dao = new JogadorDAOImpl();
        
        

                
        
        
    }
    
}
