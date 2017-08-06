/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalcounter;

import java.util.Scanner;

/**
 *
 * @author linah 
 * CodeForces
 * ID: 495A
 */
public class DigitalCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {2, 7, 2, 3, 3, 4, 2, 5, 1, 2};
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        System.out.println(arr[b / 10] * arr[b % 10]);
    }

}
