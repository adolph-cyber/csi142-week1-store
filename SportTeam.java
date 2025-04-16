//SportTeam.java
public class SportTeam{

    //SportTeam Fields
    private String sportTeamName;
    private String city;
    private int championshipsWon;
    private String coach;

    //Constructors to initialize
    public SportTeam(String sportTeamName, String city, int championshipsWon,String Coach){
        this.sportTeamName = sportTeamName;
        this.city = city;
        this.championshipsWon = championshipsWon;
        this.Coach=Coach;
    }
    //Getter for SportTeamName
    public String getSportTeamName(){
        return sportTeamName;
    }
    
    //Getter for ChampionshipsWon
    public double getChampionshipsWon(){
        return championshipsWon;
    }

    public String getCoach(){
        return Coach;
    }

    //Setter for ChampionshipsWon
    public void setChampionshipsWon(int championshipsWon){
        this.championshipsWon = championshipsWon;
    }

    //Getter for City
    public String getCity(){
        return city;
    }

    public void setCoach(String newCoach){
        this.Coach=newcoach;
    }
      
    @Override
    //Display Methods
    public String toString(){
        return "SportTeam\n" + "name: " + name + ", city: " + city + ", championshipsWon: " + championshipsWon "Coach\n" +Coach+;
    }
}
