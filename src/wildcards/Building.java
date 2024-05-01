package wildcards;

public class Building {

    public int numberOfRooms = 7;

    @Override
    public String toString() {
        return ("this is a building");
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
