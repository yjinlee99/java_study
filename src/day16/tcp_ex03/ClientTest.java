package day16.tcp_ex03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) {
        Socket s = null;

        try {
            s = new Socket("127.0.0.1", 9000); // server ip & port number

            // I / O
            InputStream is = s.getInputStream(); // read
            OutputStream os = s.getOutputStream(); // write

            String str = "안녕하세요 Server 님 !!";
            os.write(str.getBytes());

            byte[] buffer = new byte[100];
            is.read(buffer);
            System.out.println(new String(buffer));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
