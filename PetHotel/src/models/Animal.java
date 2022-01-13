package models;

public class Animal {
    private String nume;
    private double greutate;
    private Specie specie;
    private double pretDePlatit;

    public Animal(String nume, double greutate, Specie specie,double pretDePlatit) {
        this.nume = nume;
        this.greutate = greutate;
        this.specie = specie;
        this.pretDePlatit=pretDePlatit;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public Specie getSpecie() {
        return specie;
    }

    public void setSpecie(Specie specie) {
        this.specie = specie;
    }

    public Double getPretDePlatit() {
        return pretDePlatit;
    }

    public void setPretDePlatit(Double pretDePlatit) {
        this.pretDePlatit = pretDePlatit;
    }
}
