package org.Java.jfs.service;

import org.Java.jfs.dao.IplStatsDao;
import org.Java.jfs.dao.IplStatsDaoImpl;
import org.Java.jfs.domain.Player;
import org.Java.jfs.dto.TeamStats;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IplStatsServiceImpl implements IplStatsService {
    private IplStatsDao iplStatsDao = new IplStatsDaoImpl();

    @Override
    public List<String> getTeamService() {
        return iplStatsDao.getTeamNames();
    }

    @Override
    public Map<String, List<Player>> getMaxPaidPlayersOfEachRole() {

        Map<String, List<Player>> mapped = new HashMap<>();
        List<Player> players = iplStatsDao.getMaxPaidPlayersOfEachRole();
        for (Player s : players) {
            Player player = iplStatsDao.getPlayerByName(s.getName());
            if (player != null) {
                String role = player.getRole();
                mapped.computeIfAbsent(role, k -> new ArrayList<>()).add(player);
            }
        }
        mapped.forEach((k, v) -> System.out.println(k + ":" + v));
        return mapped;
    }

    @Override
    public Map<String, Map<String, List<Player>>> getMaxPaidPlayersOfEachTeamAndRoleWise() {
        Map<String, Map<String, List<Player>>> mapped = new HashMap<>();
        List<Player> playerName = iplStatsDao.getMaxPaidPlayersOfEachRoleOfEachTeam();
        for (Player player : playerName) {
            String teamName = player.getTeamName();
            String role = player.getRole();
            mapped.computeIfAbsent(teamName, k -> new HashMap<>())
                    .computeIfAbsent(role, k -> new ArrayList<>())
                    .add(player);
        }
        for (String teamName : mapped.keySet()) {
            Map<String, List<Player>> teamMap = mapped.get(teamName);
            System.out.println("Team" + teamName);
            for (String role : teamMap.keySet()) {
                List<Player> playerForRole = teamMap.get(role);
                System.out.println("Role" + role + " ,Players " + playerForRole);
            }
        }
        return mapped;
    }

    @Override
    public List<TeamStats> getTestStats() {
        return iplStatsDao.getTestStats();
    }

    @Override
    public List<TeamStats> getMaxTopAmountSpentTeams() {
        return iplStatsDao.getMaxTopAmountSpentTeams();
    }

    @Override
    public List<Player> getNthHighestPaidPlayers(int n) {
        if (iplStatsDao.getNthHighestPaidPlayers(n) == null) {
            throw new IllegalArgumentException("player with given id does not exists");
        }
        return iplStatsDao.getNthHighestPaidPlayers(n);
    }
}
