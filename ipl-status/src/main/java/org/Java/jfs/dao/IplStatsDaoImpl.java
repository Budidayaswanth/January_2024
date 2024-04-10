package org.Java.jfs.dao;

import org.Java.jfs.domain.Player;
import org.Java.jfs.dto.TeamStats;
import org.Java.jfs.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IplStatsDaoImpl implements IplStatsDao {
    private final String TEAM_NAMES = "select distinct team_name from player";
    private final String MaxPaid = "SELECT id, name, role, team_name, amount FROM (SELECT id, team_name, name, role, amount, ROW_NUMBER() OVER (PARTITION BY role ORDER BY amount DESC) AS rank FROM player) AS ranked_players WHERE rank = 1";
    private final String MaxPaidEachTeam = "SELECT id,name, role, team_name,  amount FROM ( SELECT id, name, role, team_name, amount, ROW_NUMBER() OVER (PARTITION BY team_name, role ORDER BY amount DESC) AS rank FROM player)as rank_player WHERE rank = 1";
    private final String TestStats = "select name,role,team_name, COUNT(*) AS total_players, AVG(amount) AS average_salary, MIN(amount) AS min_salary, MAX(amount) AS max_salary from player group by name,team_name,role";
    private final String NthPlayer = "select id,name,role,team_name,amount from (select id,name,role,team_name,amount,dense_rank() over (order by amount DESC)as rnk from player ) t where t.rnk=?";
    private final String AmountSpent = "WITH TeamAmounts AS (SELECT team_name, SUM(amount) AS total_amount_spent FROM player GROUP BY team_name)SELECT p.name, p.role,p.team_name,COUNT(*) AS total_players,AVG(p.amount) AS average_salary, MIN(p.amount) AS min_salary,MAX(p.amount) AS max_salary FROM player p JOIN TeamAmounts ta ON p.team_name = ta.team_name WHERE ta.total_amount_spent = (SELECT MAX(total_amount_spent) FROM TeamAmounts )GROUP BY p.name, p.role, p.team_name";
    private final String query = "SELECT * FROM player WHERE name = ?";

    @Override
    public List<String> getTeamNames() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List<String> list = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(TEAM_NAMES);
            while (rs.next()) {
                String s = rs.getString("team_name");
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Error is :" + e.getMessage());
        } finally {
            ConnectionUtil.close(con, st, rs);
        }
        return list;
    }

    @Override
    public List<Player> getMaxPaidPlayersOfEachRole() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        Player player = null;
        List<Player> list = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(MaxPaid);
            while (rs.next()) {
                IplStatsDaoImpl imp = new IplStatsDaoImpl();
                player = imp.toPlayer(rs);
                list.add(player);
            }
        } catch (SQLException e) {
            System.out.println("Error is :" + e.getMessage());
        } finally {
            ConnectionUtil.close(con, st, rs);
        }

        return list;
    }

    @Override
    public List<Player> getMaxPaidPlayersOfEachRoleOfEachTeam() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        Player player = null;
        List<Player> list = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(MaxPaidEachTeam);
            while (rs.next()) {
                IplStatsDaoImpl imp = new IplStatsDaoImpl();
                player = imp.toPlayer(rs);
                list.add(player);
            }
        } catch (SQLException e) {
            System.out.println("Error is : " + e.getMessage());
        } finally {
            ConnectionUtil.close(con, st, rs);
        }
        return list;
    }

    @Override
    public List<TeamStats> getTestStats() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        TeamStats teamStats = null;
        List<TeamStats> list = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(TestStats);
            while (rs.next()) {
                IplStatsDaoImpl imp =new IplStatsDaoImpl();
                teamStats=imp.toTeamStatsAll(rs);
                list.add(teamStats);
            }
        } catch (SQLException e) {
            System.out.println("Error is :" + e.getMessage());
        } finally {
            ConnectionUtil.close(con, st, rs);
        }
        return list;
    }

    @Override
    public List<TeamStats> getMaxTopAmountSpentTeams() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        TeamStats team = null;
        List<TeamStats> list = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(AmountSpent);
            while (rs.next()) {
                IplStatsDaoImpl imp = new IplStatsDaoImpl();
                team = imp.toTeamStats(rs);
                list.add(team);
            }
        } catch (SQLException e) {
            System.out.println("Error is :" + e.getMessage());
        } finally {
            ConnectionUtil.close(con, st, rs);
        }
        return list;
    }

    @Override
    public List<Player> getNthHighestPaidPlayers(int n) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Player> list = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            Player player = new Player();
            pst = con.prepareStatement(NthPlayer);
            pst.setInt(1, n);
            rs = pst.executeQuery();
            while (rs.next()) {
                IplStatsDaoImpl imp = new IplStatsDaoImpl();
                player = imp.toPlayer(rs);
                list.add(player);
            }
        } catch (SQLException e) {
            System.out.println("Error is: " + e.getMessage());
        } finally {
            ConnectionUtil.close(con, pst, rs);
        }
        return list;
    }

    public Player getPlayerByName(String playerName) {
        Player player = null;
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = ConnectionUtil.getConnection();
            String query = "SELECT * FROM player WHERE name = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, playerName);
            rs = pst.executeQuery();
            while (rs.next()) {
                player = new Player();
                player.setId(rs.getInt("id"));
                player.setName(rs.getString("name"));
                player.setRole(rs.getString("role"));
                player.setTeamName(rs.getString("team_name"));
                player.setAmount(rs.getDouble("amount"));
            }
        } catch (SQLException e) {
            System.out.println("Error is :" + e.getMessage());
        } finally {
            ConnectionUtil.close(con, pst, rs);
        }
        return player;
    }

    private TeamStats toTeamStats(ResultSet rs) throws SQLException {
        TeamStats teamStats = new TeamStats();
        teamStats.setName(rs.getString("name"));
        teamStats.setRole(rs.getString("role"));
        teamStats.setTeamName(rs.getString("team_name"));
        teamStats.setAmount(rs.getDouble("average_salary"));
        teamStats.setMin(rs.getDouble("min_salary"));
        teamStats.setMax(rs.getDouble("max_salary"));
        teamStats.setCount(rs.getInt("total_players"));
        return teamStats;
    }

    private Player toPlayer(ResultSet rs) throws SQLException {
        Player player = new Player();
        player.setId(rs.getInt("id"));
        player.setName(rs.getString("name"));
        player.setRole(rs.getString("role"));
        player.setTeamName(rs.getString("team_name"));
        player.setAmount(rs.getDouble("amount"));
        return player;
    }
    private TeamStats toTeamStatsAll(ResultSet rs) throws SQLException{
        TeamStats teamStats =new TeamStats();
        teamStats.setName(rs.getString("name"));
        teamStats.setRole(rs.getString("role"));
        teamStats.setTeamName(rs.getString("team_name"));
        teamStats.setCount(rs.getInt("total_players"));
        teamStats.setAmount(rs.getDouble("average_salary"));
        teamStats.setMin(rs.getDouble("min_salary"));
        teamStats.setMax(rs.getDouble("max_salary"));
        return teamStats;

    }
  /*  public static void main(String[] args) {
        IplStatsDao imp =new IplStatsDaoImpl();
        String m =imp.getMaxPaidPlayersOfEachRole().toString();
        System.out.println(m);
    }*/
}
