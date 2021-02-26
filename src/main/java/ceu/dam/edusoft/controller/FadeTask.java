package ceu.dam.edusoft.controller;

import javafx.concurrent.Task;

public class FadeTask extends Task<Void> {

    private MainMenuController mainMenuController;
    public FadeTask(MainMenuController mainMenuController) {
        this.mainMenuController = mainMenuController;
    }

    @Override
    protected Void call() throws Exception {
        mainMenuController.fade(mainMenuController.getIvDarkLogo());
        return null;
    }

    @Override
    protected void succeeded() {
        mainMenuController.setIvDarkLogo(null); //se deshace del imgview todo esto es necesario?

    }

    @Override
    protected void failed() {
    }


}
