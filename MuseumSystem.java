import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Scanner;
public class MuseumSystem {
static ArrayList<Guide>AvaliableGuide=new ArrayList<Guide>();
static ArrayList<Guide>AvaliableGuideDays=new ArrayList<Guide>();
static ArrayList<String>AvaliableGuideNames=new ArrayList<String>();
static ArrayList<Visitor>visitors=new ArrayList<Visitor>();
static ArrayList<Guide>Guides=new ArrayList<Guide>();
Scanner input = new Scanner(System.in);
	public int seq_id_V=0;
	public int seq_id_G=0;
	public int i=1;



	public  MuseumSystem() {
		super();
	}
	static int x=0; static int y=0;
	public static void MuseumInformation() {
		System.out.println("\n------------------------------------------------------------------------------------\n");
		System.out.println("Museum Name : The Palestinian Museum \nAddress : Palestine - Jerusalem \nWorking days :  SATURDAY ,  TUESDAY ,  WEDNESDAY, THURSDAY  ,   SUNDAY");
		System.out.println("\n-------------------------------------------------------------------------------------\n");

	}
	
	 // two guides in the System
	
	 static void default_Guides_and_visitors_In_The_System() {
		
			//1st guide
			LocalDate ff= LocalDate.of(2220,10,20);
			LocalDate f= LocalDate.of(2000,1,2);
			ArrayList <Languages>l=new ArrayList<Languages>();
			l.add(Languages.ARABIC);
			l.add(Languages.ENGLISH);
			ArrayList <MuseumSystemWorkingDays>m=new ArrayList<MuseumSystemWorkingDays>();
			
			m.add(MuseumSystemWorkingDays.SATURDAY);
			m.add(MuseumSystemWorkingDays.SUNDAY);



			Guide guide=new Guide("alaa",1010,f,ff,3,2,l,m);
			Guides.add(guide);
			
			//2nd guide
			
			LocalDate ll= LocalDate.of(2012,10,18);
			LocalDate j= LocalDate.of(1980,10,26);
			ArrayList <Languages>k=new ArrayList<Languages>();
			k.add(Languages.ARABIC);
			k.add(Languages.ENGLISH);
			k.add(Languages.CHINESE);
			ArrayList <MuseumSystemWorkingDays>p=new ArrayList<MuseumSystemWorkingDays>();
			p.add(MuseumSystemWorkingDays.SUNDAY);
			p.add(MuseumSystemWorkingDays.THURSDAY);

			


			Guide y=new Guide("amal",1000,ll,j,2,3,k,p);
			Guides.add(y);
			
			//1st visitor
			LocalDate g= LocalDate.of(1999,10,20);
			LocalDate e= LocalDate.of(2010,1,2);
			LocalTime t= LocalTime.of(5, 45);
			LocalDate fff= LocalDate.of(2220,10,20);
			LocalTime tt= LocalTime.of(15, 45);
			VisitorRecord d=new VisitorRecord(fff,tt);
			VisitorRecord u=new VisitorRecord(g,t);
			ArrayList<VisitorRecord>R=new ArrayList<VisitorRecord>();
			R.add(d);
			R.add(u);
			Visitor V=new Visitor("Ayman",200,g,10,R);
			V.visits_count =7;
			visitors.add(V);
		
			//2nd visitor
			
			LocalDate o= LocalDate.of(1995,07,02);
			LocalDate w= LocalDate.of(2010,1,2);
			LocalTime q= LocalTime.of(5, 45);
			LocalDate z= LocalDate.of(2220,10,20);
			LocalTime x= LocalTime.of(15, 45);
			VisitorRecord b=new VisitorRecord(w,q);
			VisitorRecord a=new VisitorRecord(z,x);
			ArrayList<VisitorRecord>s=new ArrayList<VisitorRecord>();
			s.add(b);
			s.add(a);
			Visitor H=new Visitor("Ahmad",100,o,33,s);
			H.visits_count =2;
			visitors.add(H);

			// 3ed visitor
			
			LocalDate gg= LocalDate.of(1999,10,20);
			LocalDate ee= LocalDate.of(2010,1,2);
			LocalTime Tt= LocalTime.of(5, 45);
			LocalDate ffff= LocalDate.of(2220,10,20);
			LocalTime ttt= LocalTime.of(15, 45);
			VisitorRecord dd=new VisitorRecord(fff,tt);
			VisitorRecord uu=new VisitorRecord(g,t);
			ArrayList<VisitorRecord>RR=new ArrayList<VisitorRecord>();
			R.add(d);
			R.add(u);
			Visitor Vv=new Visitor("Ayman",300,g,10,R);
			Vv.visits_count =7;
			visitors.add(Vv);

	// 4 th visitor
			
			LocalDate gg4= LocalDate.of(1999,10,20);
			LocalDate ee4= LocalDate.of(2010,1,2);
			LocalTime Tt4= LocalTime.of(5, 45);
			LocalDate ffff4= LocalDate.of(2220,10,20);
			LocalTime ttt4= LocalTime.of(15, 45);
			VisitorRecord dd4=new VisitorRecord(fff,tt);
			VisitorRecord uu4=new VisitorRecord(g,t);
			ArrayList<VisitorRecord>RR4=new ArrayList<VisitorRecord>();
			R.add(d);
			R.add(u);
			Visitor Vv4=new Visitor("Ayman",600,g,10,R);
			Vv4.visits_count =7;
			visitors.add(Vv4);
			
		}

	
	public ArrayList<Visitor>getVisitors(){
		return visitors;
	}
	public ArrayList<Guide>getGuides(){
		return Guides;
	}

