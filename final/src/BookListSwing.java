
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.sql.*;
import java.util.Scanner;

import javax.swing.*;



class DoctorInput extends JDialog{
	JLabel label1 = new JLabel("doc_id");
	JLabel label2 = new JLabel("major_treat");
	JLabel label3 = new JLabel("doc_name");
	JLabel label4 = new JLabel("doc_gen");
	JLabel label5 = new JLabel("doc_phone");
	JLabel label6 = new JLabel("doc_email");
	JLabel label7 = new JLabel("doc_position");
	JTextField doc_id = new JTextField(20);
	JTextField major_treat = new JTextField(20);
	JTextField doc_name = new JTextField(20);
	JTextField doc_gen = new JTextField(20);
	JTextField doc_phone = new JTextField(20);
	JTextField doc_email = new JTextField(20);
	JTextField doc_position = new JTextField(20);
	JButton okButton = new JButton("입력");
	Statement stmt;
	
	public DoctorInput(JFrame frame, String title, JTextArea ta, JDialog dialog) {
		super(frame, title);
	
		setBounds(0, 0, 320, 500); //가로위치,세로위치,가로길이,세로길이
		setLayout(new GridLayout(8,2));
		
		add(label1); add(doc_id);
		add(label2); add(major_treat);
		add(label3); add(doc_name);
		add(label4); add(doc_gen);
		add(label5); add(doc_phone);
		add(label6); add(doc_email);
		add(label7); add(doc_position);
		add(okButton);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	 				String query = "INSERT INTO doctors VALUES("
	 				        + doc_id.getText() + ",'" 
	 				        + major_treat.getText() + "','" 
	 				        + doc_name.getText() + "','" 
	 					    + doc_gen.getText() + "','" 
	 					    + doc_phone.getText() + "','" 
	 					    + doc_email.getText() + "','" 
	 					    + doc_position.getText() + "')";
	 				 System.out.println(query);
	 				 stmt.executeUpdate(query); 
	 				ta.setText("doctor input is completed");
	        	 }
	        	 catch (SQLIntegrityConstraintViolationException cve) {
	        		 // display error message for constraint violation
	        		 ta.setText("Error Occured   " + cve.getMessage());
	        	 } catch (SQLException e1) {
	        		 ta.setText("Error Occured   " + e1.getMessage());
				 }
	        	 setVisible(false);
	        	 dialog.setVisible(false);
			}
		});
	}
}

class NurseInput extends JDialog{
	JLabel label1 = new JLabel("nur_id");
	JLabel label2 = new JLabel("major_job");
	JLabel label3 = new JLabel("nur_name");
	JLabel label4 = new JLabel("nur_gen");
	JLabel label5 = new JLabel("nur_phone");
	JLabel label6 = new JLabel("nur_email");
	JLabel label7 = new JLabel("nur_position");
	JTextField nur_id = new JTextField(20);
	JTextField major_job = new JTextField(20);
	JTextField nur_name = new JTextField(20);
	JTextField nur_gen = new JTextField(20);
	JTextField nur_phone = new JTextField(20);
	JTextField nur_email = new JTextField(20);
	JTextField nur_position = new JTextField(20);
	JButton okButton = new JButton("입력");
	Statement stmt;
	
	public NurseInput(JFrame frame, String title, JTextArea ta, JDialog dialog) {
		super(frame, title);
	
		setBounds(0, 0, 320, 500); //가로위치,세로위치,가로길이,세로길이
		setLayout(new GridLayout(8,2));
		
		add(label1); add(nur_id);
		add(label2); add(major_job);
		add(label3); add(nur_name);
		add(label4); add(nur_gen);
		add(label5); add(nur_phone);
		add(label6); add(nur_email);
		add(label7); add(nur_position);
		add(okButton);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	 				String query = "INSERT INTO nurses VALUES("
	 				        + nur_id.getText() + ",'" 
	 				        + major_job.getText() + "','" 
	 				        + nur_name.getText() + "','" 
	 					    + nur_gen.getText() + "','" 
	 					    + nur_phone.getText() + "','" 
	 					    + nur_email.getText() + "','" 
	 					    + nur_position.getText() + "')";
	 				 System.out.println(query);
	 				 stmt.executeUpdate(query); 
	 				ta.setText("nurse input is completed");
	        	 }
	        	 catch (SQLIntegrityConstraintViolationException cve) {
	        		 // display error message for constraint violation
	        		 ta.setText("Error Occured   " + cve.getMessage());
	        	 } catch (SQLException e1) {
	        		 ta.setText("Error Occured   " + e1.getMessage());
				 }
	        	 setVisible(false);
	        	 dialog.setVisible(false);
			}
		});
	}
}

class PatientInput extends JDialog{
	JLabel label1 = new JLabel("pat_id");
	JLabel label2 = new JLabel("nur_id");
	JLabel label3 = new JLabel("doc_id");
	JLabel label4 = new JLabel("pat_name");
	JLabel label5 = new JLabel("pat_gen");
	JLabel label6 = new JLabel("pat_jumin");
	JLabel label7 = new JLabel("pat_addr");
	JLabel label8 = new JLabel("pat_phone");
	JLabel label9 = new JLabel("pat_email");
	JLabel label10 = new JLabel("pat_job");
	JTextField pat_id = new JTextField(20);
	JTextField nur_id = new JTextField(20);
	JTextField doc_id = new JTextField(20);
	JTextField pat_name = new JTextField(20);
	JTextField pat_gen = new JTextField(20);
	JTextField pat_jumin = new JTextField(20);
	JTextField pat_addr = new JTextField(20);
	JTextField pat_phone = new JTextField(20);
	JTextField pat_email = new JTextField(20);
	JTextField pat_job = new JTextField(20);
	JButton okButton = new JButton("입력");
	Statement stmt;
	
