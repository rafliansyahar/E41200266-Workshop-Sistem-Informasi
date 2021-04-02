
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
public class Tugas_E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	
	Scanner a = new Scanner(System.in);
	System.out.println("		Rafli Drinking");
	System.out.println("		 Aneka Minuman");
	System.out.println("---------------------------------------");
	System.out.println("1. Soft drinks");
	System.out.println("2. Mix juice");
	System.out.println("3. Coffee");
	System.out.println("4. Soda milk");
	System.out.println("5. Ice tea");
	System.out.println("---------------------------------------");
	System.out.print("Silahkan masukkan nama pembeli : ");
	String nama = a.nextLine();
	System.out.print("Silahkan masukkan pilihan kamu : ");
	
	int op = a.nextInt();
	String pilihan = "";
       
	switch (op) {
		case 1:
		pilihan  = "Soft drink";
		break;
		case 2:
		pilihan  = "Mix Juice";
		break;
		case 3:
		pilihan  = "Coffee";
		break;
		case 4:
		pilihan  = "Soda milk";
		break;
		case 5:
		pilihan  = "Ice tea";
		break;	
		default:
		System.out.println("pilihan anda tidak ada di menu");
		break;
            }   
    System.out.println("Minuman yang anda pilih : " + pilihan);
    System.out.println("Pesanan anda akan segera di antar");
    System.out.println("Terima Kasih " + nama + " telah berkunjung ke Rafli Drinking");	
    }
}
