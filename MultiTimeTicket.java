public class MultiTimeTicket extends Ticket {
	private TicketType ticketType;

	
public MultiTimeTicket() {
		super();
	if(ticketType==TicketType.DAILY)
			setPrice(getPrice()*1);
		if(ticketType==TicketType.MONTHILY)
		setPrice(getPrice()*2);
		if(ticketType==TicketType.YEARLY)
		setPrice(getPrice()*3);
		
	
}

/*
public int getPrice() {
	return this.price;
}
*/
	/*	
	public MultiTimeTicket(int ticketId, LocalDate issueDate, int price, Visitor visitor, TicketType ticketType) {
		super(ticketId, issueDate, price, visitor);
		this.ticketType = ticketType;
	}
*/
	public TicketType getTicketType() {
		return ticketType;
	}

	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}
	
}
