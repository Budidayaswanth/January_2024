package org.Jan.jfs.collections.properties;

import lombok.Data;
import org.yaml.snakeyaml.Yaml;

@Data
class Player{
    private  String name;
    private String role;
    private String team;
    private double amount;
    private String country;
}
public class AssignmentQuestionYaml {
    public static void main(String[] args) {
        Iterable<Object> players =getPlayersDetails();
        players.forEach(System.out::println);
    }

    public static Iterable<Object> getPlayersDetails() {
        Yaml yaml=new Yaml();
        Iterable<Object> players=yaml.loadAll(AssignmentQuestionYaml.class.getResourceAsStream("/players.yaml"));
        return players;
    }

}
