/**
 * Write a java program for following logic.
    * if marks < 60, then print "Fail"
    * if marks >= 60 but less than 90 , then print "Pass"
    * if marks >= 90, then print "Passed with Distinction"
 *
    * You are free to use any combination of if - else statements.
    * You can either use if statements OR if - else statements OR if - else if - else statements.
 */
public class _1Question {
    public static void main(String[] args) {
       int marks = 90;

       if(marks < 60) {
           System.out.println("Fail");
       } else if(marks >= 60 && marks < 90) {
           System.out.println("Pass");
       } else {
           System.out.println("Pass with Distinction");
       }
    }
}
