import java.time.LocalDate;
import java.util.Scanner;
public class Receptioniest extends Employee {
	public Receptioniest() {
		super();
	}
	Scanner inp=new Scanner(System.in);
	
	public void registersubs(int x)
	{
		if (x==1) {
	System.out.print("\nenter Visitor id :");
	MuseumSystem m=new MuseumSystem();
	//m.addVisitor(inp.nextInt());
		}

		else if (x==2) {
	System.out.print("\nenter Guide id :");
	MuseumSystem m=new MuseumSystem();
//	m.addGuide(inp.nextInt());
		}
		else {
			System.out.print("\nInvalid Input");

		}
		
		
	
	}
	public void editSubs() {
		System.out.print("If U want to edit visitor data press 0 \nIf U want to edit Guide data press 1\n");
		System.out.print("----------------------------------------------------------------------------------------\n");
		boolean flag1=false;
		boolean flag2=false;
		System.out.print("enter yr choice");
		int c=inp.nextInt();
		switch(c){
		case 0:
			System.out.print("enter visitor id");
			int ID=inp.nextInt();
			for(Visitor v:MuseumSystem.visitors) {
				if(v.id==ID) {
				flag1=true;
					System.out.print("----------------------------------------------------------------------------------------\n");
					System.out.print("What u want 2 change \nIf U want 2 change visitor name press 1\nIf U want 2 change visitor ID press 2\nIf U want 2 change visitor Date Of Birth press 3\nIf U want 2 change visitor Record ID press 4\nIf U want 2 change visits count press 5\nIf U want to exit press 6\n  ");
					System.out.print("----------------------------------------------------------------------------------------\n");
					while(true){
					
					System.out.print("enter yr choice");
					int p=inp.nextInt();
					if(p==1) {
						System.out.print("enter new name :");
						v.setName(inp.next());
					}
					else if(p==2) {
						System.out.print("enter new Id :");
						v.setId(inp.nextInt());
					}
					else if(p==3) {
						System.out.print("enter new dop in this formate (yy-mm-dd) :");
						LocalDate db=LocalDate.parse(inp.next());
						v.setDob(db);
					}
					else if(p==4) {
						System.out.print("enter new Record Id :");
						v.setRecord_id(inp.nextInt());
					}
					else if(p==5) {
						System.out.print("enter new visits count :");
						v.setVisits_count(inp.nextInt());
					}
					else if (p==6) break;
					else 
						System.out.print("Invalid input \n");
					
				}}
				
				}

			if (flag1==false)
			System.out.print("No visitors with this id in the system \n"); 
			
			
			
			break;
		case 1 :
			System.out.print("enter Guide id");
			int gd=inp.nextInt();
			for(Guide gg:MuseumSystem.Guides) {
			
				if(gg.id==gd) {
					flag2=true;
					System.out.print("----------------------------------------------------------------------------------------\n");
					System.out.print("What u want 2 change \nIf U want 2 change visitor name press 1\nIf U want 2 change visitor ID press 2\nIf U want 2 change visitor Date Of Birth press 3\nIf U want 2 change employment ID press 4\nIf U want 2 change Hire Date press 5\nIf U want 2 change # tours per day press 6\nIf U want to exit press 7\n  ");
					System.out.print("----------------------------------------------------------------------------------------\n");
					while(true){
						System.out.print("enter yr choice");
						int n=inp.nextInt();
						if(n==1) {
							System.out.print("enter new name :");
							gg.setName(inp.next());
						}
						else if(n==2) {
							System.out.print("enter new Id :");
							gg.setId(inp.nextInt());
						}
						else if(n==3) {
							System.out.print("enter new dop in this formate (yy-mm-dd) :");
							LocalDate gdb=LocalDate.parse(inp.next());
							gg.setDob(gdb);
						}
						else if(n==4) {
							System.out.print("enter new employment Id :");
							gg.setEmployment_id(inp.nextInt());
						}
						else if(n==5) {
							System.out.print("enter new Hire Date in this formate (yy-mm-dd):");
							LocalDate Hdb=LocalDate.parse(inp.next());
							gg.setDob(Hdb);			
							}
						else if(n==6) {
							System.out.print("enter new # tours per day");
							gg.setToursPerDay(inp.nextInt());
							}
						else if (n==7) break;
						else 
							System.out.print("Invalid input \n");
						
					
					}
						}
					}
			if(flag2==false)
				System.out.print("No Guides with this id in the system \n");
			break;
		}
		
		
	}
	//ISSUE_TICKET
	
/*	public void issueTicket(int ID){
		while(true) {
		Visitor VV=new Visitor();
		boolean flag =false;
		//check if the visitor exists before 
		for(Visitor b:MuseumSystem.visitors) {
			if(b.id==ID) {
				VV=b;
				flag=true;
				}
		}
		if (flag==false) {
			System.out.print("\nYou can't get a ticket coz. u have to register first\n");
			break;
		}
		else {
			System.out.print("You can get a ticket coz. u have registered before \n");
			
				String tDate;
				LocalDate LD;
				int tId;
			System.out.print("\n----------------------------------------------------------------------------------------\n");
			System.out.print("pick type of tickets : \n for One-Time Ticket press 1\n for Multi-Time Ticket press 2\n If u want to exit press 3 \n");
			System.out.print("----------------------------------------------------------------------------------------");
			System.out.print("\n enter a choice : ");
			int c=inp.nextInt();
			switch(c) {
			case 1 :
				
				OneTimeTicket OT=new OneTimeTicket();
				
				System.out.print("Enter ticket ID : ");
				tId=inp.nextInt();
				OT.setTicketId(tId);
				System.out.print("\n Enter IssueDate :  ");
				tDate=inp.next();
				LD=LocalDate.parse(tDate);
				OT.setIssueDate(LD);
				int p=OT.getPrice();
				if(VV.visits_count<5) {
				System.out.print("You got an One time ticket and u have to pay : "); 
				System.out.print(p+"$");
				}
				else {
					System.out.print("You got an One time ticket with 50% discount and u have to pay :"); 
					System.out.print(p*50/100+"$");
				}
				OT.setVisitor(VV);
				System.out.print("\n---------------------------------------------------------------------------------------\n");
				System.out.print("\nYour Ticket Info :");
				System.out.print("\n---------------------------------------------------------------------------------------\n");
				System.out.print(OT);
				break;
			case 2 :
				MultiTimeTicket MT=new MultiTimeTicket();
				System.out.print("pick type of Multi-Tickets : \n for Daily Multi-Ticket press 1\n for Monthily Multi-Ticket press 2\n for Yearly Multi-Ticket press 3\n if u want to exit press 4\n");			
				System.out.print("----------------------------------------------------------------------------------------");
				System.out.print("\nenter a choice : ");
				int x=inp.nextInt();
				if(x==1) {
					System.out.print("Enter ticket ID : ");
					tId=inp.nextInt();
					MT.setTicketId(tId);
					System.out.print(" Enter IssueDate : ");
					tDate=inp.next();
					LD=LocalDate.parse(tDate);
					MT.setIssueDate(LD);
					MT.setTicketType(TicketType.DAILY);
					int tt= MT.getPrice();
					if(VV.visits_count<5) {
					System.out.print("You got an Daily MultiTimeTicket and u have to pay : "); 
					System.out.print(tt+"$");
					}
					else {
					System.out.print("You got an Daily MultiTimeTicket with 50% discount and u have to pay : "); 
					System.out.print(tt*50/100+"$");
					}
				}
				else if(x==2) {
					System.out.print("Enter ticket ID ");
					tId=inp.nextInt();
					MT.setTicketId(tId);
					System.out.print(" Enter IssueDate  ");
					tDate=inp.next();
					LD=LocalDate.parse(tDate);
					MT.setIssueDate(LD);
					MT.setTicketType(TicketType.MONTHILY);
					int tt= MT.getPrice();
					if(VV.visits_count<5) {
					System.out.print("You got an MONTHILY MultiTimeTicket and u have to pay : "); 
					System.out.print(tt*2+"$");
					}
					else {
					System.out.print("You got an MONTHILY MultiTimeTicket with 50% discount and u have to pay : "); 
					System.out.print(tt*2*50/100+"$");
					}
				}
				else if(x==3) {
					System.out.print("Enter ticket ID ");
					tId=inp.nextInt();
					MT.setTicketId(tId);
					System.out.print(" Enter IssueDate  ");
					tDate=inp.next();
					LD=LocalDate.parse(tDate);
					MT.setIssueDate(LD);
					MT.setTicketType(TicketType.YEARLY);
					int tt= MT.getPrice();
					if(VV.visits_count<5) {
					System.out.print("You got an YEARLY MultiTimeTicket and u have to pay : "); 
					System.out.print(tt*3+"$");
					}
					else {
					System.out.print("You got an YEARLY MultiTimeTicket with 50% discount and u have to pay : "); 
					System.out.print(tt*3*50/100+"$");
					}
				}
				
				else 		
					System.out.print("\nInvalid Input");
				MT.setVisitor(VV);
				
				break;
			case 3 : 
				break;
				
		default :
			System.out.print("\nInvalid Input");
			
		
	}//switch
	break;
		
		}//loop
		}}//else //fun
		
	*/
public void deleteSubs() {
	while (true) {
		System.out.print("\n plz enter yr choice :");
		int y=inp.nextInt();
	if(y==1) {
		boolean flag1=true;
		System.out.print("\nEnter Guide ID :");
	int op=inp.nextInt();
	for (int i=0;i<MuseumSystem.Guides.size();i++) {
		if(MuseumSystem.Guides.get(i).id==op) {
			flag1=false;
			MuseumSystem.Guides.remove(MuseumSystem.Guides.get(i));
		System.out.printf("\n The guide with id=%d removed  ",op);

	}
		}
		if (flag1==true)
			System.out.printf("No Guide exists in the System with this ID %d ",op);
	
		}
	
	
	else if (y==2) {
		boolean f2=false;
		System.out.print("\n Enter visitor ID :  ");
		int uu=inp.nextInt();
		for (int i=0;i<MuseumSystem.visitors.size();i++) {
			
			if(MuseumSystem.visitors.get(i).id==uu) {
				f2=true;
				MuseumSystem.visitors.remove(MuseumSystem.visitors.get(i));
			System.out.printf("\n The guide with id=%d removed  ",uu);

		
		}
		
		}
		if (f2==false)
			System.out.printf("No visitors exists in the System with this ID %d ",uu);

	
	}
	else if (y==3) 
		break;
	else 
		System.out.print("\n Invalid Input");	
	break;
}



}


//Issue ticket with Guide
public void issueTicket_withGuide(int ID){
	while(true) {
	Visitor VV=new Visitor();
	boolean flag =false;
	//check if the visitor exists before 
	for(Visitor b:MuseumSystem.visitors) {
		if(b.id==ID) {
			VV=b;
			flag=true;
			}
	}
	if (flag==false) {
		System.out.print("\nYou can't get a ticket coz. u have to register first\n");
		break;
	}
	else {
		System.out.print("You can get a ticket coz. u have registered before \n");
		
			String tDate;
			LocalDate LD;
			int tId;
		System.out.print("\n----------------------------------------------------------------------------------------\n");
		System.out.print("pick type of tickets : \n for One-Time Ticket press 1\n for Multi-Time Ticket press 2\n If u want to exit press 3 \n");
		System.out.print("----------------------------------------------------------------------------------------");
		System.out.print("\n enter a choice : ");
		int c=inp.nextInt();
		switch(c) {
		case 1 :
			
			OneTimeTicket OT=new OneTimeTicket();
			
			System.out.print("Enter ticket ID : ");
			tId=inp.nextInt();
			OT.setTicketId(tId);
			System.out.print("\n Enter IssueDate :  ");
			tDate=inp.next();
			LD=LocalDate.parse(tDate);
			OT.setIssueDate(LD);
			int p=OT.getPrice();
			if(VV.visits_count<5) {
			System.out.print("You got an One time ticket and u have to pay"); 
			System.out.print(20+p+"$");
			}
			else {
				System.out.print("You got an One time ticket with 50% discount and u have to pay :"); 
				System.out.print((p*50/100)+20+"$");
			}
			OT.setVisitor(VV);
			System.out.print("\n---------------------------------------------------------------------------------------\n");
			System.out.print("\nYour Ticket Info :");
			System.out.print("\n---------------------------------------------------------------------------------------\n");
			System.out.print(OT);
			break;
		case 2 :
			MultiTimeTicket MT=new MultiTimeTicket();
			System.out.print("----------------------------------------------------------------------------------------\n");
			System.out.print("pick type of Multi-Tickets : \n for Daily Multi-Ticket press 1\n for Monthily Multi-Ticket press 2\n for Yearly Multi-Ticket press 3\n if u want to exit press 4\n");			
			System.out.print("----------------------------------------------------------------------------------------");
			System.out.print("\nenter a choice : ");
			int x=inp.nextInt();
			if(x==1) {
				System.out.print("Enter ticket ID : ");
				tId=inp.nextInt();
				MT.setTicketId(tId);
				System.out.print(" Enter IssueDate : ");
				tDate=inp.next();
				LD=LocalDate.parse(tDate);
				MT.setIssueDate(LD);
				MT.setTicketType(TicketType.DAILY);
				int tt= MT.getPrice();
				if(VV.visits_count<5) {
				System.out.print("You got an Daily MultiTimeTicket and u have to pay : "); 
				System.out.print(tt+20+"$");
				}
				else {
				System.out.print("You got an Daily MultiTimeTicket with 50% discount and u have to pay : "); 
				System.out.print((tt*50/100)+20+"$");
				}
				System.out.print("\n Your Ticket Info :");
				System.out.print(MT);
			}
			else if(x==2) {
				System.out.print("Enter ticket ID ");
				tId=inp.nextInt();
				MT.setTicketId(tId);
				System.out.print(" Enter IssueDate  ");
				tDate=inp.next();
				LD=LocalDate.parse(tDate);
				MT.setIssueDate(LD);
				MT.setTicketType(TicketType.MONTHILY);
				int tt= MT.getPrice();
				if(VV.visits_count<5) {
				System.out.print("You got an MONTHILY MultiTimeTicket and u have to pay : "); 
				System.out.print((tt*2)+20+"$");
				}
				else {
				System.out.print("You got an MONTHILY MultiTimeTicket with 50% discount and u have to pay : "); 
				System.out.print((tt*2*50/100)+20+"$");
				}
				System.out.print("\n Your Ticket Info :");
				System.out.print(MT);
			}
			else if(x==3) {
				System.out.print("Enter ticket ID ");
				tId=inp.nextInt();
				MT.setTicketId(tId);
				System.out.print(" Enter IssueDate  ");
				tDate=inp.next();
				LD=LocalDate.parse(tDate);
				MT.setIssueDate(LD);
				MT.setTicketType(TicketType.YEARLY);
				int tt= MT.getPrice();
				if(VV.visits_count<5) {
				System.out.print("You got an YEARLY MultiTimeTicket and u have to pay : "); 
				System.out.print((tt*3)+20+"$");
				}
				else {
				System.out.print("You got an YEARLY MultiTimeTicket with 50% discount and u have to pay : "); 
				System.out.print((tt*3*50/100)+20 + "$ \n" );
				}
				System.out.print("\n Your Ticket Info :");
				System.out.print(MT);
			}
			
			else 		
				System.out.print("\nInvalid Input");
			MT.setVisitor(VV);
			
			break;
		case 3 : 
			break;
			
	default :
		System.out.print("\nInvalid Input");
		
	
}//switch
break;
	
	}//loop
	}
	
	

	}//else //fun


}











