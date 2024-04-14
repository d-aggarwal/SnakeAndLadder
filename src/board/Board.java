package board;

import jumper.Jumper;

import java.util.HashMap;
import java.util.jar.JarEntry;

public class Board {
    int size;
    String [] [] board;
    HashMap<String, Jumper> jumpers;

    public Board(int size,HashMap<String,Jumper> jumpers) {
        this.size = size;
        this.jumpers = jumpers;
        board = new String [size][size];
        int count = 1;

        for(int row = size -1;row>=0;row --) {
            if(row%2 !=0) {
                for (int col =0;col<size;col++) {
                    board[row][col] = count+" ";
                    count ++;
                }
            } else {
                for (int col = size -1;col>=0;col--) {
                    board[row][col] = count+" ";
                    count++;
                }
            }
        }
    }

    public void printBoard() {
        for (int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }


    }

    public int getSize() {
        return this.size;
    }
    
}
