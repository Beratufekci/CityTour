import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class CityTour {
	
	public static void showOperations() {
		
		System.out.println("0-Show Operations");
		System.out.println("1-Go to next city");
		System.out.println("2-Go to previous city");
		System.out.println("3-Exit ");
		
		
		
	}
	
	public static void travelCities(LinkedList<String> cities) {
		
		ListIterator<String> iterator = cities.listIterator();
		int operation;
		
		showOperations();
		
		Scanner sc = new Scanner(System.in);
		
		if(!iterator.hasNext()) {
			System.out.println("There is no any city");
		}
		
		boolean exit = false;
		boolean next = true;
		
		while(!exit) {
			System.out.println("Choose an operation :  ");
			operation = sc.nextInt();
			
			switch(operation) {
			     case 0:
			    	 showOperations();
			    	 break;
			    	 
			     case 1:
			    	 
			    	 if(!next) {
			    		 if(iterator.hasNext())
			    			 iterator.next();
			    	 }
			    	 next = true;
			    	
			    	 if(iterator.hasNext()) {
			    		System.out.println("it is going to city :  " + iterator.next()); 
			    	 }
			    	 else {
			    		 System.out.println("There is no more city to go...");
			    		 next = true;
			    	 }
			    	 
			    	 break;
			    	 
			     case 2:
			    	 if(next) {
			    		 
			    		if(iterator.hasPrevious())
			    			iterator.previous();
			    		 
			    	 }
			    	 
			    	 next = false;
			    	
			    	 if(iterator.hasPrevious()) {
			    		 System.out.println("it is going to city : " + iterator.previous());
			    	 }
			    	 else {
			    		 System.out.println("Tour was just started...");
			    	 }
			    	 break;
			    	 
			     case 3:
			    	 exit = true;
			    	 System.out.println("You are about to exit the app...");
			    	 break;
			
			}
			
			
			
		}
	
		
		
	}

	public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<String>();
		
		cities.add("Ýstanbul");
		cities.add("Ýzmir");
		cities.add("Bursa");
		cities.add("Eskisehir");
		
		travelCities(cities);
		
		
	}

}
