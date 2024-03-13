package org.Jan.jfs.collections.sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerManager {
    public static void main(String[] args) {
        List<Player> players =loadplauers();
        List<Player> shortList =players.stream().sorted(Comparator.comparing(Player::getAmount).reversed().thenComparing(Player::getCountry).thenComparing(Player::getTeam)).toList();
        shortList.forEach(System.out::println);

        List<Player> topPaidPlayers =shortList.stream().skip(1).limit(3).toList();
        System.out.println("Top paid Players are "+topPaidPlayers);

        Map<String,List<Player>> map =new HashMap<>();


    }

    private static List<Player> loadplauers() {
        return List.of(
                new Player("Dhoni","WK","IND","CSK",1800000),
                new Player("Rohit","Batsman","IND","MI",1600000),
                new Player("Raina","All-rounder","IND","CSK",1200000),
        new Player("Rohit", "Batsman", "IND", "MI", 1800000),
                new Player("Warner", "Batsman", "AUS", "SRH", 1800000),
                new Player("Buttler", "WK", "ENG", "RR", 1400000),
                new Player("Smith", "Batsman", "AUS", "RR", 1300000),
                new Player("Williamson", "Batsman", "NZ", "SRH", 1800000),
                new Player("Rahul", "Batsman", "IND", "KXIP", 1100000),
                new Player("Pandya", "All-rounder", "IND", "MI", 1000000),
                new Player("Russell", "All-rounder", "WI", "KKR", 900000)
        );
    }
}
