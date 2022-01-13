package Model;
import java.util.ArrayList;
import java.util.List;

public class Etapa {
    private String nume;
    private List<Utilizator> utilizatorList;

    public Etapa(String nume) {
        this.nume = nume;
        this.utilizatorList=new ArrayList<>();

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Utilizator> getUtilizatorList() {
        return utilizatorList;
    }

    public void setUtilizatorList(List<Utilizator> utilizatorList) {
        this.utilizatorList = utilizatorList;
    }
    public void addUtilizator(Utilizator utilizator) {
        this.utilizatorList.add(utilizator);///las utilizator ca asa am ca parametru
    }

    @Override
    public String toString() {

        String utilizatoriList = "";

        for (Utilizator utilizator : this.utilizatorList) {
            utilizatoriList += utilizator.getNume() + ", ";
        }

        return utilizatoriList;
    }


}
