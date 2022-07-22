import java.time.LocalDate;
public class Ticket {
private int ticketId;
private LocalDate issueDate;
private int price=100;
private Visitor visitor;

public Ticket() {}
public Ticket(int ticketId, LocalDate issueDate, int price, Visitor visitor) {
	this.ticketId = ticketId;
	this.issueDate = issueDate;
	this.price = price;
	this.visitor = visitor;
}
public  void TicketInfo() {
	System.out.println("\n------------------------------------------------------------------------------------------------------");
	System.out.print(" One time ticket price = 50$ for Regular & 25$ for Senior BUT also u have to pay extra 20$ for Guide if u need \n ");
	System.out.print("Daily time ticket price = 100$ for Regular & 50$ for Senior BUT also u have to pay extra 20$ for Guide if u need \n ");
	System.out.print("Monthily time ticket price = 200$ for Regular & 100$ for Senior BUT also u have to pay extra 20$ for Guide if u need \n ");;
	System.out.print("Yearly time ticket price = 300$ for Regular & 150$ for Senior BUT also u have to pay extra 20$ for Guide if u need \n ");;
	System.out.print("--------------------------------------------------------------------------------------------------------------");

}

public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public LocalDate getIssueDate() {
	return issueDate;
}
public void setIssueDate(LocalDate issueDate) {
	this.issueDate = issueDate;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Visitor getVisitor() {
	return visitor;
}
public void setVisitor(Visitor visitor) {
	this.visitor = visitor;
}


@Override
public String toString() {
	return "Ticket [ticketId=" + ticketId + ", issueDate=" + issueDate +"]";
			
}
public TicketType getTicketType() {
	// TODO Auto-generated method stub
	return null;
}

}