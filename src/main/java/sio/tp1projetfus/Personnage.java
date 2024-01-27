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

        if ("Iop".equals(classeDuPerso.getNom()) )
        {
            this.statTerre += 4;
            this.statFeu -= 4;
        } else if ("Ecaflip".equals(classeDuPerso.getNom()) ) {
            this.statTerre += 4;
            this.statAir -= 4;
        } else if ("Cra".equals(classeDuPerso.getNom()) ) {
            this.statAir += 4;
            this.statEau -= 4;
        } else if ("Eniripsa".equals(classeDuPerso.getNom()) ) {
            this.statFeu += 4;
            this.statTerre -= 4;
        } else if ("Feca".equals(classeDuPerso.getNom()) ) {
            this.statEau += 4;
            this.statTerre -= 4;
        } else if ("Sadida".equals(classeDuPerso.getNom()) ) {
            this.statFeu += 4;
            this.statTerre -= 4;
        } else if ("Pandawa".equals(classeDuPerso.getNom()) ) {
            this.statTerre += 4;
            this.statAir -= 4;
        } else if ("Osamodas".equals(classeDuPerso.getNom()) ) {
            this.statFeu += 4;
            this.statEau -= 4;
        } else if ("Xelor".equals(classeDuPerso.getNom()) ) {
            this.statAir += 4;
            this.statFeu -= 4;
        } else if ("Sram".equals(classeDuPerso.getNom()) ) {
            this.statAir += 4;
            this.statFeu -= 4;
        } else if ("Enutrof".equals(classeDuPerso.getNom()) ) {
            this.statEau += 4;
            this.statAir -= 4;
        } else if ("Sacrieur".equals(classeDuPerso.getNom()) ) {
            this.statTerre += 4;
            this.statEau -= 4;
        }
    }

    public String getNom() {
        return nom;
    }

    public ClassePerso getClasseDuPerso() {
        return classeDuPerso;
    }

    public int getStatAir() {
        return statAir;
    }

    public int getStatTerre() {
        return statTerre;
    }

    public int getStatFeu() {
        return statFeu;
    }

    public int getStatEau() {
        return statEau;
    }

    public int getStatVita() {
        return statVita;
    }

    public int getStatVitaMax() {
        return statVitaMax;
    }

    public int getNombreKama() {
        return nombreKama;
    }
}
