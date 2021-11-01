import java.util.Scanner;

public class Easter {


    public static String dateOfEaster(String name) {
        return null;

    }

    public static Boolean isValidYear(int year) {

        if (year >= 1900 && year <= 2099)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the year?");
        int newYear = scan.nextInt();

    }
}