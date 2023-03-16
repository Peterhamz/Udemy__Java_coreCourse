package Udemy__Generics_10.___League_Challenge;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("EPL");
        Team<FootballPlayer> manU = new Team<>("MANU");
        Team<FootballPlayer> chelsea = new Team<>("CHELSEA");
        Team<FootballPlayer> manCity = new Team<>("MAN_CITY");
        Team<FootballPlayer> liverpool = new Team<>("LIVERPOOL");
        Team<FootballPlayer> watford = new Team<>("WATFORD");


        manU.matchResult(watford, 1, 0);
        manCity.matchResult(liverpool, 3, 2);
        manU.matchResult(manCity,2,3);
        liverpool.matchResult(watford,6,2);
        chelsea.matchResult(manU, 1, 0);
        watford.matchResult(chelsea, 3, 2);
        manCity.matchResult(manU,2,3);
        liverpool.matchResult(manCity,6,2);

        footballLeague.add(manU);
        footballLeague.add(chelsea);
        footballLeague.add(manCity);
        footballLeague.add(liverpool);
        footballLeague.add(watford);

        footballLeague.showLeagueTable();
    }
}
