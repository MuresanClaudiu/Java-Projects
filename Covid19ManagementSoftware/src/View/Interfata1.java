package View;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;

public class Interfata1 extends JFrame {

    private JFrame frame; ///unde avem frame punem this.
    private JTextField textFieldEtapa;
    private JButton btnNewButton_inscriere;
    private JButton btnNewButton_pacienti;

    public Interfata1() {

        this.setBounds(100, 100, 907, 589);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        textFieldEtapa = new JTextField();
        textFieldEtapa.setBounds(368, 405, 86, 20);
        this.getContentPane().add(textFieldEtapa);
        textFieldEtapa.setColumns(10);

        btnNewButton_inscriere = new JButton("INSCRIERE");
        btnNewButton_inscriere.setBounds(365, 206, 103, 23);
        this.getContentPane().add(btnNewButton_inscriere);

        JLabel lblNewLabel = new JLabel("VACCINARE COVID");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel.setBounds(326, 59, 194, 31);
        this.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("ETAPA");
        lblNewLabel_1.setBounds(249, 405, 89, 20);
        this.getContentPane().add(lblNewLabel_1);

        btnNewButton_pacienti = new JButton("VEZI PACIENTI");
        btnNewButton_pacienti.setBounds(493, 404, 129, 23);
        this.getContentPane().add(btnNewButton_pacienti);

        this.setVisible(true);


    }

    public int getTextFieldEtapa() {
        return Integer.parseInt(textFieldEtapa.getText());
    }

    public void setTextFieldEtapa(String textFieldEtapa) {
        this.textFieldEtapa.setText(textFieldEtapa);
    }


    public void addInscriereListener(ActionListener action) {
        btnNewButton_inscriere.addActionListener(action);
    }

    public void addVeziPacientiListener(ActionListener action) {
        btnNewButton_pacienti.addActionListener(action);
    }
    public void showMessage(String message){
        JOptionPane.showMessageDialog(this,message);
        refresh();
    }

    public void refresh(){
        textFieldEtapa.setText(null);
    }

}
