import java.util.ArrayList;

/**
 * Created by Shane on 9/29/2016.
 */
public class Stats {
    ArrayList<Double> k;
    double M;
    double V1;
    double S1;
    double V2;
    double S2;

    public Stats(ArrayList data){
        k=data;
    }

    public void showData(){
        System.out.println(k);
    }

    public double mean(){
        double s=0;
        for(Double x : k){
            s=s+x;
        }
        M= (double) s/(k.size());
        return M;
    }

    public double variance(){
        double s=0;
        for(double x:k){
            s=s+((x-this.mean())*(x-this.mean()));
        }
        V1= s/(k.size()-1);
        return V1;
    }

    public double standardDeviation(){
        double tempVar;
        tempVar=this.Var();
        return Math.sqrt(tempVar);

    }

    public double Var(){
        double sumofdata=0;
        double sumofsquaredata=0;
        for(double x:k){
            sumofdata=sumofdata+x;
        }
        for (double x:k){
            sumofsquaredata=sumofsquaredata+(x*x);
        }
        V1=(sumofsquaredata-(sumofdata*sumofdata)/k.size())/(k.size()-1);
        return V1;
    }


}
