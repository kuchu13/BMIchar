package ex;

import java.awt.*;
import java.awt.event.*;
//Integer.toString()
class MainFrame extends Frame {
	int v1 = 0;
	protected String gender,height,weight,age;
	protected Button btnSum = new Button("�T�{");
	protected Label lab1 = new Label("�k:1,�k:0");
	protected Label lab2 = new Label("����:(cm)");
	protected Label lab3 = new Label("�魫:");
	protected Label lab4 = new Label("�~��:");
	protected TextField tf1 = new TextField("");
	protected TextField tf2 = new TextField("");
	protected TextField tf3 = new TextField("");
	protected TextField tf4 = new TextField("");

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
	public void setGender(String gender1){
		gender1=tf1.getText();
		gender=gender1;
	}
	public void setHeight(String height1){
		height1=tf2.getText();
		height=height1;
	}
	public void setWeight(String weight1){
		weight1=tf3.getText();
		weight=weight1;
	}
	public void setAge(String age1){
		age1=tf4.getText();
		age=age1;
	}
	public String getGender1(){
		return gender;
	}
	public String getHeight1(){
		return height;
	}
	public String getWeight1(){
		return weight;
	}
	public String getAge1(){
		return age;
	}

	public MainFrame() {
		initComp();
	}

	protected void initComp() {
		this.setLocation(100, 200);
		this.setSize(500, 600);
		// �[�J������ť��
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
		lab1.setBounds(50, 75, 50, 40);
		lab2.setBounds(50, 150, 50, 40);
		lab3.setBounds(50, 225, 50, 40);
		lab4.setBounds(50, 300, 50, 40);
		lab1.setBackground(Color.ORANGE);
		lab2.setBackground(Color.ORANGE);
		lab3.setBackground(Color.ORANGE);
		lab4.setBackground(Color.ORANGE);
		tf1.setBounds(100, 75, 250, 40);
		tf2.setBounds(100, 150, 250, 40);
		tf3.setBounds(100, 225, 250, 40);
		tf4.setBounds(100, 300, 250, 40);
		tf1.setBackground(Color.ORANGE);
		tf2.setBackground(Color.ORANGE);
		tf3.setBackground(Color.ORANGE);
		tf4.setBackground(Color.ORANGE);
		this.add(tf1);
		this.add(tf2);
		this.add(tf3);
		this.add(tf4);
		this.add(btnSum);
		this.add(lab1);
		this.add(lab2);
		this.add(lab3);
		this.add(lab4);

		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent wa) {
				MainFrame.this.setVisible(false);
				e01 mFrm1 = new e01( getGender1(), getHeight1(), getWeight1(), getAge1());
				mFrm1.setVisible(true);
			}
		});

	}

}