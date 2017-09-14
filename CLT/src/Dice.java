/**
 * Created by Shane on 9/29/2016.
 */
public class Dice {

    public Dice(){

    }

    public double roll() {
        double x = 1 + (int) (Math.random() * 6);
        return x;
    }
}
