/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.plugin;

import jqplot.Renderer;
/**
 *
 * @author bernardo.moura
 */
public class CanvasGridRenderer implements Renderer {
    private ShadowRenderer shadowRenderer = null;
    private String pluginName = null;
    public CanvasGridRenderer(String pluginName){
        shadowRenderer = new ShadowRenderer();
        this.pluginName = pluginName;
    }
   
     @Override
    public String pluginName(){
        return null;
    }

}