package org.Java.jfs;

import org.Java.jfs.domain.Player;
import org.Java.jfs.dto.TeamStats;
import org.Java.jfs.service.IplStatsService;
import org.Java.jfs.service.IplStatsServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class iplStatsManager {
    public static void main(String[] args) {
        IplStatsService iplStatsService=new IplStatsServiceImpl();
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("-".repeat(20));
            System.out.println("1.To get Team Name");
            System.out.println("2.To get Max paid Player Each role");
            System.out.println("3.To get the max paid player each team and role wise");
            System.out.println("4.To get Team Stats");
            System.out.println("5.TO get max spent team for players ");
            System.out.println("6.To get Nth Highest Paid Player");
            System.out.println("7.To Exits");
            System.out.println("Enter your choice :");
            int ch =sc.nextInt();
            switch (ch){
                case 1:
                    List<String> list =iplStatsService.getTeamService();
                    if(list.isEmpty()){
                        System.out.println("No Ipl Team is found");
                    }else {
                        for (String team : list) {
                            System.out.println(team);
                        }
                    }
                    break;
                case 2:
                    Map<String,List<Player>> maxPaidPlayer=iplStatsService.getMaxPaidPlayersOfEachRole();
                    if (maxPaidPlayer.isEmpty()){
                        System.out.println("No Ipl MaxPaid Player on each role is found ");
                    }else {
                        maxPaidPlayer.forEach((k,v) -> System.out.println(k+" : "+v));
                    }
                    break;
                case 3:
                    Map<String,Map<String,List<Player>>> map =iplStatsService.getMaxPaidPlayersOfEachTeamAndRoleWise();
                    if (map.isEmpty()){
                        System.out.println("No tpl Max Paid Players Each Team and Role Wise is found");
                    }else {
                        map.forEach((k,v)->System.out.println(k+" :"+v));
                    }
                    break;

                case 4:
                    List<TeamStats>Team =iplStatsService.getTestStats();
                    if (Team.isEmpty()){
                        System.out.println("No Ipl Team Stats is found");
                    }else {Team.forEach(stats->{
                        System.out.println(stats.getName() + " " + stats.getRole() + " " + stats.getTeamName() + " " + stats.getAmount());
                    });
                    }
                    break;
                case 5:
                    List<TeamStats>amountSpent=iplStatsService.getMaxTopAmountSpentTeams();
                    if (amountSpent.isEmpty()){
                        System.out.println("No Ipl Team Spent amount is found");
                    }else {amountSpent.forEach(spent->{
                        System.out.println(spent.getName()+" "+spent.getRole()+" "+spent.getTeamName()+" "+spent.getAmount()+" "+spent.getMax()+" "+spent.getMin()+" "+spent.getCount());
                    });
                    }
                    break;
                case 6:
                    System.out.println("Enter the id");
                    int id =sc.nextInt();
                    List<Player> HighestPaid=iplStatsService.getNthHighestPaidPlayers(id);
                    if (HighestPaid.isEmpty()){
                        System.out.println("No Highest Paid player is found ");
                    }else {
                        HighestPaid.forEach(highpaidplayer->{
                            System.out.println(highpaidplayer.getId()+" "+highpaidplayer.getName()+" "+highpaidplayer.getRole()+" "+highpaidplayer.getAmount()+" "+highpaidplayer.getTeamName());
                        });
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }

    }
}
