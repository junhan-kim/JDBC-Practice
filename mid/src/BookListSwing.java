
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.sql.*;
import java.util.Scanner;

import javax.swing.*;



class InputDialog extends JDialog {
	JLabel label1 = new JLabel("orderid");
	JLabel label2 = new JLabel("custid");
	JLabel label3 = new JLabel("bookid");
	JLabel label4 = new JLabel("saleprice");
	JLabel label5 = new JLabel("orderdate");
	JTextField orderid = new JTextField(20);
	JTextField custid = new JTextField(20);
	JTextField bookid = new JTextField(20);
	JTextField saleprice = new JTextField(20);
	JTextField orderdate = new JTextField(20);
	JButton okButton = new JButton("�Է�");
	Statement stmt;

	public InputDialog(JFrame frame, String title, JTextArea ta) {
		super(frame, title);
		setLayout(new FlowLayout());
		add(label1); add(orderid);
		add(label2); add(custid);
		add(label3); add(bookid);
		add(label4); add(saleprice);
		add(label5); add(orderdate);
		add(okButton);
		//setSize(320, 500);
		setBounds(0, 0, 320, 500); //������ġ,������ġ,���α���,���α���
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	 try {
	 				String query = "INSERT INTO Orders(orderid, custid, bookid, saleprice, orderdate) VALUES ("
	 				        + orderid.getText() + "," 
	 				        + custid.getText() + "," 
	 				        + bookid.getText() + "," 
	 					    + saleprice.getText() + ",'" 
	 					    + orderdate.getText() + "')";
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


public class BookListSwing extends JFrame implements ActionListener {
   JButton btnReset, btnInput, btnSearch1, btnSearch2, btnSearch3;
   JTextArea txtResult;
   JPanel pn1;
   InputDialog dialog;
   
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
      dialog = new InputDialog(this, "Input Dialog", txtResult);
      dialog.setVisible(false);
      setBounds(200, 200, 600, 600); //������ġ,������ġ,���α���,���α���
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public void layInit() {
      btnReset = new JButton("�ʱ�ȭ"); 
      btnInput = new JButton("�Է�1");
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
         dialog.stmt = stmt;
         if (e.getSource() == btnReset) {
            txtResult.setText("");

            String query = "DELETE FROM Orders";
            stmt.executeUpdate(query); 
            query = "DELETE FROM Customer";
            stmt.executeUpdate(query); 
            query = "DELETE FROM Book";
            stmt.executeUpdate(query); 
            
            query = "INSERT INTO Book VALUES(1, '�౸�� ����', '�½�����', 7000)";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Book VALUES(2, '�౸�ƴ� ����', '������', 13000)";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Book VALUES(3, '�౸�� ����', '���ѹ̵��', 22000)";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Book VALUES(4, '���� ���̺�', '���ѹ̵��', 35000)";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Book VALUES(5, '�ǰ� ����', '�½�����', 8000)";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Book VALUES(6, '���� �ܰ躰���', '�½�����', 6000)";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Book VALUES(7, '�߱��� �߾�', '�̻�̵��', 20000)";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Book VALUES(8, '�߱��� ��Ź��', '�̻�̵��', 13000)";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Book VALUES(9, '�ø��� �̾߱�', '�Ｚ��', 7500)";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Book VALUES(10, 'Olympic Champions', 'Pearson', 13000)";
            stmt.executeUpdate(query); 
            query = "insert into book(bookid, bookname, publisher, price) values (11, '������ ����', '�Ѽ����м���', 90000)";
            stmt.executeUpdate(query); 
            query = "insert into book(bookid, bookname, publisher, price) values (12, '�߱��� ����', '�½�����', 44000)";
            stmt.executeUpdate(query); 
            query = "insert into book(bookid, bookname, publisher, price) values (13, '�߱��� ����', '�Ѽ����м���', 8000)";
            stmt.executeUpdate(query); 
            query = "insert into book(bookid, bookname, publisher, price) values (14, '�󱸴� �� ģ��', '���ѹ̵��', 13000)";
            stmt.executeUpdate(query); 
            query = "insert into book(bookid, bookname, publisher, price) values (15, '�౸�� �غ���', '�½�����', 22000)";
            stmt.executeUpdate(query); 
            query = "insert into book(bookid, bookname, publisher, price) values (16, '���� ��Ŀű', '�½�����', 20000)";
            stmt.executeUpdate(query); 
            query = "insert into book(bookid, bookname, publisher, price) values (17, '�������� �̷�', '�̻�̵��', 19000)";
            stmt.executeUpdate(query); 
            query = "insert into book(bookid, bookname, publisher, price) values (18, '�Ǳ��� ��Ű', '���ѹ̵��', 16000)";
            stmt.executeUpdate(query); 
            query = "insert into book(bookid, bookname, publisher, price) values (19, '�󱸸� ������', '�½�����', 9000)";
            stmt.executeUpdate(query); 
            query = "insert into book(bookid, bookname, publisher, price) values (20, '�ǰ� ��������', '���ѹ̵��', 17000)";
            stmt.executeUpdate(query); 
            
            query = "INSERT INTO Customer VALUES (1, '������', '���� ��ü��Ÿ', '000-5000-0001')";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Customer VALUES (2, '�迬��', '���ѹα� ����', '000-6000-0001')";  
            stmt.executeUpdate(query); 
            query = " INSERT INTO Customer VALUES (3, '��̶�', '���ѹα� ������', '000-7000-0001')";
            stmt.executeUpdate(query); 
            query = " INSERT INTO Customer VALUES (4, '�߽ż�', '�̱� Ŭ������', '000-8000-0001')";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Customer VALUES (5, '�ڼ���', '���ѹα� ����',  NULL)";
            stmt.executeUpdate(query); 
            query = "insert into customer(custid, name, address, phone) values (6, '�迵ȿ', '���ѹα� �뱸', '000-9000-001')";
            stmt.executeUpdate(query); 
            query = "insert into customer(custid, name, address, phone) values (7, '������', '�̱� ����', '000-2000-001')";
            stmt.executeUpdate(query); 
            query = "insert into customer(custid, name, address, phone) values (8, '���켺', '�Ϻ� ����', '000-3000-001')";
            stmt.executeUpdate(query); 
            query = "insert into customer(custid, name, address, phone) values (9, '��ȿ��', '���ѹα� ��õ', '000-1000-001')";
            stmt.executeUpdate(query); 
            query = "insert into customer(custid, name, address, phone) values (10, '�̰濵', '�Ϻ� ����ī', null)";
            stmt.executeUpdate(query); 
               
            query = "INSERT INTO Orders VALUES (1, 1, 1, 6000, STR_TO_DATE('2014-07-01','%Y-%m-%d'))"; 
            stmt.executeUpdate(query); 
            query = "INSERT INTO Orders VALUES (2, 1, 3, 21000, STR_TO_DATE('2014-07-03','%Y-%m-%d'))";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Orders VALUES (3, 2, 5, 8000, STR_TO_DATE('2014-07-03','%Y-%m-%d'))"; 
            stmt.executeUpdate(query); 
            query = "INSERT INTO Orders VALUES (4, 3, 6, 6000, STR_TO_DATE('2014-07-04','%Y-%m-%d'))"; 
            stmt.executeUpdate(query); 
            query = "INSERT INTO Orders VALUES (5, 4, 7, 20000, STR_TO_DATE('2014-07-05','%Y-%m-%d'))";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Orders VALUES (6, 1, 2, 12000, STR_TO_DATE('2014-07-07','%Y-%m-%d'))";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Orders VALUES (7, 4, 8, 13000, STR_TO_DATE( '2014-07-07','%Y-%m-%d'))";
            stmt.executeUpdate(query); 
            query = "INSERT INTO Orders VALUES (8, 3, 10, 12000, STR_TO_DATE('2014-07-08','%Y-%m-%d'))"; 
            stmt.executeUpdate(query); 
            query = "INSERT INTO Orders VALUES (9, 2, 10, 7000, STR_TO_DATE('2014-07-09','%Y-%m-%d'))"; 
            stmt.executeUpdate(query); 
            query = "INSERT INTO Orders VALUES (10, 3, 8, 13000, STR_TO_DATE('2014-07-10','%Y-%m-%d'))";
            stmt.executeUpdate(query); 
            query = "insert into orders(orderid, custid, bookid, saleprice, orderdate) values (11, 6, 12, 43000, '2014-07-13')";
            stmt.executeUpdate(query); 
            query = "insert into orders(orderid, custid, bookid, saleprice, orderdate) values (12, 8, 14, 12000, '2014-07-11')";
            stmt.executeUpdate(query); 
            query = "insert into orders(orderid, custid, bookid, saleprice, orderdate) values (13, 8, 1, 6000, '2014-07-18')";
            stmt.executeUpdate(query); 
            query = "insert into orders(orderid, custid, bookid, saleprice, orderdate) values (14, 9, 8, 11000, '2014-07-17')";
            stmt.executeUpdate(query); 
            query = "insert into orders(orderid, custid, bookid, saleprice, orderdate) values (15, 7, 18, 15000, '2014-07-22')";
            stmt.executeUpdate(query); 
            query = "insert into orders(orderid, custid, bookid, saleprice, orderdate) values (16, 9, 16, 19000, '2014-07-26')";
            stmt.executeUpdate(query); 
            query = "insert into orders(orderid, custid, bookid, saleprice, orderdate) values (17, 4, 11, 89000, '2014-07-24')";
            stmt.executeUpdate(query); 
            query = "insert into orders(orderid, custid, bookid, saleprice, orderdate) values (18, 2, 19, 8000, '2014-07-10')";
            stmt.executeUpdate(query); 
            query = "insert into orders(orderid, custid, bookid, saleprice, orderdate) values (19, 3, 15, 21000, '2014-07-03')";
            stmt.executeUpdate(query); 
            query = "insert into orders(orderid, custid, bookid, saleprice, orderdate) values (20, 10, 13, 7000, '2014-07-28')";
            stmt.executeUpdate(query); 
            
            
         } else if (e.getSource() == btnInput) {
        	 dialog.setVisible(true);     		 
         } else if (e.getSource() == btnSearch1) {
        	 String query = "SELECT * FROM Book";
             txtResult.setText("");
             txtResult.setText("BOOKID           BOOK NAME       PUBLISHER      PRICE\n");
             rs = stmt.executeQuery(query);
             while (rs.next()) {
                String str = rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4)
                      + "\n";
                txtResult.append(str);
             }
         } else if (e.getSource() == btnSearch2) {
        	 String query = "SELECT * FROM Orders";
             txtResult.setText("");
             txtResult.setText("ORDERID           CUSTID       BOOKID              SALEPRICE         ORDERDATE\n");
             rs = stmt.executeQuery(query);
             while (rs.next()) {
                String str = rs.getInt(1) + "\t" + rs.getInt(2) + "\t" + rs.getInt(3) + "\t" + rs.getInt(4)
                      + "\t" + rs.getDate(5) + "\n";
                txtResult.append(str);
             }
         } else if (e.getSource() == btnSearch3) {
        	 String query = "SELECT * FROM Customer";
             txtResult.setText("");
             txtResult.setText("CUSTID                NAME               ADDRESS            PHONE\n");
             rs = stmt.executeQuery(query);
             while (rs.next()) {
                String str = rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4)
                      + "\n";
                txtResult.append(str);
             }
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

