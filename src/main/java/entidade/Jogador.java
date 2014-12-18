package entidade;

import java.util.Date;

/**
 * @author carlos
 */
public class Jogador {
    
    private int id;
    private String nome;
    private String tipoJogo;
    private int pontuação;
    private Date dataHoraJogo;

    public Jogador() {
    }

    public Jogador(String nome, int id, String tipoJogo, int pontuação, Date dataHoraJogo) {
        this.nome = nome;
        this.id = id;
        this.tipoJogo = tipoJogo;
        this.pontuação = pontuação;
        this.dataHoraJogo = dataHoraJogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoJogo() {
        return tipoJogo;
    }

    public void setTipoJogo(String tipoJogo) {
        this.tipoJogo = tipoJogo;
    }

    public int getPontuação() {
        return pontuação;
    }

    public void setPontuação(int pontuação) {
        this.pontuação = pontuação;
    }

    public Date getDataHoraJogo() {
        return dataHoraJogo;
    }

    public void setDataHoraJogo(Date dataHoraJogo) {
        this.dataHoraJogo = dataHoraJogo;
    }

    public void setDate(java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
