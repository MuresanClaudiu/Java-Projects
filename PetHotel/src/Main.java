import controllers.Controler1;
import models.Animal;
import models.Hotel;
import models.Specie;
import views.Interfata1;
import views.Interfata2;

public class Main {
    public static void main(String[] args) {
Interfata1 interfata1=new Interfata1();
Interfata2 interfata2=new Interfata2();

        Hotel hotel1=new Hotel("Privo");
        Animal animal1=new Animal("Rex",12.2, Specie.CAINE,50+12.2*0.02);
        Animal animal2=new Animal("Mot",2,Specie.PISICA,50+2*0.02);

        //test
        Animal animal3=new Animal("Mot1",3,Specie.CAINE,30);
        Animal animal4=new Animal("Mot2",4,Specie.CAINE,30);
        Animal animal5=new Animal("Mot3",5,Specie.CAINE,30);
        Animal animal6=new Animal("Mot4",6,Specie.CAINE,30);
///////////////////////
        hotel1.addAnimale(animal1);
        hotel1.addAnimale(animal2);

        ///test
        hotel1.addAnimale(animal3);
        hotel1.addAnimale(animal4);
        hotel1.addAnimale(animal5);
        hotel1.addAnimale(animal6);

        Controler1 controler1=new Controler1(interfata1,interfata2,hotel1);
    }
}
