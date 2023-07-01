import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // Inicia la interfaz de usuario
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Interfaz ui = new Interfaz();
                ui.setVisible(true);
            }
        });
    }
}