	//Add_Visitor

	public int addVisitor(String vname,int vid,LocalDate vdob, boolean state) {
		
		for(Guide gg:Guides) {
			if(gg.id==vid) 
				return 0;
				
				}
		for(Visitor v:visitors) {
			if (v.id == vid) 
				return 0;
			
		}
		if(state == true) {
	
		Visitor vv=new Visitor();
		seq_id_V+=1;
		vv.set_serial_id(seq_id_V);
		vv.id=vid;
		vv.name=vname;
		vv.dob=vdob;
		vv.is_senior=state;
		visitors.add(vv);
		System.out.print(vv);
		
		x+=1;

		}
		else {

			Visitor vv=new Visitor();
			seq_id_V+=1;
			vv.set_serial_id(seq_id_V);
			vv.id=vid;
			vv.name=vname;
			vv.dob=vdob;
			vv.is_senior=state;
	
			visitors.add(vv);
			System.out.print(vv);

			y+=1;
		}
	
	return 1;
		}
	public boolean addGuide(int Gid,String Gname,LocalDate Gdob,ArrayList <MuseumSystemWorkingDays>GW,ArrayList <Languages>l_g,int M, LocalDate Ghd) {
		//Guides=new ArrayList<Guide>();
		for(Guide gg:Guides) {
		if(gg.id==Gid) 
			return false;
			
			}
		for(Visitor V:visitors) {
			if(V.id==Gid) 
				return false;
				
				}
		
		Guide g =new Guide ();
		seq_id_G+=1;
		g.set_serial_id(seq_id_G);
		g.id=Gid;
		g.name=Gname;
		g.dob=Gdob;
		g.toursPerDay=M;
		g.hireDate=Ghd;
		g.setGuideWorkingDays(GW);
		g.setLang(l_g);
			Guides.add(g);
			System.out.print(g+"\n");
			return true;
	}
	//search Guide name
	public String Search_Guide (String g_name) {

		int num_tou_week;
		boolean flag=false;

		String SE=new String();
		String SN=new String("NO guide exist with this Name");
		int age;
		 
		for(Guide gg: Guides) {
			if (gg.name.equals(g_name)) {
				flag =true;
				age=2021-gg.dob.getYear();
				SE+= ("------Information of Guide ------"+"\nGuide Name : "+gg.name +"\nAge : "+ age+"\nGuide id : "+ gg.id +"\nGuide employment id : "+gg.ser_id+"\nGuide Birth Date :"+ gg.dob.toString()+"\nGuide Hire Date :"+ gg.hireDate.toString()+ "\n Max Num of tours : " + gg.toursPerDay + "\nSpoken languages : " + gg.lang.toString()+ "\nWorking Days : "+ gg.GuideWorkingDays.toString()+ "\nNum of tours performed this week : "+"\n--------------------"+"\n");

				
		}
			else continue;
		}
		if(flag==false)
		return SN;
		else 
			return SE;
		

	}
	public String Search_Visitor (String v_name) {

		boolean flag=false;

		String SE=new String();
		String SN=new String("NO visitor exist with this Name");
		int age;
		 
		for(Visitor vv: visitors) {
			String VRecord="";
			if (vv.name.equals(v_name)) {
				flag =true;
				age=2021-vv.dob.getYear();
				for(VisitorRecord y:vv.Record) {
					VRecord+="Record #"+ i+"---->[ Time : "+y.enteringDate.toString()+" & Date :"+y.enteringDate.toString()+"]\n";
					i++;
					
				}
				SE+= ("--------Information of visitor -------"+" \nvisitor Name : "+vv.name+" \nvisitor id : "+ vv.id +"\nemployment id : "+vv.ser_id+" \nvisitor Birth Date :"+ vv.dob +"\n Age : "+ age + "\nRecord History :\n" + VRecord +"\n"+"--------------------"+"\n");

				
		}
			else continue;
		}
		if(flag==false)
		return SN;
		else 
			return SE;
		

	}
	//Search Guide Day
	
public String Search_Guide_day (String g_d) {
	System.out.println(g_d);

		String A_G_D= new String();
		String NA_G_D= new String("No available guides in this day");
		int age;
		int i =0;
		boolean flag= false;
		for(Guide gg: Guides) {
			if (gg.GuideWorkingDays.contains(MuseumSystemWorkingDays.valueOf(g_d))) {
				i++;
				flag=true;
				age=2021-gg.dob.getYear();
				A_G_D+= +i+". Guide Name : "+gg.name +" & employment id :"+gg.ser_id+"\n";


		}			

		}
		
		if(flag==false)
			return NA_G_D;
		else return A_G_D;
	}

public String Search_Guide_lang (String g_l) {
	
	System.out.println(g_l);

	String A_G_D=new String();
	String NA_G_D= new String("No available guides talking this language");
	int age;
	boolean flag= false;
	int i=0;
	for(Guide gg: Guides) {
		if (gg.lang.contains(Languages.valueOf(g_l))) {
			i++;
			flag=true;
			age=2021-gg.dob.getYear();
			A_G_D+=+i+". Guide Name : "+gg.name +" & employment id :"+gg.ser_id+"\n";


	}			

	}
	
	if(flag==false)
		return NA_G_D;
	else return A_G_D;
}
	
