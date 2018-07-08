package mastermind;
import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
        System.out.println("Dit is Mastermind.");
        System.out.println("Om te winnen moet u bepalen wat de nummers zijn op de juiste plaats (dit zijn de nummers 1-4).");
        System.out.println("Als een nummer juist is komt u dat te weten door het nummer op de juiste plaats ingevuld te zien.");
        System.out.println("U krijgt 10 pogingen.");
        System.out.println("Klaaaar, AF!!!");


        
        int [] answerArray;

        answerArray= new int [4];
        // antwoorden
        answerArray[0]=2;
        answerArray[1]=3;
        answerArray[2]=2;
        answerArray[3]=2;
        
        System.out.println("__ __ __ __");

        Scanner userGuess = new Scanner(System.in);
       

        boolean guessedAll = false;
         int pogingCount=0;
         int tryCounter=0;
         
        System.out.println("\nVul 4 getallen onder elkaar in:"); 
        for(tryCounter=0 ; tryCounter < 9; tryCounter++){
        int num = userGuess.nextInt();
        int num1 = userGuess.nextInt();
        int num2 = userGuess.nextInt();
        int num3 = userGuess.nextInt();
        
        if (num==answerArray[0]) {System.out.println(answerArray[0] + " __ __ __");

        } else{ System.out.println("Jammer, probeer het opnieuw.");

        } if(num1==answerArray[1]) {System.out.println("__ " + answerArray[1] + " __ __");
        
        } else{ System.out.println("Jammer, probeer het opnieuw.");

        } if(num2==answerArray[2]) {System.out.println("__ __ " + answerArray[2] + " __");
        
        } else{ System.out.println("Jammer, probeer het opnieuw.");

        } if(num3==answerArray[3]) {System.out.println("__ __ __  " + answerArray[3]);
        
        } else{ System.out.println("Jammer, probeer het opnieuw.");

        }
         
         
        }
    }
}

