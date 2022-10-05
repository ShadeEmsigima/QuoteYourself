import java.util.Scanner; // import the Scanner class 
import java.util.concurrent.DelayQueue;

class HowAreYou{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sup? \n good/bad");
    
        String reply = sc.nextLine();
        String counter = (reply.equals("good"))? "What a day" : "How bad was it on a scale of one to ten?"; 
        System.out.println(counter);
        // try{Thread.sleep(10000);}catch(InterruptedException e){System.out.println(e);}  
        // catch (Exception ie){ System.out.println("Something went wrong");}  
        
        switch (reply) {
            case "1":
            System.out.println("I hope it stays at white onions");
                break;
            default:
            System.out.println("default case");
                break;
        }


        sc.close();
            
    }
    String GetReply(){
        String reply = "";
        return reply; 

    }

    public class Question(){
        String content;
        Answer[] answers;
    }

    public class Answer(){
        String content;
    }

}


