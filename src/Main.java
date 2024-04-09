import player.Player;

import java.sql.SQLOutput;
import java.util.*;


public class Main {
    public static void main(String[] args) {
    Player p1 =  new Player();
    p1.setPlayerDetailsWithUserInput();
    Player p2 =  new Player();
    p2.setPlayerDetailsWithUserInput();

    System.out.println(p1.getPlayerName());
    System.out.println(p2.getPlayerName());







    }


}