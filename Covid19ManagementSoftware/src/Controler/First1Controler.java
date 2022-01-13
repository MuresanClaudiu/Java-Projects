package Controler;

import Model.Etapa;
import View.Interfata1;
import View.Interfata2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First1Controler {
       private Etapa etapa1;
       private Etapa etapa2;
       private Etapa etapa3;
       private Interfata1 interfata1;
       private Interfata2 interfata2;


    public First1Controler(Etapa etapa1, Etapa etapa2, Etapa etapa3, Interfata1 interfata1, Interfata2 interfata2) {
        this.etapa1 = etapa1;
        this.etapa2 = etapa2;
        this.etapa3 = etapa3;
        this.interfata1 = interfata1;
        this.interfata2 = interfata2;


        this.interfata1.addVeziPacientiListener(new VeziPacientiListener());
        this.interfata1.addInscriereListener((e) -> {///am folosit addinscriere listener pe care l-am creat in interfata1
            ///pentru ca am 2 butoane si la fiecare buton trebe facut un create listener
            //this.interfata1.dispose();
            //Interfata2 interfata2 = new Interfata2();
            interfata1.setVisible(false);
            interfata2.setVisible(true);
        });
    }
        class VeziPacientiListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int etapa = interfata1.getTextFieldEtapa();
                    switch (etapa){
                        case 1:{
                            interfata1.showMessage(etapa1.toString());
                            return;
                        }
                        case 2:{
                            interfata1.showMessage(etapa2.toString());
                            return;
                        }
                        case 3:{
                            interfata1.showMessage(etapa3.toString());
                            return;
                        }
                        default: interfata1.showMessage("introduceti o etapa corecta");
                    }
                }
                catch (Exception exception){
                   interfata1.showMessage("Nu e bine");
                }
            }
        }



    }


