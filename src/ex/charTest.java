package ex;
import java.io.*; 
import org.jfree.data.*; 
import org.jfree.data.category.*;   
import org.jfree.chart.*; 
import org.jfree.chart.plot.*; 
public class charTest{ 
    public static void main(String[] args) throws IOException{ 
        Demo mychart=new Demo(); 
        mychart.run(); 
    } 
} 
class Demo{ 
    public void run()throws IOException{ 
        DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
        dataset.addValue(100, "Miaoli", "Car"); 
        dataset.addValue(200, "Taipei", "Moto");  
        dataset.addValue(300, "Hsinchu", "Bicycle"); 
        dataset.addValue(400, "Hualien", "Car"); 
        dataset.addValue(500, "Kaohsiung", "Moto"); 
        JFreeChart chart = ChartFactory.createBarChart3D( 
                            "Title", // �Ϫ����D 
                            "city",  // x �y�м��D 
                            "value", // y �y�м��D 
                            dataset, // �A��ƾڪ��a�� 
                            PlotOrientation.VERTICAL, // �Ϫ��V�G�����B���� 
                            true,     // �O�_��ܹϨ� 
                            false,     // �O�_ tooltips �u��  
                            false     // �O�_�ͦ�URL 
                            ); 
        FileOutputStream fos_jpg = null; 
        try { 
            fos_jpg = new FileOutputStream("fruit.jpg"); 
            ChartUtilities.writeChartAsJPEG(fos_jpg,1.0f,chart,400,300,null); 
        } finally { 
            try { 
                fos_jpg.close(); 
            } catch (Exception e) {} 
        } 
    } 
}