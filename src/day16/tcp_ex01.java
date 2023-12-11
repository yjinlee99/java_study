package day16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class tcp_ex01 {
    public static void main(String[] args) {
        String host = "127.0.0.1"; //or 내 ip 주소

        try {
            InetAddress[] address = InetAddress.getAllByName(host);

            for(InetAddress item : address) {
                System.out.println(item);
                System.out.println(item.getCanonicalHostName());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
