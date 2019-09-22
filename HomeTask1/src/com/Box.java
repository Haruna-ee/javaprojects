package com;

public class Box {
//   attributes
    private double width;
    private double depth;
    private double height;
    private String colour;
    private String material;
    private boolean isReusable;
//constructor

    public Box(double width, double depth, double height, String colour, String material, boolean isReusable) {
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.colour = colour;
        this.material = material;
        this.isReusable = isReusable;

    }
//getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isReusable() {
        return isReusable;
    }

    public void setReusable(boolean reusable) {
        isReusable = reusable;
    }
//    method to calculate volume
    public double calculateVolume(){
        return this.depth * this.height * this.width;

    }
//toString
    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", depth=" + depth +
                ", height=" + height +
                ", colour='" + colour + '\'' +
                ", material='" + material + '\'' +
                ", isReusable=" + isReusable +
                '}';
    }
}
