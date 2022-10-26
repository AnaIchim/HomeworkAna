package homeworkJava01;

import static homeworkJava01.MathFunctions.computeVolume;
import static homeworkJava01.MathFunctions.runVolume;

public class arithmeticCalculator_leapYear {

 public static void main (String[] args) {
       /* if (args.length == 3) {
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[2]);;
            String operator = args[1];
            float result;

            switch(operator)
            {
                case "+":
                    result = (a + b);
                    break;

                case "-":
                    result = (a - b);
                    break;

                case "*":
                    result = (a * b);
                    break;

                default:
                    result = (a / b);
                    break;

            }
            System.out.println("Result is: " + result);
        }
        else {
            System.err.println("3 args are needed!");
        }



        int year;
        year = Integer.parseInt(args[3]);

        if (year>=1900&&year<=2016) {

            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Month February of "+year + " has 29 days");
            } else {
                System.out.println("Month February of "+year + " has 28 days");
            }
        } else

        {
            System.out.println(year + " is not in range 1600-2016");
        } */

     runVolume();

    }
}
