import java.time.LocalDate;
import java.util.ArrayList;

public class Guide extends Employee {
	
ArrayList <Languages>lang= new ArrayList<Languages>();
ArrayList <MuseumSystemWorkingDays>GuideWorkingDays= new ArrayList<MuseumSystemWorkingDays>();
public int toursPerDay;
public int NumOfLang;
public int NumOfDays;
public int NumOfToursPerformed = NumOfDays*toursPerDay;



public int getNumOfLang() {
	return NumOfLang;
}


public void setNumOfLang(int numOfLang) {
	NumOfLang = numOfLang;
}


public int getNumOfDays() {
	return NumOfDays;
}


public void setNumOfDays(int numOfDays) {
	NumOfDays = numOfDays;
}


public Guide(String name, int id, LocalDate dop, LocalDate hireDate,int toursPerDay,int NumOfDays,ArrayList<Languages>L,ArrayList<MuseumSystemWorkingDays>GWD)
 {
	super(name, id, dop, hireDate);
	this.toursPerDay=toursPerDay;
	this.NumOfDays=NumOfDays;
	this .lang=L;
	this.GuideWorkingDays=GWD;
	
}


public ArrayList<MuseumSystemWorkingDays> getGuideWorkingDays() {
	return GuideWorkingDays;
}


public void setGuideWorkingDays(ArrayList<MuseumSystemWorkingDays> guideWorkingDays) {
	GuideWorkingDays = guideWorkingDays;
}


public ArrayList<Languages> getLang() {
	return lang;
}


public void setLang(ArrayList<Languages> lang) {
	this.lang = lang;
}


public int getToursPerDay() {
	return toursPerDay;
}

public void setToursPerDay(int toursPerDay) {
	this.toursPerDay = toursPerDay;
}

public Guide() {
	super();
}
public void set_serial_id(int s_id) {
	ser_id=s_id;
}
public int get_serial_id() {
	return ser_id;
}

@Override
public String toString() {
	return super.toString()+" languages =" + lang + ", toursPerDay=" + toursPerDay + ", GuideWorkingDays =" + GuideWorkingDays;
}



}
