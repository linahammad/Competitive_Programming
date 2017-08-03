/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loansomecarbuyer;

import java.util.Scanner;

/**
 *
 * @author linah
 * UVA
 * ID: 10114 
 */
public class LoansomeCarBuyer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Reader = new Scanner(System.in);
        int loanDuration;
        double downPayment;
        double loanAmount;
        double carValue;
        int noOfDepr;
        double monthlyPayment;
        String ss;
        while ((loanDuration = Reader.nextInt()) > 0) {

            downPayment = Reader.nextDouble();
            loanAmount = Reader.nextDouble();
            noOfDepr = Reader.nextInt();
            monthlyPayment = loanAmount / loanDuration;
            carValue = downPayment + loanAmount;

            int readedDepr = 0;
            int lastReadedDeprMonth = -1;
            double lastReadedDeprValue = 0;
            double monthDeprPercentage = 0;
            int currentDepr = 0;
            for (int currentMonth = 0;; currentMonth++) {
                if (readedDepr < noOfDepr && lastReadedDeprMonth < currentMonth) {
                    lastReadedDeprValue = monthDeprPercentage;
                    currentDepr = Reader.nextInt();
                    monthDeprPercentage = Reader.nextDouble();
                    readedDepr++;
                    lastReadedDeprMonth = currentDepr;

                }
                if (currentDepr > currentMonth) {
                    carValue -= carValue * lastReadedDeprValue;
                } else {
                    carValue -= carValue * monthDeprPercentage;
                }

                if (carValue > loanAmount) {

                    if (currentMonth == 1) {

                        System.out.println(currentMonth + " month");
                    } else {
                        System.out.println(currentMonth + " months");
                    }
                    while (readedDepr < noOfDepr) {
                        currentDepr = Reader.nextInt();
                        monthDeprPercentage = Reader.nextDouble();
                        readedDepr++;

                    }
                    break;
                }
                loanAmount -= monthlyPayment;
            }
        }
    }
}
