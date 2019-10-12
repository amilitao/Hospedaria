
package PacoteClassesSistema;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Quartos {

private TipoQuarto tipQua = new TipoQuarto();
private String idQuarto;
private String idTipoQuarto;
private String idHospedaria;
private String numero;
private String status;  

    public String getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(String idQuarto) {
        this.idQuarto = idQuarto;
    }

    public String getIdTipoQuarto() {
        return idTipoQuarto;
    }

    public void setIdTipoQuarto(String idTipoQuarto) {
        this.idTipoQuarto = idTipoQuarto;
    }

    public String getIdHospedaria() {
        return idHospedaria;
    }

    public void setIdHospedaria(String idHospedaria) {
        this.idHospedaria = idHospedaria;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Quartos(String idQuarto, String tipoQuarto, String idHospedaria, String numero, String status) {
        this.idQuarto = idQuarto;
        this.idTipoQuarto = tipoQuarto;
        this.idHospedaria = idHospedaria;
        this.numero = numero;
        this.status = status;
    }

    public Quartos() {
        this("","","","","");
    }


}
