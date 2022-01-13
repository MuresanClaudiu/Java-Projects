package Controler;

import Model.Etapa;
import Model.Ocupatie;
import Model.Utilizator;
import View.Interfata1;
import View.Interfata2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SecondControler {
    private Interfata1 interfata1;
    private Interfata2 interfata2;
    private Etapa etapa1;
    private Etapa etapa2;
    private Etapa etapa3;

    public SecondControler(Interfata1 interfata1, Interfata2 interfata2, Etapa etapa1, Etapa etapa2, Etapa etapa3) {
        this.interfata1 = interfata1;
        this.interfata2 = interfata2;
        this.etapa1 = etapa1;
        this.etapa2 = etapa2;
        this.etapa3 = etapa3;

        this.interfata2.addInscriereListener( new InscriereListener());
        this.interfata2.addVerificareListener(new VerificaEtapa());
        interfata2.addSecondViewListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                interfata2.setVisible(false);
                interfata1.setVisible(true);
            }
        });
    }
    class InscriereListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String nume = interfata2.getTextField();

                int varsta = interfata2.getVarstaField_1();
                int index = interfata2.getComboBox().getSelectedIndex();

                if(index==0){
                   // etapa1.addUtilizator(new Utilizator(nume,varsta, Ocupatie.DOCTOR));
                    etapa1.getUtilizatorList().add(new Utilizator(nume,varsta, Ocupatie.DOCTOR));
                }
                else if(index==1 || varsta>=65){
                    //etapa2.addUtilizator(new Utilizator(nume,varsta,Ocupatie.PROFESOR));
                    etapa2.getUtilizatorList().add(new Utilizator(nume,varsta, Ocupatie.PROFESOR));
                }


                else if(index==2){
                   // etapa3.addUtilizator(new Utilizator(nume,varsta,Ocupatie.ELEV));
                    etapa3.getUtilizatorList().add(new Utilizator(nume,varsta, Ocupatie.ELEV));
                }

            }catch (Exception exception) {
                interfata2.showMessage("Nu e bn");
            }

        }
    }
    class VerificaEtapa implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String nume = interfata2.getTextField();
                int varsta = interfata2.getVarstaField_1();
                int index = interfata2.getComboBox().getSelectedIndex();

                Ocupatie ocupatie = index==0?Ocupatie.DOCTOR:index==1?Ocupatie.PROFESOR:Ocupatie.ELEV;

                Utilizator utilizator = new Utilizator(nume,varsta,ocupatie);

                interfata2.setNumarEtapaLabel(utilizator.getEtapa());

            }catch (Exception exception){
                interfata2.showMessage("Nu e bn");
            }
        }
    }
}
