package ex;

import java.awt.*;
import java.awt.event.*;
public class surface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mFrm=new MainFrame();
		mFrm.setVisible(true);
	}

}

class MainFrame extends Frame{
	int v1=0;
	protected Button btnSum=new Button("�T�{");
	protected Label lab1=new Label("�W�r:");
	protected Label lab2=new Label("����:");
	protected Label lab3=new Label("�魫:");
	protected TextField tf1=new TextField("");
	protected TextField tf2=new TextField("");
	protected TextField tf3=new TextField("");
	
	public MainFrame(){
		initComp();
	}
	private void initComp(){
		this.setLocation(100,200);
		this.setSize(500,600);
		// �[�J������ť��
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(null);
		btnSum.setLocation(150,450);
		btnSum.setSize(200,100);
//		lab1.setLocation(175,100);
//		lab1.setSize(100,40);
		lab1.setBounds(50,75,50,40);
		lab2.setBounds(50,150,50,40);
		lab3.setBounds(50,225,50,40);
		lab1.setBackground(Color.ORANGE);
		lab2.setBackground(Color.ORANGE);
		lab3.setBackground(Color.ORANGE);
		tf1.setBounds(100,75,250,40);
		tf2.setBounds(100,150,250,40);
		tf3.setBounds(100,225,250,40);
		tf1.setBackground(Color.ORANGE);
		tf2.setBackground(Color.ORANGE);
		tf3.setBackground(Color.ORANGE);
		this.add(tf1);
		this.add(tf2);
		this.add(tf3);
		this.add(btnSum);
		this.add(lab1);
		this.add(lab2);
		this.add(lab3);
//		btnAdd.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent wa){
//				v1++;
//				lab.setText(Integer.toString(v1));
//			}
//});
	}
	
}