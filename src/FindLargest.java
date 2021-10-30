import java.util.Scanner;

public class FindLargest {

    public static <Do> void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Prompt the user for two integer variables
        int x = scan.nextInt();
        int y = scan.nextInt();

        // Create a series of if statements that will print which number is larger or if they are equal
        if (x > y)
            System.out.println(x + "Is greater than" + y);

        // Make sure your output matches the samples or the tests will not pass.

    }
}
