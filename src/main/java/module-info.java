module sio.tp1projetfus {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.tp1projetfus to javafx.fxml;
    exports sio.tp1projetfus;
}