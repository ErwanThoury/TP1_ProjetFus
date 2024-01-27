package sio.tp1projetfus;

public class Personnage {
    public String nom;
    private ClassePerso classeDuPerso;
    private int statAir;
    private int statTerre;
    private int statFeu;
    private int statEau;
    private int statVita;
    private int statVitaMax;
    private int nombreKama;

    public Personnage(String nom, ClassePerso classeDuPerso) {
        this.nom = nom;
        this.classeDuPerso = classeDuPerso;
        this.statAir = 5;
        this.statTerre = 5;
        this.statFeu = 5;
        this.statEau = 5;
        this.statVita = 50;
        this.nombreKama = 500;
        this.statVitaMax = 50;
    }
}
