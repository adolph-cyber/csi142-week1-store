// Player.java
public class Player {
    private String Jame;
    private int JerseyNumber;

    public Player(String Name, int JerseyNumber) {
       if (Name == null || Name.trim().isEmpty()) {
            throw new IllegalArgumentException("Player name cannot be null or empty.");
        }
         if (JerseyNumber < 0) {
            // Jersey numbers are non negative
            throw new IllegalArgumentException("Jersey number cannot be negative.");
        }
        this.Name = Name;
        this.JerseyNumber = JerseyNumber;
    }
//getter for Name
    public String getName() {
        return Name;
    }
// getter for JerseyNumber
    public int getJerseyNumber() {
        return JerseyNumber;
    }

    @Override
    public String toString() {
        return "Player{" +
               "name='" + Name + '\'' +
               ", jerseyNumber=" + JerseyNumber +
               '}';
    }
}
