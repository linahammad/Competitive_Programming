
package back.to.high.school.physics;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10071
 */
public class BackToHighSchoolPhysics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            System.out.println(n1 * n2 * 2);

        }
    }

}
