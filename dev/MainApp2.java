package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
		System.out.println(" nhap so tu nhien n: ");
		int n = sc.nextInt();
		int i = 0;
		int sum = 0;
		while (i < n) {
			if (i % 3 == 0) {
				sum += i; // tong = tong + 1
			} else
				i = i++;
			i++;
		}
		System.out.println(" tong cac so chia het cho 3 be hon " + n + " la: " + sum);
		
		
		
	}

}
*/
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = sc.nextInt();
		int mod, r = 0 ;
		int temp = n ;
		
		while (n >0) { 
			mod = n % 10;
			n = n / 10 ;
			r = r * 10 + mod;
			
		}
		if(temp == r ){
			System.out.format("%d la so polinom" , temp);
		} else {
			System.out.format("%d khong phai la so polinom" , temp);
		}
	}
}
	

