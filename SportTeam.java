//SportTeam.java
public class SportTeam{

    //SportTeam Fields
    private String SportTeamName;
    private String City;
    private int ChampionshipsWon;
    private String Coach;

    //Constructors to initialize
    public SportTeam(String SportTeamName, String City, int ChampionshipsWon,String Coach){
        this.SportTeamName = SportTeamName;
        this.City = City;
        this.ChampionshipsWon = ChampionshipsWon;
        this.Coach = Coach;
    }
    //Getter for SportTeamName
    public String getSportTeamName(){
        return SportTeamName;
    }

    //Setter for SportTeamName
    public void setSportTeamName(String SportTeamName){
        this.SportTeamName = SportTeamName;
    }
    
    //Getter for ChampionshipsWon
    public double getChampionshipsWon(){
        return championshipsWon;
    }

    //Setter for ChampionshipsWon
    Public void setChampionshipsWon(String ChampioshipsWon){
        this.ChampionshipsWon = ChampionshipsWon;
    }

    //Getter for Coach
    public String getCoach(){
        return Coach;
    }

     //Getter for City
    public String getCity(){
        return city;
    }

    //Setter for ChampionshipsWon
    public void setChampionshipsWon(int championshipsWon){
        this.championshipsWon = championshipsWon;
    }

    //setter for Caoch
    public void setCoach(String newCoach){
        this.Coach=newcoach;
    }
      
    @Override
    //Display Methods
    public String toString(){
        return "SportTeam\n" + "name: " + name + ", city: " + city + ", championshipsWon: " + championshipsWon "Coach\n" +Coach+;
    }
}
