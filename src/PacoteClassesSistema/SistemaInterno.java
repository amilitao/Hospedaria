package PacoteClassesSistema;

import Interfaces.Autenticavel;
import Janelas.TelaPrincipal;
import javax.swing.JFrame;

/**
 *
 * @author Adriano
 */
public class SistemaInterno {

    public static void login(Autenticavel funcionario, JFrame telaLogin) {
        if (funcionario.autentica()) {
            telaLogin.setVisible(false);
            TelaPrincipal telaPrincipal = new TelaPrincipal(funcionario);
            telaPrincipal.setVisible(true);

        }
    }

}
