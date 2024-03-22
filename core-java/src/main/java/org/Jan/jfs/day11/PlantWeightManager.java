package org.Jan.jfs.day11;

public class PlantWeightManager {
    public static void main(String[] args) {
        double weightOnEarth =  83;
        double mass =weightOnEarth/Planet.EARTH.surfaceGravity();
        for (Planet p :Planet.values()){
            System.out.println("Weight On "+p+" is "+p.surfaceWeight(mass)+" Kg");
        }
    }
}
