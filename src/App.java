import java.util.*;
import board.Board;
import dice.Dice;
import jumper.Jumper;
import coordinates.Coordinates;
import player.Player;
import game.Game;

public class App {
    public static void main(String[] args) {

        HashMap<String,Jumper> map = new HashMap<>();
        map.put("6",new Jumper(new Coordinates(9,5),new Coordinates(6,6)));
        map.put("97",new Jumper(new Coordinates(0,1),new Coordinates(9,9)));
        map.put("21",new Jumper(new Coordinates(7,0),new Coordinates(0,9)));
        map.put("64",new Jumper(new Coordinates(3,3),new Coordinates(7,4)));
            Player p1 =  new Player();
    p1.setPlayerDetailsWithUserInput();
    Player p2 =  new Player();
    p2.setPlayerDetailsWithUserInput();

    System.out.println(p1.getPlayerName());
    System.out.println(p2.getPlayerName());

Board b = new Board(10,map);
b.printBoard();
Game game = new Game(b,new Player[]{p1,p2},new Dice());
game.play();





    }


}