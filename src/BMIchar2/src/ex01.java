import java.awt.*;
import java.awt.event.*;
public class ex01 {

	public static void main(String[]args){
		MainFrame mf=new MainFrame();
		mf.setVisible(true);
	}	
		
	}

	class MainFrame extends Frame{
		protected Button btnAns=new Button("���R");
		protected Label lab1=new Label("BMI:");
		protected Label lab2=new Label("���:");
		protected Label lab3=new Label("�z�Q�魫:");
		protected Label lab4=new Label("���q�ݨD:");
		
		public MainFrame(){
			initComp();
		}
		
		private void initComp(){
			this.setLocation(100, 200);
			this.setSize(500,600);
			this.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we){
				System.exit(0);
				}
			});
			this.setLayout(null);
			btnAns.setLocation(150,450);
			btnAns.setSize(200,100);
			btnAns.setBackground(Color.ORANGE);

			lab1.setBounds(50,75,60,50);
			lab2.setBounds(50,150,60,50);
			lab3.setBounds(50,225,60,50);
			lab4.setBounds(50,300,60,50);
			lab1.setBackground(Color.PINK);
			lab2.setBackground(Color.PINK);
			lab3.setBackground(Color.PINK);
			lab4.setBackground(Color.PINK);
			
			btnAns.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
	//����3		
				}
			});
			
			this.add(btnAns);
			this.add(lab1);
			this.add(lab2);
			this.add(lab3);
			this.add(lab4);
			
			
		}
	} 