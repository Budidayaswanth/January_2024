package org.Java.di.rating;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerRattingService {
    private final PlayerSeedData playerSeedData;
    public List<PlayerRating> getPlayersRating(){
        List<Player> players =playerSeedData.getPlayers();
        List<PlayerRating> PlayerRatings =new ArrayList<>();
        for (Player player:players){
            int rating =(int) (Math.random()*10)+1;
            PlayerRating playerRating =new PlayerRating(player.name(),rating);
            PlayerRatings.add(playerRating);
        }
        return PlayerRatings;
    }
}
