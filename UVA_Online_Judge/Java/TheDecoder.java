/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thedecoder;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author linah
 * UVA
 * ID: 458
 */
public class TheDecoder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream output = new DataOutputStream(System.out);
        int C;
        while ((C = in.read()) != -1) {
            output.write((Character.isSpace((char) C) ? C : (C - 7)));
        }
    }
}
