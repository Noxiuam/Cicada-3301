package gq.noxiuam.cicada.onionhasher.util;

import lombok.SneakyThrows;
import java.security.MessageDigest;

public class HashUtil {

    /**
     * A simple method that gets the hash of a string.
     * This will be used in hashing the actual address, which will use its own algorithm.
     *
     * @param data - Usually an onion address.
     */
    @SneakyThrows
    public static String getSHA512(String data) {
        // Since the hash is most likely SHA512, we'll automatically begin hashing the data with that method.
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(data.getBytes());

        byte[] rawBytes = md.digest();
        StringBuilder sb = new StringBuilder();

        for (byte digestedByte : rawBytes)
            sb.append(Integer.toString((digestedByte & 0xff) + 0x100, 16).substring(1));

        return sb.toString();
    }

}
