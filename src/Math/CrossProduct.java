package Math;

import java.util.List;

/**
 * This class is responsible for calculating the cross product of two vectors provided in the from of lists
 */
public class CrossProduct {

    //fields
    private double[] vect1;
    private double[] vect2;

    //constructor
    public CrossProduct(double[] l1,  double[] l2, double charge){
        vect1 = l1; //velocity
        vect1[0] *= charge; vect1[1] *= charge; vect1[2] *= charge;
        vect2 = l2;
    }

    //methods
    public double[] solver(){
        double[] answer = new double[3];
        //System.out.println(vect2[2]);
        answer[0] = ((vect1[1]*vect2[2]-(vect2[1]*vect1[2])));
        answer[1] = (-1*(vect1[0]*vect2[2])-(vect2[0]*vect1[2]));
        answer[2] = ((vect1[0]*vect2[1])-(vect2[0]*vect1[1]));
        return answer;
    }

}