	public PatientInput(JFrame frame, String title, JTextArea ta, JDialog dialog) {
		super(frame, title);
	
		setBounds(0, 0, 320, 500); //가로위치,세로위치,가로길이,세로길이
		setLayout(new GridLayout(11,2));
		
		add(label1); add(pat_id);
		add(label2); add(nur_id);
		add(label3); add(doc_id);
		add(label4); add(pat_name);
		add(label5); add(pat_gen);
		add(label6); add(pat_jumin);
		add(label7); add(pat_addr);
		add(label8); add(pat_phone);
		add(label9); add(pat_email);
		add(label10); add(pat_job);
		add(okButton);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	 				String query = "INSERT INTO patients VALUES("
	 				        + pat_id.getText() + "," 
	 				        + nur_id.getText() + "," 
	 				        + doc_id.getText() + ",'" 
	 					    + pat_name.getText() + "','" 
	 					    + pat_gen.getText() + "','" 
	 					    + pat_jumin.getText() + "','" 
				    		+ pat_addr.getText() + "','" 
		    				+ pat_phone.getText() + "','" 
    						+ pat_email.getText() + "','" 
	 					    + pat_job.getText() + "')";
	 				 System.out.println(query);
	 				 stmt.executeUpdate(query); 
	 				ta.setText("patient input is completed");
	        	 }
	        	 catch (SQLIntegrityConstraintViolationException cve) {
	        		 // display error message for constraint violation
	        		 ta.setText("Error Occured   " + cve.getMessage());
	        	 } catch (SQLException e1) {
	        		 ta.setText("Error Occured   " + e1.getMessage());
				 }
	        	 setVisible(false);
	        	 dialog.setVisible(false);
			}
		});
	}
}

class TreatmentInput extends JDialog{
	JLabel label1 = new JLabel("treat_id");
	JLabel label2 = new JLabel("pat_id");
	JLabel label3 = new JLabel("doc_id");
	JLabel label4 = new JLabel("treat_contents");
	JLabel label5 = new JLabel("treat_date");
	JTextField treat_id = new JTextField(20);
	JTextField pat_id = new JTextField(20);
	JTextField doc_id = new JTextField(20);
	JTextField treat_contents = new JTextField(20);
	JTextField treat_date = new JTextField(20);
	JButton okButton = new JButton("입력");
	Statement stmt;
	
	public TreatmentInput(JFrame frame, String title, JTextArea ta, JDialog dialog) {
		super(frame, title);
	
		setBounds(0, 0, 320, 500); //가로위치,세로위치,가로길이,세로길이
		setLayout(new GridLayout(6,2));
		
		add(label1); add(treat_id);
		add(label2); add(pat_id);
		add(label3); add(doc_id);
		add(label4); add(treat_contents);
		add(label5); add(treat_date);
		add(okButton);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	 				String query = "INSERT INTO treatments VALUES("
	 				        + treat_id.getText() + "," 
	 				        + pat_id.getText() + "," 
	 				        + doc_id.getText() + ",'" 
	 					    + treat_contents.getText() + "','" 
	 					    + treat_date.getText()+ "')";
	 				 System.out.println(query);
	 				 stmt.executeUpdate(query); 
	 				ta.setText("treatments input is completed");
	        	 }
	        	 catch (SQLIntegrityConstraintViolationException cve) {
	        		 // display error message for constraint violation
	        		 ta.setText("Error Occured   " + cve.getMessage());
	        	 } catch (SQLException e1) {
	        		 ta.setText("Error Occured   " + e1.getMessage());
				 }
	        	 setVisible(false);
	        	 dialog.setVisible(false);
			}
		});
	}
}

class ChartInput extends JDialog{
	JLabel label1 = new JLabel("chart_id");
	JLabel label2 = new JLabel("treat_id");
	JLabel label3 = new JLabel("doc_id");
	JLabel label4 = new JLabel("pat_id");
	JLabel label5 = new JLabel("nur_id");
	JLabel label6 = new JLabel("chart_contents");
	JTextField chart_id = new JTextField(20);
	JTextField treat_id = new JTextField(20);
	JTextField doc_id = new JTextField(20);
	JTextField pat_id = new JTextField(20);
	JTextField nur_id = new JTextField(20);
	JTextField chart_contents = new JTextField(20);
	JButton okButton = new JButton("입력");
	Statement stmt;
	
	public ChartInput(JFrame frame, String title, JTextArea ta, JDialog dialog) {
		super(frame, title);
	
		setBounds(0, 0, 320, 500); //가로위치,세로위치,가로길이,세로길이
		setLayout(new GridLayout(7,2));
		
		add(label1); add(chart_id);
		add(label2); add(treat_id);
		add(label3); add(doc_id);
		add(label4); add(pat_id);
		add(label5); add(nur_id);
		add(label6); add(chart_contents);
		add(okButton);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	 				String query = "INSERT INTO charts VALUES('"
	 				        + chart_id.getText() + "'," 
	 				        + treat_id.getText() + "," 
	 				        + doc_id.getText() + "," 
	 					    + pat_id.getText() + "," 
	 					    + nur_id.getText() + ",'" 
	 					    + chart_contents.getText() + "')";
	 				 System.out.println(query);
	 				 stmt.executeUpdate(query); 
	 				ta.setText("charts input is completed");
	        	 }
	        	 catch (SQLIntegrityConstraintViolationException cve) {
	        		 // display error message for constraint violation
	        		 ta.setText("Error Occured   " + cve.getMessage());
	        	 } catch (SQLException e1) {
	        		 ta.setText("Error Occured   " + e1.getMessage());
				 }
	        	 setVisible(false);
	        	 dialog.setVisible(false);
			}
		});
	}
}





