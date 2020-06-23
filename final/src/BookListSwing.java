
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
	JButton okButton = new JButton("�Է�");
	Statement stmt;
	
	public DoctorInput(JFrame frame, String title, JTextArea ta, JDialog dialog) {
		super(frame, title);
	
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
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
	JButton okButton = new JButton("�Է�");
	Statement stmt;
	
	public NurseInput(JFrame frame, String title, JTextArea ta, JDialog dialog) {
		super(frame, title);
	
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
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
	JButton okButton = new JButton("�Է�");
	Statement stmt;
	
	public PatientInput(JFrame frame, String title, JTextArea ta, JDialog dialog) {
		super(frame, title);
	
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
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
	JButton okButton = new JButton("�Է�");
	Statement stmt;
	
	public TreatmentInput(JFrame frame, String title, JTextArea ta, JDialog dialog) {
		super(frame, title);
	
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
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
	JButton okButton = new JButton("�Է�");
	Statement stmt;
	
	public ChartInput(JFrame frame, String title, JTextArea ta, JDialog dialog) {
		super(frame, title);
	
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
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
		setBounds(0, 0, 600, 100); //������ġ,������ġ,���α���,���α���
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
      setTitle("13011051/������");
      setVisible(true);
      inputDialog = new InputDialog(this, "Input Dialog", txtResult);
      inputDialog.setVisible(false);
      searchDialog = new SearchDialog(this, "Search Dialog", txtResult);
      searchDialog.setVisible(false);
      setBounds(200, 200, 600, 600); //������ġ,������ġ,���α���,���α���
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public void layInit() {
      btnReset = new JButton("�ʱ�ȭ"); 
      btnInput = new JButton("�Է�");
      btnSearch1 = new JButton("�˻�1");
      btnSearch2 = new JButton("�˻�2");
      btnSearch3 = new JButton("�˻�3");  
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
         System.out.println("����̹� �ε� ����");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
      
      try { /* �����ͺ��̽��� �����ϴ� ���� */
          System.out.println("�����ͺ��̽� ���� �غ�...");
          con = DriverManager.getConnection(url, userid, pwd);
          System.out.println("�����ͺ��̽� ���� ����");
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
            
            stmt.executeUpdate("insert into doctors values(980312, '�Ҿư�', '������', 'M', '010-333-1340', 'ltj@hanbh.com', '����')"); 
            stmt.executeUpdate("insert into doctors values(000601, '����', '�ȼ���', 'M', '011-222-0987', 'ask@hanbh.com', '����')");
            stmt.executeUpdate("insert into doctors values(001208, '�ܰ�', '�����', 'M', '010-333-8743', 'kmj@han.com', '����')");
            stmt.executeUpdate("insert into doctors values(020403, '�Ǻΰ�', '���¼�', 'M', '019-777-3764', 'lts@hanbh.com', '����')");
            stmt.executeUpdate("insert into doctors values(050900, '�Ҿư�', '�迬��', 'F', '010-555-3746', 'kya@hanbh.com', '������')");
            stmt.executeUpdate("insert into doctors values(050101, '����', '������', 'M', '010-555-3746', 'cth@hanbh.com', '������')");
            stmt.executeUpdate("insert into doctors values(062019, '�Ҿư�', '������', 'F', '010-999-1265', 'jjh@hanbh.com', '������')");
            stmt.executeUpdate("insert into doctors values(070576, '�Ǻΰ�', 'ȫ�浿', 'M', '016-333-7263', 'hgd@hanbh.com', '������')");
            stmt.executeUpdate("insert into doctors values(080543, '��缱��', '���缮', 'M', '010-222-1263', 'yjs@hanbh.com', '����')");
            stmt.executeUpdate("insert into doctors values(091001, '�ܰ�', '�躴��', 'M', '010-555-3542', 'kbm@hanbh.com', '������')");
            stmt.executeUpdate("insert into doctors values(091103, '�Ǻΰ�', '����ö', 'M', '010-123-5675', 'aaa@hanbh.com', '����')");
            stmt.executeUpdate("insert into doctors values(091282, '�ܰ�', '�輮��', 'M', '010-242-5677', 'bbb@hanbh.com', '����')");
            stmt.executeUpdate("insert into doctors values(102454, '�ܰ�', '�̿��', 'M', '010-435-4544', 'ccc@hanbh.com', '������')");
            stmt.executeUpdate("insert into doctors values(115533, '��缱��', '���μ�', 'M', '010-787-2342', 'ddd@hanbh.com', '����')");
            stmt.executeUpdate("insert into doctors values(117812, '�Ǻΰ�', '����ö', 'M', '010-987-1231', 'eee@hanbh.com', '������')");
            stmt.executeUpdate("insert into doctors values(119723, '��缱��', '������', 'M', '010-546-6667', 'fff@han.com', '������')");
            stmt.executeUpdate("insert into doctors values(120312, '�Ҿư�', '�ڹξ�', 'F', '010-123-6764', 'ggg@hanbh.com', '������')");
            stmt.executeUpdate("insert into doctors values(128546, '����', '������', 'F', '010-424-3454', 'hhh@hanbh.com', '����')");
            stmt.executeUpdate("insert into doctors values(135562, '�Ǻΰ�', '����ȣ', 'M', '010-454-1231', 'azz@hanbh.com', '������')");
            stmt.executeUpdate("insert into doctors values(141832, '�ܰ�', '���缺', 'M', '010-535-5858', 'sdf@hanbh.com', '����')");
            
            stmt.executeUpdate("insert into nurses values(050302, '�Ҿư�', '������', 'F', '010-555-8751', 'key@hanbh.com', '����ȣ��')");
            stmt.executeUpdate("insert into nurses values(050021, '����', '������', 'F', '010-333-8745', 'ysa@hanbh.com', '����ȣ��')");
            stmt.executeUpdate("insert into nurses values(040089, '�Ǻΰ�', '������', 'M', '010-666-7646', 'sjw@hanbh.com', '����')");
            stmt.executeUpdate("insert into nurses values(070605, '��缱��', '����ȭ', 'F', '010-333-4548', 'yjh@hanbh.com', '����')");
            stmt.executeUpdate("insert into nurses values(070804, '����', '���ϳ�', 'F', '010-222-1340', 'nhn@hanbh.com', '����')");
            stmt.executeUpdate("insert into nurses values(071018, '�Ҿư�', '��ȭ��', 'F', '010-888-4116', 'khk@hanbh.com', '����')");
            stmt.executeUpdate("insert into nurses values(100356, '�Ҿư�', '�̼���', 'M', '010-777-1234', 'lsy@hanbh.com', '��ȣ��')");
            stmt.executeUpdate("insert into nurses values(104145, '�ܰ�', '����', 'M', '010-999-8520', 'kh@hanbh.com', '��ȣ��')");
            stmt.executeUpdate("insert into nurses values(120309, '�Ǻΰ�', '�ڼ���', 'M', '010-777-4996', 'psw@hanbh.com', '��ȣ��')");
            stmt.executeUpdate("insert into nurses values(130211, '�ܰ�', '�̼���', 'F', '010-222-3214', 'lsy2@hanbh.com', '��ȣ��')");
            stmt.executeUpdate("insert into nurses values(130516, '�Ҿư�', '�ھ���', 'F', '010-555-8751', 'key@hanbh.com', '����')");
            stmt.executeUpdate("insert into nurses values(134512, '��缱��', '���α�', 'M', '010-141-7667', 'asd@hanbh.com', '��ȣ��')");
            stmt.executeUpdate("insert into nurses values(148612, '�ܰ�', '���ʼ�', 'M', '010-242-6868', 'qwe@hanbh.com', '��ȣ��')");
            stmt.executeUpdate("insert into nurses values(143651, '�Ҿư�', '�ΰ���', 'F', '010-2424-4545', 'sdf@hanbh.com', '����ȣ��')");
            stmt.executeUpdate("insert into nurses values(159123, '�Ҿư�', '�迵��', 'F', '010-412-1234', 'gfh@hanbh.com', '��ȣ��')");
            stmt.executeUpdate("insert into nurses values(172135, '�Ǻΰ�', '������', 'F', '010-123-3456', 'asd@hanbh.com', '����')");
            stmt.executeUpdate("insert into nurses values(171532, '�Ҿư�', '������', 'F', '010-234-5678', 'tyu@hanbh.com', '����')");
            stmt.executeUpdate("insert into nurses values(184232, '�ܰ�', '����', 'F', '010-353-6789', 'hjk@hanbh.com', '����ȣ��')");
            stmt.executeUpdate("insert into nurses values(192312, '�Ҿư�', '�̼ҿ�', 'F', '010-343-5365', 'sdf@hanbh.com', '��ȣ��')");
            stmt.executeUpdate("insert into nurses values(201232, '��缱��', '�̹ξ�', 'F', '010-454-2344', 'vbn@hanbh.com', '��ȣ��')");
            
            stmt.executeUpdate("insert into patients values(2345, 050302, 980312, '�Ȼ��', 'M', 232345, '����', '010-555-7845', 'ask@ab.com', 'ȸ���')");
            stmt.executeUpdate("insert into patients values(3545, 040089, 020403, '�輺��', 'M', 543545, '����', '010-333-7812', 'ksr@bb.com', '�ڿ���')");
            stmt.executeUpdate("insert into patients values(3424, 070605, 080543, '������', 'M', 433424, '�λ�', '019-888-4859', 'ljj@ab.com', 'ȸ���')");
            stmt.executeUpdate("insert into patients values(7675, 100356, 050900, '�ֱ���', 'M', 677675, '����', '010-222-4847', 'cks@cc.com', 'ȸ���')");
            stmt.executeUpdate("insert into patients values(4533, 070804, 000601, '���Ѱ�', 'M', 744533, '����', '010-777-9630', 'jhk@ab.com', '����')");
            stmt.executeUpdate("insert into patients values(5546, 120309, 070576, '������', 'M', 765546, '�뱸', '016-777-0214', 'ywh@cc.com', '�ڿ���')");
            stmt.executeUpdate("insert into patients values(4543, 070804, 050101, '������', 'M', 454543, '�λ�', '010-555-4187', 'cjj@bb.com', 'ȸ���')");
            stmt.executeUpdate("insert into patients values(9768, 130211, 091001, '������', 'F', 119768, '����', '010-888-3675', 'ljh@ab.com', '����')");
            stmt.executeUpdate("insert into patients values(4234, 130211, 091001, '������', 'F', 234234, '����', '010-999-6541', 'onm@cc.com', '�л�')");
            stmt.executeUpdate("insert into patients values(7643, 071018, 062019, '�ۼ���', 'M', 987643, '����', '010-222-5874', 'ssm@bb.com', '�л�')");
            stmt.executeUpdate("insert into patients values(8432, 184232, 120312, '���ο�', 'M', 123131, '����', '010-532-1853', 'aaa@cc.com', 'ȸ���')");
            stmt.executeUpdate("insert into patients values(1513, 192312, 117812, '������', 'M', 345345, '����', '010-786-4321', 'aga@dd.com', '����')");
            stmt.executeUpdate("insert into patients values(2786, 130516, 128546, '����ȸ', 'M', 565632, '����', '010-765-8933', 'zzz@aj.com', '�ڿ���')");
            stmt.executeUpdate("insert into patients values(9753, 159123, 141832, '�۹���', 'F', 634636, '�뱸', '010-364-4384', 'abs@am.com', '�л�')");
            stmt.executeUpdate("insert into patients values(3945, 172135, 135562, '�̰���', 'M', 678678, '����', '010-795-4623', 'awa@am.com', 'ȸ���')");
            stmt.executeUpdate("insert into patients values(4831, 171532, 091103, '���̳�', 'F', 151535, '����', '010-987-3213', 'gdd@am.com', '�л�')");
            stmt.executeUpdate("insert into patients values(5634, 134512, 091282, '������', 'M', 585853, '���', '010-354-4531', 'xvx@am.com', '�ڿ���')");
            stmt.executeUpdate("insert into patients values(6648, 148612, 115533, '������', 'F', 474512, '��õ', '017-468-1232', 'xxx@am.com', 'ȸ���')");
            stmt.executeUpdate("insert into patients values(7013, 201232, 120312, '���α�', 'M', 115734, '����', '010-777-7898', 'bbb@am.com', '�л�')");
            stmt.executeUpdate("insert into patients values(8645, 192312, 141832, '���ùμ�', 'M', 156875, '����', '010-111-1332', 'eee@am.com', '����')");
            
            stmt.executeUpdate("insert into treatments values(130516023, 2345, 980312, '����,����', '2013-05-16')");
            stmt.executeUpdate("insert into treatments values(130628100, 3545, 020403, '�Ǻ� Ʈ���� ġ��', '2013-06-28')");
            stmt.executeUpdate("insert into treatments values(131205056, 3424, 080543, '�� ��ũ�� MRI �Կ�', '2013-12-05')");
            stmt.executeUpdate("insert into treatments values(131218024, 7675, 050900, '���̿�', '2013-12-18')");
            stmt.executeUpdate("insert into treatments values(131224012, 4533, 000601, '�忰', '2013-12-24')");
            stmt.executeUpdate("insert into treatments values(140103001, 5546, 070576, '���帧 ġ��', '2014-01-03')");
            stmt.executeUpdate("insert into treatments values(140109026, 4543, 050101, '����', '2014-01-09')");
            stmt.executeUpdate("insert into treatments values(140226102, 9768, 091001, 'ȭ��ġ��', '2014-02-26')");
            stmt.executeUpdate("insert into treatments values(140303003, 4234, 091001, '������ �ܻ�ġ��', '2014-03-03')");
            stmt.executeUpdate("insert into treatments values(140308087, 7643, 062019, '�忰', '2014-03-08')");
            stmt.executeUpdate("insert into treatments values(150105012, 8432, 120312, '����', '2015-01-05')");
            stmt.executeUpdate("insert into treatments values(150109243, 1513, 117812, '����', '2015-01-09')");
            stmt.executeUpdate("insert into treatments values(150215135, 2786, 128546, '���������', '2015-02-15')");
            stmt.executeUpdate("insert into treatments values(150713544, 9753, 141832, '���帧 ġ��', '2015-07-13')");
            stmt.executeUpdate("insert into treatments values(150921123, 3945, 135562, 'ȭ��ġ��', '2015-09-21')");
            stmt.executeUpdate("insert into treatments values(160404987, 4831, 091103, '���ź� ġ��', '2016-04-04')");
            stmt.executeUpdate("insert into treatments values(160625112, 5634, 091282, '��ٰ���', '2016-06-25')");
            stmt.executeUpdate("insert into treatments values(160911013, 6648, 115533, 'ȯû', '2016-09-11')");
            stmt.executeUpdate("insert into treatments values(161112351, 7013, 120312, '�� ����', '2016-11-12')");
            stmt.executeUpdate("insert into treatments values(161210331, 8645, 141832, '�����δ� �λ�', '2016-12-10')");
            
            stmt.executeUpdate("insert into charts values('a', 130516023, 980312, 2345, 050302, '���� ��')");
            stmt.executeUpdate("insert into charts values('b', 130628100, 020403, 3545, 040089, '���� �Ϸ�')");
            stmt.executeUpdate("insert into charts values('c', 131205056, 080543, 3424, 070605, '���� ��')");
            stmt.executeUpdate("insert into charts values('d', 131218024, 050900, 7675, 100356, '���� �Ϸ�')");
            stmt.executeUpdate("insert into charts values('e', 131224012, 000601, 4533, 070804, '���� ��')");
            stmt.executeUpdate("insert into charts values('f', 140103001, 070576, 5546, 120309, '���� ���')");
            stmt.executeUpdate("insert into charts values('g', 140109026, 050101, 4543, 070804, '���� �Ϸ�')");
            stmt.executeUpdate("insert into charts values('h', 140226102, 091001, 9768, 130211, '���� ��')");
            stmt.executeUpdate("insert into charts values('i', 140303003, 091001, 4234, 130211, '���� ��')");
            stmt.executeUpdate("insert into charts values('j', 140308087, 062019, 7643, 071018, '���� �Ϸ�')");
            stmt.executeUpdate("insert into charts values('k', 150105012, 120312, 8432, 184232, '���� ��')");
            stmt.executeUpdate("insert into charts values('l', 150109243, 117812, 1513, 192312, '���� �Ϸ�')");
            stmt.executeUpdate("insert into charts values('m', 150215135, 128546, 2786, 130516, '���� ��')");
            stmt.executeUpdate("insert into charts values('n', 150713544, 141832, 9753, 159123, '���� ���')");
            stmt.executeUpdate("insert into charts values('o', 150921123, 135562, 3945, 172135, '���� ��')");
            stmt.executeUpdate("insert into charts values('p', 160404987, 091103, 4831, 171532, '���� ���')");
            stmt.executeUpdate("insert into charts values('q', 160625112, 091282, 5634, 134512, '���� �Ϸ�')");
            stmt.executeUpdate("insert into charts values('r', 160911013, 115533, 6648, 148612, '���� �Ϸ�')");
            stmt.executeUpdate("insert into charts values('s', 161112351, 120312, 7013, 201232, '���� ���')");
            stmt.executeUpdate("insert into charts values('t', 161210331, 141832, 8645, 192312, '���� �Ϸ�')");
            
            txtResult.setText("init completed");
            
         } else if (e.getSource() == btnInput) {
        	 inputDialog.setVisible(true);      
         } else if (e.getSource() == btnSearch1) {
        	 searchDialog.setVisible(true);
        	 
         } else if (e.getSource() == btnSearch2) {
        	 
        	 // jumin�� ���� 3�鸸 �̻��� �Ѵ� �������� �ش��ϴ� ȯ���� �̸��� ��ȣ���� �̸�
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
        	 
        	 // jumin�� ���� 150�� ���� ���� �������� �ش��ϴ� ȯ���� �̸�, ��ȣ���� �̸�, �ǻ��� �̸�
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
         System.out.println("���� �б� ���� :" + e2);
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
    		System.out.println("���α׷� ���� ����!");    		
    	    System.exit(0);
    	  }
    	});
   }
}

