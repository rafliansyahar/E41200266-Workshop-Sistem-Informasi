
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAFLI
 */
public class Tugas_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a=new Scanner(System.in);
            System.out.print("Masukkan jumlah nilai untuk array secara acak : ");
            int b = a.nextInt();
            int[] randomNumber =  new int[b];

            //input nilai
            for (int i = 0; i < b; i++) {
                    System.out.print("Nilai ke-" + i + " = ");
                    randomNumber[i] = a.nextInt();
                    }
            //output nilai
            System.out.print("Nilai array = ");
            System.out.print(" [ ");
            for (int i : randomNumber) {
		System.out.print(i + " ");
		}
            System.out.println(" ] ");
	}
    }
