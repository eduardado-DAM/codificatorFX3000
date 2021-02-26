package ceu.dam.edusoft.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainMenuController extends AppController {

    @FXML
    private Button btWindow;

    @FXML
    private BorderPane bpWindow;

    @FXML
    void changeWindow(ActionEvent event) throws IOException {
        changePane(FXMLPATH.Panel.CIFRAR_PANEL);
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

    public BorderPane getBpWindow() {
        return bpWindow;
    }
}
