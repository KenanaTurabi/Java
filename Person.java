import java.time.LocalDate;

public class Person {
	
String name;
int id;
int ser_id;
//static int serial_id=0;
LocalDate dob;


public Person() {
	super();
}

public Person(String name, int id, LocalDate dob) {
	//ser_id++;
	this.name = name;
	this.id = id;
	this.dob = dob;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
@Override
public String toString() {
	return " name=" + name + ", id=" + id + ", dob=" + dob;
}


}
