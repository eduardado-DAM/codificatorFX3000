package ceu.dam.edusoft.server;

import javafx.concurrent.Task;

import java.net.ServerSocket;
import java.net.Socket;

public class InitServerTask extends Task<Void> {

    private Integer port;

    public InitServerTask(Integer port) {
        this.port = port;
    }

    @Override
    protected Void call() throws Exception {
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Waiting request");
        Socket clientSocket = serverSocket.accept();
        System.out.println("Petición recibida");
        return null;
    }
}
