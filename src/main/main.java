package main;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import view.MegaferiaFrame;

/**
 *
 * @author Garcchi
 */
public class main {

    public static void main(String[] args) {
        System.setProperty("flatlaf.useNativeLibrary", "false");
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MegaferiaFrame().setVisible(true);
            }
        });
    }
}
