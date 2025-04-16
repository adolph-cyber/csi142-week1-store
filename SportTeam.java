//SportTeam.java
public class SportTeam{

    private String sportTeamName;
    private String city;
    private int championshipsWon;

    public SportTeam(String sportTeamName, String city, int championshipsWon){
        this.sportTeamName = sportTeamName;
        this.city = city;
        this.championshipsWon = championshipsWon;
    }

    
    @Override
    public String toString(){
        return "SportTeam" + "name: " + name + ", city: " + city + ", championshipsWon: " + championshipsWon;
    }
}