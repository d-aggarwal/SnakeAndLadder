package jumper;
import coordinates.Coordinates;
public class Jumper {
    Coordinates start;
    Coordinates end;
    String name;

    public Jumper(Coordinates start,Coordinates end) {
        this.start = start;
        this.end = this.end;

        if(start.row > end.row) this.name = "Ladder";
        else this.name = "Snake";
    }

    public String getJumperName() {
        return this.name;
    }
}
