import java.time.LocalDate;
import java.time.LocalTime;

public class VisitorRecord {
	
LocalDate enteringDate ;
LocalTime enteringTime ;
public VisitorRecord() {
	super();
}
public VisitorRecord(LocalDate enteringDate, LocalTime enteringTime) {
	super();
	this.enteringDate = enteringDate;
	this.enteringTime = enteringTime;
}
@Override
public String toString() {
	return " Date=" + enteringDate + " & Time=" + enteringTime ;
}

}
