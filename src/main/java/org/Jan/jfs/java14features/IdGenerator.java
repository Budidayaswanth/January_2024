package org.Jan.jfs.java14features;

public final class IdGenerator {
    private IdGenerator(){
    }
    public static String generateId(){
        return "BY"+System.currentTimeMillis();
    }
}
