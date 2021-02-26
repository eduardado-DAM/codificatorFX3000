package ceu.dam.edusoft.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {



    public void initServer(Integer port){
        InitServerTask initServerTask = new InitServerTask(port);
        Thread thread = new Thread(initServerTask);
        thread.start();
    }
}
