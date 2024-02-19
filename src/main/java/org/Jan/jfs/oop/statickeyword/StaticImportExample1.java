package org.Jan.jfs.oop.statickeyword;

import java.io.PrintStream;

import static org.Jan.jfs.oop.statickeyword.lws.console;

class lws{
    public static PrintStream console =System.out;
}
public class StaticImportExample1 {
    public static void main(String[] args) {
        console.println("Hello");
    }
}