	/*
	public String Search_Guide_day (String g_d) {
		String A_G_D= " ";
		String NA_G_D= new String("No available guides in this day");
		int age;
		boolean flag= false;
		for(Guide gg: Guides) {
			if (gg.GuideWorkingDays.contains(MuseumSystemWorkingDays.valueOf(g_d))) {
				flag=true;
				age=2021-gg.dob.getYear();
				A_G_D+= "\nGuide Name : "+gg.name +" Age : "+ age+" Guide id : "+ gg.id +" Guide Birth Date :"+ gg.dob.toString()+" Guide Hire Date :"+ gg.hireDate.toString()+ "Max Num of tours : " + gg.toursPerDay + " \nSpoken languages : " + gg.lang.toString()+ "Working Days : "+ gg.GuideWorkingDays.toString()+ " Num of tours performed this week : ";

		}			

		}

		if(flag==false)
			return NA_G_D;
		else return A_G_D;
	}
	*/
	public static int issueTicket(int vid,char c) {
		int p=0;

		for(Visitor v: visitors) {
			if(v.id==vid) {
				if(v.is_senior) {
					switch(c) {
					case 'D': p= 50;
							  break;
					case 'M':p= 100;
							 break;
					case 'Y':p= 150;
							break;
					default: p=0;
							 break;
				}//switch
				}//sen
				else {
					switch(c) {
					case 'D': p= 100;
							  break;
					case 'M':p= 200;
							 break;
					case 'Y':p= 300;
							 break;
					default: p=0;
							 break;
				}
			}
			}
				break;
		}
			
		return p;
	}//fun
	
	public static int BK_Tour(int vid,char c) {
		int p=0;
		for(Visitor v: visitors) {
			if(v.id==vid) {
				if(v.is_senior) {
					switch(c) {
					
					case 'D': p= 70;
						      break;
					case 'M':p= 120;
							 break;
					case 'Y':p= 170;
							 break;
				    default: p=0;
							 break;   	
				}//switch
				}//sen
				else {
					switch(c) {
					case 'D': p= 120;
				      break;

					case 'M':p= 220;
				      break;

					case 'Y':p= 320;
				      break;
					  default: p=0;
						 break; 
				}
			}
		}//vis
			break;
		}//for
		return p;
	}//fun
	
	
	
