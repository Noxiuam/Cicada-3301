package gq.noxiuam.cicada.onionhasher.util;

import lombok.SneakyThrows;
import java.net.*;

public class OnionUtil {

    /**
     * A basic method that uses Socks to ping a TOR Address.
     *
     * @param onionAddress - The address that gets pinged to see if it's still online.
     */
    @SneakyThrows
    public static boolean isOnionOnline(String onionAddress) {
        try {
            InetSocketAddress localProxy = new InetSocketAddress("127.0.0.1", 9150);
            InetSocketAddress address = InetSocketAddress.createUnresolved(onionAddress, 80);

            Proxy proxy = new Proxy(Proxy.Type.SOCKS, localProxy);
            Socket socket = new Socket(proxy);

            socket.connect(address);
            return true;
        } catch (SocketException e) {
            return false;
        }
    }

}
