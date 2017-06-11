package ex;


import java.awt.*;
import java.awt.event.*;

public class e01 {

}

class MainFrame1 extends Frame {
	MainFrame s;
	protected Button btnAns = new Button("分析");
	protected Label lab1 = new Label("BMI:");
	protected Label lab2 = new Label("體脂:");
	protected Label lab3 = new Label("理想體重:");
	protected Label lab4 = new Label("熱量需求:");
	float A=0;
	//double B=1.2*A+0.23*a-5.4-10.8*g;
	float C=0;
	float D=0;
	// float A=w/h/h/10000;
	// double B=1.2*A+0.23*a-5.4-10.8*g;
	// float C=h*h*22/10000;
	// float D=0;
	protected Label labA = new Label(""); // (A+"")
	protected Label labB = new Label(""); // (B+"")
	protected Label labC = new Label(""); // (C+"")
	protected Label labD = new Label(""); // (D+"")

	public MainFrame1(MainFrame s) {
		this.s = s;
		init();
		initComp();
	}
	
	private void init(){
		String n = s.getPName();
		float h = s.getPHeight();
		float w = s.getPWeight();
		String a = s.getPAge();

		if(w!=-1&&h!=-1){
			A = w/(h*h)*10000;
			C=h*h*22/10000;
			labA = new Label(A+"");
			labC = new Label(C+"");
		}
	}

	protected void initComp() {
		this.setLocation(100, 200);
		this.setSize(500, 600);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		this.setLayout(null);
		btnAns.setLocation(150, 450);
		btnAns.setSize(200, 100);
		btnAns.setBackground(Color.ORANGE);

		lab1.setBounds(50, 75, 60, 50);
		lab2.setBounds(50, 150, 60, 50);
		lab3.setBounds(50, 225, 60, 50);
		lab4.setBounds(50, 300, 60, 50);
		lab1.setBackground(Color.PINK);
		lab2.setBackground(Color.PINK);
		lab3.setBackground(Color.PINK);
		lab4.setBackground(Color.PINK);
		
		labA.setBounds(50+60,75,60,50);
		labA.setBackground(Color.red);
		labC.setBounds(50+60,225,60,50);
		labC.setBackground(Color.red);

		btnAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				setVisible(false);
				MainFrame2 mFrm2 = new MainFrame2();
				mFrm2.setVisible(true);
			}
		});
		this.add(btnAns);
		this.add(lab1);
		this.add(lab2);
		this.add(lab3);
		this.add(lab4);
		this.add(labA);
		this.add(labC);

	}
}