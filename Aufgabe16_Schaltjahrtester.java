import java.util.Scanner;
public class Aufgabe16_Schaltjahrtester {
	public static void main(String [] args) {
		/*TODO
		 * Schaltjahr wenn:
		 * durch 4 aber nicht durch 100 und wenn durch 400
		 * 
		 *  nicht Schaltjahr wenn:
		 *  durch 100 aber nicht durch 400
		 */
		Scanner sc = new Scanner(System.in);
		boolean conSchalt = false;
		boolean conNoSchalt = false;
		int yearInput = sc.nextInt();
		
		//Schaltjahr wenn durch 4 nicht durch 100
		//schaltjahr wenn durch 400
		if(((yearInput%4 == 0) && (yearInput%100 != 0)) || (yearInput%400 == 0)) {
			System.out.println(yearInput + " ist ein Schaltjahr");
			
			//nicht schaltjahr wenn durch 100 aber nicht durch 400
//		}else if((yearInput%100 == 0) && (yearInput%400 != 0)) {
//			System.out.println(yearInput + " ist kein Schaltjahr");
		}else {
			System.out.println("NaN");
			System.out.println(yearInput + " ist kein Schaltjahr");
		}
		
//		if(yearInput%400 == 0) {
//			conSchalt = true;
//		}else if(yearInput%100 == 0) {
//			conSchalt = false;
//		}else if(yearInput%4 == 0) {
//			conSchalt = true;
//		}
//		
//		if(conSchalt == true) {
//			System.out.println(yearInput + " ist ein Schaltjahr");
//		} else if(conSchalt == false) {
//			System.out.println(yearInput + " ist kein Schaltjahr");
//		}
		
		
		
	}

}
