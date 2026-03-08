import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberAnalyser {
    public static void main(String[] args)
    {

        boolean GameRunning = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> menu = new ArrayList<>(List.of(
                "Sum",
                "Avearge",
                "Largest number",
                "Smallest number",
                "How many even numbers"
        ));

        while (GameRunning){
            System.out.println("How many numbers would you like to analyse? : ");
            String NumbersAmount = scanner.next();
            int LoopAmount = Integer.parseInt(NumbersAmount);



            //Filling in the arraylist of numbers
            for(int i = 0;i < LoopAmount;i++)
            {
                System.out.println("Input number #"+i);
                String number = scanner.next();
                numbers.add(i,Integer.parseInt(number));
            }
            /*

            System.out.println("1. Sum ");
            System.out.println("2. Avearge ");
            System.out.println("3. Largest number ");
            System.out.println("4. Smallest number ");
            System.out.println("5. How many even numbers ");
             */
            System.out.println("What would you like to do?");

            for(int i=0; i < menu.size();i++)
            {

                System.out.println(i+1 + "." + menu.get(i));

            }
            String answer = scanner.nextLine().toLowerCase();
            Switch (answer)
            case sum,1{

            }




    }

    }
}
