package ex;


import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class e01 {

}

class MainFrame1 extends Frame {
	MainFrame s;
	protected Button btnAns = new Button("分析");
	protected Label lab1 = new Label("BMI:");
	protected Label lab2 = new Label("體脂:");
	protected Label lab3 = new Label("理想體重:");
	protected Label lab4 = new Label("建議熱量:");
	float A=0;
	float B=0;
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
	protected JLabel labD = new JLabel(""); // (D+"")
	
	String Name;

	public MainFrame1(MainFrame s) {
		this.s = s;
		this.Name = s.getPName();
		init();
		labD.setIcon(new ImageIcon(this.getClass().getResource("a.png")));
		initComp();
	}
	
	private void init(){
		float h = s.getPHeight();
		float w = s.getPWeight();
		String a = s.getPAge();
		int g = s.getPGender();

		if(h!=-1){
			C=h*h*22/10000;
			labC.setText(C+"");
			if(w!=-1){
				A = w/(h*h)*10000;
				labA.setText(A+"");
				if(g==1||g==0){
					B = (w-(g==0?0.82f:0.88f)*C)/w*100f;
					labB.setText(B+"");


				}
			}
		}
	}

	protected void initComp() {
		this.setLocation(100, 200);
		this.setSize(500, 800);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		this.setLayout(null);
		btnAns.setLocation(150, 536);
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
		labB.setBounds(50+60,150,60,50);
		labB.setBackground(Color.red);
		labC.setBounds(50+60,225,60,50);
		labC.setBackground(Color.red);
		labD.setBounds(30,300,450,186);

		btnAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				setVisible(false);
				MainFrame2 mFrm2 = new MainFrame2(Name);
				mFrm2.setVisible(true);
			}
		});
		this.add(btnAns);
		this.add(lab1);
		this.add(lab2);
		this.add(lab3);
		//this.add(lab4);
		this.add(labA);
		this.add(labB);
		this.add(labC);
		this.add(labD);

	}
}