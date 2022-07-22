import java.time.LocalDate;

public class Employee extends Person {
	
int employment_id=0;
LocalDate hireDate;

public Employee() {
	super();
}

public Employee(String name,int id,LocalDate dop, LocalDate hireDate) {
	super( name, id, dop);
	this.hireDate = hireDate;
	employment_id++;
	
}

public int getEmployment_id() {
	return employment_id;
}

public void setEmployment_id(int employment_id) {
	this.employment_id = employment_id;
}

public LocalDate getHireDate() {
	return hireDate;
}

public void setHireDate(LocalDate hireDate) {
	this.hireDate = hireDate;
}

@Override
public String toString() {
	return super.toString()+", employment_id=" + employment_id + ", hireDate=" + hireDate;
}


}
