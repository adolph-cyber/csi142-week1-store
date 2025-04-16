//SportTeam.java
public class SportTeam{

    //SportTeam Fields
    private String sportTeamName;
    private String city;
    private int championshipsWon;

    //Constructors to initialize
    public SportTeam(String sportTeamName, String city, int championshipsWon){
        this.sportTeamName = sportTeamName;
        this.city = city;
        this.championshipsWon = championshipsWon;
    }
    //Getter for SportTeamName
    public String getSportTeamName(){
        return sportTeamName;
    }
    
    //Getter for ChampionshipsWon
    public double getChampionshipsWon(){
        return championshipsWon;
    }

    //Setter for ChampionshipsWon
    public void setChampionshipsWon(int championshipsWon){
        this.championshipsWon = championshipsWon;
    }

    //Getter for City
    public String getCity(){
        return city;
    }
      
    @Override
    //Display Methods
    public String toString(){
        return "SportTeam\n" + "name: " + name + ", city: " + city + ", championshipsWon: " + championshipsWon;
    }
}
