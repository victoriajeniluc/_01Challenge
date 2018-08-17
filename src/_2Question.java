/**Write a logic using switch-case to print "EVEN" / "ODD" for the numbers.
 Numbers divisible by 2 are even and numbers not divisible by 2 are odd.
 *
 * Create a function name main
 * Create a variable named result that will take in the number and find the reminder when divided by 2
 * Create a switch case
    * if result is equal 0, print out even
    * if result is equal 1, print out odd
 */

public class _2Question {
    public static void main(String[] args) {
        int number = 1;
        int result = number % 2;

        switch(result) {
            default:
                System.out.println("not valid");
                break;
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;

        }
    }
}