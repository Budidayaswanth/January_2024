package org.Jan.jfs.oop.Interface;

interface Game{
    void start();
    void play();
    void stop();
}
abstract class AbstractGame implements Game{
    public void start(){
        System.out.println("the Game "+getClass().getSimpleName()+" Started");
    }
    public void stop(){
        System.out.println("the Game "+getClass().getSimpleName()+" Started ");
    }
}
class car extends AbstractGame implements Game{
    @Override
    public void play(){
        System.out.println("playing the Race "+getClass().getSimpleName()+" Game  Wear Seat Belt ");
    }
}
class Bike extends AbstractGame implements Game{
    @Override
    public void play(){
        System.out.println("playing "+getClass().getSimpleName()+" Game Wear Helmet andLife Jacket ");
    }
}
class Ship extends AbstractGame implements Game{
    @Override
    public void play(){
        System.out.println("Playing "+getClass().getSimpleName()+" Game Wear Life Jacket ");
    }
}
public class InterfaceAndAbstractClass {
    public static void main(String[] args) {
        Game game =new car()    ;
        game.start();
        game.play();
        game.stop();
    }
}
