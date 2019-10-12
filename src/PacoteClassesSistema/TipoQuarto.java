package PacoteClassesSistema;

import java.sql.SQLException;

public class TipoQuarto {
    
 private String id;
 private String descricao;
 private String numCamaCasal;
 private String numCamaSolteiro;
 private String preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumCamaCasal() {
        return numCamaCasal;
    }

    public void setNumCamaCasal(String numCamaCasal) {
        this.numCamaCasal = numCamaCasal;
    }

    public String getNumCamaSolteiro() {
        return numCamaSolteiro;
    }

    public void setNumCamaSolteiro(String numCamaSolteiro) {
        this.numCamaSolteiro = numCamaSolteiro;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public TipoQuarto(String id, String descricao, String numCamaCasal, String numCamaSolteiro, String preco) {
        this.id = id;
        this.descricao = descricao;
        this.numCamaCasal = numCamaCasal;
        this.numCamaSolteiro = numCamaSolteiro;
        this.preco = preco;
    }

    public TipoQuarto() {
        this("","","","","");
    }
 
  
}

