package dao;

import conexao.ConnectionException;
import conexao.ConnectionFactory;
import entidade.Jogador;
import interfaces.JogadorDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/** 
 * @author carlos
 **/
public class JogadorDAOImpl implements JogadorDAO {

    private Connection connection;

    public JogadorDAOImpl() throws ConnectionException, SQLException {
        this.connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public Jogador recuperaJogador(int id) throws SQLException {

        PreparedStatement statement = connection.prepareStatement("select * from jogador where id = ?");
        statement.setInt(1, id);
        statement.execute();
        Jogador jogador = null;

        while (statement.getResultSet().next()) {
            jogador = new Jogador();
            jogador.setId(statement.getResultSet().getInt("id"));
            jogador.setNome(statement.getResultSet().getString("nome"));
            jogador.setTipoJogo(statement.getResultSet().getString("tipoJogo"));
            jogador.setPontuação(statement.getResultSet().getInt("pontuação"));
            jogador.setDataHoraJogo(statement.getResultSet().getDate("dataHoraJogo"));


        }

        return jogador;
    }

    @Override
    public void adicionaJogador(Jogador jogador) throws SQLException {

        PreparedStatement statement = connection.prepareStatement("insert into jogador(nome, tipo, pontuacao, data) values(?, ?, ? ,?)");
        statement.setString(1, jogador.getNome());
        statement.setString(2, jogador.getTipoJogo());
        statement.setInt(3, jogador.getPontuação());
        statement.setDate(4, (Date) jogador.getDataHoraJogo());
        statement.executeUpdate();

    }

    @Override
    public List<Jogador> listarJogadores() throws SQLException {

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from jogador");

        List<Jogador> jogadores = new ArrayList<Jogador>();

        while (resultSet.next()) {

            Jogador jogador = new Jogador();
            jogador.setId(statement.getResultSet().getInt("id"));
            jogador.setNome(statement.getResultSet().getString("nome"));
            jogador.setTipoJogo(statement.getResultSet().getString("tipoJogo"));
            jogador.setPontuação(statement.getResultSet().getInt("pontuação"));
            jogador.setDate(statement.getResultSet().getDate("dataHoraJogo"));

        }
        return jogadores;


    }

    @Override
    public void atualizarJogador(Jogador jogador) throws SQLException {
        
        PreparedStatement statement = connection.prepareStatement("update jogador set nome = ?, tipoJogo = ?, pontuação = ?, dataHoraJogo = ? where id = ?");
        statement.setInt(5, jogador.getId());
        statement.setString(1, jogador.getNome());
        statement.setString(2, jogador.getTipoJogo());
        statement.setInt(3, jogador.getPontuação());
        statement.setDate(4, (Date) jogador.getDataHoraJogo());
        statement.executeUpdate();
    }

    @Override
    public void removerJogador(int id) throws SQLException {

        PreparedStatement statement = connection.prepareStatement("delete from jogador where id = ?");
        statement.setInt(1, id);
        statement.executeUpdate();

    }

    @Override
    public Jogador recuperarJogadorPorNome(String nome) throws SQLException {

        PreparedStatement statement = connection.prepareStatement("select * from jogador where nome = ?");
        statement.setString(1, nome);
        Jogador jogador = null;

        while (statement.getResultSet().next()) {
            jogador = new Jogador();
            jogador.setId(statement.getResultSet().getInt("id"));
            jogador.setNome(statement.getResultSet().getString("nome"));
            jogador.setTipoJogo(statement.getResultSet().getString("tipoJogo"));
            jogador.setPontuação(statement.getResultSet().getInt("pontuação"));
            jogador.setDataHoraJogo(statement.getResultSet().getDate("dataHoraJogo"));

        }
        return jogador;
    }
}
