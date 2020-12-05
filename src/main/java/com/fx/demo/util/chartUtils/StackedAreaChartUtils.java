package com.fx.demo.util.chartUtils;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
/**
 * @DESCRIPTION:
 * @AUTHOR: KONG De Yan
 * @DATE: Create in  23:16 2020/12/5
 */
public class StackedAreaChartUtils
{
    private StackedAreaChart stackedAreaChart;

    public StackedAreaChartUtils(StackedAreaChart stackedAreaChart)
    {
        this.stackedAreaChart = stackedAreaChart;
    }

    public void operateStackedAreaChart()
    {
        //获取两条轴线对象
        final CategoryAxis xAxis = (CategoryAxis) stackedAreaChart.getXAxis();
        final NumberAxis yAxis = (NumberAxis) stackedAreaChart.getYAxis();
        //设定轴线名称
        xAxis.setLabel("日");
        yAxis.setLabel("温度");
        //设置图表标题
        stackedAreaChart.setTitle("温度监控(单位：°C)");

        //第一组数据（系列1）
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("三月");
        series1.getData().addAll(
                new XYChart.Data<>("1", 4),
                new XYChart.Data<>("3", 10),
                new XYChart.Data<>("6", 15),
                new XYChart.Data<>("9", 8),
                new XYChart.Data<>("12", 5),
                new XYChart.Data<>("15", 18),
                new XYChart.Data<>("18", 15),
                new XYChart.Data<>("21", 13),
                new XYChart.Data<>("24", 19),
                new XYChart.Data<>("27", 21),
                new XYChart.Data<>("30", 21)
        );
        //系列2
        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("五月");
        series2.getData().addAll(
                new XYChart.Data<>("1", 20),
                new XYChart.Data<>("3", 15),
                new XYChart.Data<>("6", 13),
                new XYChart.Data<>("9", 12),
                new XYChart.Data<>("12", 14),
                new XYChart.Data<>("15", 18),
                new XYChart.Data<>("18", 25),
                new XYChart.Data<>("21", 25),
                new XYChart.Data<>("24", 23),
                new XYChart.Data<>("27", 26),
                new XYChart.Data<>("31", 26)
        );

        //显示图表
        stackedAreaChart.getData().addAll(series1, series2);


    }
}
