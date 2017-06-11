package ex;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
public class XYchart extends ApplicationFrame
{
   public XYchart( String applicationTitle , String chartTitle )
   {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Date","Your Weight",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }

   private DefaultCategoryDataset createDataset( )
   {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      dataset.addValue( 20 , "KiloGrams" , "Mon" );
      dataset.addValue( 30 , "KiloGrams" , "Tue" );
      dataset.addValue( 40 , "KiloGrams" ,  "Wed" );
      dataset.addValue( 50 , "KiloGrams" , "Thur" );
      dataset.addValue( 60 , "KiloGrams" , "Fri" );
      dataset.addValue( 70 , "KiloGrams" , "Sat" );
      dataset.addValue( 80 , "KiloGrams" , "Sun" );
      return dataset;
   }
   public static void main( String[ ] args ) 
   {
      XYchart chart = new XYchart(
      "Weight Vs Date" ,
      "Weight vs Date");

      chart.pack( );
      RefineryUtilities.centerFrameOnScreen( chart );
      chart.setVisible( true );
   }
}