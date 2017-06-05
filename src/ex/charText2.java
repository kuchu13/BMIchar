package ex;

public class charText2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYSeries series = new XYSeries("XYGraph");  
		series.add(1, 1);  
		series.add(1, 2);  
		series.add(2, 1);  
		series.add(3, 9);  
		series.add(4, 10);  
		// Add the series to your data set  
		XYSeriesCollection dataset = new XYSeriesCollection();  
		dataset.addSeries(series);  
		// Generate the graph  
		JFreeChart chart = ChartFactory.createXYAreaChart(  
		    "XY Chart", // Title  
		    "x-axis", // x-axis Label  
		    "y-axis", // y-axis Label  
		    dataset, // Dataset  
		    PlotOrientation.VERTICAL, // Plot Orientation  
		    true, // Show Legend  
		    true, // Use tooltips  
		    false // Configure chart to generate URLs?  
		);
	}

}
