import java.util.Scanner;
public class numeroPerfecto {
	public static void main(String[]args){

		Scanner kb=new Scanner(System.in);
		int number = 0;
		int count = 0;
		int suma = 0;

		System.out.println("ingrese un numero para sabes si es un numero natural perfecto. ");
		number=kb.nextInt();

		for(count=1; count <= number-1; count++){
			if (number % count == 0){
			suma = suma + count;

		}

	}

	   System.out.println(suma);
	   if (suma == number) {
	   System.out.println("si es un numero perfecto. ");
   }
       else {
       System.out.println("no es un numero perfecto. ");
   }





	}
}
