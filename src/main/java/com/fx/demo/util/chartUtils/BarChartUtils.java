package com.fx.demo.util.chartUtils;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
/**
 * @DESCRIPTION:
 * @AUTHOR: KONG De Yan
 * @DATE: Create in  23:16 2020/12/5
 */
public class BarChartUtils
{
    private BarChart bc;

    public BarChartUtils(BarChart barChart)
    {
        this.bc = barChart;
    }

    public void operateBarChart()
    {
        //两条轴线
        final CategoryAxis xAxis = (CategoryAxis) bc.getXAxis();
        final NumberAxis yAxis = (NumberAxis) bc.getYAxis();
        //图表标题
        bc.setTitle("Country Summary");
        //轴名
        xAxis.setLabel("Value");
        yAxis.setLabel("Country");
        final String austria = "Austria";
        final String brazil = "Brazil";
        final String france = "France";
        final String italy = "Italy";
        final String usa = "USA";
        //系列1
        XYChart.Series<String, Double> series1 = new XYChart.Series<>();
        series1.setName("2003");
        series1.getData().add(new XYChart.Data<>(austria, 25601.34));
        series1.getData().add(new XYChart.Data<>(brazil, 20148.82));
        series1.getData().add(new XYChart.Data<>(france, 10000.00));
        series1.getData().add(new XYChart.Data<>(italy, 35407.15));
        series1.getData().add(new XYChart.Data<>(usa, 12000.00));
        //系列2
        XYChart.Series<String , Double> series2 = new XYChart.Series<>();
        series2.setName("2004");
        series2.getData().add(new XYChart.Data<>(austria, 57401.85));
        series2.getData().add(new XYChart.Data<>(brazil, 41941.19));
        series2.getData().add(new XYChart.Data<>(france, 45263.37));
        series2.getData().add(new XYChart.Data<>(italy, 117320.16));
        series2.getData().add(new XYChart.Data<>(usa, 14845.27));
        //系列3
        XYChart.Series<String, Double> series3 = new XYChart.Series<>();
        series3.setName("2005");
        series3.getData().add(new XYChart.Data<>(austria, 45000.65));
        series3.getData().add(new XYChart.Data<>(brazil, 44835.76));
        series3.getData().add(new XYChart.Data<>(france, 18722.18));
        series3.getData().add(new XYChart.Data<>(italy, 17557.31));
        series3.getData().add(new XYChart.Data<>(usa, 92633.68));


        //显示图表
        bc.getData().addAll(series1, series2, series3);
    }
}
