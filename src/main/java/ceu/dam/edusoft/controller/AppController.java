package ceu.dam.edusoft.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class AppController {

    private static Stage stage;
    protected static BorderPane mainBorderPane;
    private Map<String, Object> parameters;


    public AppController() {
        parameters = new HashMap<>(); //instanciación del mapa que almacena información no persistente de la app
    }

    public static void setMainPanel(BorderPane borderPane) {
        mainBorderPane = borderPane;
    }

    /**
     * Establece los parámetros
     *
     * @param parameters
     */
    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        AppController.stage = stage;
    }

    /**
     * Cambia escenas
     *
     * @param fxmlPath
     * @throws IOException
     */
    public void changeScene(String fxmlPath) throws IOException {
        //Carga de escena
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPath));
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent, 640, 480);
        getStage().setScene(scene);

        //Controller
        AppController controller = fxmlLoader.getController(); //obtenemos el controller de la escena que hayamos cargado
        controller.init(); //invocamos el método, que contiene aquellas acciones que queremos que ocurran siempre cuando se carga una escena
        /*
            Qué hace esta línea:
                - Cada clase controladora hereda de AppController
                - AppController establece que ella y todas sus clases hijas tendrán un hashmap
                - Cuando ejecutamos controller.setParameters(parameters)
                    - Le estamos pasando la referencia del hashMap de la clase padre a la clase hija
                    - De esta manera siempre habrá accesible un hashmap que se va pasando entre controladores
         */
        controller.setParameters(parameters);


    }

    /**
     * Cambia el espacio central del BorderPane con un Anchor pane que le pasemos por parámetro
     *
     * @param fxmlPanel
     * @throws IOException
     */
    public void changePane(String fxmlPanel) throws IOException {
        //cargamos el panel
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPanel));
        AnchorPane anchorPane = fxmlLoader.load();

        mainBorderPane.setCenter(anchorPane); //


    }


    /**
     * Carga inicial de datos y componentes de la escena
     */
    public abstract void init();

    /**
     * Guarda los datos de entrada, selección de los usuarios
     */
    protected abstract void saveState();

    protected abstract void loadState();


    public abstract void setMainPane();
}
