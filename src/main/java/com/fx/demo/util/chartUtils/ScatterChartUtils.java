package com.fx.demo.util.chartUtils;

import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
/**
 * @DESCRIPTION:
 * @AUTHOR: KONG De Yan
 * @DATE: Create in  23:16 2020/12/5
 */
public class ScatterChartUtils
{
    ScatterChart scatterChart;

    public ScatterChartUtils(ScatterChart scatterChart)
    {
        this.scatterChart = scatterChart;
    }

    public void operateScatterChart()
    {
        //获取两条轴的对象
        final NumberAxis xAxis = (NumberAxis) scatterChart.getXAxis();
        final NumberAxis yAxis = (NumberAxis) scatterChart.getYAxis();
        //设定轴线的名称
        xAxis.setLabel("时间（单位：年）");
        yAxis.setLabel("回本");
        //设定图表的名称
        scatterChart.setTitle("投资概览");

        //数据1
        XYChart.Series<Number, Number> series1 = new XYChart.Series<>();
        series1.setName("项目1");
        series1.getData().add(new XYChart.Data<>(4.2, 193.2));
        series1.getData().add(new XYChart.Data<>(2.8, 33.6));
        series1.getData().add(new XYChart.Data<>(6.2, 24.8));
        series1.getData().add(new XYChart.Data<>(1, 14));
        series1.getData().add(new XYChart.Data<>(1.2, 26.4));
        series1.getData().add(new XYChart.Data<>(4.4, 114.4));
        series1.getData().add(new XYChart.Data<>(8.5, 323));
        series1.getData().add(new XYChart.Data<>(6.9, 289.8));
        series1.getData().add(new XYChart.Data<>(9.9, 287.1));
        series1.getData().add(new XYChart.Data<>(0.9, -9));
        series1.getData().add(new XYChart.Data<>(3.2, 150.8));
        series1.getData().add(new XYChart.Data<>(4.8, 20.8));
        series1.getData().add(new XYChart.Data<>(7.3, -42.3));
        series1.getData().add(new XYChart.Data<>(1.8, 81.4));
        series1.getData().add(new XYChart.Data<>(7.3, 110.3));
        series1.getData().add(new XYChart.Data<>(2.7, 41.2));

        //数据2
        XYChart.Series<Number, Number> series2 = new XYChart.Series<>();
        series2.setName("项目2");
        series2.getData().add(new XYChart.Data<>(5.2, 229.2));
        series2.getData().add(new XYChart.Data<>(2.4, 37.6));
        series2.getData().add(new XYChart.Data<>(3.2, 49.8));
        series2.getData().add(new XYChart.Data<>(1.8, 134));
        series2.getData().add(new XYChart.Data<>(3.2, 236.2));
        series2.getData().add(new XYChart.Data<>(7.4, 114.1));
        series2.getData().add(new XYChart.Data<>(3.5, 323));
        series2.getData().add(new XYChart.Data<>(9.3, 29.9));
        series2.getData().add(new XYChart.Data<>(8.1, 287.4));

        //显示图表
        scatterChart.getData().addAll(series1, series2);
    }
}
