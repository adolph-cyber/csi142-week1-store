// Player.java
public class Player {
    private String name;
    private int jerseyNumber;

    public Player(String name, int jerseyNumber) {
       if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Player name cannot be null or empty.");
        }
         if (jerseyNumber < 0) {
            // Jersey numbers are non negative
            throw new IllegalArgumentException("Jersey number cannot be negative.");
        }
        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }
//getter for Name
    public String getName() {
        return name;
    }
// getter for JerseyNumber
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    @Override
    public String toString() {
        return "Player{" +
               "name='" + name + '\'' +
               ", jerseyNumber=" + jerseyNumber +
               '}';
    }
}
