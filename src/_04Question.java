/**
 * Write a java program for following logic.
 *     if marks < 60, then print "Fail"
 *     if marks >= 60 but less than 90 , then print "Pass"
 *     if marks >= 90, then print "Passed with Distinction"
 *
 * You are free to use any combination of if - else statements.
 * You can either use if statements OR if - else statements OR if - else if - else statements.
 *
 * CHALLENGE USE TERNARY!
 */

public class _04Question {
    public static void main(String[] args) {
        int marks = 45;
        String res = (marks >= 90) ? "PASSED WITH DISTINCTION" : (marks >= 60) ? "PASSED" : "FAILED";

        System.out.println(res);
    }
}
