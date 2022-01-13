package Model;

public class Utilizator {

    private String nume;
    private int varsta;
    private Ocupatie ocupatie;

    public Utilizator(String nume, int varsta, Ocupatie ocupatie) {
        this.nume = nume;
        this.varsta = varsta;
        this.ocupatie = ocupatie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Ocupatie getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(Ocupatie ocupatie) {
        this.ocupatie = ocupatie;
    }
    public int getEtapa(){
        if(this.ocupatie==Ocupatie.DOCTOR)
            return 1;///etapa 1
        else if(this.ocupatie==Ocupatie.PROFESOR || this.varsta>65)
            return 2;///etapa 2
        else if(this.ocupatie==Ocupatie.ELEV)
            return 3;///etapa 3
        else return 0;
    }
}
