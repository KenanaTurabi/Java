import java.time.LocalDate;
import java.util.Scanner;
public class SeniorVisitor extends Visitor {
	Receptioniest r=new Receptioniest();
	Scanner s=new Scanner (System.in);
double  discountRate ;

public double getDiscountRate() {
	return discountRate;
}

public void setDiscountRate(double discountRate) {
	this.discountRate = discountRate;
}

public SeniorVisitor() {
	super();
}

public SeniorVisitor(double discountRate) {
	super();
	this.discountRate = discountRate;
}
/*
void booktour(int ID ) {
	MuseumSystem m=new MuseumSystem();
	
	System.out.print("If you need a Guide enter 1 else enter 0  ");
	int x;
	x=s.nextInt();
	if (x==1) {
		System.out.print("Enter the date Formate -->(yy-mm-dd) of the tour and the language -->[Arabic,English,Franch,Italian,Chinese]");
		String date = s.next();
		String lan = s.next();
		System.out.print("yr Guide will be one of these available Guides");
		m.getAvaliableGuide(date,lan);
		r.issueTicket_withGuide(ID);

		
		
		
	}
	else 
		
		r.issueTicket(ID);
	}	
	*/
	
}
