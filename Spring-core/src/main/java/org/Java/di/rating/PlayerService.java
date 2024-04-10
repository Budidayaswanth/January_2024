package org.Java.di.rating;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerSeedData playerSeedData;
    private final PlayerRattingService playerRattingService;

    public List<PlayerWithRatting> getPlayerWithRatting() {
        List<Player> players = playerSeedData.getPlayers();
        List<PlayerRating> playerRatings = playerRattingService.getPlayersRating();
        Map<String, Player> playerMap = players.stream().collect(Collectors.toMap(Player::name, Function.identity()));
        Map<String, PlayerRating> playerRatingMap = playerRatings.stream().collect(Collectors.toMap(PlayerRating::name, Function.identity()));
        List<PlayerWithRatting> playerWithRattings = new ArrayList<>();
        for (Player player : players) {
            PlayerRating playerRating = playerRatingMap.get(player.name());
            PlayerWithRatting playerWithRatting = new PlayerWithRatting(player.name(), player.role(), player.country(), playerRating.rating());
            playerWithRattings.add(playerWithRatting);

        }
        return playerWithRattings;
    }
}
