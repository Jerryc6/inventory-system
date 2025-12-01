
import javax.swing.JFrame;
import java.util.Scanner;

public class main{

	public static void SoftwareJFrame(){ //This is the main frame of software
		JFrame frame = new JFrame("Invenory-System");
		frame.setSize(1200, 700);
		frame.setVisible(true);
		frame .setLayout(null);
	}

	public static void RI(){ // #1 Receiving Inventory
		
		Scanner RIsc = new Scanner(System.in);

		System.out.println("Enter company:");
		String company = RIsc.nextLine();

		System.out.println("Enter supplier:");
		String supplier = RIsc.nextLine();
		
		System.out.println("Enter purchase order:");
		String purchaseOrder = RIsc.nextLine();

		try{
			if(company.equals("abc company")){
				System.out.println("Correct");
			}if(supplier.equals("xyz supplier")){
				System.out.println("Correct");
			}if(purchaseOrder.equals("code")){
				System.out.println("Correct");
			}
		
		}catch(Exception e){
			System.out.println(e);
		}

		System.out.println("Enter Location");
		String location = TIsc.nextLine();
	}

	public static void SOI(){ // #2. Storing & Organizing Inventory

	}

	public static void RTIT(){// #3 Real-Time Inventory Tracking

	}


	public static void main(String [] args){
		main m = new main();
		m.RI();
	}
}
