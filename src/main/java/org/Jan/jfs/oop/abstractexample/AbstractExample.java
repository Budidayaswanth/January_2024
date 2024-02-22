package org.Jan.jfs.oop.abstractexample;
abstract class MusicInstrument{
    void watch(){
        System.out.println("Watch");
    }
    abstract void BookTickets();
}
class Movie extends MusicInstrument{
    @Override
    public void BookTickets(){
        System.out.println("For Movie KGF ");
    }
    @Override
    void watch(){
        System.out.println("Movie Watching");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        MusicInstrument musicInstrument=new Movie();
        musicInstrument.watch();
        musicInstrument.BookTickets();
    }
}
