package utilities;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinicios
 */
public class GUIMessage {

    public static void inf(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void error(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.OK_OPTION);
    }
}
