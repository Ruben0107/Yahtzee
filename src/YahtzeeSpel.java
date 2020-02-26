import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class YahtzeeSpel {
	
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	
	
	public static void dobbelstenen() {
	
		arr.add(DobbelSteen.werpen());
		arr.add(DobbelSteen.werpen());
		arr.add(DobbelSteen.werpen());
		arr.add(DobbelSteen.werpen());
		arr.add(DobbelSteen.werpen());
		arr.add(DobbelSteen.werpen());
		
	}	
	
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
				System.out.println(arr);
				
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
	
	 

}
