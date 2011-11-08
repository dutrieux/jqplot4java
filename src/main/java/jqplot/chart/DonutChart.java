/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import jqplot.Legend;
import jqplot.SeriesDefaults;
import jqplot.plugin.PluginClasses;

/**
 *
 * @author bernardo.moura
 */
public class DonutChart {

    private Legend legend;
    private SeriesDefaults seriesDefaults = new SeriesDefaults();

    public DonutChart() {
        legend = new Legend(true, "e");
        seriesDefaults.setRenderer(PluginClasses.DonutRenderer);
        seriesDefaults.getRendererOptions().setSliceMargin(4);
        seriesDefaults.getRendererOptions().setDataLabels("value");
    }

    public PluginClasses getRenderer() {
        return seriesDefaults.getRenderer();
    }

    public void setRenderer(PluginClasses renderer) {
        seriesDefaults.setRenderer(renderer);
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public SeriesDefaults getSeriesDefaults() {
        return seriesDefaults;
    }

    public void setSeriesDefaults(SeriesDefaults seriesDefaults) {
        this.seriesDefaults = seriesDefaults;
    }
}
