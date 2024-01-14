import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total numbers you would like to find sum of: ");
        int totalNum = Integer.parseInt(scanner.nextLine()); // assigning the input value as integer. 
      

        int sum = 0;
        for (int i = 0; i < totalNum; i++){
            Scanner numbers = new Scanner(System.in);
            System.out.println("Enter the numbers: ");
            int values = Integer.parseInt(numbers.nextLine());
            sum+= values;
        }
        double average = sum / totalNum;
        System.out.println("Total average of given "+ totalNum + " numbers is "+ average);





    }
}
