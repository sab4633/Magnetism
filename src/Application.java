import java.util.Scanner;

public class Application {

    private static final String WELCOME = "Hi welcome to Magnetism study guide :)";
    private static final String VARIABLE_QUERY = "Please Input what variables your problem includes, separated " +
            "by spaces or enter QUIT to exit";
    private static final String GOODBYE = "Thank you for using our software";

    /**
     * Application class asks for input from user and runs continuously until user enters quit ot exit. After each input
     * the system scans the all equations containing those variables and returns all the things that can be calculated
     * from that. In addition if you want a specific equation you can also ask for that.
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(WELCOME);
        boolean running = true;
        while(running){
            System.out.println(VARIABLE_QUERY);
            String inp = sc.nextLine();
            if(inp.equals("QUIT")){
                running = false;
            }else{
                String[] vars = inp.split(" ");
                System.out.println(vars[2]);
            }

        }
        System.out.println(GOODBYE);




    }
}
