package ex;

import java.awt.*;
import java.awt.event.*;

public class e01 extends Frame{

	MainFrame s = new MainFrame();
	protected Button btnAns = new Button("分析");
	protected Label lab1 = new Label("BMI:");
	protected Label lab2 = new Label("體脂:");
	protected Label lab3 = new Label("理想體重:");
	protected Label lab4 = new Label("熱量需求:");
	 String g = s.getGender1();
	 String h = s.getHeight1();
	 String w = s.getWeight1();
	 String a = s.getAge1();
	 int g2=Integer.parseInt(g);
	 int h2=Integer.parseInt(h);
	 int w2=Integer.parseInt(w);
	 int a2=Integer.parseInt(a);
	 float A=w2/h2/h2/10000;
	 double B=1.2*A+0.23*a2-5.4-10.8*a2;
	 float C=h2*h2*22/10000;
	 float D=0;
	protected Label labA = new Label(A+""); // (A+"")
	protected Label labB = new Label(B+""); // (B+"")
	protected Label labC = new Label(C+""); // (C+"")
	protected Label labD = new Label(D+""); // (D+"")

	public e01(String v1, String v2, String v3, String v4) {
		initComp();
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

		btnAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				e01.this.setVisible(false);
				e02 mFrm2 = new e02();
				mFrm2.setVisible(true);
			}
		});
		labA.setText("tf2");
		this.add(btnAns);
		this.add(lab1);
		this.add(lab2);
		this.add(lab3);
		this.add(lab4);

	}
}