package ex;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


class MainFrame extends Frame {
	
	private DBConnection dbconn;

	
	int v1 = 0;
	protected Button btnSum = new Button("送出");//送出
	protected Label lab1 = new Label("姓名");//名子
	protected Label lab2 = new Label("身高(cm)");//身高
	protected Label lab3 = new Label("體重(kg)");//體重
	protected Label lab4 = new Label("年齡");//年齡
	protected Label lab5 = new Label("性別 (0女，1男)");

	protected TextField tf1 = new TextField("");
	protected TextField tf2 = new TextField("");
	protected TextField tf3 = new TextField("");
	protected TextField tf4 = new TextField("");
	protected TextField tf5 = new TextField("");

	// public float getValue1(){
	// return Float.parseFloat(tf1.getText());
	// }
	// public float getValue2(){
	// return Float.parseFloat(tf2.getText());
	// }
	// public float getValue3(){
	// return Float.parseFloat(tf3.getText());
	// }
	// public float getValue4(){
	// return Float.parseFloat(tf4.getText());
	// }
	public MainFrame() {
		initComp();
	}
	
	public String getPName(){
		return tf1.getText();
	}
	
	public Float getPHeight(){
		try{
			return Float.valueOf(tf2.getText());
		}catch(NumberFormatException e){
			//數值不是數字
		}
		return -1f;
	}
	
	public Float getPWeight(){
		try{
			return Float.valueOf(tf3.getText());
		}catch(NumberFormatException e){
			//數值不是數字
		}
		return -1f;
	}
	
	public String getPAge(){
		return tf4.getText();
	}
	
	public int getPGender(){
		try{
			return Integer.valueOf(tf5.getText());
		}catch(NumberFormatException e){
			//數值不是數字
		}
		return -1;
	}

	public MainFrame getInstance(){
		return this;
	}

	protected void initComp() {

		this.setLocation(100, 200);
		this.setSize(500, 600);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(null);
		btnSum.setLocation(150, 450);
		btnSum.setSize(200, 100);
		// lab1.setLocation(175,100);
		// lab1.setSize(100,40);
		/*
		lab1.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lab2.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lab3.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		lab4.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		*/
		lab1.setBounds(50, 75, 50, 40);
		lab2.setBounds(50, 150, 50, 40);
		lab3.setBounds(50, 225, 50, 40);
		lab4.setBounds(50, 300, 50, 40);
		lab5.setBounds(50, 375, 100, 40);
		lab1.setBackground(Color.ORANGE);
		lab2.setBackground(Color.ORANGE);
		lab3.setBackground(Color.ORANGE);
		lab4.setBackground(Color.ORANGE);
		lab5.setBackground(Color.ORANGE);
		tf1.setBounds(100, 75, 250, 40);
		tf2.setBounds(100, 150, 250, 40);
		tf3.setBounds(100, 225, 250, 40);
		tf4.setBounds(100, 300, 250, 40);
		tf5.setBounds(150, 375, 200, 40);
		tf1.setBackground(Color.ORANGE);
		tf2.setBackground(Color.ORANGE);
		tf3.setBackground(Color.ORANGE);
		tf4.setBackground(Color.ORANGE);
		tf5.setBackground(Color.ORANGE);

		this.add(tf1);
		this.add(tf2);
		this.add(tf3);
		this.add(tf4);
		this.add(tf5);

		this.add(btnSum);
		this.add(lab1);
		this.add(lab2);
		this.add(lab3);
		this.add(lab4);
		this.add(lab5);


		
		
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent wa) {
				MainFrame1 mFrm1 = new MainFrame1(getInstance());
				mFrm1.setVisible(true);
				setVisible(false);
				
				//儲存至資料庫程式碼
				boolean save = false;//當假的成真就存進去
				if(save){
					int gender = -1;
					int age = -1;//tf4
					float weight = -1;//tf3
					float height = -1;//tf2
					String Name = tf1.getText();//tf1
					try{
						gender = Integer.valueOf(tf5.getText());
						age = Integer.valueOf(tf4.getText());
						weight = Float.valueOf(tf3.getText());
						height = Float.valueOf(tf2.getText());
					}catch(NumberFormatException e){
						//輸入數值不是數字
					}
					if(gender<0||gender>1){
						return;
					}
					if(age<=0){
						return;
					}
					if(weight<=0){
						return;
					}
					if(height<=0){
						return;
					}
					if(Name==null||Name.length()<1){
						return;
					}
					dbconnection();
					//SQL處理
					dbconn.addData(Name,height,weight,age,gender);
					//SQL處理結束
					dbconn.dispose();
				}
			}
		});
	}
	//MySQL Code
	private void dbconnection() {
		dbconn = new DBConnection(this, "root", "");
	}
}