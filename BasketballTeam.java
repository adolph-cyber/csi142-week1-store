// BasketballTeam.java
public class BasketballTeam extends SportTeam{

    private int conferenceTitles;

    public BasketballTeam(String name, String city, int championshipsWon, int conferenceTitles){
        super(name, city, championshipsWon);
        this.conferenceTitles = conferenceTitles;
    }

    public int getConferenceTitles(){
        return conferenceTitles;
    }

    public void setConferenceTitles(int conferenceTitles){
        this.conferenceTitles = conferenceTitles;
    }

    @Override
    public String getSportType(){
        return "Basketball";
    }

    @Override
    public String toString(){
        return super.toString() + ", BasketballTeam\n" + "conferenceTitles: " + conferenceTitles;
    }
}