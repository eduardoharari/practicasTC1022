import java.util.Scanner;
public class esBisiesto {
	public static void main(String[]args){

		Scanner kb=new Scanner(System.in);
		int year=0;

		System.out.println("ingrese un ano para sabes si es bisiesto. ");
		year=kb.nextInt();

		if (year < 100 && year % 4 ==0){
			System.out.println("si es bisiesto");
		}
		if (year%100==0 && year%400==0){
			System.out.println("si es bisiesto");
		}
		else if (year%100==0){
			System.out.println("no es bisiesto");
		}
		else {
			System.out.println("no es bisiesto");
		}



	}
}