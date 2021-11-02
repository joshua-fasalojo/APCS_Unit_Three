import java.util.Scanner;

public class Easter {


    public static String dateOfEaster(int year) {
        int a = year % 19;
        int   b = year % 4;
      int  c = year % 7;
      int  d = (19 * a + 24) % 30;
     int   e = (2*b + 4*c + 6*d + 5) % 7;

      int day = 22 + d + e;
      if (day <= 31)
        {
          return "March" + day;

        }
      else {
          return "April " + (day - 32);
        }
        if (year == 1954 || year == 1981 || year == 2049 || year == 2076)
        {
            day -= 7;
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
        isValidYear(newYear);
        if (isValidYear(newYear) )
        {
            System.out.println(dateOfEaster (newYear));
        }
        else
        {
          System.out.println("not a valid date") ;
        }

    }
}}