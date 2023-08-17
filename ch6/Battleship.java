package ch6;

public class Battleship {
    private String name;
    private String location;

    public Battleship(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public boolean checkGuess(String guess) {
        return guess.equals(location);
    }
}