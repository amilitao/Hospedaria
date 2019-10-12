
package PacoteClassesSistema;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Reserva {
  
    private Hospede hospede = new Hospede();
    private String id;
    private String idQuarto;
    private String codHosp;
    private String dtInicio;
    private String dtFim;
    private String conf;
    private int navega = 0;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(String idQuarto) {
        this.idQuarto = idQuarto;
    }

    public String getCodHosp() {
        return codHosp;
    }

    public void setCodHosp(String codHosp) {
        this.codHosp = codHosp;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtFim() {
        return dtFim;
    }

    public void setDtFim(String dtFim) {
        this.dtFim = dtFim;
    }

    public String getConf() {
        return conf;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }

    public Reserva(String id, String idTipoQuarto, String codHosp, String dtInicio, String dtFim, String conf) {
        this.id = id;
        this.idQuarto = idTipoQuarto;
        this.codHosp = codHosp;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.conf = conf;
    }

    public Reserva() {
        this("","","","","","");
    }
    
    
       
}
