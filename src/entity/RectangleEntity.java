/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Gabi
 */
public class RectangleEntity extends GeometricFormsEntity {
    
   private double height;
   private double width;

    public RectangleEntity() {
     
    }

    

    public RectangleEntity(double height, double width, double area, double perimeter) {
        super(area, perimeter);
        this.height = height;
        this.width = width;
    }

    

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "RectangleEntity{" + "height=" + height + ", width=" + width + "\n }" + super.toString();
    }
   
   
    
}