	/*
	
	public void addGuide(int Gid) {
		
		boolean flag= false;
		for(Guide gg:Guides) {
		if(gg.id==Gid) {
			System.out.println("This Guide already exists");
			flag=true;
			break;
			}
		    else 
			continue;
			
			}
		if (flag==true);
		else
		{
		Guide g =new Guide ();
		g.id=Gid;
		System.out.print("enter yr name :");
		g.name=input.next();
		
		System.out.print("\n enter yr dob (plz notice this format yy-mm-dd):");
		String date=input.next();
		LocalDate d=LocalDate.parse(date);
		g.dob=d;
		System.out.print("\nenter the employment_id :");
		g.employment_id=input.nextInt();
		System.out.print("\n enter yr hire date (plz notice this format yy-mm-dd):");
		String date2=input.next();
		LocalDate d2=LocalDate.parse(date2);
		g.hireDate=d2;
		System.out.print("\nenter the  number of toursPerDay (plz noticed that the Max tours per day is 3 ):");
		int p;
		while(true) {
			p=input.nextInt();
			if(p>3||p<0) {
				System.out.print("Incorrect Data enter num. again ");
				continue;
			}
			else {
				g.toursPerDay=p;
				break;
			}
		}
		
		
		ArrayList <Languages>l=new ArrayList<Languages>();
		ArrayList <MuseumWorkingDays>W=new ArrayList<MuseumWorkingDays>();
		
		System.out.print("\nenter the  number of languages :");
		g.NumOfLang=input.nextInt();
		System.out.println("\n--------------------------------------------------------------------------------------------------");
		System.out.println("\nIf u speak Arabic press 1 \nIf u speak English press 2 \nIf u speak Franch press 3 \nIf u speak Italian press 4 \nIf u speak Chinese press 5  ");
		System.out.println("\n--------------------------------------------------------------------------------------------------");

		for(int i=0;i<g.NumOfLang;i++)	{
		System.out.print("\nenter yr choice : ");
			int c=input.nextInt();
			switch(c) {
			case 1: l.add(Languages.Arabic);
			break;
			case 2:l.add(Languages.English);
			break;
			case 3: l.add(Languages.Franch);
			break;
			case 4: l.add(Languages.Italian);
			break;
			case 5: l.add(Languages.Chinese);
			break;
			default: System.out.print("incorrect choice");
	
			}
		}
		int x;
		System.out.print("\nenter the number of WorkingDays (plz noticed that the Max Working days is 5 ) :");
		while(true) {
		x=input.nextInt();
		if(x<0||x>5) {
			System.out.print("Incorrect data enter num. again");
			continue;
			
		}
		else
			g.NumOfDays=x;
			break;
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------");
		System.out.println("\n plz notice that the Mesueum is closed on Friday & Saturday \n if u want to work on Sunday click 1 \n if u want to work on Monday click 2 \n if u want to work on Tuesday click 3\n if u want to work on Wednesday click 4\n if u want to work on Thersday click 5 ");
		System.out.println("\n--------------------------------------------------------------------------------------------------");
		for(int i=0;i<g.NumOfDays;i++)	{
			System.out.print("\nenter yr choice : ");
				int c=input.nextInt();
				switch(c) {
				case 1: W.add(MuseumWorkingDays.SUNDAY);
				break;
				case 2: W.add(MuseumWorkingDays.MONDAY);
				break;
				case 3: W.add(MuseumWorkingDays.TUESDAY);
				break;
				case 4: W.add(MuseumWorkingDays.WEDNESDAY);
				break;
				case 5:W.add(MuseumWorkingDays.THURSDAY);
				break;
				default: System.out.print("incorrect choice");
				break;
				}
			}
		g.setLang(l);
		g.setGuideWorkingDays(W);
			System.out.println("Adding new Guide to the system done successfully");
			Guides.add(g);
	}
	
	}
	*/
	public static void setVisitors(ArrayList<Visitor> visitors) {
		MuseumSystem.visitors = visitors;
	}
	
	public static void setGuides(ArrayList<Guide> guides) {
		Guides = guides;
	}
	
	//Available Guide
	public static ArrayList <String> getAvaliableGuide (String d,String l) {
		System.out.println(d);
		System.out.println(l);
		
		
		for(Guide g: Guides) {
		
			if(g.GuideWorkingDays.contains(MuseumSystemWorkingDays.valueOf(d))&&g.lang.contains(Languages.valueOf(l))) {
			AvaliableGuide.add(g);
			AvaliableGuideNames.add(g.getName());
			
			}
		}
		
		
			return AvaliableGuideNames;
		
		
	}

	/*
	public static void getAvaliableGuide (String d,String l) {
		LocalDate d2=LocalDate.parse(d);
		DayOfWeek dayOfWeek = d2.getDayOfWeek();
		 String dayOfWeekName = dayOfWeek.name();
		
		boolean flag=false;
		for(Guide g: Guides) {
		
			if(g.GuideWorkingDays.contains(MuseumSystemWorkingDays.valueOf(dayOfWeekName))&&g.lang.contains(Languages.valueOf(l))) {
			AvaliableGuide.add(g);
			flag=true;
			
			}
		}
		if (flag==true) {
			System.out.print("\n The available guides are : \n "); 
			for(Guide r:AvaliableGuide) {
				System.out.print(r);
			System.out.print("\n "); 
	
		}}
		else 		
		System.out.print("\n  sorry There aren't  available guides\n "); 
	
	}
	*/
	//print Guides
	
	
	public static void printGides() {
	System.out.println(" \n guides");
	if(MuseumSystem.Guides.isEmpty())
	System.out.println(" \nEmpty List");
	for(Guide fb:Guides) {
		System.out.println(fb);
	}
	System.out.println("\n--------------------------------------------------------------------------");
	}
	//print visitors
	public static void printvisitors() {
	System.out.println(" Visitors");
	if(MuseumSystem.visitors.isEmpty())
	System.out.println(" \nEmpty List");
	for(Visitor fb:visitors) {
		System.out.println(fb);
	}
	System.out.println("\n-------------------------------------------------------------------------");
		}
	
	
	}




