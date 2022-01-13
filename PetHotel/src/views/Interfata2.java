package views;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;

public class Interfata2 extends JFrame{

    private JFrame frame;
    private JTextField textField_nume;
    private JTextField textField_greutate;
    private JComboBox comboBox_specie;
    private JButton  btnNewButton_cazeaza;
    private JButton  btnNewButton_spalaAnimal;
    private JButton  btnNewButton_plimbaAnimal;
    private JButton  btnNewButton_veziPret;



    public Interfata2() {
        this.setBounds(100, 100, 899, 551);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Inregistrare ANIMAL");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel.setBounds(347, 36, 186, 36);
        this.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Nume");
        lblNewLabel_1.setBounds(48, 142, 87, 27);
        this.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Specie");
        lblNewLabel_1_1.setBounds(48, 221, 87, 27);
        this.getContentPane().add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_2 = new JLabel("Greutate");
        lblNewLabel_1_2.setBounds(48, 313, 87, 27);
        this.getContentPane().add(lblNewLabel_1_2);

        textField_nume = new JTextField();
        textField_nume.setBounds(125, 145, 134, 20);
        this.getContentPane().add(textField_nume);
        textField_nume.setColumns(10);

        comboBox_specie = new JComboBox();
        comboBox_specie.setModel(new DefaultComboBoxModel(new String[] {"CAINE", "PISICA"}));
        comboBox_specie.setBounds(125, 223, 134, 22);
        this.getContentPane().add(comboBox_specie);

        textField_greutate = new JTextField();
        textField_greutate.setBounds(128, 316, 131, 20);
        this.getContentPane().add(textField_greutate);
        textField_greutate.setColumns(10);

        btnNewButton_cazeaza = new JButton("Cazeaza");
        btnNewButton_cazeaza.setBounds(111, 394, 148, 23);
        this.getContentPane().add(btnNewButton_cazeaza);

        JLabel lblNewLabel_2 = new JLabel("Servicii extra");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_2.setBounds(649, 142, 186, 27);
        this.getContentPane().add(lblNewLabel_2);

       btnNewButton_spalaAnimal = new JButton("SPALA ANIMAL");
        btnNewButton_spalaAnimal.setBounds(649, 223, 154, 27);
        this.getContentPane().add(btnNewButton_spalaAnimal);

        btnNewButton_plimbaAnimal = new JButton("PLIMBA ANIMAL");
        btnNewButton_plimbaAnimal.setBounds(649, 315, 154, 23);
        this.getContentPane().add(btnNewButton_plimbaAnimal);

        btnNewButton_veziPret = new JButton("VEZI PRET CURENT CAZARE SI SERVICII");
        btnNewButton_veziPret.setBounds(303, 454, 311, 36);
        this.getContentPane().add(btnNewButton_veziPret);

    }

    public void addCazeaza(ActionListener action){
        btnNewButton_cazeaza.addActionListener(action);
    }

    public JComboBox getComboBox_specie() {
        return comboBox_specie;
    }

    public String getTextField_nume() {
        return textField_nume.getText();
    }

    public void setTextField_nume(JTextField textField_nume) {
        this.textField_nume = textField_nume;
    }

    public double getTextField_greutate() {
        return Double.parseDouble(textField_greutate.getText());
    }

    public void setTextField_greutate(JTextField textField_greutate) {
        this.textField_greutate = textField_greutate;
    }
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    public void addSpala(ActionListener action){
        btnNewButton_spalaAnimal.addActionListener(action);
    }
    public void addPlimba(ActionListener action){
        btnNewButton_plimbaAnimal.addActionListener(action);
    }

   public void veziPretAnimal(ActionListener action){
        btnNewButton_veziPret.addActionListener(action);
   }
}

