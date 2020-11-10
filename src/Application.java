import java.util.List;
import java.util.Scanner;
import Math.CrossProduct;

public class Application {


    private static final String WELCOME = "Hi welcome to Magnetism study guide :)";
    private static final String VARIABLE_QUERY = "Enter OPTIONS to see all the different formulas to calculate or " +
            "QUIT to exit game";
    private static final String GOODBYE = "Thank you for using our software";
    private static final String OPTIONS = "1. point charge formula (F = qv X B)";


    /**
     * Application class asks for input from user and runs continuously until user enters quit ot exit. After each input
     * the system scans the all equations containing those variables and returns all the things that can be calculated
     * from that. In addition if you want a specific equation you can also ask for that.
     * @param args
     */
    public static void main(String[] args){

       // cpTEST();
        Scanner sc = new Scanner(System.in);
        System.out.println(WELCOME);
        boolean running = true;
        while(running){
            System.out.println(VARIABLE_QUERY);
            String inp = sc.nextLine();
            if(inp.equals("QUIT")) {
                running = false;
            }else if(inp.contains("OPTIONS")){
                System.out.println(OPTIONS);
                int opt = sc.nextInt();
                switch(opt){
                    case 1:
                        pointCharge(sc);
                }

            }else{
                //String[] vars = inp.split(" ");
                //System.out.println(vars[2]);
            }
           sc.nextLine();

        }
        System.out.println(GOODBYE);




    }

    public static void pointCharge(Scanner sc){
        double[] vel = new double[3];
        double[] mag = new double[3];
        System.out.println("Enter charge value");
        double charge = sc.nextDouble();
        System.out.println("Enter charge velocity");
        vel[0] = sc.nextDouble();
        vel[1] = sc.nextDouble();
        vel[2] = sc.nextDouble();
        System.out.println("Enter charge Magnetic field");
        mag[0] = sc.nextDouble();
        mag[1] = sc.nextDouble();
        mag[2] = sc.nextDouble();
        CrossProduct cp = new CrossProduct(vel, mag,charge);
        double[] sol = cp.solver();
        System.out.println(sol[0]+"i + "+sol[1]+"j + "+sol[2]+"k");
    }

    public static void cpTEST(){
        double l1[] = {1,7,0};
        double l2[] = {0,0,10};
        double q = -5;
        CrossProduct cp = new CrossProduct(l1,l2, q);
        double[] sol = cp.solver();
        System.out.println(sol[0]+"i + "+sol[1]+"j + "+sol[2]+"k");
    }
}
