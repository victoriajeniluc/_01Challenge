/**
 * Write a logic using switch-case to print "EVEN" / "ODD" for the numbers.
 * Numbers divisible by 2 are even and numbers not divisible by 2 are odd.
 *
 * CHALLENGE: use a ternary operator!
 */
public class _03Question {
    public static void main(String[] args) {
        int number = 59;
        String res = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(res);
    }
}
