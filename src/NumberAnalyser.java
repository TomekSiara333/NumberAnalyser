import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberAnalyser {


    public static void main(String[] args)
    {

        float sum=0;
        float average;
        float largestNumber=0;
        float smallestNumber=0;
        int evenNumbersAmount=0;
        boolean gameRunning = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> numbers = new ArrayList<>();
        numbers.clear();
        ArrayList<String> menu = new ArrayList<>(List.of(
                "Sum",
                "Average",
                "Largest number",
                "Smallest number",
                "How many even numbers (Type \"even\")"
        ));

        while (gameRunning){
            System.out.println("How many numbers would you like to analyse? : ");
            String NumbersAmount = scanner.next();
            int LoopAmount = Integer.parseInt(NumbersAmount);



            //Filling in the arraylist of numbers
            for(int i = 0;i < LoopAmount;i++)
            {
                System.out.println("Input number #"+(i+1));
                String number = scanner.next();
                numbers.add(i,Float.parseFloat(number));
            }
            /*

            System.out.println("1. Sum ");
            System.out.println("2. Average ");
            System.out.println("3. Largest number ");
            System.out.println("4. Smallest number ");
            System.out.println("5. How many even numbers ");
             */
            System.out.println("What would you like to do?");

            for(int i=0; i < menu.size();i++)
            {

                System.out.println(i+1 + "." + menu.get(i));

            }
            String answer = scanner.next().toLowerCase();
            switch (answer)
            {
                case "sum","1":
                    for (Float number : numbers) {
                        sum = sum + number;

                    }
                    System.out.println(sum);
                    break;
                case "average","2":
                    for (Float number: numbers)
                    {
                        sum = sum + number;
                    }

                    average = sum / numbers.size();
                    System.out.println(average);
                    break;
                case "largest number","3":
                    for (Float number: numbers)
                    {
                        if (largestNumber < number)
                        {
                            largestNumber = number;
                        }
                        System.out.println(largestNumber);
                    }
                    break;
                case "smallest number", "4":

                    smallestNumber = numbers.getFirst();
                    for (Float number: numbers)
                    {
                        if(number < smallestNumber)
                        {
                            smallestNumber = number;
                        }
                    }
                    break;
                case "even", "5":
                    for (Float number: numbers)
                    {
                        if (number%2==0)
                        {
                            evenNumbersAmount++;
                        }
                    }
                    break;

            }
            gameRunning = gameRunOption(gameRunning);






    }


    }
    public static boolean gameRunOption(boolean gameRunning)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to continue? (yes/no)");
        String option = scanner.nextLine().toLowerCase();
        if (option.equals("no"))
        {

            return false;

        }
        return true;
    }
}
