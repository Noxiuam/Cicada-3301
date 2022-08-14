package gq.noxiuam.cicada.onionhasher.feature;

import gq.noxiuam.cicada.onionhasher.data.OnionPage;
import gq.noxiuam.cicada.onionhasher.util.HashUtil;

import java.util.*;

public class DWHFeature {

    private final List<OnionPage> v2OnionAddresses = new ArrayList<>();

    private static final String DEEP_WEB_HASH = "";

    /**
     * Not yet implemented.
     *
     * Will manually look for offline and online addresses alike if told to do so.
     */
    public void loadV2OnionIndex(boolean lookForOfflineOnions) {
        // TODO: Load the v2 index.

        this.search();
    }

    public void search() {
        String prefix = "[DeepWebHash] ";
        String currentHash;

        for (OnionPage onion : this.v2OnionAddresses) {
            currentHash = HashUtil.getSHA512(onion.getOnionAddress());
            if (currentHash.equals(DEEP_WEB_HASH)) {
                System.out.println(prefix + "Eureka! We've found the page, time to alert the community that " + onion.getOnionAddress() + " is the one we have been looking for."); // lol, obviously would be more excited in person.
            } else {
                System.err.println(prefix + currentHash + " is not a match. :(");
            }
        }
    }

}
