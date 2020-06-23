
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.swing.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


class CompanyInputDialog extends JDialog {
	JLabel label1 = new JLabel("id");
	JLabel label2 = new JLabel("name");
	JLabel label3 = new JLabel("address");
	JLabel label4 = new JLabel("phone");
	JLabel label5 = new JLabel("manager_name");
	JLabel label6 = new JLabel("manager_mail");
	JTextField id = new JTextField(20);
	JTextField name = new JTextField(20);
	JTextField address = new JTextField(20);
	JTextField phone = new JTextField(20);
	JTextField manager_name = new JTextField(20);
	JTextField manager_mail = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;

	public CompanyInputDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new GridLayout(7,2));
		add(label1); add(id);
		add(label2); add(name);
		add(label3); add(address);
		add(label4); add(phone);
		add(label5); add(manager_name);
		add(label6); add(manager_mail);
		add(okButton);
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	 				String query = "insert into company values("
	 				        + id.getText() + "," 
	 				        + "'" + name.getText() + "'" + "," 
	 				        + "'" + address.getText() + "'" + "," 
	 					    + "'" + phone.getText() + "'" + "," 
	 					    + "'" + manager_name.getText() + "'" + ","
	 					    + "'" + manager_mail.getText() + "'"
	 					    + ")";
	 				 System.out.println(query);
	 				 stmt.executeUpdate(query); 
	 				ta.setText("Input is Completed");
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

class CarInputDialog extends JDialog {
	JLabel label1 = new JLabel("id");
	JLabel label2 = new JLabel("company_id");
	JLabel label3 = new JLabel("name");
	JLabel label4 = new JLabel("car_number");
	JLabel label5 = new JLabel("passenger_number");
	JLabel label6 = new JLabel("company");
	JLabel label7 = new JLabel("year");
	JLabel label8 = new JLabel("distance");
	JLabel label9 = new JLabel("price");
	JLabel label10 = new JLabel("registration_date");
	JTextField id = new JTextField(20);
	JTextField company_id = new JTextField(20);
	JTextField name = new JTextField(20);
	JTextField car_number = new JTextField(20);
	JTextField passenger_number = new JTextField(20);
	JTextField company = new JTextField(20);
	JTextField year = new JTextField(20);
	JTextField distance = new JTextField(20);
	JTextField price = new JTextField(20);
	JTextField registration_date = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;

	public CarInputDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new GridLayout(11,2));
		add(label1); add(id);
		add(label2); add(company_id);
		add(label3); add(name);
		add(label4); add(car_number);
		add(label5); add(passenger_number);
		add(label6); add(company);
		add(label7); add(year);
		add(label8); add(distance);
		add(label9); add(price);
		add(label10); add(registration_date);
		add(okButton);
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	 				String query = "insert into car values("
	 				        + id.getText() + "," 
	 				        + company_id.getText() + "," 
	 				        + "'" + name.getText() + "'" + "," 
	 				        + car_number.getText() + "," 
	 				        + passenger_number.getText() + "," 
	 				        + "'" + company.getText() + "'" + ","
	 				        + year.getText() + "," 
	 				        + distance.getText() + "," 
	 				        + price.getText() + "," 
	 					    + "'" + registration_date.getText() + "'"
	 					    + ")";
	 				 System.out.println(query);
	 				 stmt.executeUpdate(query); 
	 				ta.setText("Input is Completed");
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

class CustomerInputDialog extends JDialog {
	JLabel label1 = new JLabel("id");
	JLabel label2 = new JLabel("name");
	JLabel label3 = new JLabel("address");
	JLabel label4 = new JLabel("phone");
	JLabel label5 = new JLabel("mail");
	JTextField id = new JTextField(20);
	JTextField name = new JTextField(20);
	JTextField address = new JTextField(20);
	JTextField phone = new JTextField(20);
	JTextField mail = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;

	public CustomerInputDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new GridLayout(6,2));
		add(label1); add(id);
		add(label2); add(name);
		add(label3); add(address);
		add(label4); add(phone);
		add(label5); add(mail);
		add(okButton);
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	 				String query = "insert into customer values("
	 				        + id.getText() + "," 
	 				        + "'" + name.getText() + "'" + "," 
	 				        + "'" + address.getText() + "'" + "," 
	 				        + "'" + phone.getText() + "'" + "," 
	 				        + "'" + mail.getText() + "'"
	 					    + ")";
	 				 System.out.println(query);
	 				 stmt.executeUpdate(query); 
	 				ta.setText("Input is Completed");
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

class WorkshopInputDialog extends JDialog {
	JLabel label1 = new JLabel("id");
	JLabel label2 = new JLabel("name");
	JLabel label3 = new JLabel("address");
	JLabel label4 = new JLabel("phone");
	JLabel label5 = new JLabel("manager_name");
	JLabel label6 = new JLabel("manager_mail");
	JTextField id = new JTextField(20);
	JTextField name = new JTextField(20);
	JTextField address = new JTextField(20);
	JTextField phone = new JTextField(20);
	JTextField manager_name = new JTextField(20);
	JTextField manager_mail = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;

	public WorkshopInputDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new GridLayout(7,2));
		add(label1); add(id);
		add(label2); add(name);
		add(label3); add(address);
		add(label4); add(phone);
		add(label5); add(manager_name);
		add(label6); add(manager_mail);
		add(okButton);
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	 				String query = "insert into workshop values("
	 				        + id.getText() + "," 
	 				        + "'" + name.getText() + "'" + "," 
	 				        + "'" + address.getText() + "'" + "," 
	 				        + "'" + phone.getText() + "'" + "," 
	 				        + "'" + manager_name.getText() + "'" + "," 
	 				        + "'" + manager_mail.getText() + "'" 
	 					    + ")";
	 				 System.out.println(query);
	 				 stmt.executeUpdate(query); 
	 				ta.setText("Input is Completed");
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



// select, update, delete ���� �Ѿ id -> ���� id�̹Ƿ� ���� �ȵ�
// cascade ����
class DeleteDialog extends JDialog {
	JLabel label1 = new JLabel("id");
	JTextField id = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;
	String query;

