public class FracCalc {
    public static void main(String[] args)
    {
        //Your code goes here!

        //initializing
        int num1 = 1;
        int den1 = 2;
        int num2 = 1;
        int den2 = 3;

        //print the initialized values
        System.out.println("The numerator of the first fraction is " + num1);
        System.out.println("The denominator of the first fraction is " + den1);
        System.out.println("The numerator of the second fraction is " + num2);
        System.out.println("The denominator of the second fraction is " + den2);


        //calculate the sum
        int convNum1 = num1*den2;
        int convNum2 = num2*den1;

        int finalDen = den1 * den2;
        int finalNum = convNum1 + convNum2;

        String fraction1 = num1 + "/" + den1;
        String fraction2 = num2 + "/" + den2;
        String fractionFinal = finalNum + "/" + finalDen;

        //print result
        System.out.print("The sum of " + fraction1 + " + " + fraction2 + " = ");
        System.out.print(fractionFinal);

    }

}
