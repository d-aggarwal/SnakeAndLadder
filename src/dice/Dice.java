package dice;
import java.util.Random;
public class Dice {

    public static int diceRoll () {
        Random r = new Random();
        return r.nextInt(1,7);
    }
}
