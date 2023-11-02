package eiu.cit.netprog;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class getByID {
    public static void main(String[] args) throws UnknownHostException, SocketException {
        InetAddress local = InetAddress.getByName("127.0.0.1");

        NetworkInterface ni = NetworkInterface.getByInetAddress(local);

        if (ni == null) {

            System.err.println("That's weird. No local loopback address.");

        } else {

            System.out.println(ni);

        }
    }
}
