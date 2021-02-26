package ceu.dam.edusoft.controller;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

import java.io.IOException;

public class MainMenuController extends AppController implements EventHandler {

    @FXML
    private Label lbCifrar;

    @FXML
    private Label lbDescifrar;

    @FXML
    private Label lbLoadPubK;

    @FXML
    private Label lbLoadPriKey;

    @FXML
    private Button btLoadPrivateKey;

    @FXML
    private Button btLoadPublicKey;

    @FXML
    private Button btDecifer;

    @FXML
    private Button btCifer;

    @FXML
    private ImageView ivDarkLogo;


    @FXML
    private BorderPane bpWindow;

    @FXML
    void changeWindow(ActionEvent event) throws IOException {
        changePane(FXMLPATH.Panel.CIFRAR_PANEL);
    }

    @Override
    public void init() {

        fadeLogo();

        addButtonEvents();

        labelTransparent();


    }

    /**
     * Evita que el texto de los botones sea sensible al ratón y estropee los efectos
     */
    private void labelTransparent() {
        lbCifrar.setMouseTransparent(true);
        lbDescifrar.setMouseTransparent(true);
        lbLoadPriKey.setMouseTransparent(true);
        lbLoadPubK.setMouseTransparent(true);
    }

    /**
     * Añade eventos de entrada y salida de ratón en botones
     */
    private void addButtonEvents() {
        btCifer.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, this);
        btCifer.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, this);

        btDecifer.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, this);
        btDecifer.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, this);

        btLoadPublicKey.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, this);
        btLoadPublicKey.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, this);

        btLoadPrivateKey.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, this);
        btLoadPrivateKey.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, this);
    }

    /**
     * Lanza un hilo que hace desaparecer al logo
     */
    private void fadeLogo() {
        FadeTask fadeTask = new FadeTask(this);
        Thread thread = new Thread(fadeTask);
        thread.start();
    }


    public void fade(ImageView imageView) { //todo debería mover este método?
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(3000));
        fadeTransition.setNode(imageView);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();
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

    public ImageView getIvDarkLogo() {
        return ivDarkLogo;
    }

    public void setIvDarkLogo(ImageView ivDarkLogo) {
        this.ivDarkLogo = ivDarkLogo;
    }


    @Override
    public void handle(Event event) {

        Glow glow = new Glow();
        glow.setLevel(10);
        if (event.getEventType().equals(MouseEvent.MOUSE_ENTERED)) {
            ((Button) event.getSource()).setEffect(glow);
        }
        if (event.getEventType().equals(MouseEvent.MOUSE_EXITED)) {
            ((Button) event.getSource()).setEffect(null);
        }


    }
}
