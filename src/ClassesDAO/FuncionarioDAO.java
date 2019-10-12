/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import PacoteClassesSistema.Funcionario;
import PacoteClassesSistema.Cargo;
import PacoteConexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adriano
 */
public class FuncionarioDAO {

    public FuncionarioDAO() {

    }

    public void cadastra(Funcionario f) {

    }

    public List<Funcionario> getLista() {
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT idFUNCIONARIO, nome, login, CARGO_idCARGO, "
                + "descricao from funcionario func "
                + "join cargo car on func.CARGO_idCARGO = car.idCARGO;";

        try (Connection con = new ConnectionFactory().getConnection();
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();) {

            while (rs.next()) {
                Funcionario f = new Funcionario();
                Cargo cargo = new Cargo();

                f.setId(rs.getInt("idFUNCIONARIO"));
                cargo.setId(rs.getInt("CARGO_idCARGO"));
                cargo.setDescricao(rs.getString("descricao"));
                f.setCargo(cargo);
                f.setNome(rs.getString("nome"));
                f.setLogin(rs.getString("login"));                
                
                funcionarios.add(f);

            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro no sql!!!", e);
        }
        return funcionarios;

    }

    public void altera() {

    }

    public Funcionario getFuncionario(Funcionario func) {
        Funcionario f = null;
        String sql = "select * from funcionario where login = ? and senha = ?";
        try (Connection con = new ConnectionFactory().getConnection();
                PreparedStatement stmt = con.prepareStatement(sql);) {
            stmt.setString(1, func.getLogin());
            stmt.setString(2, func.getSenha());

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                f = new Funcionario();
                Cargo cargo = new Cargo();

                f.setId(rs.getInt("idFUNCIONARIO"));
                cargo.setId(rs.getInt("CARGO_idCARGO"));
                f.setCargo(cargo);
                f.setNome(rs.getString("nome"));
                f.setLogin(rs.getString("login"));
                f.setSenha(rs.getString("senha"));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro no sql!!!", e);
        }

        return f;
    }

}
