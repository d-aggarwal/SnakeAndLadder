package coordinates;

public class Coordinates {
    int row;
    int col;

    public Coordinates(int row ,int col) {
        this.row = row;
        this.col = col;
    }

    public void  printCoordinates() {
        System.out.println("[ "+this.row +","+ this.col+" ]");
    }
}
