package ex;
import org.jfree.ui.RefineryUtilities;
public class chartmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BarChart longchart1 = new BarChart("<使用者偏好>");
		longchart1.pack();
		RefineryUtilities.centerFrameOnScreen(longchart1);
		longchart1.setVisible(true);
	}

}
