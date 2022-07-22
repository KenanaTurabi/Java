import java.time.LocalDate;
import java.util.ArrayList;
public class Visitor extends Person {
int record_id;
int visits_count=0;
boolean is_senior=false;

ArrayList<VisitorRecord> Record=new ArrayList<VisitorRecord>();

public Visitor() {
	super();
}
/*
public Visitor(String name, int id, LocalDate dob) {
	super(name,id,dob);

}
*/
public Visitor(String name, int id, LocalDate dob,int record_id, ArrayList<VisitorRecord> record) {
	super(name,id,dob);
	this.record_id = record_id;
	this.Record = record;
}
public void setVisitorRecord(ArrayList<VisitorRecord> VR){
	Record=VR;
}

public ArrayList<VisitorRecord>getVisits(){
	return Record;
	
}
public void setVisits(VisitorRecord enteringDate,VisitorRecord enteringTime){
	Record.add(enteringDate);
	Record.add(enteringTime);

}
public int getRecord_id() {
	return record_id;
}

public void setRecord_id(int record_id) {
	this.record_id = record_id;
}

public int getVisits_count() {
	return visits_count;
}

public void setVisits_count(int visits_count) {
	this.visits_count = visits_count;
}
public int getvId () {
	return getId();
}
public void setvId(int id) {
	setId(id);
}
void bookTour() {}
public void set_serial_id(int s_id) {
	ser_id=s_id;
}
public int get_serial_id() {
	return ser_id;
}

@Override
public String toString() {
	return super.toString()+ " , record_id=" + record_id + ", visits_count=" + visits_count +"Visitor Record" +Record ;
}
void bookTour(LocalDate date,boolean NeedingGuide,String Lang) {
	
}
}
