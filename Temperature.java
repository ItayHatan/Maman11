import  java.util.Scanner;
/**
 *  This class present temperature conversion between different temperature scales.
 * @author Itay Hatan
 * @version 5/10/20
 * */
public class Temperature {

    /** This method will get and number from the user and that set the temperature scale
     and the temperature convert the the input to all the match temperature in the other temperature scale/
     */

    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your temperature scale C, F, K and a temperature:");
        // Get from the user String with char(F, K, C) and number - assume tha input is valid
        String word = scan.next();
        char c = word.charAt(0);
        double temp = scan.nextDouble();
        final double ZERO_ABS = -273.15;
        final double TWO_HUNDRED_FIFTY_FIVE = 255.37222;
        final double THIRTY_TWO = 32;
        final double NINE_SPLIT_FIVE = 9.0 / 5;
        final double FIVE_SPLIT_NINE = 5.0 / 9;

        // make variables that contains the formulas to each conversion.
        // from c to f , c to k ,f to c , f to k , k to f, k to c.
        double fToC = ((FIVE_SPLIT_NINE) * (temp - THIRTY_TWO));
        double fToK= ((FIVE_SPLIT_NINE) * temp) + TWO_HUNDRED_FIFTY_FIVE;
        double kToC = (temp + ZERO_ABS);
        double kToF = ((NINE_SPLIT_FIVE) * (temp + ZERO_ABS)) +THIRTY_TWO;
        double cToK = (temp - ZERO_ABS);
        double cToF = (NINE_SPLIT_FIVE) * temp + THIRTY_TWO;

        /* use switch case to case the options, print not valid massage if char not K, F, C
        if char in the first position is not F, K, C */
        switch (c) {
            case 'C': {
                System.out.println(temp + " C");
                System.out.println(cToF + " F");
                System.out.println(cToK + " K");
                break;
            }
            case 'K': {
                System.out.println(kToC + " C");
                System.out.println(kToF + " F");
                System.out.println(temp + " K");
                break;
            }
            case 'F': {
                System.out.println(fToC + " C");
                System.out.println(temp + " F");
                System.out.println(fToK + " K");
                break;
            }
            default: System.out.println("Not a valid temperature scale !");
                break;
        }
    }
}

