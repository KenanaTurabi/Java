import java.time.LocalDateTime ;
import java.time.DayOfWeek;
import java.time.LocalDate ;
import java.time.LocalTime ;
import java.util.ArrayList;
import java.util.Scanner;
public class Test_Class {

	
	 static void Menue() {
	System.out.print("\n ----------------------------------------------------------------------------------------\n");
	System.out.println("If u want 2 see the menue again press 0");
 	System.out.println("If u want 2 see the museum info. press 1");
  	System.out.println("If u want 2 to register subs press 2");
  	System.out.println("If u want 2 delete subs press 3");
 	System.out.println("If u want 2 see the museum Guide's Info. press 4");
 	System.out.println("If u want 2 see the museum Visitor's Info. press 5");
 	System.out.println("If u want 2 get a tecket press 6");
 	System.out.println("If u want 2 Bk tour press 7");
	System.out.println("If u want 2 see the Tickets menue Information press 8");
 	System.out.println("If u want 2 edit guide or visitor data press 9");
 	System.out.println("If u want 2 exit press 10");
	System.out.print("----------------------------------------------------------------------------------------");



	 }
public static void main(String []args) {
	MuseumSystem mm=new MuseumSystem();
	mm.default_Guides_and_visitors_In_The_System();
	//System.out.println(mm.Search_Guide("alaa"));
	//System.out.println(mm.Search_Guide("amal"));
	//System.out.println(mm.Search_Guide_lang("ENGLISH"));
//	System.out.println(mm.Search_Guide_lang("ARABIC"));
	//System.out.println(mm.Search_Guide_lang("ARABIC"));

	//System.out.println(mm.Search_Guide_day("SATURDAY"));
	//System.out.println(mm.Search_Guide_day("SATURDAY"));
	//System.out.println(mm.Search_Guide_day("TUESDAY"));

	//System.out.println(mm.Search_Guide("diana"));

	/*
	ArrayList <String> zz=new ArrayList<String>();
	 MuseumSystem m=new MuseumSystem();
		//m.default_Guides_and_visitors_In_The_System();
		String x=m.Search_Guide_day("THURSDAY");
		System.out.println(x);
	//	int y=m.issueTicket(100, 'D');
	//	System.out.print("\n"+y);
		 zz=m.getAvaliableGuide("SUNDAY","ARABIC");
				System.out.print(zz.toString());
*/

	/*
	Receptioniest r = new Receptioniest();
	Ticket k=new Ticket ();
	//from here 
	 MuseumSystem m=new MuseumSystem();
		m.default_Guides_and_visitors_In_The_System();

	Test_Class.Menue();
	 while(true) {
	 System.out.print("\nplz enter yr choice : ");
	 Scanner input=new Scanner(System.in);
	int choice=input.nextInt();
	switch(choice) {
	case 0:
		Test_Class.Menue();
		break;
	case 1:
		MuseumSystem.MuseumInformation();
		break;
	case 2 : 
		System.out.print("\n----------------------------------------------------------------------------------------\n");
		System.out.print(" If you want to register subs for visitor press 1 \n If you want to regester subs for Guide press 2  ");
		System.out.print("\n----------------------------------------------------------------------------------------\n");
		System.out.print("\nenter yr choice : ");
		r.registersubs(input.nextInt());	
		break;
	case 3 :
		System.out.print(" If you want to delete subs for Guide press 1 \n If you want to delete subs for visitor press 2 \n If you want to exit press 3 \n  ");
		System.out.print("----------------------------------------------------------------------------------------\n");
		System.out.print("\nenter yr choice : ");
		r.deleteSubs();
		break;
		
	case 4:
		m.printGides();
		break;
	case 5:
		m.printvisitors();
		break;
	case 6:
		System.out.print("Enter visiter Id : ");
		int vid=input.nextInt();
		r.issueTicket(vid);
		break;

	case 7:
		System.out.print("Enter visiter Id : ");
		int Vid=input.nextInt();
		boolean f=true;
		for(Visitor v:MuseumSystem.visitors) {
			if(v.id==Vid) {
				f=false;
			System.out.print("u have a record in our Museum before");
			if(v.visits_count>5) {
				System.out.print("\nU R senior visitor so u will get discount \n ");
				SeniorVisitor SV=new SeniorVisitor();
				SV.booktour(Vid);
		}
			else
			{
				System.out.print("\nU R Regular visitor so u will NOT get discount  \n ");
				RegularVisitor RV=new RegularVisitor();
				RV.bookTour(Vid);
			}
		}
		}
		if(f==true)		
			System.out.print("\nU do not have record in the museuem. you have to register first. \n ");
		break;
			
	case 8 : k.TicketInfo();
	break;
	case 9:r.editSubs();
		break;
	case 10:
		System.out.print("--------------FINISH-----------");
		System.exit(0);
		
	default:  
		System.out.print("\n invalid input");
		//to here
	
	
	}}

	*/
}

}