import Controler.First1Controler;
import Controler.SecondControler;
import Model.Etapa;
import Model.Ocupatie;
import Model.Utilizator;
import View.Interfata1;
import View.Interfata2;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Interfata1 interfata1=new Interfata1();
        Interfata2 interfata2=new Interfata2();

        Utilizator utilizator = new Utilizator("Andrei",24, Ocupatie.DOCTOR);
        Utilizator utilizator1 = new Utilizator("Lucaks",4, Ocupatie.ELEV);
        Utilizator utilizator2 = new Utilizator("Clau",20, Ocupatie.PROFESOR);

        Etapa etapa1=new Etapa("1");
        Etapa etapa2=new Etapa("2");
        Etapa etapa3=new Etapa("3");

        etapa1.addUtilizator(utilizator);
        etapa2.addUtilizator(utilizator1);
        etapa3.addUtilizator(utilizator2);

        First1Controler first1Controler=new First1Controler(etapa1,etapa2,etapa3,interfata1, interfata2);
        SecondControler secondControler=new SecondControler(interfata1,interfata2,etapa1,etapa2,etapa3);
    }
}
