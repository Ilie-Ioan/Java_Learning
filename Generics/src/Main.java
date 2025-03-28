interface Player{

    String name();

}

record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}
record VolleyballPlayer(String name, String position) implements Player{}

public class Main {

    public static void main(String[] args) {

        var philly = new Affiliation("city","Philadelphia, PA", "US");
        BaseballTeam philippines1 = new BaseballTeam("Philadelphia Philipines");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(philippines1,3,astros1,5);

        SportsTeam philippines = new SportsTeam("Philadelphia Philipines");
        SportsTeam astros = new SportsTeam("Houston Astros");
        scoreResult(philippines,3,astros,5);

        Team philippines3 = new Team("Philadelphia Philipines");
        Team astros3 = new Team("Houston Astros");
        scoreResult(philippines3,3, astros3,5);


        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");

        philippines.addTeamMember(harper);
        philippines.addTeamMember(marsh);
        philippines.listTeamMeambers();

        Team<FootballPlayer,Affiliation>  LIV = new Team<>("Liverpool");
        var mo = new FootballPlayer("Mo Salah", "Right Winger");
        LIV.addTeamMember(mo);

       // var LEBRON = new BaseballPlayer("Lebron James","Center Fielder");
        //LIV.addTeamMember(LEBRON);
        //LIV.listTeamMeambers();

        Team<VolleyballPlayer,Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember( new VolleyballPlayer("N Roberts","Setter"));
        adelaide.listTeamMeambers();

        var canberra = new Team<VolleyballPlayer,Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyballPlayer("B black","Opposoite"));
        canberra.listTeamMeambers();
        scoreResult(canberra,0, adelaide,1);

       // Team<Integer> melbourne = new Team<>("Melbourne Vipers");



    }

    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score){

        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score,
                                   SportsTeam team2, int t2_score){

        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }

    public static void scoreResult(Team team1, int t1_score,
                                   Team team2, int t2_score){

        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
