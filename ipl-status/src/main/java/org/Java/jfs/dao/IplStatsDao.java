package org.Java.jfs.dao;

import org.Java.jfs.domain.Player;
import org.Java.jfs.dto.TeamStats;

import java.util.List;

public interface IplStatsDao {
    List<String> getTeamNames();
    List<Player> getMaxPaidPlayersOfEachRole();
    List<Player> getMaxPaidPlayersOfEachRoleOfEachTeam();
    List<TeamStats> getTestStats();
    List<TeamStats> getMaxTopAmountSpentTeams();
    List<Player>getNthHighestPaidPlayers(int n);
    Player getPlayerByName(String playerName);
}
