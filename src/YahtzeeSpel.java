import java.util.Scanner;
import java.util.Random;

public class YahtzeeSpel {
	
	public static void spelen() {
		int x = 100;
		for(int i=1;i < x ;i++){
			Scanner sc = new Scanner(System.in);			
//			String test = sc.nextLine();
//			System.out.println(">>"+test.equals(""));
//			char go = sc.nextLine();
//			int gaan = go;
//			System.out.println(gaan);
			String go = sc.nextLine();
			if (go.equals("") ) {
				System.out.println("nog een rondje");
				
			} 
			if(go.equals("q")) { 
				System.out.println("Het spel is klaar nu");
				break;
  				// block of code to be executed if the condition is false
			}
			else {
				System.out.println();
			}
			

		}
	}
	
	 static int werpen() {
		
		
		Random r = new Random();
		
		int r1 = r.nextInt(6);
		
		return r1; 
		
	}

}
