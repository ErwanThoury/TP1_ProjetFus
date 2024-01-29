package sio.tp1projetfus;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private HBox hbSorts;
    @FXML
    private AnchorPane apCraqueleur;
    @FXML
    private AnchorPane apTofu;
    @FXML
    private AnchorPane apBouftou;
    @FXML
    private AnchorPane apAstrub;
    @FXML
    private AnchorPane apZoneMonstre;
    private boolean unPointVingtNeuf;
    private String deuxPointZero = "";//""deuxPointZero/";
    int intNumberZone = 0;
    /*
    0 = Astrub
    1 = Tofu
    2 = Bouftou
    3 = Craqueleur
     */
    //---------------------------------------------------------------------------------
    // Tofu
    //---------------------------------------------------------------------------------
    Monstre monstreTofuMineur = new Monstre("Tofu furtif"
            , deuxPointZero+"monstreTofuMineur.png"
            , 10
            , 10
            , 3
            , 30
            , 12
            , 20);
    Monstre monstreTofu = new Monstre("Tofukaz agile"
            , "monstreTofu.png"
            , 15
            , 10
            , 5
            , 30
            , 20
            , 30);
    Monstre monstreTofuMajeur = new Monstre("Grofu heureux"
            , "monstreTofuMajeur.png"
            , 20
            , 5
            , 20
            , 15
            , 25
            , 35);
    Monstre monstreTofuRoyal = new Monstre("Tofu Royal"
            , "monstreTofuRoyal.png"
            , 50
            , 20
            , 10
            , 50
            , 500
            , 1000);
    //---------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------
    // Bouftou
    //---------------------------------------------------------------------------------
    Monstre monstreBouftouMineur = new Monstre("Boufton intimidé"
            , "monstreBouftouMineur.png"
            , 50
            , 10
            , 10
            , 20
            , 50
            , 100);
    Monstre monstreBouftou = new Monstre("Bouftou assoupi"
            , "monstreBouftou.png"
            , 75
            , 10
            , 15
            , 20
            , 80
            , 120);
    Monstre monstreBouftouMajeur = new Monstre("Boufcroute énervé"
            , "monstreBouftouMajeur.png"
            , 100
            , 15
            , 20
            , 20
            , 100
            , 140);
    Monstre monstreBouftouRoyal = new Monstre("Bouftou Royal"
            , "monstreBouftouRoyal.png"
            , 250
            , 25
            , 30
            , 20
            , 1000
            , 1500);
    //---------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------
    // Craqueleur
    //---------------------------------------------------------------------------------
    Monstre monstreCraqueleurMineur = new Monstre("Craqueboule téméraire"
            , "monstreCraqueleurMineur.png"
            , 80
            , 20
            , 15
            , 30
            , 80
            , 130);
    Monstre monstreCraqueleur = new Monstre("Craqueleur terrible"
            , "monstreCraqueleur.png"
            , 110
            , 25
            , 22
            , 35
            , 130
            , 200);
    Monstre monstreCraqueleurMajeur = new Monstre("Craqueterre monstrueux"
            , "monstreCraqueleurMajeur.png"
            , 150
            , 30
            , 35
            , 40
            , 170
            , 240);
    Monstre monstreCraqueleurRoyal = new Monstre("Craqueleur Majestueux"
            , "monstreCraqueleurRoyal.png"
            , 350
            , 50
            , 55
            , 45
            , 1500
            , 2000);
    //---------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------
    // CLASSES
    //---------------------------------------------------------------------------------
    ClassePerso iop = new ClassePerso("Iop", "iop.png", "Les Iops sont des guerriers fonceurs et sans reproche ! Une chose est sûre : les Iops savent faire parler les armes. D'ailleurs, se retrouver pris dans une bagarre au moins une fois par jour est pour eux un signe de bonne santé. Leur tempérament impétueux fait des Iops des paladins de l'extrême, capables du meilleur... comme du pire !", "Terre", "Feu");
    ClassePerso eniripsa = new ClassePerso("Eniripsa", "eniripsa.png", "Les Eniripsas sont des guérisseurs qui soignent d'un simple Mot. Ils utilisent le pouvoir de la parole pour soulager les souffrances de leurs alliés, mais parfois aussi pour blesser leurs ennemis. Certains Eniripsas sont même devenus de véritables arpenteurs du verbe, des rôdeurs des langues oubliées.", "Feu", "Terre");
    ClassePerso osamodas = new ClassePerso("Osamodas", "osamodas.png", "Les Osamodas sont des dompteurs nés ! Ils ont le pouvoir d'invoquer des créatures et sont de remarquables dresseurs. Une rumeur prétend qu'ils taillent leurs vêtements dans la peau de leurs ennemis, mais allez donc leur demander ce qu'il en est… Si vous êtes de son côté, un Osamodas sera aux petits soins pour vous. Dans le cas contraire, peut-être terminerez-vous votre vie sous la forme d'une botte ou d'un bonnet fourré.", "Feu", "Eau");
    ClassePerso feca = new ClassePerso("Feca", "feca.png", "Les Fécas sont de loyaux protecteurs toujours sur la défensive. Ils sont appréciés dans les groupes d'aventuriers pour leurs armures élémentaires et leur capacité à encaisser les coups durs. Ils sont également maîtres dans l’art des signes magiques : quand il va y avoir du grabuge, les Fécas sortent leurs glyphes !", "Eau", "Terre");
    ClassePerso sacrieur = new ClassePerso("Sacrieur", "sacrieur.png", "Les Sacrieurs sont des berserkers qui décuplent leurs forces dès qu'ils sont frappés ! N'ayant pas peur de recevoir des coups, ni de s'exposer aux blessures, ils seront souvent en première ligne, prêts à verser le premier sang ! Le Sacrieur est vraiment le compagnon idéal pour vos longues soirées guerrières…", "Terre", "Eau");
    ClassePerso cra = new ClassePerso("Cra", "cra.png", "Les Crâs sont des archers aussi fiers que précis ! Ils font des alliés précieux contre les adeptes de la mêlée franche. Restant à distance, décochant leurs traits empennés dans le moindre orifice laissé sans surveillance, ils ne laissent aucun répit à leurs adversaires !", "Air", "Eau");
    ClassePerso sadida = new ClassePerso("Sadida", "sadida.png", "Les Sadidas sont des invocateurs qui empoisonnent la vie de leurs ennemis ! Apprivoiser les Ronces pour en faire des armes terrifiantes, confectionner des poupées de guerre et de soins, voilà qui satisfait tout disciple Sadida digne de ce nom.", "Feu", "Terre");
    ClassePerso enutrof = new ClassePerso("Enutrof", "enutrof.png", "Les Enutrofs sont des chasseurs de trésor avides de kamas, qui malgré leur grand âge courent comme des dragodindes à la vue d'un coffre bien rempli. Ils sont experts dans l’art de ralentir leurs ennemis : ils peuvent ainsi les harceler avant de les assommer à grands coups de pelle le moment venu !", "Eau", "Air");
    ClassePerso sram = new ClassePerso("Sram", "sram.png", "Les Srams sont des assassins qui aiment les bourses, rebondies de préférence. Trousser les pans d'une tunique, tâter le fond d'une poche, faire preuve de doigté, palper enfin des bijoux tant convoités avant de poser un piège ou d'asséner un coup mortel, voilà la vie d'un disciple de Sram !", "Air", "Feu");
    ClassePerso xelor = new ClassePerso("Xelor", "xelor.png", "Les Xélors sont des mages qui maîtrisent le temps et toutes les mécaniques qui donnent l'heure : carillons, horloges, et pendules leur obéissent au doigt et à l'œil. Les Xélors jouent donc avec le temps pour ralentir un ennemi ou se téléporter où bon leur semble.", "Air", "Feu");
    ClassePerso ecaflip = new ClassePerso("Ecaflip", "ecaflip.png", "Les Ecaflips sont des guerriers joueurs qui se fourrent dans les endroits où l'on peut gagner gros, et perdre beaucoup… Un Ecaflip bien dans sa peau parie sans arrêt, pour tout et pour rien. Mais attention, il prend le jeu très au sérieux et ira même jusqu'à risquer sa vie sur un jet de dés pour tenter de remporter la mise…", "Terre", "Air");
    ClassePerso pandawa = new ClassePerso("Pandawa", "pandawa.png", "Les Pandawas sont des guerriers adeptes des arts martiaux qui savent faire des folies de leurs corps ! Ils peuvent même en faire avec le corps des autres… Le Pandawa sait comment soulever les foules, il porte ses alliés sur ses épaules pour mieux les protéger. Quant à ses ennemis, il les enverra valser dans le décor, avant de fêter sa victoire avec une bonne rasade de lait de bambou !", "Eau", "Air");
    //---------------------------------------------------------------------------------
    @FXML
    private AnchorPane apMaison;
    @FXML
    private AnchorPane apChoixAction;
    @FXML
    private Label lblVitaMax;
    @FXML
    private Label lblAir;
    @FXML
    private Label lblEau;
    @FXML
    private Label lblFeu;
    @FXML
    private Label lblTerre;
    @FXML
    private ImageView imgPersonnage;

    Personnage p;
    ClassePerso c;
    Image imagePerso;
    @FXML
    private Label lblPVPerso;
    @FXML
    private Label lblPVMaxPerso;
    @FXML
    private Label lblPVAdv;
    @FXML
    private Label lblPVMaxAdv;
    @FXML
    private ImageView imgVitaPerso;
    @FXML
    private ImageView imgVitaAdv;
    @FXML
    private Label lblSlash;

    @FXML
    private Label lblSlashBis;
    @FXML
    private AnchorPane apCombatPersonnages;
    @FXML
    private ImageView imgAdversaire;
    @FXML
    private ImageView imgPersonnageCbt;
    @FXML
    private StackPane apBarreBasse;
    @FXML
    private TextArea txtClasses;
    @FXML
    private ImageView imgLogoClasse;
    @FXML
    private ListView lvClasses;
    @FXML
    private ImageView imgBonusStat;
    @FXML
    private ImageView imgMalusStat;
    @FXML
    private ImageView imgClasseChoix;
    @FXML
    private TextField txtNomPerso;
    @FXML
    private AnchorPane apChoix;
    @FXML
    private Label lblVita;
    @FXML
    private Label lblSoin;
    @FXML
    private Label lblFuite;
    @FXML
    private Label lblEsquive;
    @FXML
    private Label lblDef;
    @FXML
    private Label lblProspection;
    @FXML
    private Label lblAttaque;
    @FXML
    private Label lblCritique;
    @FXML
    private Label lblNomClasse;
    @FXML
    private Label lblNomDuPersonnage;
    @FXML
    private Label lblNomDuMonstre;
    Monstre m;
    @FXML
    private Label lblKama;
    @FXML
    private Label lblGainPertePerso;
    @FXML
    private Label lblGainPerteAdv;

    @FXML
    private ImageView imgCraqueleur;
    @FXML
    private ImageView imgTofu;
    @FXML
    private ImageView imgBouftou;
    @FXML
    private ImageView imgZoneMonstre;
    @FXML
    private ImageView imgMonstreBouftou;
    @FXML
    private ImageView imgMonstreTofu;
    @FXML
    private ImageView imgMonstreCraqueleur;
    @FXML
    private ImageView imgBoss;
    @FXML
    private ImageView imgAleaRencontre;
    @FXML
    private ImageView imgPotionRappel;
    @FXML
    private ImageView imgZoneAstrub;
    @FXML
    private ImageView imgAttaque;
    @FXML
    private ImageView imgDefense;
    @FXML
    private ImageView imgFuite;
    @FXML
    private ImageView imgSoin;
    private boolean verouilleChange = false;
    private boolean estDansCombat;
    private Monstre monstreCourant;
    @FXML
    private ImageView imgJouer;
    @FXML
    private ImageView imgFond;
    @FXML
    private ImageView imgFlecheVerte;
    @FXML
    private ImageView imgFlecheRouge;
    @FXML
    private ImageView imgBarreDuHaut;
    @FXML
    private ImageView imgBarreDuBas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clearAll();
        apChoix.setVisible(true);
        unPointVingtNeuf = true;
        lvClasses.getItems().add("Sram");
        lvClasses.getItems().add("Iop");
        lvClasses.getItems().add("Cra");
        lvClasses.getItems().add("Feca");
        lvClasses.getItems().add("Pandawa");
        lvClasses.getItems().add("Xelor");
        lvClasses.getItems().add("Sadida");
        lvClasses.getItems().add("Osamodas");
        lvClasses.getItems().add("Sacrieur");
        lvClasses.getItems().add("Eniripsa");
        lvClasses.getItems().add("Enutrof");
        lvClasses.getItems().add("Ecaflip");
        lvClasses.getSelectionModel().selectFirst();
        Event e = new Event(null);
        clickChangeClasse(e);
        estDansCombat = false;
    }
    @FXML
    public void onClickCreatePerso(MouseEvent mouseEvent) {
        p = new Personnage(txtNomPerso.getText(), c);
        clearAll();
        apChoixAction.setVisible(true);
        verouilleChange = true;
        imagePerso = new Image(getClass().getResource("/Images/"+deuxPointZero+"Classe/" +  p.getClasseDuPerso().getLogoURL()).toExternalForm());
    }
    public void clearAll(){
        apBouftou.setVisible(false);
        apTofu.setVisible(false);
        apCraqueleur.setVisible(false);
        hbSorts.setVisible(false);
        apAstrub.setVisible(false);
        apZoneMonstre.setVisible(false);
        apChoixAction.setVisible(false);
        apMaison.setVisible(false);
        apBarreBasse.setVisible(true);
        apChoix.setVisible(false);
        combatClear();



    }
    public int randInter(int a, int b) {
        int randomNumber = (int) (Math.random() * (b - a + 1)) + a;

        return randomNumber;
    }
    public void combatClear() {
        lblPVAdv.setVisible(false);
        lblPVMaxAdv.setVisible(false);
        lblPVPerso.setVisible(false);
        lblPVMaxPerso.setVisible(false);
        lblSlash.setVisible(false);
        lblSlashBis.setVisible(false);
        imgVitaAdv.setVisible(false);
        imgVitaPerso.setVisible(false);
        hbSorts.setVisible(false);
        apCombatPersonnages.setVisible(false);
    }
    public void combatAff() {
        lblPVAdv.setVisible(true);
        lblPVMaxAdv.setVisible(true);
        lblPVPerso.setVisible(true);
        lblPVMaxPerso.setVisible(true);
        lblSlash.setVisible(true);
        lblSlashBis.setVisible(true);
        imgVitaAdv.setVisible(true);
        imgVitaPerso.setVisible(true);
        hbSorts.setVisible(true);
        apCombatPersonnages.setVisible(true);
    }








    public int alea()
    {
        return (int)(Math.random() * 101);  // 0 to 100
    }
    public Monstre aleatoireMonstre(Monstre m1, Monstre m2, Monstre m3) {
        Monstre m;
        int randomNumber = alea();

        if (randomNumber < 60)
            m = m1;
        else if(randomNumber < 90)
            m = m2;
        else
            m = m3;

        return m;
    }
    public void writeRapideInt(Label lblTexte, int intTexte)
    {
        lblTexte.setText(Integer.toString(intTexte));
    }


    public void clickGoToMarchand(MouseEvent mouseEvent) {
    }

    public void clickGoToPerso(MouseEvent mouseEvent) {
        clearAll();
        apMaison.setVisible(true);
        lblAir.setText(Integer.toString((p.getStatAir())));
        lblTerre.setText(Integer.toString((p.getStatTerre())));
        lblFeu.setText(Integer.toString((p.getStatFeu())));
        lblEau.setText(Integer.toString((p.getStatEau())));
        lblVitaMax.setText(Integer.toString((p.getStatVitaMax())));
        lblVita.setText(Integer.toString((p.getStatVita())));
        imgPersonnage.setImage(imagePerso);
        lblDef.setText((Integer.toString(p.getDefense())));
        lblAttaque.setText(Integer.toString(p.getAttaque()));
        lblCritique.setText(Integer.toString(p.getCritique()));
        lblFuite.setText(Integer.toString(p.getFuite()));
        lblEsquive.setText(Integer.toString(p.getEsquive()));
        lblProspection.setText(Integer.toString(p.getProspection()));
        lblSoin.setText(Integer.toString(p.getSoin()));
        writeRapideInt(lblKama, p.getNombreKama());
    }

    public void clickGoToZaap(MouseEvent mouseEvent) {
        clearAll();
        apAstrub.setVisible(true);
    }

    public void fight(){

    }
    public void setClasse(ClassePerso classe) {

        //Image imageLogo = new Image(getClass().getResource("/Images/Logo/" +deuxPointZero+ classe.getLogoURL()).toExternalForm());
        Image imageLogo = new Image(getClass().getResource("/Images/" + deuxPointZero + "Logo/" + classe.getLogoURL()).toExternalForm());
        Image imageBonus = new Image(getClass().getResource("/Images/stat" + classe.getBonus() + ".png").toExternalForm());
        Image imageMalus = new Image(getClass().getResource("/Images/stat" + classe.getMalus() + ".png").toExternalForm());
        //Image imagePerso = new Image(getClass().getResource("/Images/Classe/" +deuxPointZero+ classe.getLogoURL()).toExternalForm());
        Image imagePerso = new Image(getClass().getResource("/Images/" + deuxPointZero + "Classe/"+ classe.getLogoURL()).toExternalForm());

        txtClasses.setPromptText(classe.getDescription());
        Font f = new Font("Franklin Gothic Medium", 18);
        txtClasses.setFont(f);
        imgLogoClasse.setImage(imageLogo);
        imgBonusStat.setImage(imageBonus);
        imgMalusStat.setImage(imageMalus);
        imgClasseChoix.setImage(imagePerso);
        lblNomClasse.setText(classe.getNom().toUpperCase());
    }
    @FXML
    public void clickChangeClasse(Event event) {

        if ("Iop".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(iop);
            c = iop;
        } else if ("Ecaflip".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(ecaflip);
            c = ecaflip;
        } else if ("Cra".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(cra);
            c = cra;
        } else if ("Eniripsa".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(eniripsa);
            c = eniripsa;
        } else if ("Feca".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(feca);
            c = feca;
        } else if ("Sadida".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(sadida);
            c = sadida;
        } else if ("Pandawa".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(pandawa);
            c = pandawa;
        } else if ("Osamodas".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(osamodas);
            c = osamodas;
        } else if ("Xelor".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(xelor);
            c = xelor;
        } else if ("Sram".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(sram);
            c = sram;
        } else if ("Enutrof".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(enutrof);
            c = enutrof;
        } else if ("Sacrieur".equals(lvClasses.getSelectionModel().getSelectedItem().toString()) ) {
            setClasse(sacrieur);
            c = sacrieur;
        }
    }

    public void attaqueMonstre(Monstre monstreCombat)
    {
        p.perdrePDV(monstreCombat.getAttaque());
        writeRapideInt(lblPVPerso, p.getStatVita());
        lblGainPertePerso.setText("-" + Integer.toString(p.getAttaque()));

        return;
    }





    public void changeImageViewImg(ImageView imgView, String linkImage){
        imgView.setImage(new Image(getClass().getResource(linkImage).toExternalForm()));
    }
    public void setImageMonstre(Monstre m, String linkImage)
    {
        m.setImg(getClass().getResource(linkImage).toExternalForm());
    }
    public void clickChangeVersion(MouseEvent mouseEvent) {
        if(verouilleChange)
            changeImageViewImg(imgPersonnage, "/Images/"+deuxPointZero+"Classe/"+p.getClasseDuPerso().getLogoURL());
        if(unPointVingtNeuf == true)
        {
            unPointVingtNeuf = false;
            deuxPointZero = "deuxPointZero/";
        }
        else
        {
            unPointVingtNeuf = true;
            deuxPointZero = "";
        }
        changeImageViewImg(imgZoneAstrub, "/Images/"+deuxPointZero+"zoneChoix.PNG");
        changeImageViewImg(imgZoneMonstre, "/Images/"+deuxPointZero+"zoneMonstre.PNG");
        changeImageViewImg(imgMonstreBouftou, "/Images/"+deuxPointZero+"monstreBouftou.PNG");
        changeImageViewImg(imgMonstreTofu, "/Images/"+deuxPointZero+"monstreTofuMineur.PNG");
        changeImageViewImg(imgMonstreCraqueleur, "/Images/"+deuxPointZero+"monstreCraqueleur.PNG");
        changeImageViewImg(imgBouftou, "/Images/"+deuxPointZero+"zoneBouftou.PNG");
        changeImageViewImg(imgTofu, "/Images/"+deuxPointZero+"zoneTofu.PNG");
        changeImageViewImg(imgCraqueleur, "/Images/"+deuxPointZero+"zoneCraqueleur.PNG");
        changeImageViewImg(imgJouer,"/Images/"+deuxPointZero+"interfaceValider.PNG");
        changeImageViewImg(imgFond, "/Images/"+deuxPointZero+"zoneMenu.PNG");
        if(estDansCombat) {
            changeImageViewImg(imgAdversaire, "/Images/"+deuxPointZero+m.getImg());
            changeImageViewImg(imgPersonnageCbt, "/Images/"+deuxPointZero+"Classe/"+p.getClasseDuPerso().getLogoURL());

        }
        Event e = new Event(null);
        clickChangeClasse(e);
        changeImageViewImg(imgFlecheVerte, "/Images/"+deuxPointZero+"FlecheVerte.png");
        changeImageViewImg(imgFlecheRouge, "/Images/"+deuxPointZero+"FlecheRouge.png");
        changeImageViewImg(imgBarreDuHaut,"/Images/"+deuxPointZero+"barreWindows.png");
        changeImageViewImg(imgBarreDuBas,"/Images/"+deuxPointZero+"fond.png");
        /*
        setImageMonstre(monstreBouftou, deuxPointZero+"monstreBouftou.PNG" );
        setImageMonstre(monstreTofu, deuxPointZero+"monstreTofu.PNG" );
        setImageMonstre(monstreCraqueleur, deuxPointZero+"monstreCraqueleur.PNG" );
        */
    }

    @FXML
    public void clickGoToBouftou(Event event) {
        clearAll();
        intNumberZone = 2;
        apBouftou.setVisible(true);
        apZoneMonstre.setVisible(true);
    }

    @FXML
    public void clickGoToTofu(Event event) {
        clearAll();
        intNumberZone = 1;
        apTofu.setVisible(true);
        apZoneMonstre.setVisible(true);
    }

    @FXML
    public void clickGoToCraqueleur(Event event) {
        clearAll();
        intNumberZone = 3;
        apCraqueleur.setVisible(true);
        apZoneMonstre.setVisible(true);
    }

    @FXML
    public void clickGoToBoss(Event event) {
    }

    @FXML
    public void clickGoToAlea(Event event) {
        Image imageAdversaire;
        if (true) {
            clearAll();
            combatAff();
            estDansCombat = true;
            imgPersonnageCbt.setImage(imagePerso);
            if (intNumberZone == 1) {
                apTofu.setVisible(true);
                m = aleatoireMonstre(monstreTofuMineur, monstreTofu, monstreTofuMajeur);
            } else if (intNumberZone == 2) {
                apBouftou.setVisible(true);
                m = aleatoireMonstre(monstreBouftouMineur, monstreBouftou, monstreBouftouMajeur);
            } else if (intNumberZone == 3) {
                apCraqueleur.setVisible(true);
                m = aleatoireMonstre(monstreCraqueleurMineur, monstreCraqueleur, monstreCraqueleurMajeur);
            } else {
                m = aleatoireMonstre(monstreCraqueleurRoyal, monstreBouftouRoyal, monstreTofuRoyal);
            }
            imageAdversaire = new Image(getClass().getResource("/Images/"+deuxPointZero+m.getImg()).toExternalForm());
            m.setPvActuel(m.getPvMax());
            imgAdversaire.setImage(imageAdversaire);
            int intPvRestantHero = p.getStatVita();
            int intPvRestantAdvs = m.getPvMax();
            lblNomDuMonstre.setText(m.getNom().toUpperCase());
            lblNomDuPersonnage.setText(p.getNom().toUpperCase());
            writeRapideInt(lblPVPerso, intPvRestantHero);
            writeRapideInt(lblPVMaxPerso, p.getStatVitaMax());
            writeRapideInt(lblPVAdv, intPvRestantAdvs);
            writeRapideInt(lblPVMaxAdv, intPvRestantAdvs);
        }
        else
        {
            System.out.println("Trouver le coffre");
        }
    }

    @FXML
    public void clickGoToAstrub(Event event) {
        clearAll();
        apChoixAction.setVisible(true);
    }

    @FXML
    public void clickAttaque(Event event) {
        m.perdrePDV(p.getAttaque());
        writeRapideInt(lblPVAdv, m.getPvActuel());
        if(m.getPvActuel() <= 0)
        {
            int gain = randInter(m.getKamaGagneMin(),m.getKamaGagneMax());
            p.gainKama(gain);
            clearAll();
            apChoixAction.setVisible(true);
            estDansCombat = false;

            return;
        }
        attaqueMonstre(m);
    }

    @FXML
    public void clickDefense(Event event) {
    }

    @FXML
    public void clickFuite(Event event) {
        int probaFuite = alea();
        if (p.getFuite()<probaFuite) {
            clearAll();
            apChoixAction.setVisible(true);
            estDansCombat = false;
            return;
        }
        attaqueMonstre(m);
    }

    @FXML
    public void clickSoin(Event event) {
        p.gainPDV();
        int gainPerso = p.gainPDV();
        lblGainPertePerso.setText("+" + Integer.toString(gainPerso));
        writeRapideInt(lblPVPerso, p.getStatVita());
        lblGainPerteAdv.setText("");
    }


}