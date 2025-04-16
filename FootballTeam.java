//FootballTeam.java
public class FootballTeam extends SportTeam{

    private int leagueTitles;

    public FootballTeam(String name, String city, int championshipsWon, int leagueTitles){
        super(name, city, championshipsWon);
        this.leagueTitles = leagueTitles;
    }

    public int getLeagueTitles(){
        return leagueTitles;
    }

    public void setLeagueTitles(int leagueTitles){
        this.leagueTitles = leagueTitles;
    }

    @Override
    public String getSportType(){
        return "Football";
    }

    @Override
    public String toString(){
        return super.toString() + ", FootballTeam\n" + "leagueTitles: " + leagueTitles;
    }
}