class InputDialog extends JDialog {
	JButton but1 = new JButton("doctors");
	JButton but2 = new JButton("nurses");
	JButton but3 = new JButton("patients");
	JButton but4 = new JButton("treatments");
	JButton but5 = new JButton("charts");
	DoctorInput doctorInput;
	NurseInput nurseInput;
	PatientInput patientInput;
	TreatmentInput treatmentInput;
	ChartInput chartInput;
	
	Statement stmt;

	public InputDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setBounds(0, 0, 600, 100); //가로위치,세로위치,가로길이,세로길이
		setLayout(new GridLayout(1,5));
		add(but1);
		add(but2);
		add(but3);
		add(but4);
		add(but5);
		
		doctorInput = new DoctorInput(frame, title, ta, this);
		doctorInput.setVisible(false);
		nurseInput = new NurseInput(frame, title, ta, this);
		nurseInput.setVisible(false);
		patientInput = new PatientInput(frame, title, ta, this);
		patientInput.setVisible(false);
		treatmentInput = new TreatmentInput(frame, title, ta, this);
		treatmentInput.setVisible(false);
		chartInput = new ChartInput(frame, title, ta, this);
		chartInput.setVisible(false);
		
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doctorInput.setVisible(true);
				doctorInput.stmt = stmt;
			}
		});
		but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nurseInput.setVisible(true);
				nurseInput.stmt = stmt;
			}
		});
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patientInput.setVisible(true);
				patientInput.stmt = stmt;
			}
		});
		but4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				treatmentInput.setVisible(true);
				treatmentInput.stmt = stmt;
			}
		});
		but5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chartInput.setVisible(true);
				chartInput.stmt = stmt;
			}
		});
	}
}

class SearchDialog extends JDialog{
	JButton but1 = new JButton("doctors");
	JButton but2 = new JButton("nurses");
	JButton but3 = new JButton("patients");
	JButton but4 = new JButton("treatments");
	JButton but5 = new JButton("charts");
	Statement stmt;
	
	public SearchDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setBounds(0, 0, 600, 100);
		setLayout(new GridLayout(1,5));
		add(but1);
		add(but2);
		add(but3);
		add(but4);
		add(but5);
		
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	 				ta.setText("");
			        ResultSet rs = stmt.executeQuery("SELECT * FROM doctors");
			        while (rs.next()) {
			           String str = rs.getInt(1)
			        		   + "\t" + rs.getString(2) 
			        		   + "\t" + rs.getString(3) 
			        		   + "\t" + rs.getString(4)
			        		   + "\t" + rs.getString(5)
			        		   + "\t" + rs.getString(6)
			        		   + "\t" + rs.getString(7)
			        		   + "\n";
			           ta.append(str);
			        }
			        rs.close();
	        	 }
	        	 catch (SQLIntegrityConstraintViolationException cve) {
	        		 // display error message for constraint violation
	        		 ta.setText("Error Occured   " + cve.getMessage());
	        	 } catch (SQLException e1) {
	        		 ta.setText("Error Occured   " + e1.getMessage());
				 }  
		        setVisible(false);
			}
		});
		but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	 				ta.setText("");
			        ResultSet rs = stmt.executeQuery("SELECT * FROM nurses");
			        while (rs.next()) {
			           String str = rs.getInt(1)
			        		   + "\t" + rs.getString(2) 
			        		   + "\t" + rs.getString(3) 
			        		   + "\t" + rs.getString(4)
			        		   + "\t" + rs.getString(5)
			        		   + "\t" + rs.getString(6)
			        		   + "\t" + rs.getString(7)
			        		   + "\n";
			           ta.append(str);
			        }
			        rs.close();
	        	 }
	        	 catch (SQLIntegrityConstraintViolationException cve) {
	        		 // display error message for constraint violation
	        		 ta.setText("Error Occured   " + cve.getMessage());
	        	 } catch (SQLException e1) {
	        		 ta.setText("Error Occured   " + e1.getMessage());
				 }  
		        setVisible(false);
			}
		});
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	 				ta.setText("");
			        ResultSet rs = stmt.executeQuery("SELECT * FROM patients");
			        while (rs.next()) {
			           String str = rs.getInt(1)
			        		   + "\t" + rs.getInt(2) 
			        		   + "\t" + rs.getInt(3) 
			        		   + "\t" + rs.getString(4)
			        		   + "\t" + rs.getString(5)
			        		   + "\t" + rs.getString(6)
			        		   + "\t" + rs.getString(7)
			        		   + "\t" + rs.getString(8)
			        		   + "\t" + rs.getString(9)
			        		   + "\t" + rs.getString(10)
			        		   + "\n";
			           ta.append(str);
			        }
			        rs.close();
	        	 }
	        	 catch (SQLIntegrityConstraintViolationException cve) {
	        		 // display error message for constraint violation
	        		 ta.setText("Error Occured   " + cve.getMessage());
	        	 } catch (SQLException e1) {
	        		 ta.setText("Error Occured   " + e1.getMessage());
				 }  
		        setVisible(false);
			}
		});
		but4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	 				ta.setText("");
			        ResultSet rs = stmt.executeQuery("SELECT * FROM treatments");
			        while (rs.next()) {
			           String str = rs.getInt(1)
			        		   + "\t" + rs.getInt(2) 
			        		   + "\t" + rs.getInt(3) 
			        		   + "\t" + rs.getString(4)
			        		   + "\t" + rs.getString(5)
			        		   + "\n";
			           ta.append(str);
			        }
			        rs.close();
	        	 }
	        	 catch (SQLIntegrityConstraintViolationException cve) {
	        		 // display error message for constraint violation
	        		 ta.setText("Error Occured   " + cve.getMessage());
	        	 } catch (SQLException e1) {
	        		 ta.setText("Error Occured   " + e1.getMessage());
				 }  
		        setVisible(false);
			}
		});
		but5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	 				ta.setText("");
			        ResultSet rs = stmt.executeQuery("SELECT * FROM charts");
			        while (rs.next()) {
			           String str = rs.getString(1)
			        		   + "\t" + rs.getInt(2) 
			        		   + "\t" + rs.getInt(3) 
			        		   + "\t" + rs.getInt(4)
			        		   + "\t" + rs.getInt(5)
			        		   + "\t" + rs.getString(6)
			        		   + "\n";
			           ta.append(str);
			        }
			        rs.close();
	        	 }
	        	 catch (SQLIntegrityConstraintViolationException cve) {
	        		 // display error message for constraint violation
	        		 ta.setText("Error Occured   " + cve.getMessage());
	        	 } catch (SQLException e1) {
	        		 ta.setText("Error Occured   " + e1.getMessage());
				 }  
		        setVisible(false);
			}
		});
	}
}





