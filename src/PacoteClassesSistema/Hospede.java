
package PacoteClassesSistema;


public class Hospede {
    
 private String cod;
 private String cpf;
 private String nome;
 private String telefone;
 private String cartao;
 private String email;
 private int navega;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Hospede(String cod, String cpf, String nome, String telefone, String cartao, String email) {
        this.cod = cod;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.cartao = cartao;
        this.email = email;
    }
 
   
 public Hospede(){
 this("","","","","","");
 }
 
   
}

