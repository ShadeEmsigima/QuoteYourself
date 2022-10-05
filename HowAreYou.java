import java.util.Scanner;
import java.time.LocalDate; // import the LocalDate class

//i want the code to loop back ti the question when IDK finishes

class HowAreYou{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Today is " + LocalDate.now());

        System.out.println("Here to rant, read, or stash a question? \n");

        String reply = sc.nextLine();

        
        switch(reply){
            //Case statements  
            case "rant": System.out.println("Write to your heart's content:");  
            break;  
            case "read": System.out.println("On x date you wrote the following:");  
            break;  
            case "stash": System.out.println("Ask a question to your future self:");  
            break;  
            //Default case statement  
            default:
            IDK();
            System.out.println("Its gotta be rant, read or stash \n");  
            }  

        sc.close();        
    }

    static void IDK(){
        var value = Math.random() * 10;
        System.out.println((int)value);
        switch((int) value){
            case 0: System.out.println("Could not compute! \\(O.O)/"); break;
            case 1: System.out.println("Wablief? (O_O)"); break;
            case 2: System.out.println("I don't speak hooman lang lang"); break;
            default: System.out.println("Come again?");
        }
    }










    
    public abstract class Entry{
        String content;
    }

    public class Question {
        Answer[] answers;
    }

    public class Answer {
    }
}


