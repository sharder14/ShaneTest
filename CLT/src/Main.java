import java.util.ArrayList;

/**
 * Created by Shane on 9/27/2016.
 */
public class Main {
    public static void main(String[] args) {
        int n=0;
        ArrayList v= new ArrayList();

		// Look I made a change
		//New Change push through commandline please
		
        Dice d = new Dice();
        while (n < 100) {
            v.add(d.roll());
            n++;
        }

        Stats s= new Stats(v);
        //s.showData();
        System.out.println(s.mean());
        //System.out.println(s.variance());
        System.out.println(s.Var());
        System.out.println(s.standardDeviation());

        /*
        ArrayList hw= new ArrayList();

        hw.add(19.2);
        hw.add(19.2);
        hw.add(19.3);
        hw.add(19.5);
        hw.add(19.5);
        hw.add(19.5);
        hw.add(19.5);
        hw.add(19.6);
        hw.add(19.6);
        hw.add(19.7);
        hw.add(19.7);
        hw.add(19.7);
        hw.add(19.8);
        hw.add(19.8);
        hw.add(19.8);
        hw.add(19.9);
        hw.add(19.9);
        hw.add(20.0);
        hw.add(20.1);
        hw.add(20.4);
        hw.add(20.4);
        hw.add(20.4);
        hw.add(20.6);
        hw.add(20.8);
        System.out.println(hw);
        System.out.println(hw.size());
        Stats HW=new Stats(hw);
        System.out.println(HW.mean());
        System.out.println(HW.standardDeviation());

        */


    }
}
