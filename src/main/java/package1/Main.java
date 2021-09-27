package package1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean hak = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen isim giriniz : ");
		String inputName = input.nextLine();
		System.out.println("Lütfen soyisim giriniz : ");
		String inputLastname = input.nextLine();
		System.out.println("Lütfen yaþýnýzý giriniz : ");
		int inputAge = input.nextInt();
		if(inputAge<18 || inputAge>40) {
			hak = false;
		}
		else {
			System.out.println("Lütfen maaþ beklentinizi giriniz : ");
			int inputWage = input.nextInt();
			if(inputWage>4000) {
				hak=false;				
			}
			else if(inputWage<0) {
				System.out.println("Tanýmlanmayan deðer girdiniz!Lütfen uygulama sayfasýný yenileyiniz.");
			}
			else {
				System.out.println("Lütfen yabancý dil seviyenizi 100 üzerinden giriniz : ");
				int inputLanguageLevel = input.nextInt();
				if(inputLanguageLevel<80) {
					hak=false;
				}
				else if(inputLanguageLevel>100) {
					System.out.println("Tanýmlanmayan deðer girdiniz!Lütfen uygulama sayfasýný yenileyiniz.");
					return;
				}
				else {
					hak = true;
				}
			}
		}
		if(hak==false) {
			System.out.println("Malesef kriterleri karþýlamýyorsunuz!");
		}
		if(hak==true) {
			System.out.println("Kriterlere uygunsunuz.Baþvuru için sitemize yönlendiriliyorsunuz...");
		}
	}

}
