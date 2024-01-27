package sio.tp1projetfus;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.net.URL;
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

    int intNumberZone = 0;
    @FXML
    private AnchorPane apMaison;
    @FXML
    private AnchorPane apChoixAction;

    /*
    0 = Astrub
    1 = Tofu
    2 = Bouftou
    3 = Craqueleur
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clearAll();
        apChoixAction.setVisible(true);
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

    }
    public void clickFuite(MouseEvent mouseEvent) {
        clearAll();
        apChoixAction.setVisible(true);
    }

    public void clickGoToBouftou(MouseEvent mouseEvent) {
        clearAll();
        intNumberZone = 2;
        apBouftou.setVisible(true);
        apZoneMonstre.setVisible(true);


    }

    public void clickGoToTofu(MouseEvent mouseEvent) {
        clearAll();
        intNumberZone = 1;
        apTofu.setVisible(true);
        apZoneMonstre.setVisible(true);

    }

    public void clickGoToCraqueleur(MouseEvent mouseEvent) {
        clearAll();
        intNumberZone = 3;
        apCraqueleur.setVisible(true);
        apZoneMonstre.setVisible(true);

    }

    public void clickGoToAstrub(MouseEvent mouseEvent) {
        clearAll();
        apChoixAction.setVisible(true);
    }

    public void clickGoToAlea(MouseEvent mouseEvent) {
        //Event croiser un monstre ou trouver un coffre
        if (true) {
            clearAll();
            if (intNumberZone == 1) {
                apTofu.setVisible(true);
                hbSorts.setVisible(true);

            } else if (intNumberZone == 2) {
                apBouftou.setVisible(true);
                hbSorts.setVisible(true);

            } else if (intNumberZone == 3) {
                apCraqueleur.setVisible(true);
                hbSorts.setVisible(true);

            } else {
                System.out.println("Error");
            }
        }
        else
        {
            System.out.println("Trouver le coffre");
        }
    }

    public void clickGoToBoss(MouseEvent mouseEvent) {
    }

    public void clickGoToMarchand(MouseEvent mouseEvent) {
    }

    public void clickGoToPerso(MouseEvent mouseEvent) {
    }

    public void clickGoToZaap(MouseEvent mouseEvent) {
        clearAll();
        apAstrub.setVisible(true);
    }
}