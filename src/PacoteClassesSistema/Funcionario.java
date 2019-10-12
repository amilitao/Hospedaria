package PacoteClassesSistema;

import ClassesDAO.FuncionarioDAO;
import Interfaces.Autenticavel;

public class Funcionario implements Autenticavel {

    private int id;
    private String nome;
    private Cargo cargo;
    private String login;
    private String senha;

    @Override
    public String getLogin() {
        return this.login;
    }


    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario() {

    }

    public Funcionario(String login, String senha) {

        this.login = login;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public boolean autentica() {
        boolean resultado = false;
        FuncionarioDAO fDao = new FuncionarioDAO();         
        if (fDao.getFuncionario(this) != null) {
            resultado = true;
        }

        return resultado;
    }

   
}
