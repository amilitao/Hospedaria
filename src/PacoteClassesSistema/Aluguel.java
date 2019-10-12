
package PacoteClassesSistema;

import PacoteConexao.ConnectionFactory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Aluguel {
private ConnectionFactory con = new ConnectionFactory();
private Hospede hospede = new Hospede();

    //declara��o de variaveis
        private String codAluguel;
        private String codHospede;
	private String strLocatario;
        private String numQuarto;
	private String horarioEnt, diaEnt, mesEnt, anoEnt, horarioSaid, diaSaid, mesSaid, anoSaid;
	private Double precoTotal,valorDiaria;
        private int totalDiaria;
	private int navega = 0;
        


    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public String getCodAluguel() {
        return codAluguel;
    }

    public void setCodAluguel(String codAluguel) {
        this.codAluguel = codAluguel;
    }

    public String getCodHospede() {
        return codHospede;
    }

    public void setCodHospede(String codHospede) {
        this.codHospede = codHospede;
    }

    public String getStrLocatario() {
        return strLocatario;
    }

    public void setStrLocatario(String strLocatario) {
        this.strLocatario = strLocatario;
    }

    public String getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(String numQuarto) {
        this.numQuarto = numQuarto;
    }

    public String getHorarioEnt() {
        return horarioEnt;
    }

    public void setHorarioEnt(String horarioEnt) {
        this.horarioEnt = horarioEnt;
    }

    public String getDiaEnt() {
        return diaEnt;
    }

    public void setDiaEnt(String diaEnt) {
        this.diaEnt = diaEnt;
    }

    public String getMesEnt() {
        return mesEnt;
    }

    public void setMesEnt(String mesEnt) {
        this.mesEnt = mesEnt;
    }

    public String getAnoEnt() {
        return anoEnt;
    }

    public void setAnoEnt(String anoEnt) {
        this.anoEnt = anoEnt;
    }

    public String getHorarioSaid() {
        return horarioSaid;
    }

    public void setHorarioSaid(String horarioSaid) {
        this.horarioSaid = horarioSaid;
    }

    public String getDiaSaid() {
        return diaSaid;
    }

    public void setDiaSaid(String diaSaid) {
        this.diaSaid = diaSaid;
    }

    public String getMesSaid() {
        return mesSaid;
    }

    public void setMesSaid(String mesSaid) {
        this.mesSaid = mesSaid;
    }

    public String getAnoSaid() {
        return anoSaid;
    }

    public void setAnoSaid(String anoSaid) {
        this.anoSaid = anoSaid;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getTotalDiaria() {
        return totalDiaria;
    }

    public void setTotalDiaria(int totalDiaria) {
        this.totalDiaria = totalDiaria;
    }

    public int getNavega() {
        return navega;
    }

    public void setNavega(int navega) {
        this.navega = navega;
    }

    public Aluguel(String codAluguel, String codHospede, String strLocatario, String numQuarto, String horarioEnt, String diaEnt, String mesEnt, String anoEnt, String horarioSaid, String diaSaid, String mesSaid, String anoSaid, Double valorDiaria, Double precoTotal, int totalDiaria) {
        this.codAluguel = codAluguel;
        this.codHospede = codHospede;
        this.strLocatario = strLocatario;
        this.numQuarto = numQuarto;
        this.horarioEnt = horarioEnt;
        this.diaEnt = diaEnt;
        this.mesEnt = mesEnt;
        this.anoEnt = anoEnt;
        this.horarioSaid = horarioSaid;
        this.diaSaid = diaSaid;
        this.mesSaid = mesSaid;
        this.anoSaid = anoSaid;
        this.valorDiaria = valorDiaria;
        this.precoTotal = precoTotal;
        this.totalDiaria = totalDiaria;
    }

    public Aluguel() {
        this("","","","","","","","","","","","",0.0,0.0,0);
    }
	

 
                
}