	public DeleteDialog(JFrame frame, String title, JTextArea ta, String table) {
		super(frame, title);
		setLayout(new GridLayout(2,2));
		add(label1); add(id);
		add(okButton);
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	 				query = "delete from " + table + " where id = " + id.getText();
	 				System.out.println(query);
	 				stmt.executeUpdate(query); 
	 				ta.setText("Delete is Completed");
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



// ����θ� ���� �ȵ� (�� �׸� update)
class CompanyUpdateDialog extends JDialog {
	JLabel label1 = new JLabel("id");
	JLabel label2 = new JLabel("name");
	JLabel label3 = new JLabel("address");
	JLabel label4 = new JLabel("phone");
	JLabel label5 = new JLabel("manager_name");
	JLabel label6 = new JLabel("manager_mail");
	JTextField id = new JTextField(20);
	JTextField name = new JTextField(20);
	JTextField address = new JTextField(20);
	JTextField phone = new JTextField(20);
	JTextField manager_name = new JTextField(20);
	JTextField manager_mail = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;
	String query;

	public CompanyUpdateDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new GridLayout(7,2));
		add(label1); add(id);
		add(label2); add(name);
		add(label3); add(address);
		add(label4); add(phone);
		add(label5); add(manager_name);
		add(label6); add(manager_mail);
		add(okButton);
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	        		query = "";
	        		if(!name.getText().equals("")) {
		 				query = "update company set name=" + "'" + name.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}
	        		if(!address.getText().equals("")) {
		 				query = "update company set address=" + "'" + address.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}
	        		if(!phone.getText().equals("")) {
		 				query = "update company set phone=" + "'" + phone.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}
	        		if(!manager_name.getText().equals("")) {
		 				query = "update company set manager_name=" + "'" + manager_name.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}
	        		if(!manager_mail.getText().equals("")) {
		 				query = "update company set manager_mail=" + "'" + manager_mail.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}	
	 				ta.setText("Update is Completed");
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


class CarUpdateDialog extends JDialog {
	JLabel label1 = new JLabel("id");
	JLabel label2 = new JLabel("company_id");
	JLabel label3 = new JLabel("name");
	JLabel label4 = new JLabel("car_number");
	JLabel label5 = new JLabel("passenger_number");
	JLabel label6 = new JLabel("company");
	JLabel label7 = new JLabel("year");
	JLabel label8 = new JLabel("distance");
	JLabel label9 = new JLabel("price");
	JLabel label10 = new JLabel("registration_date");
	JTextField id = new JTextField(20);
	JTextField company_id = new JTextField(20);
	JTextField name = new JTextField(20);
	JTextField car_number = new JTextField(20);
	JTextField passenger_number = new JTextField(20);
	JTextField company = new JTextField(20);
	JTextField year = new JTextField(20);
	JTextField distance = new JTextField(20);
	JTextField price = new JTextField(20);
	JTextField registration_date = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;
	String query;

	public CarUpdateDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new GridLayout(11,2));
		add(label1); add(id);
		add(label2); add(company_id);
		add(label3); add(name);
		add(label4); add(car_number);
		add(label5); add(passenger_number);
		add(label6); add(company);
		add(label7); add(year);
		add(label8); add(distance);
		add(label9); add(price);
		add(label10); add(registration_date);
		add(okButton);
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	        		query = "";
	        		if(!company_id.getText().equals("")) {
		 				query = "update car set company_id=" + "'" + company_id.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}
	        		if(!name.getText().equals("")) {
		 				query = "update car set name=" + "'" + name.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}
	        		if(!car_number.getText().equals("")) {
		 				query = "update car set car_number=" + "'" + car_number.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}
	        		if(!passenger_number.getText().equals("")) {
		 				query = "update car set passenger_number=" + "'" + passenger_number.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}
	        		if(!company.getText().equals("")) {
		 				query = "update car set company=" + "'" + company.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}
	        		if(!year.getText().equals("")) {
		 				query = "update car set year=" + "'" + year.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}
	        		if(!distance.getText().equals("")) {
		 				query = "update car set distance=" + "'" + distance.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}
	        		if(!price.getText().equals("")) {
		 				query = "update car set price=" + "'" + price.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}
	        		if(!registration_date.getText().equals("")) {
		 				query = "update car set registration_date=" + "'" + registration_date.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}
	        		ta.setText("Update is Completed");
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

class CustomerUpdateDialog extends JDialog {
	JLabel label1 = new JLabel("id");
	JLabel label2 = new JLabel("name");
	JLabel label3 = new JLabel("address");
	JLabel label4 = new JLabel("phone");
	JLabel label5 = new JLabel("mail");
	JTextField id = new JTextField(20);
	JTextField name = new JTextField(20);
	JTextField address = new JTextField(20);
	JTextField phone = new JTextField(20);
	JTextField mail = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;
	String query;
	
	public CustomerUpdateDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new GridLayout(6,2));
		add(label1); add(id);
		add(label2); add(name);
		add(label3); add(address);
		add(label4); add(phone);
		add(label5); add(mail);
		add(okButton);
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	        		query = "";
	        		if(!name.getText().equals("")) {
		 				query = "update customer set name=" + "'" + name.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}	
	        		if(!address.getText().equals("")) {
		 				query = "update customer set address=" + "'" + address.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}	
	        		if(!phone.getText().equals("")) {
		 				query = "update customer set phone=" + "'" + phone.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}	
	        		if(!mail.getText().equals("")) {
		 				query = "update customer set mail=" + "'" + mail.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}	
	 				ta.setText("Input is Completed");
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

class WorkshopUpdateDialog extends JDialog {
	JLabel label1 = new JLabel("id");
	JLabel label2 = new JLabel("name");
	JLabel label3 = new JLabel("address");
	JLabel label4 = new JLabel("phone");
	JLabel label5 = new JLabel("manager_name");
	JLabel label6 = new JLabel("manager_mail");
	JTextField id = new JTextField(20);
	JTextField name = new JTextField(20);
	JTextField address = new JTextField(20);
	JTextField phone = new JTextField(20);
	JTextField manager_name = new JTextField(20);
	JTextField manager_mail = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;
	String query;

	public WorkshopUpdateDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new GridLayout(7,2));
		add(label1); add(id);
		add(label2); add(name);
		add(label3); add(address);
		add(label4); add(phone);
		add(label5); add(manager_name);
		add(label6); add(manager_mail);
		add(okButton);
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	        		query = "";
	        		if(!name.getText().equals("")) {
		 				query = "update workshop set name=" + "'" + name.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}	
	        		if(!address.getText().equals("")) {
		 				query = "update workshop set address=" + "'" + address.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}	
	        		if(!phone.getText().equals("")) {
		 				query = "update workshop set phone=" + "'" + phone.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}	
	        		if(!manager_name.getText().equals("")) {
		 				query = "update workshop set manager_name=" + "'" + manager_name.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}	
	        		if(!manager_mail.getText().equals("")) {
		 				query = "update workshop set manager_mail=" + "'" + manager_mail.getText() + "'" + " where id=" + id.getText();
		 				System.out.println(query);
		 				stmt.executeUpdate(query); 
	        		}	
	 				ta.setText("Input is Completed");
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




class CarSearchDialog extends JDialog {
	JLabel label1 = new JLabel("name");
	JLabel label2 = new JLabel("passenger_number (2 ~ 6)");
	JLabel label3 = new JLabel("price (50000 ~ 500000)");
	JLabel label4 = new JLabel("�˻� ����");
	JLabel label5 = new JLabel("~");
	JLabel label6 = new JLabel("~");
	JTextField name = new JTextField(20);
	JTextField passenger_number_min = new JTextField(20);
	JTextField passenger_number_max = new JTextField(20);
	JTextField price_min = new JTextField(20);
	JTextField price_max = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;
	String name_str, passenger_number_min_str, passenger_number_max_str, 
			price_min_str, price_max_str;
	final int PASSENGER_NUMBER_MIN = 2;
	final int PASSENGER_NUMBER_MAX = 6;
	final int PRICE_MIN = 50000;
	final int PRICE_MAX = 500000;

	public CarSearchDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		label5.setHorizontalAlignment(JLabel.CENTER);
		label6.setHorizontalAlignment(JLabel.CENTER);
		setLayout(new GridLayout(5,4));
		add(label4); add(new JLabel("(�� ���� ����)")); add(new JLabel("")); add(new JLabel(""));
		add(label1); add(name); add(new JLabel("")); add(new JLabel(""));
		add(label2); add(passenger_number_min); add(label5); add(passenger_number_max);
		add(label3); add(price_min); add(label6); add(price_max);
		add(okButton); add(new JLabel("")); add(new JLabel("")); add(new JLabel(""));
		setBounds(0, 0, 700, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {				
	 				 ResultSet rs;
	 				 
	 				 // ����ִ� ���� ��ü �˻�
	 				 if(name.getText().equals("")){
	 					name_str = "name";
	 				 } else {
	 					name_str = "'" + name.getText() + "'";
	 				 }
	 				 // ����ִ� ���� ����(�ּ� or �ִ�)
	 				 if(passenger_number_min.getText().equals("")){
	 					passenger_number_min_str = "'" + Integer.toString(PASSENGER_NUMBER_MIN) + "'";
	 				 } else {
	 					passenger_number_min_str = "'" + passenger_number_min.getText() + "'";
	 				 }
	 				 if(passenger_number_max.getText().equals("")){
	 					passenger_number_max_str = "'" + Integer.toString(PASSENGER_NUMBER_MAX) + "'";
	 				 } else {
	 					passenger_number_max_str = "'" + passenger_number_max.getText() + "'";
	 				 }
	 				 
	 				 if(price_min.getText().equals("")){
	 					price_min_str = "'" + Integer.toString(PRICE_MIN) + "'";
	 				 } else {
	 					price_min_str = "'" + price_min.getText() + "'";
	 				 }
	 				 if(price_max.getText().equals("")){
	 					price_max_str = "'" + Integer.toString(PRICE_MAX) + "'";
	 				 } else {
	 					price_max_str = "'" + price_max.getText() + "'";
	 				 }
	 				 
	 				 
	 				 String query = "select * from car where name=" + name_str
	 						+ " and passenger_number between " + passenger_number_min_str + " and " + passenger_number_max_str
	 				 		+ " and price between " + price_min_str + " and " + price_max_str;
	 	             ta.setText("");
	 	             ta.setText("id             company_id                    name         car_number"
	 	             		+ "  passenger_number          company                year"
	 	             		+ "            distance                price                registration_date\n");
	 	             rs = stmt.executeQuery(query);
	 	             while (rs.next()) {
	 	                String str = rs.getInt(1) + "\t" + rs.getInt(2) + "\t" + rs.getString(3) 
	 	                			+ "\t" + rs.getInt(4) + "\t" + rs.getInt(5) + "\t" + rs.getString(6)
	 	                			+ "\t" + rs.getString(7) + "\t" + rs.getInt(8) + "\t" + rs.getInt(9)
	 	                			+ "\t" + rs.getString(10)
	 	                			+ "\n";
	 	                ta.append(str);
	 	             }
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


// ������̹Ƿ� id�� auto increment�� �����
class CarRentalDialog extends JDialog {
	JLabel label1 = new JLabel("car_id");
	JLabel label2 = new JLabel("customer_id");
	JLabel label3 = new JLabel("period (2 ~ 6)");
	JLabel label4 = new JLabel("other_billing_fee_info \n (�Ͻú�, 3����, 6����)");

	JTextField car_id = new JTextField(20);
	JTextField customer_id = new JTextField(20);
	JTextField period = new JTextField(20);
	JTextField other_billing_fee_info = new JTextField(20);

	String id;  // max(id)
	String company_id;  // car ���̺��� �˻�
	String start_date;  // ���� ��¥
	String fee;  // car ���̺��� �˻�
	String payment_deadline;  // ���� ��¥ + 1�� (Date����)
	String other_billing_history = "-";  // �׳� -�� �ʱ�ȭ
	
	JButton okButton = new JButton("�Է�");
	Statement stmt;

	private String addDate(String dt, int y, int m, int d) throws Exception 
	{ 
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd"); 
		Calendar cal = Calendar.getInstance(); 
		Date date = format.parse(dt); 
		cal.setTime(date); 
		cal.add(Calendar.YEAR, y); //�� ���ϱ� 
		cal.add(Calendar.MONTH, m); //�� ���ϱ� 
		cal.add(Calendar.DATE, d); //�� ���ϱ� 
		return format.format(cal.getTime());
	}
	
	public CarRentalDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new GridLayout(5,2));
		add(label1); add(car_id);
		add(label2); add(customer_id);
		add(label3); add(period);
		add(label4); add(other_billing_fee_info);
		add(okButton);
		setBounds(0, 0, 600, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	        		 String query = "";
	        		 ResultSet rs;
	        		 
	        		 query = "select max(id) from rental";
	        		 rs = stmt.executeQuery(query); 
	        		 if(rs.next())
	        			 id = Integer.toString(rs.getInt(1) + 1);
	        		 
	        		 rs.close();
	        		 query = "select company_id from car where id=" + car_id.getText();
	        		 rs = stmt.executeQuery(query); 
	        		 if(rs.next())
	        			 company_id = Integer.toString(rs.getInt(1));
	        		 
	        		 start_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	        		 
	        		 rs.close();
	        		 query = "select price from car where id=" + car_id.getText();
	        		 rs = stmt.executeQuery(query); 
	        		 if(rs.next())
	        			 fee = Integer.toString(rs.getInt(1));
	        		 
	        		 try {
						payment_deadline = addDate(start_date, 0, 0, 1);
	        		 } catch (Exception e1) {
	        			e1.printStackTrace();
	        		 }
	        		 
	        		 System.out.println(id + " " + company_id + " " + start_date + " " + fee + " " + payment_deadline);
	        		 
	        		 query = "insert into rental values("
		        		 		+ id + "," 
		        				+ car_id.getText() + ","
		        				+ customer_id.getText() + ","
		        				+ company_id + ",'"
		        				+ start_date + "',"
		        				+ period.getText() + ","
		        				+ fee + ",'"
		        				+ payment_deadline + "','"
		        				+ other_billing_history + "','"
		        				+ other_billing_fee_info.getText() + "'"
		        				+ ")";
	        		 System.out.println(query);
	        		 stmt.executeUpdate(query); 
	 				 ta.setText("Your Rental ID is " + id);
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


// ��ȯ(����)
class CarInspectionDialog extends JDialog {
	JLabel label1 = new JLabel("rental_id (�뿩 ��ȣ)");
	JLabel label2 = new JLabel("front_desc");
	JLabel label3 = new JLabel("left_desc");
	JLabel label4 = new JLabel("right_desc");
	JLabel label5 = new JLabel("back_desc");
	JLabel label6 = new JLabel("repair_required (T / F)");
	JTextField rental_id = new JTextField(20);
	JTextField front_desc = new JTextField(20);
	JTextField left_desc = new JTextField(20);
	JTextField right_desc = new JTextField(20);
	JTextField back_desc = new JTextField(20);
	JTextField repair_required = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;
	String car_id;
	String repair_required_str;

	public CarInspectionDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new GridLayout(7,2));
		add(label1); add(rental_id);
		add(label2); add(front_desc);
		add(label3); add(left_desc);
		add(label4); add(right_desc);
		add(label5); add(back_desc);
		add(label6); add(repair_required);
		add(okButton);
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	        		 String query = "";
	        		 ResultSet rs;
	        		 car_id = null;
	        		 
	        		 query = "select car_id from rental where id=" + rental_id.getText();
	        		 rs = stmt.executeQuery(query); 
	        		 if(rs.next())
	        			 car_id = Integer.toString(rs.getInt(1));	 
	        		 rs.close();
	        		 
	        		 if(repair_required.getText().equals("T")) {
	        			 repair_required_str = "1";
	        		 } else {
	        			 repair_required_str = "0";
	        		 }
	        		 
	        		 query = "insert into inspection values("
	        				 + rental_id.getText() + ","
	        				 + car_id + ",'"
	        				 + front_desc.getText() + "','"
	        				 + left_desc.getText() + "','"
	        				 + right_desc.getText() + "','"
	        				 + back_desc.getText() + "',"
	        				 + repair_required_str + ")";

	        		 System.out.println(query);
	        		 stmt.executeUpdate(query); 
	        		 ta.setText("Your Inspection ID is " + rental_id.getText());
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


class CarMaintenanceInputDialog extends JDialog {
	JLabel label1 = new JLabel("inspection_id (���� ��ȣ)");
	JLabel label2 = new JLabel("workshop_id");
	JLabel label3 = new JLabel("history");
	JLabel label4 = new JLabel("date");
	JLabel label5 = new JLabel("price");
	JLabel label6 = new JLabel("payment_deadline");
	JTextField rental_id = new JTextField(20);
	JTextField workshop_id = new JTextField(20);
	JTextField history = new JTextField(20);
	JTextField date = new JTextField(20);
	JTextField price = new JTextField(20);
	JTextField payment_deadline = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;

	String id;
	String car_id;
	String company_id;
	String customer_id;
	int repair_required;
	
	public CarMaintenanceInputDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new GridLayout(7,2));
		add(label1); add(rental_id);
		add(label2); add(workshop_id);
		add(label3); add(history);
		add(label4); add(date);
		add(label5); add(price);
		add(label6); add(payment_deadline);
		add(okButton);
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	        		 String query = "";
	        		 ResultSet rs;
	        		 
	        		 car_id = null;
	        		 
	        		 query = "select repair_required from inspection where id=" + rental_id.getText();
	        		 rs = stmt.executeQuery(query); 
	        		 if(rs.next())
	        			 repair_required = rs.getInt(1);
	        		 rs.close();
	        		 
	        		 if(repair_required == 0) {
	        			 throw new Exception("No Repair Required for this Inspection ID");
	        		 }
	        		 
	        		 
	        		 query = "select max(id) from maintenance";
	        		 rs = stmt.executeQuery(query); 
	        		 if(rs.next())
	        			 id = Integer.toString(rs.getInt(1) + 1);
	        		 rs.close();
	        		 
	        		 query = "select car_id from inspection where id=" + rental_id.getText();
	        		 rs = stmt.executeQuery(query); 
	        		 if(rs.next())
	        			 car_id = Integer.toString(rs.getInt(1));
	        		 rs.close();
	        		 
	        		 query = "select company_id from rental where id=" + rental_id.getText();
	        		 rs = stmt.executeQuery(query); 
	        		 if(rs.next())
	        			 company_id = Integer.toString(rs.getInt(1));
	        		 rs.close();
	        		 
	        		 query = "select customer_id from rental where id=" + rental_id.getText();
	        		 rs = stmt.executeQuery(query); 
	        		 if(rs.next())
	        			 customer_id = Integer.toString(rs.getInt(1));
	        		 rs.close();
        		 
	        		 query = "insert into maintenance values("
	        				 + id + ","
	        				 + car_id + ","
	        				 + workshop_id.getText() + ","
	        				 + company_id + ","
	        				 + customer_id + ",'"
	        				 + history.getText() + "','"
	        				 + date.getText() + "',"
	        				 + price.getText() + ",'"
	        				 + payment_deadline.getText() + "',"
	        				 + "'-')";
	        		 System.out.println(query);
	        		 stmt.executeUpdate(query); 
	        		 
	        		 query = "update inspection set repair_required=" + "0" + " where id=" + rental_id.getText();
	        		 stmt.executeUpdate(query); 
	        		 
	 				 ta.setText("Maintenance ID : " + id + " is inserted");
	        	 }
	        	 catch (SQLIntegrityConstraintViolationException cve) {
	        		 // display error message for constraint violation
	        		 ta.setText("Error Occured   " + cve.getMessage());
	        	 } 
	        	 catch (SQLException e1) {
	        		 ta.setText("Error Occured   " + e1.getMessage());
	        	 }
	        	 catch (Exception exception) {
	        		 ta.setText(exception.getMessage());
	        	 }
	        	 setVisible(false);
			}
		});
	}
}





