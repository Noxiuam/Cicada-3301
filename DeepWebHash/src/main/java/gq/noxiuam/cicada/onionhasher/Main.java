package gq.noxiuam.cicada.onionhasher;

import gq.noxiuam.cicada.onionhasher.util.OnionUtil;

public class Main {

    // used for debugging, will be removed once complete.
    private static final String V3_FACEBOOK_ONION = "facebookwkhpilnemxj7asaniu7vnjjbiltxjqhye3mhbshg7kx5tfyd.onion";
    private static final String V2_FACEBOOK_ONION = "facebookcorewwwi.onion";

    public Main() {
        // as stated before, was merely debugging.
        System.out.println(OnionUtil.isOnionOnline(V3_FACEBOOK_ONION));
    }

}
