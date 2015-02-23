/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testscore;

/**
 *
 * @author class
 */
public class TestScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int testScore1 = 70;
        int testScore2 = 65;
        int testScore3 = 80;
        int total = testScore1 + testScore2 + testScore3;
        double average = total / 3.0;
        System.out.println("The score of testScore1 : " + testScore1);
        System.out.println("The score of testScore1 : " + testScore2);
        System.out.println("The score of testScore1 : " + testScore3);
        System.out.println("The average of all testScore: " + average);
        
        
    }
    
}