public class BookListSwing extends JFrame implements ActionListener {
   JButton btnReset, btnInput, btnSearch1, btnSearch2, btnSearch3;
   JTextArea txtResult;
   JPanel pn1;
   InputDialog inputDialog;
   SearchDialog searchDialog;
   
   static Connection con;
   Statement stmt;
   ResultSet rs;
   String Driver = "";
   String url = "jdbc:mysql://localhost:3306/madang?&serverTimezone=Asia/Seoul&useSSL=false"; 
   String userid = "madang";
   String pwd = "madang";
   
   public BookListSwing() {
      super("Swing Database");
      layInit();
      conDB();
      setTitle("13011051/김준한");
      setVisible(true);
      inputDialog = new InputDialog(this, "Input Dialog", txtResult);
      inputDialog.setVisible(false);
      searchDialog = new SearchDialog(this, "Search Dialog", txtResult);
      searchDialog.setVisible(false);
      setBounds(200, 200, 600, 600); //가로위치,세로위치,가로길이,세로길이
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public void layInit() {
      btnReset = new JButton("초기화"); 
      btnInput = new JButton("입력");
      btnSearch1 = new JButton("검색1");
      btnSearch2 = new JButton("검색2");
      btnSearch3 = new JButton("검색3");  
      txtResult = new JTextArea();
      pn1 = new JPanel();
      pn1.add(btnReset);
      pn1.add(btnInput);
      pn1.add(btnSearch1);
      pn1.add(btnSearch2);
      pn1.add(btnSearch3);
      txtResult.setEditable(false);
      JScrollPane scrollPane = new JScrollPane(txtResult);
      add("North", pn1);
      add("Center", scrollPane);
      btnReset.addActionListener(this);
      btnInput.addActionListener(this);
      btnSearch1.addActionListener(this);
      btnSearch2.addActionListener(this);
      btnSearch3.addActionListener(this);
   }

   public void conDB() {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         System.out.println("드라이버 로드 성공");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
      
      try { /* 데이터베이스를 연결하는 과정 */
          System.out.println("데이터베이스 연결 준비...");
          con = DriverManager.getConnection(url, userid, pwd);
          System.out.println("데이터베이스 연결 성공");
       } catch (SQLException e1) {
          e1.printStackTrace();
       }
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      try {
         stmt = con.createStatement();
         inputDialog.stmt = stmt;
         searchDialog.stmt = stmt;
         if (e.getSource() == btnReset) {
            txtResult.setText("");
            
            stmt.execute("drop table if exists charts");
            stmt.execute("drop table if exists treatments");
            stmt.execute("drop table if exists patients");
            stmt.execute("drop table if exists nurses");
            stmt.execute("drop table if exists doctors");         

            stmt.execute("CREATE TABLE IF NOT EXISTS `madang`.`Doctors` (\r\n" + 
            		"  `doc_id` INT NOT NULL,\r\n" + 
            		"  `major_treat` VARCHAR(25) NOT NULL,\r\n" + 
            		"  `doc_name` VARCHAR(20) NOT NULL,\r\n" + 
            		"  `doc_gen` CHAR(1) NOT NULL,\r\n" + 
            		"  `doc_phone` VARCHAR(15) NULL,\r\n" + 
            		"  `doc_email` VARCHAR(50) NULL,\r\n" + 
            		"  `doc_position` VARCHAR(20) NOT NULL,\r\n" + 
            		"  PRIMARY KEY (`doc_id`))");
            stmt.execute("CREATE TABLE IF NOT EXISTS `madang`.`Nurses` (\r\n" + 
            		"  `nur_id` INT NOT NULL,\r\n" + 
            		"  `major_job` VARCHAR(25) NOT NULL,\r\n" + 
            		"  `nur_name` VARCHAR(20) NOT NULL,\r\n" + 
            		"  `nur_gen` CHAR(1) NOT NULL,\r\n" + 
            		"  `nur_phone` VARCHAR(15) NULL,\r\n" + 
            		"  `nur_email` VARCHAR(50) NULL,\r\n" + 
            		"  `nur_position` VARCHAR(20) NOT NULL,\r\n" + 
            		"  PRIMARY KEY (`nur_id`))");
            stmt.execute("CREATE TABLE IF NOT EXISTS `madang`.`Patients` (\r\n" + 
            		"  `pat_id` INT NOT NULL,\r\n" + 
            		"  `nur_id` INT NOT NULL,\r\n" + 
            		"  `doc_id` INT NOT NULL,\r\n" + 
            		"  `pat_name` VARCHAR(20) NOT NULL,\r\n" + 
            		"  `pat_gen` CHAR(1) NOT NULL,\r\n" + 
            		"  `pat_jumin` VARCHAR(14) NOT NULL,\r\n" + 
            		"  `pat_addr` VARCHAR(100) NOT NULL,\r\n" + 
            		"  `pat_phone` VARCHAR(15) NULL,\r\n" + 
            		"  `pat_email` VARCHAR(50) NULL,\r\n" + 
            		"  `pat_job` VARCHAR(20) NOT NULL,\r\n" + 
            		"  PRIMARY KEY (`pat_id`),\r\n" + 
            		"  INDEX `fk_Patients_Doctors_idx` (`doc_id` ASC) VISIBLE,\r\n" + 
            		"  INDEX `fk_Patients_Nurses1_idx` (`nur_id` ASC) VISIBLE,\r\n" + 
            		"  CONSTRAINT `fk_Patients_Doctors`\r\n" + 
            		"    FOREIGN KEY (`doc_id`)\r\n" + 
            		"    REFERENCES `madang`.`Doctors` (`doc_id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE,\r\n" + 
            		"  CONSTRAINT `fk_Patients_Nurses1`\r\n" + 
            		"    FOREIGN KEY (`nur_id`)\r\n" + 
            		"    REFERENCES `madang`.`Nurses` (`nur_id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE)");
            stmt.execute("CREATE TABLE IF NOT EXISTS `madang`.`Treatments` (\r\n" + 
            		"  `treat_id` INT NOT NULL,\r\n" + 
            		"  `pat_id` INT NOT NULL,\r\n" + 
            		"  `doc_id` INT NOT NULL,\r\n" + 
            		"  `treat_contents` VARCHAR(1000) NOT NULL,\r\n" + 
            		"  `treat_date` DATE NOT NULL,\r\n" + 
            		"  PRIMARY KEY (`treat_id`, `pat_id`, `doc_id`),\r\n" + 
            		"  INDEX `fk_Treatments_Doctors1_idx` (`doc_id` ASC) VISIBLE,\r\n" + 
            		"  INDEX `fk_Treatments_Patients1_idx` (`pat_id` ASC) VISIBLE,\r\n" + 
            		"  CONSTRAINT `fk_Treatments_Doctors1`\r\n" + 
            		"    FOREIGN KEY (`doc_id`)\r\n" + 
            		"    REFERENCES `madang`.`Doctors` (`doc_id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE,\r\n" + 
            		"  CONSTRAINT `fk_Treatments_Patients1`\r\n" + 
            		"    FOREIGN KEY (`pat_id`)\r\n" + 
            		"    REFERENCES `madang`.`Patients` (`pat_id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE)");
            stmt.execute("CREATE TABLE IF NOT EXISTS `madang`.`Charts` (\r\n" + 
            		"  `chart_id` VARCHAR(20) NOT NULL,\r\n" + 
            		"  `treat_id` INT NOT NULL,\r\n" + 
            		"  `doc_id` INT NOT NULL,\r\n" + 
            		"  `pat_id` INT NOT NULL,\r\n" + 
            		"  `nur_id` INT NOT NULL,\r\n" + 
            		"  `chart_contents` VARCHAR(1000) NOT NULL,\r\n" + 
            		"  PRIMARY KEY (`chart_id`, `treat_id`, `doc_id`, `pat_id`),\r\n" + 
            		"  INDEX `fk_Charts_Nurses1_idx` (`nur_id` ASC) INVISIBLE,\r\n" + 
            		"  INDEX `fk_Charts_Treatments1_idx` (`treat_id` ASC) VISIBLE,\r\n" + 
            		"  INDEX `fk_Charts_Doctor_idx` (`doc_id` ASC) VISIBLE,\r\n" + 
            		"  INDEX `k_Charts_Patients_idx` (`pat_id` ASC) VISIBLE,\r\n" + 
            		"  CONSTRAINT `fk_Charts_Nurses1`\r\n" + 
            		"    FOREIGN KEY (`nur_id`)\r\n" + 
            		"    REFERENCES `madang`.`Nurses` (`nur_id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE,\r\n" + 
            		"  CONSTRAINT `fk_Charts_Treatments1`\r\n" + 
            		"    FOREIGN KEY (`treat_id`)\r\n" + 
            		"    REFERENCES `madang`.`Treatments` (`treat_id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE,\r\n" + 
            		"  CONSTRAINT `fk_Charts_Doctor`\r\n" + 
            		"    FOREIGN KEY (`doc_id`)\r\n" + 
            		"    REFERENCES `madang`.`Treatments` (`doc_id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE,\r\n" + 
            		"  CONSTRAINT `k_Charts_Patients`\r\n" + 
            		"    FOREIGN KEY (`pat_id`)\r\n" + 
            		"    REFERENCES `madang`.`Treatments` (`pat_id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE)");
            
            stmt.executeUpdate("insert into doctors values(980312, '소아과', '이태정', 'M', '010-333-1340', 'ltj@hanbh.com', '과장')"); 
            stmt.executeUpdate("insert into doctors values(000601, '내과', '안성기', 'M', '011-222-0987', 'ask@hanbh.com', '과장')");
            stmt.executeUpdate("insert into doctors values(001208, '외과', '김민종', 'M', '010-333-8743', 'kmj@han.com', '과장')");
            stmt.executeUpdate("insert into doctors values(020403, '피부과', '이태서', 'M', '019-777-3764', 'lts@hanbh.com', '과장')");
            stmt.executeUpdate("insert into doctors values(050900, '소아과', '김연아', 'F', '010-555-3746', 'kya@hanbh.com', '전문의')");
            stmt.executeUpdate("insert into doctors values(050101, '내과', '차태현', 'M', '010-555-3746', 'cth@hanbh.com', '전문의')");
            stmt.executeUpdate("insert into doctors values(062019, '소아과', '전지현', 'F', '010-999-1265', 'jjh@hanbh.com', '전문의')");
            stmt.executeUpdate("insert into doctors values(070576, '피부과', '홍길동', 'M', '016-333-7263', 'hgd@hanbh.com', '전문의')");
            stmt.executeUpdate("insert into doctors values(080543, '방사선과', '유재석', 'M', '010-222-1263', 'yjs@hanbh.com', '과장')");
            stmt.executeUpdate("insert into doctors values(091001, '외과', '김병만', 'M', '010-555-3542', 'kbm@hanbh.com', '전문의')");
            stmt.executeUpdate("insert into doctors values(091103, '피부과', '전용철', 'M', '010-123-5675', 'aaa@hanbh.com', '과장')");
            stmt.executeUpdate("insert into doctors values(091282, '외과', '김석민', 'M', '010-242-5677', 'bbb@hanbh.com', '과장')");
            stmt.executeUpdate("insert into doctors values(102454, '외과', '이용규', 'M', '010-435-4544', 'ccc@hanbh.com', '전문의')");
            stmt.executeUpdate("insert into doctors values(115533, '방사선과', '설민석', 'M', '010-787-2342', 'ddd@hanbh.com', '과장')");
            stmt.executeUpdate("insert into doctors values(117812, '피부과', '구자철', 'M', '010-987-1231', 'eee@hanbh.com', '전문의')");
            stmt.executeUpdate("insert into doctors values(119723, '방사선과', '박지성', 'M', '010-546-6667', 'fff@han.com', '전문의')");
            stmt.executeUpdate("insert into doctors values(120312, '소아과', '박민아', 'F', '010-123-6764', 'ggg@hanbh.com', '전문의')");
            stmt.executeUpdate("insert into doctors values(128546, '내과', '류연경', 'F', '010-424-3454', 'hhh@hanbh.com', '과장')");
            stmt.executeUpdate("insert into doctors values(135562, '피부과', '송인호', 'M', '010-454-1231', 'azz@hanbh.com', '전문의')");
            stmt.executeUpdate("insert into doctors values(141832, '외과', '명재성', 'M', '010-535-5858', 'sdf@hanbh.com', '과장')");
            
            stmt.executeUpdate("insert into nurses values(050302, '소아과', '김은영', 'F', '010-555-8751', 'key@hanbh.com', '수간호사')");
            stmt.executeUpdate("insert into nurses values(050021, '내과', '윤성애', 'F', '010-333-8745', 'ysa@hanbh.com', '수간호사')");
            stmt.executeUpdate("insert into nurses values(040089, '피부과', '신지원', 'M', '010-666-7646', 'sjw@hanbh.com', '주임')");
            stmt.executeUpdate("insert into nurses values(070605, '방사선과', '유정화', 'F', '010-333-4548', 'yjh@hanbh.com', '주임')");
            stmt.executeUpdate("insert into nurses values(070804, '내과', '리하나', 'F', '010-222-1340', 'nhn@hanbh.com', '주임')");
            stmt.executeUpdate("insert into nurses values(071018, '소아과', '김화경', 'F', '010-888-4116', 'khk@hanbh.com', '주임')");
            stmt.executeUpdate("insert into nurses values(100356, '소아과', '이선용', 'M', '010-777-1234', 'lsy@hanbh.com', '간호사')");
            stmt.executeUpdate("insert into nurses values(104145, '외과', '김현', 'M', '010-999-8520', 'kh@hanbh.com', '간호사')");
            stmt.executeUpdate("insert into nurses values(120309, '피부과', '박성완', 'M', '010-777-4996', 'psw@hanbh.com', '간호사')");
            stmt.executeUpdate("insert into nurses values(130211, '외과', '이서연', 'F', '010-222-3214', 'lsy2@hanbh.com', '간호사')");
            stmt.executeUpdate("insert into nurses values(130516, '소아과', '박아정', 'F', '010-555-8751', 'key@hanbh.com', '주임')");
            stmt.executeUpdate("insert into nurses values(134512, '방사선과', '송인규', 'M', '010-141-7667', 'asd@hanbh.com', '간호사')");
            stmt.executeUpdate("insert into nurses values(148612, '외과', '명필성', 'M', '010-242-6868', 'qwe@hanbh.com', '간호사')");
            stmt.executeUpdate("insert into nurses values(143651, '소아과', '민경희', 'F', '010-2424-4545', 'sdf@hanbh.com', '수간호사')");
            stmt.executeUpdate("insert into nurses values(159123, '소아과', '김영인', 'F', '010-412-1234', 'gfh@hanbh.com', '간호사')");
            stmt.executeUpdate("insert into nurses values(172135, '피부과', '문인주', 'F', '010-123-3456', 'asd@hanbh.com', '주임')");
            stmt.executeUpdate("insert into nurses values(171532, '소아과', '강소희', 'F', '010-234-5678', 'tyu@hanbh.com', '주임')");
            stmt.executeUpdate("insert into nurses values(184232, '외과', '김경아', 'F', '010-353-6789', 'hjk@hanbh.com', '수간호사')");
            stmt.executeUpdate("insert into nurses values(192312, '소아과', '이소연', 'F', '010-343-5365', 'sdf@hanbh.com', '간호사')");
            stmt.executeUpdate("insert into nurses values(201232, '방사선과', '이민아', 'F', '010-454-2344', 'vbn@hanbh.com', '간호사')");
            
            stmt.executeUpdate("insert into patients values(2345, 050302, 980312, '안상건', 'M', 232345, '서울', '010-555-7845', 'ask@ab.com', '회사원')");
            stmt.executeUpdate("insert into patients values(3545, 040089, 020403, '김성룡', 'M', 543545, '서울', '010-333-7812', 'ksr@bb.com', '자영업')");
            stmt.executeUpdate("insert into patients values(3424, 070605, 080543, '이종진', 'M', 433424, '부산', '019-888-4859', 'ljj@ab.com', '회사원')");
            stmt.executeUpdate("insert into patients values(7675, 100356, 050900, '최광석', 'M', 677675, '당진', '010-222-4847', 'cks@cc.com', '회사원')");
            stmt.executeUpdate("insert into patients values(4533, 070804, 000601, '정한경', 'M', 744533, '강릉', '010-777-9630', 'jhk@ab.com', '교수')");
            stmt.executeUpdate("insert into patients values(5546, 120309, 070576, '유원현', 'M', 765546, '대구', '016-777-0214', 'ywh@cc.com', '자영업')");
            stmt.executeUpdate("insert into patients values(4543, 070804, 050101, '최재정', 'M', 454543, '부산', '010-555-4187', 'cjj@bb.com', '회사원')");
            stmt.executeUpdate("insert into patients values(9768, 130211, 091001, '이진희', 'F', 119768, '서울', '010-888-3675', 'ljh@ab.com', '교수')");
            stmt.executeUpdate("insert into patients values(4234, 130211, 091001, '오나미', 'F', 234234, '속초', '010-999-6541', 'onm@cc.com', '학생')");
            stmt.executeUpdate("insert into patients values(7643, 071018, 062019, '송성묵', 'M', 987643, '서울', '010-222-5874', 'ssm@bb.com', '학생')");
            stmt.executeUpdate("insert into patients values(8432, 184232, 120312, '김인우', 'M', 123131, '서울', '010-532-1853', 'aaa@cc.com', '회사원')");
            stmt.executeUpdate("insert into patients values(1513, 192312, 117812, '이정재', 'M', 345345, '원주', '010-786-4321', 'aga@dd.com', '교수')");
            stmt.executeUpdate("insert into patients values(2786, 130516, 128546, '구인회', 'M', 565632, '전주', '010-765-8933', 'zzz@aj.com', '자영업')");
            stmt.executeUpdate("insert into patients values(9753, 159123, 141832, '송민정', 'F', 634636, '대구', '010-364-4384', 'abs@am.com', '학생')");
            stmt.executeUpdate("insert into patients values(3945, 172135, 135562, '이강인', 'M', 678678, '서울', '010-795-4623', 'awa@am.com', '회사원')");
            stmt.executeUpdate("insert into patients values(4831, 171532, 091103, '민이나', 'F', 151535, '대전', '010-987-3213', 'gdd@am.com', '학생')");
            stmt.executeUpdate("insert into patients values(5634, 134512, 091282, '문광우', 'M', 585853, '울산', '010-354-4531', 'xvx@am.com', '자영업')");
            stmt.executeUpdate("insert into patients values(6648, 148612, 115533, '성수경', 'F', 474512, '인천', '017-468-1232', 'xxx@am.com', '회사원')");
            stmt.executeUpdate("insert into patients values(7013, 201232, 120312, '강인규', 'M', 115734, '서울', '010-777-7898', 'bbb@am.com', '학생')");
            stmt.executeUpdate("insert into patients values(8645, 192312, 141832, '남궁민수', 'M', 156875, '서울', '010-111-1332', 'eee@am.com', '교수')");
            
            stmt.executeUpdate("insert into treatments values(130516023, 2345, 980312, '감기,몸살', '2013-05-16')");
            stmt.executeUpdate("insert into treatments values(130628100, 3545, 020403, '피부 트러블 치료', '2013-06-28')");
            stmt.executeUpdate("insert into treatments values(131205056, 3424, 080543, '목 디스크로 MRI 촬영', '2013-12-05')");
            stmt.executeUpdate("insert into treatments values(131218024, 7675, 050900, '중이염', '2013-12-18')");
            stmt.executeUpdate("insert into treatments values(131224012, 4533, 000601, '장염', '2013-12-24')");
            stmt.executeUpdate("insert into treatments values(140103001, 5546, 070576, '여드름 치료', '2014-01-03')");
            stmt.executeUpdate("insert into treatments values(140109026, 4543, 050101, '위염', '2014-01-09')");
            stmt.executeUpdate("insert into treatments values(140226102, 9768, 091001, '화상치료', '2014-02-26')");
            stmt.executeUpdate("insert into treatments values(140303003, 4234, 091001, '교통사고 외상치료', '2014-03-03')");
            stmt.executeUpdate("insert into treatments values(140308087, 7643, 062019, '장염', '2014-03-08')");
            stmt.executeUpdate("insert into treatments values(150105012, 8432, 120312, '위염', '2015-01-05')");
            stmt.executeUpdate("insert into treatments values(150109243, 1513, 117812, '위암', '2015-01-09')");
            stmt.executeUpdate("insert into treatments values(150215135, 2786, 128546, '십이지장암', '2015-02-15')");
            stmt.executeUpdate("insert into treatments values(150713544, 9753, 141832, '여드름 치료', '2015-07-13')");
            stmt.executeUpdate("insert into treatments values(150921123, 3945, 135562, '화상치료', '2015-09-21')");
            stmt.executeUpdate("insert into treatments values(160404987, 4831, 091103, '정신병 치료', '2016-04-04')");
            stmt.executeUpdate("insert into treatments values(160625112, 5634, 091282, '골다공증', '2016-06-25')");
            stmt.executeUpdate("insert into treatments values(160911013, 6648, 115533, '환청', '2016-09-11')");
            stmt.executeUpdate("insert into treatments values(161112351, 7013, 120312, '팔 골절', '2016-11-12')");
            stmt.executeUpdate("insert into treatments values(161210331, 8645, 141832, '십자인대 부상', '2016-12-10')");
            
            stmt.executeUpdate("insert into charts values('a', 130516023, 980312, 2345, 050302, '진료 중')");
            stmt.executeUpdate("insert into charts values('b', 130628100, 020403, 3545, 040089, '진료 완료')");
            stmt.executeUpdate("insert into charts values('c', 131205056, 080543, 3424, 070605, '진료 중')");
            stmt.executeUpdate("insert into charts values('d', 131218024, 050900, 7675, 100356, '진료 완료')");
            stmt.executeUpdate("insert into charts values('e', 131224012, 000601, 4533, 070804, '진료 중')");
            stmt.executeUpdate("insert into charts values('f', 140103001, 070576, 5546, 120309, '진료 대기')");
            stmt.executeUpdate("insert into charts values('g', 140109026, 050101, 4543, 070804, '진료 완료')");
            stmt.executeUpdate("insert into charts values('h', 140226102, 091001, 9768, 130211, '진료 중')");
            stmt.executeUpdate("insert into charts values('i', 140303003, 091001, 4234, 130211, '진료 중')");
            stmt.executeUpdate("insert into charts values('j', 140308087, 062019, 7643, 071018, '진료 완료')");
            stmt.executeUpdate("insert into charts values('k', 150105012, 120312, 8432, 184232, '진료 중')");
            stmt.executeUpdate("insert into charts values('l', 150109243, 117812, 1513, 192312, '진료 완료')");
            stmt.executeUpdate("insert into charts values('m', 150215135, 128546, 2786, 130516, '진료 중')");
            stmt.executeUpdate("insert into charts values('n', 150713544, 141832, 9753, 159123, '진료 대기')");
            stmt.executeUpdate("insert into charts values('o', 150921123, 135562, 3945, 172135, '진료 중')");
            stmt.executeUpdate("insert into charts values('p', 160404987, 091103, 4831, 171532, '진료 대기')");
            stmt.executeUpdate("insert into charts values('q', 160625112, 091282, 5634, 134512, '진료 완료')");
            stmt.executeUpdate("insert into charts values('r', 160911013, 115533, 6648, 148612, '진료 완료')");
            stmt.executeUpdate("insert into charts values('s', 161112351, 120312, 7013, 201232, '진료 대기')");
            stmt.executeUpdate("insert into charts values('t', 161210331, 141832, 8645, 192312, '진료 완료')");
            
            txtResult.setText("init completed");
            
         } else if (e.getSource() == btnInput) {
        	 inputDialog.setVisible(true);      
         } else if (e.getSource() == btnSearch1) {
        	 searchDialog.setVisible(true);
        	 
         } else if (e.getSource() == btnSearch2) {
        	 
        	 // jumin의 합이 3백만 이상이 넘는 직업군에 해당하는 환자의 이름과 간호사의 이름
        	 String query = "select pat_name, nur_name from patients, nurses where patients.nur_id = nurses.nur_id and patients.pat_job in (select pat_job from patients group by pat_job having sum(pat_jumin) >= 3000000)";
        	 txtResult.setText("");
        	 txtResult.append(query + "\n\n");
        	 rs = stmt.executeQuery(query);
    		 while (rs.next()) {
	 	                String str = rs.getString(1) + "\t" + rs.getString(2) + "\n";
	 	                txtResult.append(str);
	 	     }
    		 rs.close();
        	 
         } else if (e.getSource() == btnSearch3) {
        	 
        	 // jumin의 합이 150만 보다 작은 직업군에 해당하는 환자의 이름, 간호사의 이름, 의사의 이름
        	 String query = "select pat_name, nur_name, doc_name from patients, nurses, doctors where patients.nur_id = nurses.nur_id and patients.doc_id = doctors.doc_id and patients.pat_job in (select pat_job from patients group by pat_job having sum(pat_jumin) < 1500000)";
        	 txtResult.setText("");
        	 txtResult.append(query + "\n\n");
        	 rs = stmt.executeQuery(query);
    		 while (rs.next()) {
	 	                String str = rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\n";
	 	                txtResult.append(str);
	 	     }
    		 rs.close();
        	 
         } 
      } catch (Exception e2) {
         System.out.println("쿼리 읽기 실패 :" + e2);
/*      } finally {
         try {
            if (rs != null)
               rs.close();
            if (stmt != null)
               stmt.close();
            if (con != null)
               con.close();
         } catch (Exception e3) {
            // TODO: handle exception
         }
  */
      }

   }

   public static void main(String[] args) {
      BookListSwing BLS = new BookListSwing();
      
      //BLS.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      //BLS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      BLS.addWindowListener(new WindowAdapter() {
    	  public void windowClosing(WindowEvent we) {
    		try {
    			con.close();
    		} catch (Exception e4) { 	}
    		System.out.println("프로그램 완전 종료!");    		
    	    System.exit(0);
    	  }
    	});
   }
}