class CarMaintenanceUpdateDialog extends JDialog {
	JLabel label1 = new JLabel("maintenance_id (���� ��ȣ)");
	JLabel label2 = new JLabel("workshop_id");
	JLabel label3 = new JLabel("history");
	JLabel label4 = new JLabel("date");
	JLabel label5 = new JLabel("price");
	JLabel label6 = new JLabel("payment_deadline");
	JTextField id = new JTextField(20);
	JTextField workshop_id = new JTextField(20);
	JTextField history = new JTextField(20);
	JTextField date = new JTextField(20);
	JTextField price = new JTextField(20);
	JTextField payment_deadline = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;
	String query;
	
	public CarMaintenanceUpdateDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new GridLayout(7,2));
		add(label1); add(id);
		add(label2); add(workshop_id);
		add(label3); add(history);
		add(label4); add(date);
		add(label5); add(price);
		add(label6); add(payment_deadline);
		add(okButton);
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	        		 query = "";
	 
	        		 if(!workshop_id.getText().equals("")) {
			 				query = "update maintenance set workshop_id=" + workshop_id.getText() + " where id=" + id.getText();
			 				System.out.println(query);
			 				stmt.executeUpdate(query); 
	        		 }
	        		 if(!history.getText().equals("")) {
			 				query = "update maintenance set history=" + "'" + history.getText() + "'" + " where id=" + id.getText();
			 				System.out.println(query);
			 				stmt.executeUpdate(query); 
	        		 }
	        		 if(!date.getText().equals("")) {
			 				query = "update maintenance set date=" + "'" + date.getText() + "'" + " where id=" + id.getText();
			 				System.out.println(query);
			 				stmt.executeUpdate(query); 
	        		 }
	        		 if(!price.getText().equals("")) {
			 				query = "update maintenance set price=" + price.getText() + " where id=" + id.getText();
			 				System.out.println(query);
			 				stmt.executeUpdate(query); 
	        		 }
	        		 if(!payment_deadline.getText().equals("")) {
			 				query = "update maintenance set payment_deadline=" + "'" + payment_deadline.getText() + "'" + " where id=" + id.getText();
			 				System.out.println(query);
			 				stmt.executeUpdate(query); 
	        		 }
	        		 
	 				 ta.setText("Maintenance is Updated");
	        	 }
	        	 catch (SQLIntegrityConstraintViolationException cve) {
	        		 // display error message for constraint violation
	        		 ta.setText("Error Occured   " + cve.getMessage());
	        	 } 
	        	 catch (SQLException e1) {
	        		 ta.setText("Error Occured   " + e1.getMessage());
	        	 }
	        	 catch (Exception exception) {
	        		 ta.setText(exception.getMessage());
	        	 }
	        	 setVisible(false);
			}
		});
	}
}



