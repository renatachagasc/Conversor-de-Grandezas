
package conversor;

import static java.awt.EventQueue.invokeLater;

public class ClassePrincipal {

    public static void main(String args[]) {
        invokeLater(new Runnable() {
            @Override
            public void run() {
                new Teste().setVisible(true);
            }
        });
    }
    
}
