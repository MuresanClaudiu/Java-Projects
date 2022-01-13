package views;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;

public class Interfata1 extends JFrame{

    private JFrame frame;
    private JComboBox comboBox_TipAnimal;
    private JButton btnNewButton_verifdisponibilitate;
    private JButton btnNewButton_inregistrare;
    private JLabel lblNewLabel_esteLoc;



    public Interfata1() {
        this.setBounds(100, 100, 861, 551);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Hotel pentru Animale");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setBounds(345, 36, 151, 30);
        this.getContentPane().add(lblNewLabel);

        comboBox_TipAnimal = new JComboBox();
        comboBox_TipAnimal.setModel(new DefaultComboBoxModel(new String[] {"CAINE", "PISICA"}));
        comboBox_TipAnimal.setBounds(29, 147, 160, 30);
        this.getContentPane().add(comboBox_TipAnimal);

        btnNewButton_verifdisponibilitate = new JButton("VERIFICA DISPONIBILITATE");
        btnNewButton_verifdisponibilitate.setBounds(328, 147, 241, 30);
        this.getContentPane().add(btnNewButton_verifdisponibilitate);

        btnNewButton_inregistrare = new JButton("Inregistrare");
        btnNewButton_inregistrare.setBounds(318, 414, 178, 40);
        this.getContentPane().add(btnNewButton_inregistrare);

        lblNewLabel_esteLoc = new JLabel("");
        lblNewLabel_esteLoc.setBounds(655, 147, 151, 30);
        this.getContentPane().add(lblNewLabel_esteLoc);

        this.setVisible(true);

    }


    public JComboBox getComboBox_TipAnimal() {
        return comboBox_TipAnimal;
    }

    public void setComboBox_TipAnimal(JComboBox comboBox_TipAnimal) {
        this.comboBox_TipAnimal = comboBox_TipAnimal;
    }

    public JLabel getLblNewLabel_esteLoc() {
        return lblNewLabel_esteLoc;
    }

    public void setLblNewLabel_esteLoc(String lblNewLabel_esteLoc) {
        this.lblNewLabel_esteLoc .setText(lblNewLabel_esteLoc); ;
    }
    public  void addInregistrareListener(ActionListener action){
        btnNewButton_inregistrare.addActionListener(action);
    }
public void AddVerifListener(ActionListener action)
{
    btnNewButton_verifdisponibilitate.addActionListener(action); ///listener pentru buton de disponibili
}


    public void showMessage(String message)
    {
        JOptionPane.showMessageDialog(this,message);
    }
}
