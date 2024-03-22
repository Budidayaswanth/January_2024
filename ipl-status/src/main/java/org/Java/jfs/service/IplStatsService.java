package org.Java.jfs.service;

import org.Java.jfs.domain.Player;
import org.Java.jfs.dto.TeamStats;

import java.util.List;
import java.util.Map;

public interface IplStatsService {
    List<String> getTeamService();
    Map<String,List<Player>>getMaxPaidPlayersOfEachRole();
    Map<String,Map<String,List<Player>>>getMaxPaidPlayersOfEachTeamAndRoleWise();
    List<TeamStats> getTestStats();
    List<TeamStats>  getMaxTopAmountSpentTeams();
    List<Player> getNthHighestPaidPlayers(int n);
}
