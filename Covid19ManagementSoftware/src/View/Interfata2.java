package View;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class Interfata2 extends JFrame {


    private JTextField textField;
    private JTextField textField_1;
    private JButton btnNewButton_verifetapa;
    private JButton btnInscriere1;
    private JComboBox comboBox;
    private JLabel numarEtapaLabel;


    public Interfata2() {
        this.setBounds(100, 100, 848, 640);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Inscriere Proces de Vaccinare COVID");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel.setBounds(267, 43, 404, 53);
        this.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Nume");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_1.setBounds(40, 160, 74, 36);
        this.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Varsta");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_2.setBounds(40, 241, 74, 36);
        this.getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Ocupatie");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_3.setBounds(40, 343, 74, 36);
        this.getContentPane().add(lblNewLabel_3);

        textField = new JTextField();
        textField.setBounds(117, 169, 131, 20);
        this.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(117, 250, 131, 20);
        this.getContentPane().add(textField_1);

        btnNewButton_verifetapa = new JButton("Verifica Etapa");
        btnNewButton_verifetapa.setBounds(575, 249, 131, 28);
        this.getContentPane().add(btnNewButton_verifetapa);

        btnInscriere1 = new JButton("INSCRIERE");
        btnInscriere1.setBounds(346, 550, 126, 23);
        this.getContentPane().add(btnInscriere1);

        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"Medic", "Profesor", "Elev"}));
        comboBox.setBounds(117, 351, 131, 20);
        this.getContentPane().add(comboBox);

        numarEtapaLabel = new JLabel("Etapa:");
        numarEtapaLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        numarEtapaLabel.setBounds(529, 288, 74, 36);
        this.getContentPane().add(numarEtapaLabel);
    }

    public String getTextField() {
        return textField.getText();
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public int getVarstaField_1() {
        return Integer.parseInt(textField_1.getText());
    }

    public void setTextField_1(JTextField textField_1) {
        this.textField_1 = textField_1;
    }

    public JButton getBtnNewButton_verifetapa() {
        return btnNewButton_verifetapa;
    }

    public void setBtnNewButton_verifetapa(JButton btnNewButton_verifetapa) {
        this.btnNewButton_verifetapa = btnNewButton_verifetapa;
    }
    public JLabel getNumarEtapaLabel() {
        return numarEtapaLabel;
    }

    public void setNumarEtapaLabel(int etapa) {
        this.numarEtapaLabel.setText(String.valueOf(etapa));
    }
    public JButton getBtnInscriere1() {
        return btnInscriere1;
    }

    public void setBtnInscriere1(JButton btnInscriere1) {
        this.btnInscriere1 = btnInscriere1;
    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public void addInscriereListener(ActionListener action) {
        btnInscriere1.addActionListener(action);
    }

    public void addVerificareListener(ActionListener action) {
        btnNewButton_verifetapa.addActionListener(action);
    }

    public void addComboboxListener(ActionListener action) {
        comboBox.addActionListener(action);
    }

    public void addSecondViewListener(WindowListener action) {
        this.addWindowListener(action);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
