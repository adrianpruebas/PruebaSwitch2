package pruebas;
import java.util.Scanner;
public class PruebaSwitch2 {

		public static void main (String[] args){
			 Scanner teclado=new Scanner(System.in);
		      float n1;
		      float n2;
		      char op;
		     System.out.println("1-sumar\n"+"2-Restar\n"+"3-Multiplicar\n"+"4-Dividir");
		      System.out.println("Teclea un número ");
		      n1= teclado.nextFloat();
		      System.out.println("Teclea un número ");
		      n2= teclado.nextFloat();
		      System.out.println("Elige una operación 1+,2-,3*,4/ ");
		      op= teclado.next().charAt(0);
	switch ( op ) {
	case '1':
	System.out.println( n1 + n2 );
	break;
	case '2':
	System.out.println( n1 - n2 );
	break;
	case '3':
	System.out.println( n1 * n2 );
	break;
	case '4':
	System.out.println( n1 / n2 );
	break;
	default:
	System.out.println("error" );
	break;
		      }
		   }
		}

