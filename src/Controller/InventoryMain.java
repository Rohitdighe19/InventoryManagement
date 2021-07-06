package Controller;

import java.util.ArrayList;

import java.util.Scanner;

import Model.Inventory;

public class InventoryMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Inventory management System");
		ArrayList<Inventory> List = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		
		System.out.println("Enter 1.Add Inventory");
		System.out.println("Enter 2.View Inventory");
		System.out.println("Enter 3.Edit Inventory");
		System.out.println("Enter 4.Delete Inventory");
		System.out.println("Enter 5.Exit");
		
		int option = sc.nextInt();
	
		
		switch (option) {
		 
		case 1:
			System.out.println("Enter Inventory Name");
			String name = sc.next();
			
			System.out.println("Enter Inventory Price");
			Double price = sc.nextDouble();
			
			System.out.println("Enter Inventory Weight");
			Double Weight = sc.nextDouble();
			
			Inventory inventory = new Inventory();
			inventory.setName(name);
			inventory.setPrice(price);
			inventory.setWeight(Weight);
			
		    List.add(inventory);
		
		    break;
		    
		case 2:
			for (Inventory inventory1:List) {
				System.out.println(inventory1.getName()+ " " + inventory1.getPrice()+ " " + inventory1.getWeight()  );
				
			}
		   break;
		   
		case 3:
			System.out.println("Enter Inventory Name");
			String name1 = sc.next();
			for(int i =0;i<=List.size();i++) {
				if(List.get(i).getName().equals(name1)) {
					
			System.out.println("Enter New Price");
			Double newprice = sc.nextDouble();
			
			 System.out.println("Enter new weight");
			 Double newweight = sc.nextDouble();
			 
			List.get(i).setPrice(newprice);
			List.get(i).setWeight(newweight);
	         break;	
		}
				else {
					System.out.println("Please Enter correct Name");
					break;
				}	
			}
			
            break;
		case 4:
			System.out.println("Enter Inventory");
			String name2 =sc.next();
			for(int i =0;i<=List.size();i++) {
				if(List.get(i).getName().equals(name2)) {
					List.remove(i);
					
					break;	
				}
				else {
					System.out.println("Please Enter correct Name");
					break;
				}
			}
		
		}
		if(option == 5 ) {
			break;
			
		}
		
	}

}
}