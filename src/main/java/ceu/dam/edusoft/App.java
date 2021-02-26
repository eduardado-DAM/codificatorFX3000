package ceu.dam.edusoft;

import ceu.dam.edusoft.controller.AppController;
import ceu.dam.edusoft.controller.FXMLPATH;
import ceu.dam.edusoft.controller.MainSceneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        // Primera carga del Scene
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(FXMLPATH.Scene.MAIN_SCENE));
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent, 640, 480);
        stage.setScene(scene);
        stage.show();

        // CONTROLLER DEVICE
        AppController.setStage(stage); //le pasa el Stage al controlador principal (atributo estático por lo que no es necesario cargar la instancia de la clase)
        MainSceneController mainSceneController = fxmlLoader.getController(); //obtengo el controlador de MainScene
        mainSceneController.init();
        //le pasa la referencia del borderpane del mainScene
        AppController.setMainPanel(mainSceneController.getMainBorderPane());
    }

    public static void main(String[] args) {
        launch();
    }

}