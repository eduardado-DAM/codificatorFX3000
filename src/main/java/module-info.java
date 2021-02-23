module ceu.dam.edusoft {
    requires javafx.controls;
    requires javafx.fxml;

    opens ceu.dam.edusoft to javafx.fxml;
    exports ceu.dam.edusoft;
}