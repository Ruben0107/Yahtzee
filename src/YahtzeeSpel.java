import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class YahtzeeSpel {
	
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	Integer[] inputSpeler = {};
	
	
	public static void dobbelstenen() {
			
		for(int x=1;x <= 5 ;x++){
			DobbelSteen ds = new DobbelSteen();
			arr.add(DobbelSteen.werpen());
		
		}

		
	}	
	
	public static void spelen() {
		
		
		for(Integer i : arr){
			Scanner sc = new Scanner(System.in);			
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
	
	public static void vasthouden() {
		
		Scanner scanner = new Scanner(System.in);
		
		String inputSpeler = scanner.next();
		
		Integer.parseInt(inputSpeler);
		
		
		//Maak een losse methode vasthouden(). 
		//Via een Scanner vraagt het programma om invoer. 
		//De invoer wordt via Integer.parseInt() omgezet tot een blokkeerarray van 0 en 1 bijvoorbeeld 11001. 
		//Dit blokkeerarray is een field van het YahtzeeSpel.
		
		
	
	}
	
	 

}