class SearchDialog extends JDialog {
	JLabel label1 = new JLabel("num");  // �˻� ��ȣ
	JTextField num = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;

	public SearchDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new GridLayout(2,2));
		add(label1); add(num);
		add(okButton);
		setBounds(0, 0, 300, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {		
	        		 ResultSet rs = null;
        			 String query = "";
        			 ta.setText("");
	        		 // ��������Ÿ��� 8�� �̻��̸鼭, ���� ������ �ѹ��̶� 10���� �̻��� ���Դ� ������ �̸�
	        		 if(num.getText().equals("1")) {
	        			 query = "select name from car\r\n" + 
	        			 		"	where distance >= 80000\r\n" + 
	        			 		"   and id in (select car_id from maintenance where price >= 100000)";
	        		 } 
	        		 // 5�ν��̻��� ������ 1���̻� �뿩�� ���� �̸�
	        		 else if(num.getText().equals("2")) {
	        			 query = "select name from customer\r\n" + 
	        			 		"	where id in (select customer_id from rental\r\n" + 
	        			 		"	where car_id in (select id from car where passenger_number>=5)\r\n" + 
	        			 		"	group by customer_id having count(*) >= 1)";
	        		 }
	        		 // ��������� ���� ���(���� ���̺�) �� ������ �ʿ���� ������ �̸�
	        		 else if(num.getText().equals("3")) {
	        			 query = "select car.name from car,inspection where car.id=inspection.car_id and inspection.repair_required=0";
	        		 }
	        		 // ����,��� ���� ȸ�� �� �뿩����� 15�����̻��� ������ �Ѵ�� ������ ȸ���� �̸�
	        		 else if(num.getText().equals("4")){
	        			 query = "select name from company\r\n" + 
	        			 		"	where (address=\"����\" or address=\"���\")\r\n" + 
	        			 		"    and id in (select company_id from car where price >= 150000)";
	        		 }
	        		 rs = stmt.executeQuery(query);
	        		 while (rs.next()) {
	 	 	                String str = rs.getString(1) + "\n";
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










public class CampingCar extends JFrame implements ActionListener {
   JButton btnReset, btnCompanyInput, btnCarInput, btnCustomerInput, btnWorkshopInput,
           btnCompanyDelete, btnCarDelete, btnCustomerDelete, btnWorkshopDelete,
           btnCompanyUpdate, btnCarUpdate, btnCustomerUpdate, btnWorkshopUpdate,   
           btnCarSearch,btnCarRental,btnCarInspection, 
           btnCarMaintenanceInput, btnCarMaintenanceDelete, btnCarMaintenanceUpdate,
           btnSearchDialog
           ;
   JTextArea txtResult;
   JPanel pn1, pn2;
   CompanyInputDialog companyInputDialog;
   CarInputDialog carInputDialog;
   CustomerInputDialog customerInputDialog;
   WorkshopInputDialog workshopInputDialog;
   DeleteDialog companyDeleteDialog;
   DeleteDialog carDeleteDialog;
   DeleteDialog customerDeleteDialog;
   DeleteDialog workshopDeleteDialog;
   CompanyUpdateDialog companyUpdateDialog;
   CarUpdateDialog carUpdateDialog;
   CustomerUpdateDialog customerUpdateDialog;
   WorkshopUpdateDialog workshopUpdateDialog;
   
   CarSearchDialog carSearchDialog;
   CarRentalDialog carRentalDialog;
   CarInspectionDialog carInspectionDialog;
   CarMaintenanceInputDialog carMaintenanceInputDialog;
   DeleteDialog carMaintenanceDeleteDialog;
   CarMaintenanceUpdateDialog carMaintenanceUpdateDialog;
   SearchDialog searchDialog;

   static Connection con;
   Statement stmt;
   ResultSet rs;
   String Driver = "";
   String url = "jdbc:mysql://localhost:3306/madang?&serverTimezone=Asia/Seoul&useSSL=false"; 
   String userid = "madang";
   String pwd = "madang";
   
   public CampingCar() {
      super("Swing Database");
      layInit();
      conDB();
      setTitle("13011051/������");
      setVisible(true);
      companyInputDialog = new CompanyInputDialog(this, "CompanyInputDialog", txtResult);
      companyInputDialog.setVisible(false);
      carInputDialog = new CarInputDialog(this, "CarInputDialog", txtResult);
      carInputDialog.setVisible(false);
      customerInputDialog = new CustomerInputDialog(this, "CustomerInputDialog", txtResult);
      customerInputDialog.setVisible(false);
      workshopInputDialog = new WorkshopInputDialog(this, "WorkshopInputDialog", txtResult);
      workshopInputDialog.setVisible(false);
      companyDeleteDialog = new DeleteDialog(this, "CompanyDeleteDialog", txtResult, "company");
      companyDeleteDialog.setVisible(false);
      carDeleteDialog = new DeleteDialog(this, "CarDeleteDialog", txtResult, "car");
      carDeleteDialog.setVisible(false);
      customerDeleteDialog = new DeleteDialog(this, "CustomerDeleteDialog", txtResult, "customer");
      customerDeleteDialog.setVisible(false);
      workshopDeleteDialog = new DeleteDialog(this, "WorkshopDeleteDialog", txtResult, "workshop");
      workshopDeleteDialog.setVisible(false);
      companyUpdateDialog = new CompanyUpdateDialog(this, "CompanyUpdateDialog", txtResult);
      companyUpdateDialog.setVisible(false);
      carUpdateDialog = new CarUpdateDialog(this, "CarUpdateDialog", txtResult);
      carUpdateDialog.setVisible(false);
      customerUpdateDialog = new CustomerUpdateDialog(this, "CustomerUpdateDialog", txtResult);
      customerUpdateDialog.setVisible(false);
      workshopUpdateDialog = new WorkshopUpdateDialog(this, "WorkshopUpdateDialog", txtResult);
      workshopUpdateDialog.setVisible(false);
      carSearchDialog = new CarSearchDialog(this, "CarSearchDialog", txtResult);
      carSearchDialog.setVisible(false);
      carRentalDialog = new CarRentalDialog(this, "CarRentalDialog", txtResult);
      carRentalDialog.setVisible(false);
      carInspectionDialog = new CarInspectionDialog(this, "CarInspectionDialog", txtResult);
      carInspectionDialog.setVisible(false);
      carMaintenanceInputDialog = new CarMaintenanceInputDialog(this, "CarMaintenanceInputDialog", txtResult);
      carMaintenanceInputDialog.setVisible(false);
      carMaintenanceDeleteDialog = new DeleteDialog(this, "CarMaintenanceDeleteDialog", txtResult, "maintenance");
      carMaintenanceDeleteDialog.setVisible(false);
      carMaintenanceUpdateDialog = new CarMaintenanceUpdateDialog(this, "CarMaintenanceUpdateDialog", txtResult);
      carMaintenanceUpdateDialog.setVisible(false);
      searchDialog = new SearchDialog(this, "SearchDialog", txtResult);
      searchDialog.setVisible(false);
      
      setBounds(100, 80, 800, 600); //������ġ,������ġ,���α���,���α���
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public void layInit() {	   
      btnReset = new JButton("�ʱ�ȭ"); 
      btnCompanyInput = new JButton("�뿩ȸ�� �Է�");
      btnCarInput = new JButton("ķ��ī �Է�");
      btnCustomerInput = new JButton("�� �Է�");
      btnWorkshopInput = new JButton("����� �Է�");
      btnCompanyDelete = new JButton("�뿩ȸ�� ����");
      btnCarDelete = new JButton("ķ��ī ����");
      btnCustomerDelete = new JButton("�� ����");
      btnWorkshopDelete = new JButton("����� ����");
      btnCompanyUpdate = new JButton("�뿩ȸ�� ����");
      btnCarUpdate = new JButton("ķ��ī ����");
      btnCustomerUpdate = new JButton("�� ����");
      btnWorkshopUpdate = new JButton("����� ����");
      btnCarSearch = new JButton("ķ��ī �˻�");
      btnCarRental = new JButton("ķ��ī �뿩");
      btnCarInspection = new JButton("ķ��ī ��ȯ");
      btnCarMaintenanceInput = new JButton("ķ��ī ���� �Է�");
      btnCarMaintenanceDelete = new JButton("ķ��ī ���� ����");
      btnCarMaintenanceUpdate = new JButton("ķ��ī ���� ����");
      btnSearchDialog = new JButton("�˻�");
      
      txtResult = new JTextArea();
      pn1 = new JPanel();
      pn1.setLayout(new GridLayout(4,5));
      pn1.add(new JLabel("������ �޴�"));
      pn1.add(btnReset);
      pn1.add(btnCompanyInput);
      pn1.add(btnCarInput);
      pn1.add(btnCustomerInput);
      pn1.add(btnWorkshopInput);
      pn1.add(btnCompanyDelete);
      pn1.add(btnCarDelete);
      pn1.add(btnCustomerDelete);
      pn1.add(btnWorkshopDelete);
      pn1.add(btnCompanyUpdate);
      pn1.add(btnCarUpdate);
      pn1.add(btnCustomerUpdate);
      pn1.add(btnWorkshopUpdate);
      
      pn1.add(btnCarInspection);
      pn1.add(btnCarMaintenanceInput);
      pn1.add(btnCarMaintenanceDelete);
      pn1.add(btnCarMaintenanceUpdate);
      pn1.add(btnSearchDialog);
      
      pn2 = new JPanel();
      pn2.add(new JLabel("����� �޴�"));
      pn2.add(btnCarSearch);
      pn2.add(btnCarRental);
      
      txtResult.setEditable(false);
      JScrollPane scrollPane = new JScrollPane(txtResult);
      add("North", pn1);
      add("South", pn2);
      add("Center", scrollPane);
      btnReset.addActionListener(this);
      btnCompanyInput.addActionListener(this);
      btnCarInput.addActionListener(this);
      btnCustomerInput.addActionListener(this);
      btnWorkshopInput.addActionListener(this);
      btnCompanyDelete.addActionListener(this);
      btnCarDelete.addActionListener(this);
      btnCustomerDelete.addActionListener(this);
      btnWorkshopDelete.addActionListener(this);
      btnCompanyUpdate.addActionListener(this);
      btnCarUpdate.addActionListener(this);
      btnCustomerUpdate.addActionListener(this);
      btnWorkshopUpdate.addActionListener(this);
      
      btnCarSearch.addActionListener(this);
      btnCarRental.addActionListener(this);
      btnCarInspection.addActionListener(this);
      btnCarMaintenanceInput.addActionListener(this);
      btnCarMaintenanceDelete.addActionListener(this);
      btnCarMaintenanceUpdate.addActionListener(this);
      btnSearchDialog.addActionListener(this);
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
         
         if (e.getSource() == btnReset) {
            txtResult.setText("");
            
            stmt.execute("drop table if exists rental"); 
            stmt.execute("drop table if exists inspection"); 
            stmt.execute("drop table if exists maintenance"); 
            stmt.execute("drop table if exists car"); 
            stmt.execute("drop table if exists company");       
            stmt.execute("drop table if exists customer");  
            stmt.execute("drop table if exists workshop"); 
                  
            stmt.execute("CREATE TABLE IF NOT EXISTS `madang`.`company` (\r\n" + 
            		"  `id` INT NOT NULL AUTO_INCREMENT,\r\n" + 
            		"  `name` VARCHAR(45) NULL,\r\n" + 
            		"  `address` VARCHAR(45) NULL,\r\n" + 
            		"  `phone` VARCHAR(45) NULL,\r\n" + 
            		"  `manager_name` VARCHAR(45) NULL,\r\n" + 
            		"  `manager_mail` VARCHAR(45) NULL,\r\n" + 
            		"  PRIMARY KEY (`id`))"); 
            stmt.execute("CREATE TABLE IF NOT EXISTS `madang`.`car` (\r\n" + 
            		"  `id` INT NOT NULL AUTO_INCREMENT,\r\n" + 
            		"  `company_id` INT NOT NULL,\r\n" + 
            		"  `name` VARCHAR(45) NULL,\r\n" + 
            		"  `car_number` INT NULL,\r\n" + 
            		"  `passenger_number` INT NULL,\r\n" + 
            		"  `company` VARCHAR(45) NULL,\r\n" + 
            		"  `year` YEAR(4) NULL,\r\n" + 
            		"  `distance` INT NULL,\r\n" + 
            		"  `price` INT NULL,\r\n" + 
            		"  `registration_date` DATE NULL,\r\n" + 
            		"  PRIMARY KEY (`id`),\r\n" + 
            		"  INDEX `fk_car_company_idx` (`company_id` ASC) VISIBLE,\r\n" + 
            		"  CONSTRAINT `fk_car_company`\r\n" + 
            		"    FOREIGN KEY (`company_id`)\r\n" + 
            		"    REFERENCES `madang`.`company` (`id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE)");
            stmt.execute("CREATE TABLE IF NOT EXISTS `madang`.`customer` (\r\n" + 
            		"  `id` INT NOT NULL,\r\n" + 
            		"  `name` VARCHAR(45) NULL,\r\n" + 
            		"  `address` VARCHAR(45) NULL,\r\n" + 
            		"  `phone` VARCHAR(45) NULL,\r\n" + 
            		"  `mail` VARCHAR(45) NULL,\r\n" + 
            		"  PRIMARY KEY (`id`))");
            stmt.execute("CREATE TABLE IF NOT EXISTS `madang`.`rental` (\r\n" + 
            		"  `id` INT NOT NULL AUTO_INCREMENT,\r\n" + 
            		"  `car_id` INT NOT NULL,\r\n" + 
            		"  `customer_id` INT NOT NULL,\r\n" + 
            		"  `company_id` INT NOT NULL,\r\n" + 
            		"  `start_date` DATE NULL,\r\n" + 
            		"  `period` INT NULL,\r\n" + 
            		"  `fee` INT NULL,\r\n" + 
            		"  `payment_deadline` DATE NULL,\r\n" + 
            		"  `other_billing_history` VARCHAR(45) NULL,\r\n" + 
            		"  `other_billing_fee_info` VARCHAR(45) NULL,\r\n" + 
            		"  PRIMARY KEY (`id`),\r\n" + 
            		"  INDEX `fk_rental_car1_idx` (`car_id` ASC) VISIBLE,\r\n" + 
            		"  INDEX `fk_rental_company1_idx` (`company_id` ASC) VISIBLE,\r\n" + 
            		"  INDEX `fk_rental_customer1_idx` (`customer_id` ASC) VISIBLE,\r\n" + 
            		"  CONSTRAINT `fk_rental_car1`\r\n" + 
            		"    FOREIGN KEY (`car_id`)\r\n" + 
            		"    REFERENCES `madang`.`car` (`id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE,\r\n" + 
            		"  CONSTRAINT `fk_rental_company1`\r\n" + 
            		"    FOREIGN KEY (`company_id`)\r\n" + 
            		"    REFERENCES `madang`.`company` (`id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE,\r\n" + 
            		"  CONSTRAINT `fk_rental_customer1`\r\n" + 
            		"    FOREIGN KEY (`customer_id`)\r\n" + 
            		"    REFERENCES `madang`.`customer` (`id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE)");
            stmt.execute("CREATE TABLE IF NOT EXISTS `madang`.`inspection` (\r\n" + 
            		"  `id` INT NOT NULL,\r\n" + 
            		"  `car_id` INT NOT NULL,\r\n" + 
            		"  `front_desc` VARCHAR(45) NULL,\r\n" + 
            		"  `left_desc` VARCHAR(45) NULL,\r\n" + 
            		"  `right_desc` VARCHAR(45) NULL,\r\n" + 
            		"  `back_desc` VARCHAR(45) NULL,\r\n" + 
            		"  `repair_required` TINYINT NULL,\r\n" + 
            		"  PRIMARY KEY (`id`),\r\n" + 
            		"  INDEX `fk_inspection_car1_idx` (`car_id` ASC) VISIBLE,\r\n" + 
            		"  CONSTRAINT `fk_inspection_car1`\r\n" + 
            		"    FOREIGN KEY (`car_id`)\r\n" + 
            		"    REFERENCES `madang`.`car` (`id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE)");
            stmt.execute("CREATE TABLE IF NOT EXISTS `madang`.`Workshop` (\r\n" + 
            		"  `id` INT NOT NULL AUTO_INCREMENT,\r\n" + 
            		"  `name` VARCHAR(45) NULL,\r\n" + 
            		"  `address` VARCHAR(45) NULL,\r\n" + 
            		"  `phone` VARCHAR(45) NULL,\r\n" + 
            		"  `manager_name` VARCHAR(45) NULL,\r\n" + 
            		"  `manager_mail` VARCHAR(45) NULL,\r\n" + 
            		"  PRIMARY KEY (`id`))");
            stmt.execute("CREATE TABLE IF NOT EXISTS `madang`.`maintenance` (\r\n" + 
            		"  `id` INT NOT NULL AUTO_INCREMENT,\r\n" + 
            		"  `car_id` INT NOT NULL,\r\n" + 
            		"  `Workshop_id` INT NOT NULL,\r\n" + 
            		"  `company_id` INT NOT NULL,\r\n" + 
            		"  `customer_id` INT NOT NULL,\r\n" + 
            		"  `history` VARCHAR(45) NULL,\r\n" + 
            		"  `date` DATE NULL,\r\n" + 
            		"  `price` INT NULL,\r\n" + 
            		"  `payment_deadline` DATE NULL,\r\n" + 
            		"  `other_history_info` VARCHAR(45) NULL,\r\n" + 
            		"  PRIMARY KEY (`id`),\r\n" + 
            		"  INDEX `fk_maintenance_car1_idx` (`car_id` ASC) VISIBLE,\r\n" + 
            		"  INDEX `fk_maintenance_Workshop1_idx` (`Workshop_id` ASC) VISIBLE,\r\n" + 
            		"  INDEX `fk_maintenance_company1_idx` (`company_id` ASC) VISIBLE,\r\n" + 
            		"  INDEX `fk_maintenance_customer1_idx` (`customer_id` ASC) VISIBLE,\r\n" + 
            		"  CONSTRAINT `fk_maintenance_car1`\r\n" + 
            		"    FOREIGN KEY (`car_id`)\r\n" + 
            		"    REFERENCES `madang`.`car` (`id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE,\r\n" + 
            		"  CONSTRAINT `fk_maintenance_Workshop1`\r\n" + 
            		"    FOREIGN KEY (`Workshop_id`)\r\n" + 
            		"    REFERENCES `madang`.`Workshop` (`id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE,\r\n" + 
            		"  CONSTRAINT `fk_maintenance_company1`\r\n" + 
            		"    FOREIGN KEY (`company_id`)\r\n" + 
            		"    REFERENCES `madang`.`company` (`id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE,\r\n" + 
            		"  CONSTRAINT `fk_maintenance_customer1`\r\n" + 
            		"    FOREIGN KEY (`customer_id`)\r\n" + 
            		"    REFERENCES `madang`.`customer` (`id`)\r\n" + 
            		"    ON DELETE CASCADE\r\n" + 
            		"    ON UPDATE CASCADE)");
            System.out.println("schema init completed");
            
            stmt.executeUpdate("insert into company values(1, '��罺Ÿ', '����', '01022350101', '�����', 'kim@gmail.com')"); 
            stmt.executeUpdate("insert into company values(2, '����Ȩ', '�泲', '01051250123', '������', 'seo@naver.com')"); 
            stmt.executeUpdate("insert into company values(3, '��������', '����', '01042128896', '�۹ξ�', 'song@daum.com')"); 
            stmt.executeUpdate("insert into company values(4, '��������', '���', '01032018231', '�輺ȣ', 'kim@naver.com')"); 
            stmt.executeUpdate("insert into company values(5, '������Ʈ', '��õ', '01011028271', '�̹�', 'lee@gmail.com')"); 
            stmt.executeUpdate("insert into company values(6, '����', '����', '01092472846', '�ڳ���', 'park@daum.com')"); 
            stmt.executeUpdate("insert into company values(7, '����', '���', '01088172628', '���μ�', 'sul@naver.com')"); 
            stmt.executeUpdate("insert into company values(8, '��Ÿ���', '����', '01057820931', '��â��', 'ko@naver.com')"); 
            stmt.executeUpdate("insert into company values(9, '�ٿ�', '����', '01069812233', '��ȣ��', 'seong@naver.com')"); 
            stmt.executeUpdate("insert into company values(10, 'Ƽ��Ƽ', '�λ�', '01035321231', '���̼�', 'yoon@gmail.com')");
            stmt.executeUpdate("insert into company values(11, '���ž', '�뱸', '01012341234', '������', 'back@daum.com')"); 
            stmt.executeUpdate("insert into company values(12, '�μ�', '��õ', '01034552312', '������', 'kim@naver.com')"); 
            stmt.executeUpdate("insert into company values(13, '�̻�', '����', '01078224234', '��â��', 'park@naver.com')"); 
            stmt.executeUpdate("insert into company values(14, '����', '���', '01089721923', '�̼���', 'lee@gmail.com')"); 
            stmt.executeUpdate("insert into company values(15, '�˺���', '����', '01089121728', '�����', 'kim@naver.com')");
            
            stmt.executeUpdate("insert into customer values(1, '�����', '���', '01055224212', 'kim@daum.com')"); 
            stmt.executeUpdate("insert into customer values(2, '�ۿ���', '����', '01034552312', 'song@naver.com')"); 
            stmt.executeUpdate("insert into customer values(3, '�����', '����', '01057820931', 'kim@gmail.com')"); 
            stmt.executeUpdate("insert into customer values(4, '�̹ο�', '�泲', '01089121728', 'lee@daum.com')"); 
            stmt.executeUpdate("insert into customer values(5, '�ڹξ�', '���', '01012341234', 'park@naver.com')"); 
            stmt.executeUpdate("insert into customer values(6, '�ֿ���', '��õ', '01088172628', 'joo@gmail.com')"); 
            stmt.executeUpdate("insert into customer values(7, '���α�', '����', '01042128896', 'cho@naver.com')"); 
            stmt.executeUpdate("insert into customer values(8, '��ǿ�', '�泲', '01022350101', 'kim@naver.com')"); 
            stmt.executeUpdate("insert into customer values(9, '������', '���', '01011028271', 'ryou@gmail.com')"); 
            stmt.executeUpdate("insert into customer values(10, '������', '����', '01092472846', 'lee@naver.com')"); 
            stmt.executeUpdate("insert into customer values(11, '�ο�ȭ', '����', '01069812233', 'min@naver.com')"); 
            stmt.executeUpdate("insert into customer values(12, '������', '����', '01078224234', 'gong@naver.com')"); 
            stmt.executeUpdate("insert into customer values(13, '�����', '����', '01032018231', 'gil@daum.com')"); 
            stmt.executeUpdate("insert into customer values(14, '����ȯ', '���', '01042128896', 'yoo@naver.com')"); 
            stmt.executeUpdate("insert into customer values(15, '���ر�', '���', '01051250123', 'lee@naver.com')"); 
            
            stmt.executeUpdate("insert into workshop values(1, '������ġ', '����', '01042128896', '�����', 'kil@gmail.com')"); 
            stmt.executeUpdate("insert into workshop values(2, '�Ƶ�ī', '����', '01069812233', '�ֿ���', 'joo@gmail.com')");
            stmt.executeUpdate("insert into workshop values(3, '��������', '���', '01051250123', '������', 'lee@naver.com')");
            stmt.executeUpdate("insert into workshop values(4, '���۵�ƮĮ��', '��õ', '01078224234', '����ȯ', 'yoo@daum.com')");
            stmt.executeUpdate("insert into workshop values(5, '�ѱ�����', '����', '01078224234', '�ڹξ�', 'park@naver.com')");
            stmt.executeUpdate("insert into workshop values(6, '��â������', '����', '01051250123', '�̻�', 'lee@gmail.com')"); 
            stmt.executeUpdate("insert into workshop values(7, '�������', '��õ', '01022350101', '������', 'gong@daum.com')");
            stmt.executeUpdate("insert into workshop values(8, '����Ƽ��', '����', '01092472846', '��ǿ�', 'kim@gmail.com')");
            stmt.executeUpdate("insert into workshop values(9, '�ο�', '����', '01034552312', '�����', 'kil@naver.com')");
            stmt.executeUpdate("insert into workshop values(10, '����ī��Ÿ', '���', '01051250123', '��ȣ��', 'seong@daum.com')");
            stmt.executeUpdate("insert into workshop values(11, '����ī', '����', '01042128896', '���̼�', 'yoon@naver.com')"); 
            stmt.executeUpdate("insert into workshop values(12, '���ǵ����Ʈ', '��õ', '01034552312', '��ƿ�', 'kim@daum.com')");
            stmt.executeUpdate("insert into workshop values(13, '�׸�', '����', '01011028271', '������', 'lee@daum.com')");
            stmt.executeUpdate("insert into workshop values(14, '�Ǿ�', '�泲', '01022350101', '������', 'seong@naver.com')");
            stmt.executeUpdate("insert into workshop values(15, '����', '����', '01092472846', '�輱��', 'kim@gmail.com')");
            
            //                                           com
            stmt.executeUpdate("insert into car values(1, 1, 'sm5', 1455, 4, '����Ｚ', 2002, 21000, 125000, '2014-02-12')"); 
            stmt.executeUpdate("insert into car values(2, 1, '�ҳ�Ÿ', 2412, 4, '����', 2001, 36000, 91000, '2012-01-23')"); 
            stmt.executeUpdate("insert into car values(3, 2, '���ν���', 3190, 5, '����', 2005, 42000, 375000, '2018-06-30')"); 
            stmt.executeUpdate("insert into car values(4, 3, 'k9', 9242, 4, '���', 2009, 81000, 124000, '2016-08-11')"); 
            stmt.executeUpdate("insert into car values(5, 3, 'sm5', 3355, 4, '����Ｚ', 2002, 57000, 400000, '2015-07-28')"); 
            stmt.executeUpdate("insert into car values(6, 3, '��Ŀ����', 6723, 6, '����ι�', 1996, 96000, 137000, '2013-01-06')"); 
            stmt.executeUpdate("insert into car values(7, 4, '�������ǳ�', 4101, 2, '���', 2011, 46000, 93000, '2019-11-04')"); 
            stmt.executeUpdate("insert into car values(8, 6, 'Ƽ����', 3206, 6, '�����ٰ�', 1999, 58000, 75000, '2015-10-20')"); 
            stmt.executeUpdate("insert into car values(9, 7, '�ڳ�', 1010, 4, '����', 2007, 66000, 150000, '2013-05-16')"); 
            stmt.executeUpdate("insert into car values(10, 8, '��Ÿ����', 2341, 6, '����', 2004, 96000, 140000, '2017-12-14')"); 
            stmt.executeUpdate("insert into car values(11, 9, '���Ʒ�', 4542, 4, '�����ٰ�', 2010, 66000, 247000, '2013-09-02')"); 
            stmt.executeUpdate("insert into car values(12, 9, '��Ÿ����', 8565, 6, '����', 2004, 32000, 204000, '2014-05-03')"); 
            stmt.executeUpdate("insert into car values(13, 10, '����', 4242, 4, '����', 2001, 10300, 170000, '2017-08-07')"); 
            stmt.executeUpdate("insert into car values(14, 11, '���', 5755, 6, '���', 1998, 108000, 164000, '2013-04-16')"); 
            stmt.executeUpdate("insert into car values(15, 11, '���׿�', 9812, 4, '�����ٰ�', 2007, 78000, 228000, '2016-01-01')"); 
            
            //                                             car cus com
            stmt.executeUpdate("insert into rental values(1, 1, 4, 1, '2020-04-03', 3, 125000, '2020-05-03', '-', '�Ͻú�')"); 
            stmt.executeUpdate("insert into rental values(2, 7, 9, 4, '2020-04-03', 4, 93000, '2020-05-03', '-', '3����')"); 
            stmt.executeUpdate("insert into rental values(3, 10, 11, 8, '2020-04-05', 3, 140000, '2020-05-06', '-', '�Ͻú�')"); 
            stmt.executeUpdate("insert into rental values(4, 15, 3, 11, '2020-04-07', 5, 228000, '2020-05-10', '-', '�Ͻú�')"); 
            stmt.executeUpdate("insert into rental values(5, 2, 5, 1, '2020-04-10', 3, 91000, '2020-05-12', '-', '6����')"); 
            stmt.executeUpdate("insert into rental values(6, 9, 4, 7, '2020-04-12', 4, 150000, '2020-05-12', '-', '�Ͻú�')"); 
            stmt.executeUpdate("insert into rental values(7, 13, 10, 10, '2020-04-12', 4, 170000, '2020-05-13', '-', '�Ͻú�')"); 
            stmt.executeUpdate("insert into rental values(8, 8, 1, 6, '2020-04-14', 3, 75000, '2020-05-14', '-', '�Ͻú�')"); 
            stmt.executeUpdate("insert into rental values(9, 15, 3, 11, '2020-04-15', 2, 228000, '2020-05-17', '-', '3����')"); 
            stmt.executeUpdate("insert into rental values(10, 4, 5, 3, '2020-04-17', 3, 124000, '2020-05-18', '-', '�Ͻú�')"); 
            stmt.executeUpdate("insert into rental values(11, 7, 12, 4, '2020-04-17', 4, 93000, '2020-05-18', '-', '�Ͻú�')"); 
            stmt.executeUpdate("insert into rental values(12, 12, 2, 9, '2020-04-19', 3, 204000, '2020-05-20', '-', '�Ͻú�')"); 
            stmt.executeUpdate("insert into rental values(13, 10, 4, 8, '2020-04-19', 2, 140000, '2020-05-19', '-', '3����')");
            stmt.executeUpdate("insert into rental values(14, 6, 15, 3, '2020-04-20', 4, 137000, '2020-05-20', '-', '�Ͻú�')"); 
            stmt.executeUpdate("insert into rental values(15, 2, 7, 1, '2020-04-22', 3, 91000, '2020-05-24', '-', '�Ͻú�')"); 
            stmt.executeUpdate("insert into rental values(16, 11, 6, 9, '2020-04-23', 5, 247000, '2020-05-24', '-', '�Ͻú�')"); 
            stmt.executeUpdate("insert into rental values(17, 14, 11, 11, '2020-04-23', 3, 164000, '2020-05-23', '-', '�Ͻú�')"); 
            
            //                                           ren_id car    ��             ��              ��                 ��
            stmt.executeUpdate("insert into inspection values(1, 1, '�̻� ����', '�ļ�', '�̻� ����', '�̻� ����', true)"); 
            stmt.executeUpdate("insert into inspection values(2, 7, '�ļ�', '�̻� ����', '�ļ�', '�̻� ����', true)"); 
            stmt.executeUpdate("insert into inspection values(3, 10, '�̻� ����', '�̻� ����', '�̻� ����', '�ļ�', true)"); 
            stmt.executeUpdate("insert into inspection values(5, 2, '�̻� ����', '�̻� ����', '�̻� ����', '�̻� ����', false)");  // f
            stmt.executeUpdate("insert into inspection values(4, 15, '�ļ�', '�ļ�', '�̻� ����', '�̻� ����', true)"); 
            stmt.executeUpdate("insert into inspection values(6, 9, '�̻� ����', '�ļ�', '�̻� ����', '�̻� ����', true)"); 
            stmt.executeUpdate("insert into inspection values(7, 13, '�̻� ����', '�̻� ����', '�ļ�', '�̻� ����', true)"); 
            stmt.executeUpdate("insert into inspection values(8, 8, '�̻� ����', '�̻� ����', '�ļ�', '�̻� ����', true)"); 
            stmt.executeUpdate("insert into inspection values(9, 15, '�̻� ����', '�ļ�', '�̻� ����', '�̻� ����', true)"); 
            stmt.executeUpdate("insert into inspection values(10, 4, '�̻� ����', '�̻� ����', '�ļ�', '�ļ�', true)"); 
            stmt.executeUpdate("insert into inspection values(11, 7, '�ļ�', '�ļ�', '�̻� ����', '�̻� ����', true)"); 
            stmt.executeUpdate("insert into inspection values(14, 6, '�̻� ����', '�ļ�', '�̻� ����', '�̻� ����', true)"); 
            stmt.executeUpdate("insert into inspection values(12, 12, '�̻� ����', '�̻� ����', '�̻� ����', '�̻� ����', false)"); // f
            stmt.executeUpdate("insert into inspection values(13, 10, '�̻� ����', '�̻� ����', '�ļ�', '�̻� ����', true)"); 
            stmt.executeUpdate("insert into inspection values(15, 2, '�̻� ����', '�ļ�', '�̻� ����', '�ļ�', true)"); 
            stmt.executeUpdate("insert into inspection values(16, 11, '�̻� ����', '�̻� ����', '�̻� ����', '�ļ�', true)"); 
            stmt.executeUpdate("insert into inspection values(17, 14, '�ļ�', '�ļ�', '�̻� ����', '�ļ�', true)"); 
            
            
            //                                                 car wor com cus
            stmt.executeUpdate("insert into maintenance values(1, 1, 3, 1, 4, '���� ����', '2020-04-05', 40000, '2020-04-21', '-')"); 
            stmt.executeUpdate("insert into maintenance values(2, 7, 5, 4, 9, '������ ����', '2020-04-11', 73000, '2020-04-25', '-')"); 
            stmt.executeUpdate("insert into maintenance values(3, 10, 4, 8, 11, '���� ����', '2020-04-14', 140000, '2020-04-28', '-')"); 
            stmt.executeUpdate("insert into maintenance values(4, 15, 8, 11, 3, '���� ����', '2020-04-18', 90000, '2020-04-30', '-')"); 
            stmt.executeUpdate("insert into maintenance values(5, 9, 11, 7, 4, '���� ����', '2020-04-19', 63000, '2020-05-07', '-')"); 
            stmt.executeUpdate("insert into maintenance values(6, 13, 14, 10, 10, '���� ����', '2020-04-19', 72000, '2020-05-09', '-')");
            stmt.executeUpdate("insert into maintenance values(7, 8, 7, 6, 1, '������ ������', '2020-04-22', 137000, '2020-05-10', '-')"); 
            stmt.executeUpdate("insert into maintenance values(8, 15, 9, 11, 3, '���� ����', '2020-04-24', 290000, '2020-05-11', '-')"); 
            stmt.executeUpdate("insert into maintenance values(9, 4, 1, 3, 5, '���� ����', '2020-04-24', 110000, '2020-05-14', '-')"); 
            stmt.executeUpdate("insert into maintenance values(10, 7, 11, 4, 12, '������ ����', '2020-04-25', 55000, '2020-05-16', '-')");
            stmt.executeUpdate("insert into maintenance values(11, 6, 5, 3, 15, '���� ����', '2020-04-26', 80000, '2020-05-18', '-')");
            stmt.executeUpdate("insert into maintenance values(12, 10, 3, 8, 4, '���� ����', '2020-04-28', 91000, '2020-05-21', '-')"); 
            stmt.executeUpdate("insert into maintenance values(13, 2, 7, 1, 7, '���� ����', '2020-04-30', 170000, '2020-05-22', '-')"); 
            stmt.executeUpdate("insert into maintenance values(14, 11, 3, 9, 6, '������ ����', '2020-05-04', 135000, '2020-05-22', '-')"); 
            stmt.executeUpdate("insert into maintenance values(15, 14, 13, 11, 11, '������ ����', '2020-05-07', 87000, '2020-05-27', '-')");   
         
            txtResult.setText("init completed");
            
         } else if (e.getSource() == btnCompanyInput) {
        	 companyInputDialog.stmt = stmt;
        	 companyInputDialog.setVisible(true);     
         } else if (e.getSource() == btnCarInput) {
        	 carInputDialog.stmt = stmt;
        	 carInputDialog.setVisible(true);     
         } else if (e.getSource() == btnCustomerInput) {
        	 customerInputDialog.stmt = stmt;
        	 customerInputDialog.setVisible(true);     
         } else if (e.getSource() == btnWorkshopInput) {
        	 workshopInputDialog.stmt = stmt;
        	 workshopInputDialog.setVisible(true);     
         }  
         
         else if (e.getSource() == btnCompanyDelete) {
        	 companyDeleteDialog.stmt = stmt;
        	 companyDeleteDialog.setVisible(true);     
         }  
         else if (e.getSource() == btnCarDelete) {
        	 carDeleteDialog.stmt = stmt;
        	 carDeleteDialog.setVisible(true);     
         }  
         else if (e.getSource() == btnCustomerDelete) {
        	 customerDeleteDialog.stmt = stmt;
        	 customerDeleteDialog.setVisible(true);     
         }  
         else if (e.getSource() == btnWorkshopDelete) {
        	 workshopDeleteDialog.stmt = stmt;
        	 workshopDeleteDialog.setVisible(true);     
         }  
         
         else if (e.getSource() == btnCompanyUpdate) {
        	 companyUpdateDialog.stmt = stmt;
        	 companyUpdateDialog.setVisible(true);     
         }  
         else if (e.getSource() == btnCarUpdate) {
        	 carUpdateDialog.stmt = stmt;
        	 carUpdateDialog.setVisible(true);     
         } 
         else if (e.getSource() == btnCustomerUpdate) {
        	 customerUpdateDialog.stmt = stmt;
        	 customerUpdateDialog.setVisible(true);     
         } 
         else if (e.getSource() == btnWorkshopUpdate) {
        	 workshopUpdateDialog.stmt = stmt;
        	 workshopUpdateDialog.setVisible(true);     
         } 
         
         
         else if(e.getSource() == btnCarSearch) {
	    	 carSearchDialog.stmt = stmt;
	    	 carSearchDialog.setVisible(true);
         }
         else if(e.getSource() == btnCarRental) {
	    	 carRentalDialog.stmt = stmt;
	    	 carRentalDialog.setVisible(true);
         }
	     else if(e.getSource() == btnCarInspection) {
			 carInspectionDialog.stmt = stmt;
			 carInspectionDialog.setVisible(true);
         }
	     else if(e.getSource() == btnCarMaintenanceInput) {
	    	 carMaintenanceInputDialog.stmt = stmt;
	    	 carMaintenanceInputDialog.setVisible(true);
         }
	     else if(e.getSource() == btnCarMaintenanceDelete) {
	    	 carMaintenanceDeleteDialog.stmt = stmt;
	    	 carMaintenanceDeleteDialog.setVisible(true);
         }
	     else if(e.getSource() == btnCarMaintenanceUpdate) {
	    	 carMaintenanceUpdateDialog.stmt = stmt;
	    	 carMaintenanceUpdateDialog.setVisible(true);
         }
	     else if(e.getSource() == btnSearchDialog) {
	    	 searchDialog.stmt = stmt;
	    	 searchDialog.setVisible(true);
	    	 txtResult.setText("1. ��������Ÿ��� 8�� �̻��̸鼭, ���� ������ �ѹ��̶� 10���� �̻��� ���Դ� ������ �̸�\n"
 			 		+ "2. 5�ν��̻��� ������ 1���̻� �뿩�� ���� �̸�\n"
 			 		+ "3. ��������� ���� ���(���� ���̺�) �� ������ �ʿ���� ������ �̸�\n"
 			 		+ "4. ����,��� ���� ȸ�� �� �뿩����� 15�����̻��� ������ �Ѵ�� ������ ȸ���� �̸�");
         }
         
 
      } catch (Exception e2) {
         System.out.println("���� �б� ���� :" + e2);  
      }
   }

   public static void main(String[] args) {
      CampingCar BLS = new CampingCar();
      
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


