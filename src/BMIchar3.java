
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BMIchar3 {

public static void main(String arg[]){
	
	MainFrame mFrm=new MainFrame();
	mFrm.setVisible(true);
}
}


class MainFrame extends Frame{

	protected Button btn;

			public MainFrame(){
				initComp();
			}
			protected void initComp(){
				
				this.setSize(500,600);
				this.setLocation(100,200);
				this.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent e){
						System.exit(0);
					}
				});
				this.setBackground(Color.DARK_GRAY);
				this.setLayout(null);
				
				btn=new Button("BMI");
				btn.setLocation(30, 30);
				btn.setSize(200, 100);
				this.add(btn);
				btn=new Button("Åé¯×");
				btn.setLocation(250, 30);
				btn.setSize(200, 100);
				this.add(btn);
				
				
				
				
						}
	}
