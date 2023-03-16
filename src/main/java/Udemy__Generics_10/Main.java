package Udemy__Generics_10;

public class Main {
    public static void main(String[] args) {
        FootballPlayer peter = new FootballPlayer("Peter");
        FootballPlayer john = new FootballPlayer("john");
        BaseballPlayer joe = new BaseballPlayer("Joe");
        SoccerPlayer bekam = new SoccerPlayer("bekam");
        SoccerPlayer nile = new SoccerPlayer("Nile");



        Team<FootballPlayer> footballPlayerTeam = new Team<>("footballPlayerTeam");
        System.out.println("**************************************");
        footballPlayerTeam.addPlayer(peter);
        footballPlayerTeam.addPlayer(john);

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("baseballPlayerTeam");
        System.out.println("**************************************");
        baseballPlayerTeam.addPlayer(joe);

        System.out.println(footballPlayerTeam.numPlayers());
        System.out.println(baseballPlayerTeam.numPlayers());

        Team<SoccerPlayer> brokenPlayer = new Team<>("Broken team");
        brokenPlayer.addPlayer(bekam);


        Team<SoccerPlayer> brave = new Team<>("brave");
        brave.addPlayer(nile);

        Team<FootballPlayer> melburn = new Team<>("melburn");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melburn.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthon");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(melburn, 3, 2);

        melburn.matchResult(hawthorn,2,3);
        brave.matchResult(brokenPlayer,6,2);


        System.out.println("Rankings");
        System.out.println(brave.getName() +": " + brave.ranking());
        System.out.println(hawthorn.getName() +": " + hawthorn.ranking());
        System.out.println(brokenPlayer.getName() +": " + brokenPlayer.ranking());
        System.out.println(melburn.getName() +": " + melburn.ranking());


    }
}
