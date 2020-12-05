package com.fx.demo.util.chartUtils;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
/**
 * @DESCRIPTION:
 * @AUTHOR: KONG De Yan
 * @DATE: Create in  23:16 2020/12/5
 */
public class StackedBarChartUtils
{
    StackedBarChart stackedBarChart;

    public StackedBarChartUtils(StackedBarChart stackedBarChart)
    {
        this.stackedBarChart = stackedBarChart;
    }

    public void operateStackedBarChart()
    {
        final String austria = "Austria";
        final String brazil = "Brazil";
        final String france = "France";
        final String italy = "Italy";
        final String usa = "USA";
        //获取两条轴的对象
        CategoryAxis xAxis = (CategoryAxis) stackedBarChart.getXAxis();
        NumberAxis yAxis = (NumberAxis) stackedBarChart.getYAxis();
        //设定轴线的名称
        xAxis.setLabel("国家");
        yAxis.setLabel("数值");

        final XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("2003");
        series1.getData().add(new XYChart.Data<>(austria, 25601.34));
        series1.getData().add(new XYChart.Data<>(brazil, 20148.82));
        series1.getData().add(new XYChart.Data<>(france, 10000));
        series1.getData().add(new XYChart.Data<>(italy, 35407.15));
        series1.getData().add(new XYChart.Data<>(usa, 12000));

        final XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("2004");
        series2.getData().add(new XYChart.Data<>(austria, 57401.85));
        series2.getData().add(new XYChart.Data<>(brazil, 41941.19));
        series2.getData().add(new XYChart.Data<>(france, 45263.37));
        series2.getData().add(new XYChart.Data<>(italy, 117320.16));
        series2.getData().add(new XYChart.Data<>(usa, 14845.27));

        final XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName("2005");
        series3.getData().add(new XYChart.Data<>(austria, 45000.65));
        series3.getData().add(new XYChart.Data<>(brazil, 44835.76));
        series3.getData().add(new XYChart.Data<>(france, 18722.18));
        series3.getData().add(new XYChart.Data<>(italy, 17557.31));
        series3.getData().add(new XYChart.Data<>(usa, 92633.68));

        //显示图表
        stackedBarChart.getData().addAll(series1, series2, series3);
    }
}
