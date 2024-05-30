package org.Jan.jfs.cbook;

public class CidGenerator {
    private static int count = 1001;

    public static String generateCid() {
        return "Cid-" + count++;
    }
}
