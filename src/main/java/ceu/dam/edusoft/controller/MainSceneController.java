package ceu.dam.edusoft.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainSceneController extends AppController {

    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private MenuItem menuItemCifrar;

    @FXML
    private MenuItem menuItemDescifrar;

    @FXML
    void stageCiferPanel(ActionEvent event) throws IOException {
        changePane(FXMLPATH.Panel.CIFRAR_PANEL);
    }

    @FXML
    void stageDeciferPanel(ActionEvent event) throws IOException {
        changePane(FXMLPATH.Panel.DECIFER_PANEL);
    }


    @Override
    public void init() {

    }

    @Override
    protected void saveState() {

    }

    @Override
    protected void loadState() {

    }

    @Override
    public BorderPane getBpWindow() {
        return null;
    }

    public BorderPane getMainBorderPane() {
        return mainBorderPane;
    }
}
