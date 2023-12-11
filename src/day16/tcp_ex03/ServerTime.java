package day16.tcp_ex03;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTime {
    public static void main(String[] args) {
        int port = 7000;

        try {
            System.out.println("Server Start!!!");
            ServerSocket ss = new ServerSocket(port);

            while(true) {
                Socket s = ss.accept();

                OutputStream os = s.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);

                oos.writeObject(new Date());
                oos.flush();
                s.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
