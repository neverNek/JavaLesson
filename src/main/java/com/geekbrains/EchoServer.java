package com.geekbrains;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            Socket socket = serverSocket.accept(); // блокирующий метод
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream()); // получение сообщений
            DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // отправление сообщений
            while (true) {
                String message = in.readUTF(); // блокирующий метод
                System.out.println("Сообщение от клиента: " + message);
                // poison pill
                if ("/end".equalsIgnoreCase(message)) {
                    out.writeUTF("/end");
                    break;
                }
                out.writeUTF("echo: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        System.out.println("Сервер остановлен");
    }
}
