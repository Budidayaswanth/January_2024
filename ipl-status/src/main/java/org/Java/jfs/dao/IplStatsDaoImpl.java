package org.Java.jfs.dao;

import org.Java.jfs.domain.Player;
import org.Java.jfs.dto.TeamStats;
import org.Java.jfs.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IplStatsDaoImpl implements IplStatsDao{
    private final String TeamName="select distinct team_name from player";
    private final String MaxPaid="SELECT name, role, team_name, amount FROM (SELECT team_name, name, role, amount, ROW_NUMBER() OVER (PARTITION BY role ORDER BY amount DESC) AS rank FROM player) AS ranked_players WHERE rank = 1";
    private final String MaxPaidEachTeam="SELECT name, role, team_name,  amount, player_count FROM ( SELECT name, role, team_name, amount, ROW_NUMBER() OVER (PARTITION BY team_name, role ORDER BY amount DESC) AS rank,COUNT(*) OVER (PARTITION BY team_name, role) AS player_count FROM player)as rank_player WHERE rank = 1";
    private final String TestStats ="select name,role,team_name, COUNT(*) AS total_players, AVG(amount) AS average_salary, MIN(amount) AS min_salary, MAX(amount) AS max_salary from player group by name,team_name,role";
    private final String NthPlayer="select id,name,role,team_name,amount from (select id,name,role,team_name,amount,dense_rank() over (order by amount DESC)as rnk from player ) t where t.rnk=?";
    private final String AmountSpent="WITH TeamAmounts AS (SELECT team_name, SUM(amount) AS total_amount_spent FROM player GROUP BY team_name)SELECT p.name, p.role,p.team_name,COUNT(*) AS total_players,AVG(p.amount) AS average_salary, MIN(p.amount) AS min_salary,MAX(p.amount) AS max_salary FROM player p JOIN TeamAmounts ta ON p.team_name = ta.team_name WHERE ta.total_amount_spent = (SELECT MAX(total_amount_spent) FROM TeamAmounts )GROUP BY p.name, p.role, p.team_name";
    private final String query = "SELECT * FROM player WHERE name = ?";
    @Override
    public List<String> getTeamNames() {
        Connection con =null;
        Statement st =null;
        ResultSet rs =null;
        List<String> list =new ArrayList<>();
        try {
            con= ConnectionUtil.getConnection();
            st=con.createStatement();
            rs =st.executeQuery(TeamName);
            while (rs.next()){
                String s=rs.getString("team_name");
               list.add(s);
            }
        }catch (SQLException e){
            System.out.println("Error is :"+e.getMessage());
        }finally {
            ConnectionUtil.close(con,st,rs);
        }
        return list;
    }

    @Override
    public List<String> getMaxPaidPlayersOfEachRole() {
        Connection con =null;
        Statement st =null;
        ResultSet rs =null;
        List<String> list =new ArrayList<>();
        try {
            con =ConnectionUtil.getConnection();
            st=con.createStatement();
            rs=st.executeQuery(MaxPaid);
            while (rs.next()){
                String s =rs.getString("name");
                String s1 =rs.getString("role");
                String s2 =rs.getString("team_name");
                String s3 = rs.getString("amount");
                list.add(s);
                list.add(s1);
                list.add(s3);
                list.add(s2);
            }
        }catch (SQLException e){
            System.out.println("Error is :"+e.getMessage());
        }finally {
            ConnectionUtil.close(con,st,rs);
        }

        return list;
    }

    @Override
    public List<Player> getMaxPaidPlayersOfEachRoleOfEachTeam() {
        Connection con =null;
        Statement st =null;
        ResultSet rs =null;
        Player team =null;
        List<Player> list =new ArrayList<>();
        try {
            con=ConnectionUtil.getConnection();
            st=con.createStatement();
            rs=st.executeQuery(MaxPaidEachTeam);
            while (rs.next()){
                team =new Player();
                team.setTeamName(rs.getString("team_name"));
                team.setAmount(rs.getDouble("amount"));
                team.setCount(rs.getInt("player_count"));
                team.setRole(rs.getString("role"));
                team.setName(rs.getString("name"));
                list.add(team);
            }
        }catch (SQLException e){
            System.out.println("Error is : "+e.getMessage());
        }finally {
            ConnectionUtil.close(con,st,rs);
        }
        return list;
    }

    @Override
    public List<TeamStats> getTestStats() {
        Connection con =null;
        Statement st =null;
        ResultSet rs =null;
        TeamStats team =null;
        List<TeamStats> list =new ArrayList<>();
        try {
            con=ConnectionUtil.getConnection();
            st=con.createStatement();
            rs =st.executeQuery(TestStats);
            while (rs.next()){
                team=new TeamStats();
                team.setName(rs.getString("name"));
                team.setRole(rs.getString("role"));
                team.setTeamName(rs.getString("team_name"));
                team.setCount(rs.getInt("total_players"));
                team.setAmount(rs.getDouble("average_salary"));
                team.setMin(rs.getDouble("min_salary"));
                team.setMax(rs.getDouble("max_salary"));
                list.add(team);
            }
        }catch (SQLException e){
            System.out.println("Error is :"+e.getMessage());
        }finally {
            ConnectionUtil.close(con,st,rs);
        }
        return list;
    }

    @Override
    public List<TeamStats> getMaxTopAmountSpentTeams() {
        Connection con =null;
        Statement st =null;
        ResultSet rs =null;
        TeamStats team =null;
        List<TeamStats>list =new ArrayList<>();
        try {
            con=ConnectionUtil.getConnection();
            st=con.createStatement();
            rs=st.executeQuery(AmountSpent);
            while (rs.next()){
                team=new TeamStats();
                team.setName(rs.getString("name"));
                team.setRole(rs.getString("role"));
                team.setTeamName(rs.getString("team_name"));
                team.setAmount(rs.getDouble("average_salary"));
                team.setMin(rs.getDouble("min_salary"));
                team.setMax(rs.getDouble("max_salary"));
                team.setCount(rs.getInt("total_players"));
                list.add(team);
            }
        }catch (SQLException e){
            System.out.println("Error is :"+e.getMessage());
        }finally {
            ConnectionUtil.close(con,st,rs);
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
            Player player =new Player();
            if (player == null) {
                throw new IllegalArgumentException("player object is null");
            }
            pst = con.prepareStatement(NthPlayer);
            pst.setInt(1, n);
            rs = pst.executeQuery();
            while (rs.next()) {
                player = new Player();
                player.setId(rs.getInt("id"));
                player.setName(rs.getString("name"));
                player.setRole(rs.getString("role"));
                player.setTeamName(rs.getString("team_name"));
                player.setAmount(rs.getDouble("amount"));
                list.add(player);
            }
        } catch (SQLException e) {
            System.out.println("Error is: " + e.getMessage());
        } finally {
            ConnectionUtil.close(con, pst, rs);
        }
        return list;
    }

    public Player getPlayerByName(String playerName){
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
            if (rs.next()) {
                player = new Player();
                player.setId(rs.getInt("id"));
                player.setName(rs.getString("name"));
                player.setRole(rs.getString("role"));
                player.setTeamName(rs.getString("team_name"));
                player.setAmount(rs.getDouble("amount"));
            }
        }
        catch (SQLException e){
            System.out.println("Error is :"+e.getMessage());
        }finally
         {
            ConnectionUtil.close(con, pst, rs);
        }
        return player;
    }
}
