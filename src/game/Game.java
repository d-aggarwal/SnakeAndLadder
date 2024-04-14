package game;
import board.Board;
import player.Player;
import coordinates.Coordinates;
import dice.Dice;

public class Game {
    Board board;
    Player[] players;
    boolean[] isAllowed;
    int turn;
    Coordinates[]places;
    Dice dice;

    public Game(Board board,Player[]players,Dice dice) {
        this.board = board;
        this.players = players;
        this.dice = dice;
        turn = 0;
        isAllowed = new boolean[players.length];
        places = new Coordinates[players.length];

        for (int i =0;i<players.length;i++) places[i] = new Coordinates(board.getSize()-1,0);
    }
}
