package ex;
import java.awt.*;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.*;
public class BarChart extends ApplicationFrame{

		public BarChart(String frametitle){
			super(frametitle);//�T�w
			JPanel jp1=createDemoPanel();
			jp1.setPreferredSize(new Dimension(650,350));
			setContentPane(jp1);
		}
		private static CategoryDataset createDataset(){
			DefaultCategoryDataset dataset=new DefaultCategoryDataset();
			dataset.addValue(20,"s1","Math");
			dataset.addValue(50,"s2","English");
			dataset.addValue(10,"s3","Chinese");
			dataset.addValue(100,"s4","a123");
			return dataset;
		}
		private static JFreeChart createChart(CategoryDataset categorydataset){
//			JFreeChart jfreechart = ChartFactory.createBarChart3D(
			JFreeChart jfreechart = ChartFactory.createStackedBarChart(
					"�ϥΪ̰��n","����","�ƶq(��)",categorydataset,PlotOrientation.VERTICAL,true,true,false);
			CategoryPlot categoryplot=(CategoryPlot)jfreechart.getPlot();
			categoryplot.setBackgroundPaint(Color.lightGray);
			categoryplot.setRangeGridlinePaint(Color.white);
//			BarRenderer stackedbarrenderer=(BarRenderer)categoryplot.getRenderer();
			StackedBarRenderer stackedbarrenderer=(StackedBarRenderer) categoryplot.getRenderer();
			stackedbarrenderer.setBaseItemLabelsVisible(true);
			stackedbarrenderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
			return jfreechart;
		}
		public static JPanel createDemoPanel(){
			JFreeChart jfreechart=createChart(createDataset());
			return new ChartPanel(jfreechart);
		}

}
