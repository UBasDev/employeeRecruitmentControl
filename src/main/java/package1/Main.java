package package1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean hak = true;
		Scanner input = new Scanner(System.in);
		System.out.println("L�tfen isim giriniz : ");
		String inputName = input.nextLine();
		System.out.println("L�tfen soyisim giriniz : ");
		String inputLastname = input.nextLine();
		System.out.println("L�tfen ya��n�z� giriniz : ");
		int inputAge = input.nextInt();
		if(inputAge<18 || inputAge>40) {
			hak = false;
		}
		else {
			System.out.println("L�tfen maa� beklentinizi giriniz : ");
			int inputWage = input.nextInt();
			if(inputWage>4000) {
				hak=false;				
			}
			else if(inputWage<0) {
				System.out.println("Tan�mlanmayan de�er girdiniz!L�tfen uygulama sayfas�n� yenileyiniz.");
			}
			else {
				System.out.println("L�tfen yabanc� dil seviyenizi 100 �zerinden giriniz : ");
				int inputLanguageLevel = input.nextInt();
				if(inputLanguageLevel<80) {
					hak=false;
				}
				else if(inputLanguageLevel>100) {
					System.out.println("Tan�mlanmayan de�er girdiniz!L�tfen uygulama sayfas�n� yenileyiniz.");
					return;
				}
				else {
					hak = true;
				}
			}
		}
		if(hak==false) {
			System.out.println("Malesef kriterleri kar��lam�yorsunuz!");
		}
		if(hak==true) {
			System.out.println("Kriterlere uygunsunuz.Ba�vuru i�in sitemize y�nlendiriliyorsunuz...");
		}
	}

}
