import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Museum_System_Frame extends JFrame implements ActionListener,ItemListener {
	private MuseumSystem MS=new MuseumSystem();

	
	private JButton Guide_B,Visitor_B,Management_B;
	private JPanel MuseumPanel1,MuseumPanel2,MuseumPanel3,GuidePanel,VisitorPanel,vp,vp1,vp2,vp3,ManagementPanel;
	private JLabel MuseumName,MuseumAddress,MuseumWorkingDays;
	private JLabel Total_Num_of_visitors,Visitors_Names,Total_Num_of_subs;
	private JLabel nl1,nl2;
	private JTextField ntf1,ntf2;
	
	private JLabel vl1,vl2,vl3;
	private JTextField vt1,vt2,vt3;
	private JButton v_B;
	private JRadioButton D,Y,M;
	private JPanel emp1,emp2,emp3;
	private GridLayout gridLayout2;
	private GridLayout gridLayout3;
	private GridLayout gridLayout4;
	private JCheckBox RegularVisitors;
	private JCheckBox SeniorVisitors;
	private JTextArea v_t_a;
	private JPanel SystemPanel;
	private GridLayout gridLayout5;
	private JLabel sl1,sl2,sl3,sl4,sl5,sl6,sl7,sl8,sl9,sl10,sl11,sl12,sl13,sl14,sl15,sl16,sl17,sl,lnn1,lnn2;
	private JTextField st1,st2,st3,st4,st5,st6,st7,st8,st9,st10;
	private JButton Add_Visitor, Add_Guide,Issue_Ticket;
	private JCheckBox SUN,SAT,TUE,WED,THU;
	private JCheckBox Arabic,English,ITALIAN,CHINESE,FRANSH;
	private JPanel DAYS,Langs,v,subs,collection;
	private JCheckBox yes;
	private JRadioButton sen,reg;
	private JRadioButton DD,YY,MM;
	private JComboBox Lang,Available_G;
	private String names[]= {"ENGLISH","ARABIC","ITALY","CHINESE","FRENSH"};
	private JTextArea m_a;
	private ButtonGroup radioGroubTicket,radioGroubVisitor,radioGroub;
	private JLabel ll1,ll2,ll3;
	private JButton B1,B2,B3;
	private JTextField TF1;
	private JComboBox CB1,CB2;
	private JPanel PL1,PL2,PL3,P_ALL;
	private GridLayout grid6;
	private JTextArea Guid_text;
	private String W_D[]= {"SUNDAY","SATURDAY", "TUESDAY" ,  "WEDNESDAY", "THURSDAY"  };
	private String G_Lang[]= {"ENGLISH","ARABIC","ITALY","CHINESE","FRENSH"};
	private Box box=Box.createHorizontalBox();

	
	
	public Museum_System_Frame() {
		
		super("Museum Management System");
		setLayout(new BorderLayout());
		//guide
		ll1=new JLabel("Guide's Name");
		ll2=new JLabel("Guide's Working Days");
		ll3=new JLabel("Tour's Languages ");
		TF1=new JTextField(10);
		B1 = new JButton("Search my Name");
		B2=new JButton("List ALL Available Guides");
		B3=new JButton("List ALL Guides");
		CB1=new JComboBox(W_D);
		CB1.setMaximumRowCount(3);

		CB2=new JComboBox(G_Lang);
		CB2.setMaximumRowCount(3);

		grid6=new GridLayout(3,1);
		PL1=new JPanel(new FlowLayout());
		PL1.add(ll1);
		PL1.add(TF1);
		PL1.add(B1);
		
		PL2=new JPanel(new FlowLayout());
		PL2.add(ll2);
		PL2.add(CB1);
		PL2.add(B2);
		
		PL3=new JPanel(new FlowLayout());
		PL3.add(ll3);
		PL3.add(CB2);
		PL3.add(B3);
		
		P_ALL=new JPanel(grid6);
		P_ALL.add(PL1);
		P_ALL.add(PL2);
		P_ALL.add(PL3);
		String st="Guide Name :.........\nAge:............\nEmployment ID:...............\nHire Date :..............\nMaximum Number of Tours :..........\nSpoken Languages:..........\nNumber of tours performed this week:..........\n";
		Guid_text=new JTextArea(st);
		GuidePanel=new JPanel(new BorderLayout());
		GuidePanel.add(P_ALL,BorderLayout.NORTH);
		GuidePanel.add(Guid_text,BorderLayout.CENTER);
		add(GuidePanel,BorderLayout.CENTER);
		GuidePanel.setVisible(false);

		
		//system
		
		sl1=new JLabel("Visitor's Name ");
		sl2=new JLabel("Visitor's ID ");
		sl3=new JLabel("Visitor's Date of Birth ");
		st1=new JTextField();
		st2=new JTextField();
		st3=new JTextField();
		v=new JPanel(new FlowLayout());
		sen =new JRadioButton("senior visitor ");
		reg =new JRadioButton("Regular visitor ");
		radioGroubVisitor=new ButtonGroup();
		radioGroubVisitor.add(sen);
		radioGroubVisitor.add(reg);
		v.add(sen);
		v.add(reg);
		Add_Visitor = new JButton("Add Visitor");
		Add_Guide = new JButton("Add a Guide");
		Issue_Ticket = new JButton("Issue Ticket");
		sl4=new JLabel("Guide's Name ");
		sl5=new JLabel("Guide's ID ");
		sl6=new JLabel("Guide's Date of Birth");
		sl7=new JLabel("Working Days");
		sl=new JLabel("Languages");

		st4=new JTextField();
		st5=new JTextField();
		st6=new JTextField();
		SUN =new JCheckBox("Sun");
		SAT =new JCheckBox("SAT");
		WED =new JCheckBox("Wed");
		TUE =new JCheckBox("Tue");
		THU =new JCheckBox("Thu");
	
		Arabic =new JCheckBox("Arabic");
		English =new JCheckBox("English");
		ITALIAN =new JCheckBox("ITALY");
		CHINESE =new JCheckBox("CHINESE");
		FRANSH =new JCheckBox("FRENSH");


	    ntf1=new JTextField();
	    ntf2=new JTextField();
	    nl1=new JLabel("Maximum Num of tours per day");
		nl2=new JLabel("Hire Date");

		DAYS= new JPanel(new FlowLayout());
		DAYS.add(SUN);
		DAYS.add(SAT);
		DAYS.add(TUE);
		DAYS.add(WED);
		DAYS.add(THU);
		

		Langs= new JPanel(new FlowLayout());
		Langs.add(Arabic);
		Langs.add(English);
		Langs.add(ITALIAN);
		Langs.add(CHINESE);
		Langs.add(FRANSH);

		
		sl8=new JLabel("Visitor Number ");
		sl9=new JLabel("Expected Visit Day");
		sl10=new JLabel("Ticket's Type/Subscription");
		sl11=new JLabel("Book a Tour for this visit ?");
		lnn1=new JLabel("Expected Visit Date");
		lnn2=new JLabel("Expected Visit time");

		st7=new JTextField();
		st8=new JTextField();
		st9=new JTextField();
		st10=new JTextField();

		subs= new JPanel(new FlowLayout());
		DD=new JRadioButton("Daily");
		MM=new JRadioButton("Monthly");
		YY=new JRadioButton("Yearly");
		radioGroubTicket=new ButtonGroup();
		radioGroubTicket.add(DD);
		radioGroubTicket.add(MM);
		radioGroubTicket.add(YY);
		subs.add(DD);
		subs.add(MM);
		subs.add(YY);
		yes=new JCheckBox("Yes");
		sl12=new JLabel("Languages");
		Lang=new JComboBox(names);
		Lang.setMaximumRowCount(3);
		sl13=new JLabel("Available Guides");
	
		Available_G=new JComboBox();
		Available_G.setMaximumRowCount(3);

		collection=new JPanel(new FlowLayout());
		collection.add(yes);
		collection.add(sl12);
		collection.add(Lang);
		collection.add(sl13);
		collection.add(Available_G);
		sl14=new JLabel();
		sl15=new JLabel();
		sl16=new JLabel();
		sl17=new JLabel();

	    gridLayout5=new GridLayout(20,2);
	   	SystemPanel=new JPanel(gridLayout5);
	   	
		SystemPanel.add(sl1);
		SystemPanel.add(st1);
		SystemPanel.add(sl2);
		SystemPanel.add(st2);
		SystemPanel.add(sl3);
		SystemPanel.add(st3);
		SystemPanel.add(reg);
		SystemPanel.add(sen);
		SystemPanel.add(Add_Visitor);
		SystemPanel.add(sl14);
		SystemPanel.add(sl4);
		SystemPanel.add(st4);
		SystemPanel.add(sl5);
		SystemPanel.add(st5);
		SystemPanel.add(nl1);//max
		SystemPanel.add(ntf1);
		SystemPanel.add(nl2);//hire
		SystemPanel.add(ntf2);
		SystemPanel.add(sl6);
		SystemPanel.add(st6);
		SystemPanel.add(sl7);
		SystemPanel.add(DAYS);
		SystemPanel.add(sl);
		SystemPanel.add(Langs);
		SystemPanel.add(Add_Guide);
		SystemPanel.add(sl15);
		SystemPanel.add(sl8);
		SystemPanel.add(st7);
		SystemPanel.add(sl9);
		SystemPanel.add(st8);
		SystemPanel.add(lnn1);
		SystemPanel.add(st9);
		SystemPanel.add(lnn2);
		SystemPanel.add(st10);
		SystemPanel.add(sl10);
		SystemPanel.add(subs);
		SystemPanel.add(sl11);
		SystemPanel.add(collection);
		SystemPanel.add(Issue_Ticket);
		SystemPanel.add(sl16);

		String demo2="";
		m_a=new JTextArea(demo2,10,15);
		box.add(new JScrollPane(m_a));
		
		add(box);
		
		ManagementPanel=new JPanel(new BorderLayout());
		ManagementPanel.add(SystemPanel,BorderLayout.CENTER);
		ManagementPanel.add(m_a,BorderLayout.SOUTH);
		add(ManagementPanel,BorderLayout.CENTER);
		ManagementPanel.setVisible(false);
		
		 

		gridLayout2=new GridLayout(3,1);
		gridLayout3=new GridLayout(2,1);
		
	    Guide_B=new JButton("Guide Information");
	    Visitor_B=new JButton("Visitor Information");
   	    Management_B=new JButton("Management");
   	    gridLayout4=new GridLayout(6,1);
   	   
	    vp1=new JPanel(new FlowLayout());
	    vp2=new JPanel(new FlowLayout());
	    vp3=new JPanel(new FlowLayout());
	    VisitorPanel=new JPanel(new BorderLayout());
	    vl1=new JLabel("Total Number of Visitors");
	    vl2=new JLabel("Visitor's name");
	    vl3=new JLabel("Total Number of Subscriptions/Visits");
	    vp1.add(vl1);
	    vp2.add(vl2);
	    vp3.add(vl3);
	    D=new JRadioButton("Daily");
	    Y=new JRadioButton("Yearly");
	    M=new JRadioButton("Monthly");
	    ButtonGroup radioGroub=new ButtonGroup();
	    radioGroub.add(D);
	    radioGroub.add(M);
	    radioGroub.add(Y);
	    vp3.add(D);
	    vp3.add(M);
	    vp3.add(Y);
	    vt3=new JTextField ("----Calculated Number is shown Here---");
	    vt3.setEditable(false);
	    vp3.add(vt3);
	    String Demo="	Information on Visitor .......\n	Name.......\n	ID..........\n	Visitor ID...........\n	Age.............\n	Visit History.\n	Record1 ...........\n	Record2 ...........\n...";

	    RegularVisitors=new JCheckBox("Regular Visitor");
	    vp1.add(RegularVisitors);
	    SeniorVisitors=new JCheckBox("Senior Visitor");
	    vp1.add(SeniorVisitors);
	    v_t_a=new JTextArea(Demo,10,15);
	    
	    vt1=new JTextField ("----Calculated Number is shown Here---");
	    vt1.setEditable(false);
	    vp1.add(vt1);
	    vt2=new JTextField(10);
	    vp2.add(vt2);
	    v_B=new JButton("Search My Name");
	    vp2.add(v_B);
	    
	  


	    emp1=new JPanel();
	    emp2=new JPanel();
	    emp3=new JPanel();
	    
	    vp=new JPanel(gridLayout4);
	    vp.add(emp1);
	    vp.add(emp2);
	    vp.add(emp3);
	    vp.add(vp1);
	    vp.add(vp2);
	    vp.add(vp3);
	 
	    VisitorPanel=new JPanel(new BorderLayout());
	    VisitorPanel.add(vp,BorderLayout.NORTH);
	    VisitorPanel.add(v_t_a,BorderLayout.CENTER);
	    add(VisitorPanel,BorderLayout.CENTER);
	    VisitorPanel.setVisible(false);

	    


	    

		MuseumName=new JLabel("Museum Name : The Palestinian Museum ");
		MuseumAddress=new JLabel("Address : Palestine - Jerusalem ");
		MuseumWorkingDays=new JLabel("Working days :[  SUNDAY , SATURDAY , TUESDAY ,  WEDNESDAY, THURSDAY  ]");
		
		MuseumPanel1=new JPanel(new FlowLayout(FlowLayout.LEFT));
		MuseumPanel1.add(Guide_B);
		MuseumPanel1.add(Visitor_B);
		MuseumPanel1.add(Management_B);
		
		MuseumPanel2=new JPanel(gridLayout2);
		MuseumPanel2.add(MuseumName);
		MuseumPanel2.add(MuseumAddress);
		MuseumPanel2.add(MuseumWorkingDays);
		MuseumPanel3=new JPanel(gridLayout3);
		MuseumPanel3.add(MuseumPanel1);
		MuseumPanel3.add(MuseumPanel2);

		add(MuseumPanel3,BorderLayout.NORTH);
		
		//Registration
		Guide_B.addActionListener(this);
		Visitor_B.addActionListener(this);
		Management_B.addActionListener(this);
		st1.addActionListener(this);
		st2.addActionListener(this);
		st3.addActionListener(this);
		Add_Visitor.addActionListener(this);
		sen.addItemListener(this);
		reg.addItemListener(this);
		Add_Guide.addActionListener(this);
		SUN.addItemListener(this);
		SAT.addItemListener(this);
		TUE.addItemListener(this);
		WED.addItemListener(this);
		THU.addItemListener(this);
		Arabic.addItemListener(this);
		English.addItemListener(this);
		ITALIAN.addItemListener(this);
		CHINESE.addItemListener(this);
		FRANSH.addItemListener(this);
		
		Issue_Ticket.addActionListener(this);
		DD.addItemListener(this);
		MM.addItemListener(this);
		YY.addItemListener(this);
		yes.addItemListener(this);
		Lang.addItemListener(this);
		Available_G.addItemListener(this);
		
		//visitorPanel
		RegularVisitors.addItemListener(this);
		SeniorVisitors.addItemListener(this);
		v_B.addActionListener(this);
		D.addItemListener(this);
		M.addItemListener(this);
		Y.addItemListener(this);
		//GuidePanel
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		CB1.addItemListener(this);
		CB2.addItemListener(this);




		
	}

	//VARIABELS
	
	//ArrayLists
	ArrayList <MuseumSystemWorkingDays> Guide_Days=new ArrayList <MuseumSystemWorkingDays>();
	ArrayList <Languages> Guide_Lang=new ArrayList <Languages>();
	ArrayList <String> Availabel_Names=new ArrayList <String>();
	//Variabels_Visitor
	LocalDate d;
	boolean state_sen=false;
	String v_n, s_id,s_dob;
	int id;
	//Variabels_Guide
	String g_n, g_id,g_dob,g_hd,g_m_n;
	int gid,gm;
	LocalDate g_d,g_h;
	//variabels issueTicket
	LocalDate enteringDate ;
	LocalTime enteringTime ;
	int v_num;
	String v_day,sv_num,sel_lang, sel_guide;
	char subs_type;
	String TicketType;
	boolean y = false;
	//variabels from visitor panel
	int reg_size=0;
	int sen_size=0;
	//variabels from guide panel
	String Dayy,Langg;

	int ticket_price;
	//counters 
	int m_c=0;
	int y_c=0;
	int d_c=0;

	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Guide_Days=new ArrayList <MuseumSystemWorkingDays>();
		 Guide_Lang=new ArrayList <Languages>();
	//	 Guide_Lang.clear();
		// Guide_Days.clear();
		 //Availabel_Names.clear();
		
		if(sen.isSelected()) {
			 s_dob=st3.getText();
			 d =LocalDate.parse( s_dob);
			 int visitor_age=2021-d.getYear();
			 if(visitor_age>=40) {
			 	m_a.setText("");
				state_sen=true;
		   	    Add_Visitor.setEnabled(true);}
			 else {state_sen=false;
			 	m_a.setText("");
				m_a.setText("error---> U R NOT Senior");
				Add_Visitor.setEnabled(false);}

		}
			
		
			
		if(reg.isSelected()) {
			 s_dob=st3.getText();
			 d =LocalDate.parse( s_dob);
			 int visitor_age=2021-d.getYear();
			 if(visitor_age<40) {
			 		m_a.setText("");
				    state_sen=false;
			        Add_Visitor.setEnabled(true);}
		
			 else {	state_sen=true;
			 		m_a.setText("");
			 		m_a.setText("error---> U R Senior");
			 		Add_Visitor.setEnabled(false);
			 		}
			}
		
		if (SUN.isSelected()) {Guide_Days.add(MuseumSystemWorkingDays.SUNDAY);}
	    if (SAT.isSelected()) {Guide_Days.add(MuseumSystemWorkingDays.SATURDAY);}
		 if (TUE.isSelected()) {Guide_Days.add(MuseumSystemWorkingDays.TUESDAY);}
		 if (WED.isSelected()) {Guide_Days.add(MuseumSystemWorkingDays.WEDNESDAY);}
		 if (THU.isSelected()) {Guide_Days.add(MuseumSystemWorkingDays.THURSDAY);}
		 //Guide_Lang
		 if (Arabic.isSelected()) {Guide_Lang.add(Languages.ARABIC);}
		 if (English.isSelected()) {Guide_Lang.add(Languages.ENGLISH);}
		 if (ITALIAN.isSelected()) { Guide_Lang.add(Languages.ITALY);}
		 if (CHINESE.isSelected()) { Guide_Lang.add(Languages.CHINESE);}	
		 if (FRANSH.isSelected()) { Guide_Lang.add(Languages.FRENSH);}
		 if (DD.isSelected()) {subs_type='D'; d_c++;}
		 if (MM.isSelected()) {subs_type='M'; m_c++;}
		 if (YY.isSelected()) {subs_type='Y'; y_c++;}
		 if (yes.isSelected()) {
				y=true;
				if (e.getSource()==Lang)

				sel_lang= Lang.getSelectedItem().toString();
				Availabel_Names=MS.getAvaliableGuide(v_day, sel_lang) ;
				for(String A_G_N:Availabel_Names) {
					System.out.println(A_G_N);
					Available_G.addItem(A_G_N);

				}
				if (e.getSource()==Available_G)
				 sel_guide=Available_G.getSelectedItem().toString();
				
				ticket_price=MuseumSystem.BK_Tour(v_num, subs_type);
			}
			else {
				ticket_price=MuseumSystem.issueTicket(v_num, subs_type);

			}
		
		 
		
		
		//visitor panel
		

		if(SeniorVisitors.isSelected()) {
		
			vt1.setText(""+MuseumSystem.x); 
			
			}

		 if(RegularVisitors.isSelected()) {
			
		vt1.setText(Integer.toString(MuseumSystem.y)); 
		
		}

		 if(SeniorVisitors.isSelected()&&RegularVisitors.isSelected()) {
			vt1.setText(Integer.toString(MuseumSystem.x+MuseumSystem.y)); 
			}
		
		 if(!SeniorVisitors.isSelected()&&!RegularVisitors.isSelected()) {	vt1.setText(Integer.toString(0));};

		
		if(D.isSelected()) { vt3.setText(Integer.toString(d_c));}
		if(M.isSelected()) { vt3.setText(Integer.toString(m_c));}
		if(Y.isSelected()) { vt3.setText(Integer.toString(y_c));}
		if(!D.isSelected()&&!M.isSelected()&&!Y.isSelected()) {vt3.setText("0");}
		if(e.getSource()==CB1) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				Dayy=CB1.getSelectedItem().toString();

			}}
			if(e.getSource()==CB2) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					Langg=CB2.getSelectedItem().toString();

				}
				
			}
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		 if (e.getSource()== Visitor_B) {
			    add(VisitorPanel,BorderLayout.CENTER);
				GuidePanel.setVisible(false);
				VisitorPanel.setVisible(true);
				ManagementPanel.setVisible(false);
			}
		 if (e.getSource()== Guide_B) {
		    add(GuidePanel,BorderLayout.CENTER);
			GuidePanel.setVisible(true);
			VisitorPanel.setVisible(false);
			ManagementPanel.setVisible(false);
		}
		
		 if (e.getSource()== Management_B){
		   add(ManagementPanel,BorderLayout.CENTER);
			ManagementPanel.setVisible(true);
			GuidePanel.setVisible(false);
			VisitorPanel.setVisible(false);
		}
		 
		if(e.getSource()==Add_Visitor) {
		//	MS.default_Guides_and_visitors_In_The_System();

			 v_n=st1.getText();
			 s_id=st2.getText();
			 id=Integer.parseInt(s_id);
			
		
			int existbefore= MS.addVisitor(v_n, id, d, state_sen);
			 if(existbefore==0 ) 
				 m_a.setText(" ---Error --> this visitor already exists---");
			 
			 	else 

			 		m_a.setText("--Addig visitor done successfully---");
			 radioGroubVisitor.clearSelection();
			
				 }
		if(e.getSource()==Add_Guide) {
		//	MS.default_Guides_and_visitors_In_The_System();
			//Guide_Lang=new ArrayList<Languages>();
		//	Guide_Days=new ArrayList <MuseumSystemWorkingDays>();
		g_n=st4.getText();
		g_id=st5.getText();
		gid=Integer.parseInt(g_id);
		g_m_n=ntf1.getText();
		gm=Integer.parseInt(g_m_n);
		if(gm>3) {
			 m_a.setText(" ---Error --> Max num of tours per day = 3 ---");
		}
		else {
		g_hd=ntf2.getText();
		g_h=LocalDate.parse(g_hd);
		g_dob=st6.getText();
		g_d=LocalDate.parse(g_dob);
		boolean g_existbefore= MS.addGuide(gid, g_n, g_d, Guide_Days,Guide_Lang,gm,g_h);
		 if(g_existbefore==false ) 
			 m_a.setText(" ---Error --> this Guide already exists---");
		 
		 	else 

		 		m_a.setText("--Addig Guide done successfully---");
		}
		
			 }
		
		if(e.getSource()==Issue_Ticket) {
			Visitor vv=new Visitor();
		//	MS.default_Guides_and_visitors_In_The_System();
			boolean flag=false;
			String V_N=new String();
			v_day=st8.getText();
			sv_num=st7.getText();
			v_num=Integer.parseInt(sv_num);
			for(Visitor v:MS.visitors)
			{
				if(v.id==v_num) {
					flag=true;
					V_N=v.name;
					vv=v;
				}
			}
			if(flag==false) {m_a.setText("No visitor with this id in the System");}
			else {
			
			
				String datee=st9.getText();
				enteringDate=LocalDate.parse(datee);
				String timee=st10.getText();
				enteringTime=LocalTime.parse(timee);
				VisitorRecord v_r=new VisitorRecord(enteringDate, enteringTime);
				vv.Record.add(v_r);
				if (y==true) {
					
					if (Availabel_Names.isEmpty())
					m_a.setText("No Available Guides");
					String ts=new String();
					ts=("Ticket information:-\n Visitor Number : " + v_num +" , Visits Day : " + v_day +" , Visitor Name : "+ V_N + "\n with a tour : +,  guide name : "+sel_guide+ " , Ticket price : "+ticket_price);
				m_a.setText(ts);		
				

			}
				
			else {
				m_a.setText("Ticket information:-\n Visitor Number : " + v_num +" , Visits Day : " + v_day +" , Visitor Name : "+ V_N + "\n NO tour , Ticket price : "+ticket_price);
		
			}
			}
			 radioGroubTicket.clearSelection();

			}
		//Visitor panel

		if(e.getSource()==v_B) {
			//MS.default_Guides_and_visitors_In_The_System();

			String vis_nam=vt2.getText();
			v_t_a.setText(MS.Search_Visitor(vis_nam));

			
		}
		//Guide Panel 
		if (e.getSource()==B1) {
			//MS.default_Guides_and_visitors_In_The_System();
			String x=new String();
			String G_n=TF1.getText();
			x=MS.Search_Guide(G_n);
			Guid_text.setText(x);
			

				
			}
		if (e.getSource()==B2) {
			Guid_text.setText(" ");
		//	MS.default_Guides_and_visitors_In_The_System();
		//	System.out.println(Dayy);
			String st="A list of al guides who work on "+Dayy+" are :-\n";
			Guid_text.setText(st+MS.Search_Guide_day(Dayy));
			
			}
			
		if (e.getSource()==B3) {
			Guid_text.setText(" ");
			String str= "A list of al guides who speak "+Langg+" are :- \n";
		//	MS.default_Guides_and_visitors_In_The_System();
		//	System.out.println(Langg);
			Guid_text.setText(str+MS.Search_Guide_lang(Langg));


				
			}
		
		
		
			
		}
		 
		
	/*

	private class checkboxhandler1 implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (DD.isSelected()) {subs_type='D';}
			if (MM.isSelected()) {subs_type='M';}
			if (YY.isSelected()) {subs_type='Y';}
		}
		
	}
	private class checkboxhandler2 implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (yes.isSelected()) {
				y=true;
				if (e.getSource()==Lang)

				sel_lang= Lang.getSelectedItem().toString();
				Availabel_Names=MS.getAvaliableGuide(v_day, sel_lang) ;
				for(String A_G_N:Availabel_Names) {
					System.out.println(A_G_N);
					Available_G.addItem(A_G_N);

				}
				if (e.getSource()==Available_G)
				 sel_guide=Available_G.getSelectedItem().toString();
				
				ticket_price=MuseumSystem.BK_Tour(v_num, subs_type);
			}
			else {
				ticket_price=MuseumSystem.issueTicket(v_num, subs_type);

			}
		
		}
		public void itemStateChanged3(ItemEvent e) {
		
	}

	*/
	public static void main(String[]args) {
		
		Museum_System_Frame MSF=new Museum_System_Frame();
		MSF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MSF.setSize(1500,750);
		MSF.setVisible(true);
		MSF.setResizable(false);
		
	}
	
}