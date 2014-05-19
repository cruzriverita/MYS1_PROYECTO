/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author RobsonGiovanni
 */
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import java.io.File;
//import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.general.Series;
import org.jfree.data.xy.*;
import org.jfree.chart.plot.*;
import java.io.*;
public class Graficar {
public  static void graph (double x1,double x2,double x3,double x4,double x5, double y1,double y2, double y3,double y4, double y5,String auto) {
//Create a simple XY chart
XYSeries series = new XYSeries("Grafica Desplazamiento vs tiempo");
series.add(x1, y1);
series.add(x2, y2);
series.add(x3, y3);
series.add(x4, y4);
series.add(x5, y5);
//Add the series to your data set
XYSeriesCollection dataset = new XYSeriesCollection();
dataset.addSeries(series);
//Generate the graph
//JFreeChart chart = ChartFactory.createXYLineChart("Crecimiento Ubuntu", // Title
JFreeChart chart = ChartFactory.createXYAreaChart("XY Chart", // Title
"Tiempo", // x-axis Label
"Usuarios", // y-axis Label
dataset, // Dataset
PlotOrientation.VERTICAL, // Plot Orientation
true, // Show Legend
true, // Use tooltips
false // Configure chart to generate URLs?
);
try {
ChartUtilities.saveChartAsJPEG(new File("Graficas//"+auto+".jpg"), chart, 500,300);


} catch (IOException e) {
System.err.println("Error creando grafico.");
}
}
}