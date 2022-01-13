package controllers;

import models.Animal;
import models.Hotel;
import models.Specie;
import views.Interfata1;
import views.Interfata2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controler1 {
    private Interfata1 interfata1;
    private Interfata2 interfata2;
    private Hotel hotel;

    public Controler1(Interfata1 interfata1, Interfata2 interfata2, Hotel hotel) {
        this.interfata1 = interfata1;
        this.interfata2 = interfata2;
        this.hotel = hotel;

        this.interfata1.addInregistrareListener((e) -> {
            this.interfata1.setVisible(false);
            this.interfata2.setVisible(true);
        });
        this.interfata1.AddVerifListener(new VeziDisponibilitatea());
        this.interfata2.addCazeaza(new cazat());
        this.interfata2.veziPretAnimal(new catConsuma());
    }

    class VeziDisponibilitatea implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int index = interfata1.getComboBox_TipAnimal().getSelectedIndex();

                if (index == 0) {
                    if (hotel.getListaCaini().size() < 5) {
                        interfata1.setLblNewLabel_esteLoc("Da e loc");
                    } else
                        interfata1.setLblNewLabel_esteLoc("Nu e loc");


                } else if (index == 1) {
                    if (hotel.getListaPisici().size() < 10) {
                        interfata1.setLblNewLabel_esteLoc("Da e loc");
                    } else
                        interfata1.setLblNewLabel_esteLoc("Nu e loc");
                }


            } catch (Exception exception) {
                interfata1.showMessage("err");
            }
        }
    }

    class cazat implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String nume = interfata2.getTextField_nume();
                int tip = interfata2.getComboBox_specie().getSelectedIndex();
                double greutate = interfata2.getTextField_greutate();

                if (tip == 0 && hotel.getListaCaini().size() < 5) {
                    hotel.getListaCaini().add(new Animal(nume, greutate, Specie.CAINE, 50 + greutate * 0.02));
                    throw new Exception("Animalul a fost cazat");
                } else if (tip == 1 && hotel.getListaPisici().size() < 10) {
                    hotel.getListaPisici().add(new Animal(nume, greutate, Specie.PISICA, 30));
                    throw new Exception("Animalul a fost cazat");
                } else
                    throw new Exception("Nu mai sunt locuri");
            } catch (Exception exception) {
                interfata2.showMessage(exception.getMessage());
            }
        }
    }

    class catConsuma implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int tip = interfata2.getComboBox_specie().getSelectedIndex();
                if (tip == 0){
                    for(int i=0;i<hotel.getListaCaini().size();i++){
                        if(interfata2.getTextField_nume().equals(hotel.getListaCaini().get(i))){
                            interfata2.showMessage("Costul cazarii este de: " + String.valueOf(hotel.getListaCaini().get(i).getPretDePlatit()));
                        }
                    }
                }
                else if(tip==1){
                    for(int i=0;i<hotel.getListaPisici().size();i++){
                        if(interfata2.getTextField_nume().equals(hotel.getListaPisici().get(i))){
                            interfata2.showMessage("Costul cazarii este de: " + String.valueOf(hotel.getListaPisici().get(i).getPretDePlatit()));
                        }
                    }
                }

            } catch (Exception exception) {
                interfata2.showMessage("err");
            }
        }
    }
}
