package Math;

import java.util.List;

/**
 * This class is responsible for calculating the cross product of two vectors provided in the from of lists
 */
public class CrossProduct {

    //fields
    private List<Double> vect1;
    private List<Double> vect2;

    //constructor
    public CrossProduct(List<Double> l1,  List<Double> l2){
        vect1 = l1;
        vect2 = l1;
    }

    //methods
    public List<Double> solver(){
        List<Double> answer = null;
        answer.add((vect1.get(1)*vect2.get(2))-(vect2.get(1)*vect1.get(2)));
        answer.add(-1*(vect1.get(0)*vect2.get(2))-(vect2.get(0)*vect1.get(2)));
        answer.add((vect1.get(0)*vect2.get(1))-(vect2.get(0)*vect1.get(1)));
        return answer;
    }
}
