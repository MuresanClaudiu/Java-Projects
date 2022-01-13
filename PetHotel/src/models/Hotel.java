package models;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nume;
    private List<Animal> listaCaini;
    private List<Animal> listaPisici;

    public Hotel(String nume) {
        this.nume = nume;
        this.listaCaini = new ArrayList<>();
        this.listaPisici = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Animal> getListaCaini() {
        return listaCaini;
    }

    public void setListaCaini(List<Animal> listaCaini) {
        this.listaCaini = listaCaini;
    }

    public List<Animal> getListaPisici() {
        return listaPisici;
    }

    public void setListaPisici(List<Animal> listaPisici) {
        this.listaPisici = listaPisici;
    }

    public void addAnimale(Animal animal){///functia de a adauga
        if(animal.getSpecie()==Specie.CAINE && listaCaini.size()<5)
            this.listaCaini.add(animal);
        else if(animal.getSpecie()==Specie.PISICA && listaPisici.size()<10)
            this.listaPisici.add(animal);
    }


}
