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
import org.jfree.chart.plot.*;
import java.io.*;
import org.jfree.data.category.DefaultCategoryDataset;
public class Graficar {
public  static void graph (String ejey,String namegrafico,double x1,double x2,double x3,double x4,double x5, double y1,double y2, double y3,double y4, double y5,String auto) {
//Create a simple XY chart
DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        line_chart_dataset.addValue(0, "", "0");
        line_chart_dataset.addValue(y1, "", String.valueOf(x1));
        line_chart_dataset.addValue(y2, "", String.valueOf(x2));
        line_chart_dataset.addValue(y3, "", String.valueOf(x3));
        line_chart_dataset.addValue(y4, "", String.valueOf(x4)); 
        line_chart_dataset.addValue(y5, "", String.valueOf(x5));   
//Generate the graph
//JFreeChart chart = ChartFactory.createXYLineChart("Crecimiento Ubuntu", // Title
JFreeChart chart=ChartFactory.createLineChart(namegrafico,
                "Tiempo",ejey,line_chart_dataset,PlotOrientation.VERTICAL,
                true,true,false); 
try {
ChartUtilities.saveChartAsJPEG(new File("Graficas//"+auto+".jpg"), chart, 700,500);


} catch (IOException e) {
System.err.println("Error creando grafico.");
}
}
}