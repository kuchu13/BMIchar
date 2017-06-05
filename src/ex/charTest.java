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
                            "Title", // 圖的標題 
                            "city",  // x 座標標題 
                            "value", // y 座標標題 
                            dataset, // 你放數據的地方 
                            PlotOrientation.VERTICAL, // 圖表方向：水平、垂直 
                            true,     // 是否顯示圖例 
                            false,     // 是否 tooltips 工具  
                            false     // 是否生成URL 
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