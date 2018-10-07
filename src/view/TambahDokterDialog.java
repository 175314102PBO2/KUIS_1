/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.Parent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import static org.omg.CORBA.ORB.init;

/**
 *
 * @author admin
 */
public class TambahDokterDialog extends JFrame implements ActionListener {
    public static void main(String[] args) {
        
    }
    private JLabel namaLabel;
    private JTextField namaText;
    private JLabel nomorPegawaiLabel;
    private JTextField nomorPegawaiText;
    private JToggleButton tambahButton;
    private JLabel tambahDokterLabel;

    public TambahDokterDialog(Frame parent, boolean modal) {
    }

    public static void initComponents() {
        init();
    }

    public void tambahButtonActionPerformed(ActionEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
