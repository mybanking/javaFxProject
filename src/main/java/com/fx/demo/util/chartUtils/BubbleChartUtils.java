package com.fx.demo.util.chartUtils;

import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
/**
 * @DESCRIPTION:
 * @AUTHOR: KONG De Yan
 * @DATE: Create in  23:16 2020/12/5
 */
public class BubbleChartUtils
{
    private BubbleChart bubbleChart;

    public BubbleChartUtils(BubbleChart bubbleChart)
    {
        this.bubbleChart = bubbleChart;
    }

    public void operateBubbleChart()
    {
        //获取两条轴的对象
        NumberAxis xAxis = (NumberAxis)bubbleChart.getXAxis();
        NumberAxis yAxis = (NumberAxis)bubbleChart.getYAxis();
        //设定轴线的名称
        xAxis.setLabel("周");
        yAxis.setLabel("产品预算");
        //设定表格名称
        bubbleChart.setTitle("预算监控");

        //数据1
        XYChart.Series<Number, Number> series1 = new XYChart.Series();
        series1.setName("Product 1");
        series1.getData().add(new XYChart.Data<>(3, 35));
        series1.getData().add(new XYChart.Data<>(12, 60));
        series1.getData().add(new XYChart.Data<>(15, 15));
        series1.getData().add(new XYChart.Data<>(22, 30));
        series1.getData().add(new XYChart.Data<>(28, 20));
        series1.getData().add(new XYChart.Data<>(35, 41));
        series1.getData().add(new XYChart.Data<>(42, 17));
        series1.getData().add(new XYChart.Data<>(49, 30));

        //数据2
        XYChart.Series<Number, Number> series2 = new XYChart.Series();
        series2.setName("Product 2");
        series2.getData().add(new XYChart.Data<>(8, 15));
        series2.getData().add(new XYChart.Data<>(13, 23));
        series2.getData().add(new XYChart.Data<>(15, 45));
        series2.getData().add(new XYChart.Data<>(24, 30));
        series2.getData().add(new XYChart.Data<>(38, 78));
        series2.getData().add(new XYChart.Data<>(40, 41));
        series2.getData().add(new XYChart.Data<>(45, 57));
        series2.getData().add(new XYChart.Data<>(47, 23));

        bubbleChart.getData().addAll(series1, series2);
    }
}
