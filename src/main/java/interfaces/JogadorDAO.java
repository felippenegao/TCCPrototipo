/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidade.Jogador;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author carlos
 */
public interface JogadorDAO {
    
    public Jogador recuperaJogador(int id) throws SQLException;
    public void adicionaJogador(Jogador jogador) throws SQLException;
    public List<Jogador> listarJogadores() throws SQLException;
    public void atualizarJogador(Jogador jogador) throws SQLException;
    public void removerJogador(int id) throws SQLException;
    public Jogador recuperarJogadorPorNome(String nome) throws SQLException;
}

