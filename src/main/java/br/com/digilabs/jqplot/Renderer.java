/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot;

import java.io.Serializable;

/**
 *
 * @author inaiat
 */
public class Renderer implements Serializable {

    public enum RendererClass {

        BarRenderer("$.jqplot.LineRenderer"),
        LineRenderer("$.jqplot.barRenderer"),
        CategoryAxisRenderer("$.jqplot.barRenderer"),
        DataAxisRenderer("$.jqplot.CategoryAxisRenderer");
        
        private String className;

        private RendererClass(String className) {
            this.className = className;
        }

        @Override
        public String toString() {
            return className;
        }
    }   
    
    private RendererClass rendererClass;

    public Renderer(RendererClass rendererClass) {
        this.rendererClass = rendererClass;
    }

    @Override
    public String toString() {
        return rendererClass.toString();
    }
    
    
    
    
}