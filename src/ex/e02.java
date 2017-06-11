package ex;


import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class e02 {

}

class MainFrame2 extends Frame {

	protected Button btn;
	
	protected TextArea text = new TextArea();
	private String Name;

	public MainFrame2(String Name) {
		this.Name = Name;
		initComp();
	}

	protected void initComp() {

		this.setSize(500, 600);
		this.setLocation(100, 200);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(null);

		btn = new Button("BMI");
		btn.setLocation(30, 30);
		btn.setSize(200, 100);
		this.add(btn);
		btn = new Button("體脂");
		btn.setLocation(250, 30);
		btn.setSize(200, 100);
		this.add(btn);
		
		DBConnection dbconn;
		dbconn = new DBConnection(this, "root", "");
		
		java.util.List<PersonInfo> list = dbconn.getData(Name);
		Calendar c = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		text.setFont(new Font("微軟正黑體", Font.PLAIN, 24));
		for(PersonInfo obj:list){
			//取資料
			c.setTimeInMillis(obj.time);
			text.setText(text.getText()+obj+"\r\n");
			text.setText(text.getText()+format.format(c.getTime())+"\r\n");
		}
		//SQL處理結束
		dbconn.dispose();
		text.setBounds(30, 150, 450, 400);
		this.add(text);

	}
}