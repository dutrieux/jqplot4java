package br.com.digilabs.jqplot.data.item;

/**
 *
 * @author inaiat
 */
public class BubbleItem {

    private Float x;
    private Float y;
    private Float radius;
    private String label;

    public BubbleItem() {
    }

    public BubbleItem(Float x, Float y, Float radius, String label) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }
}
