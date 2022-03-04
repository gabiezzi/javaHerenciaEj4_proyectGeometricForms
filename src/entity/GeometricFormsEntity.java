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
public class GeometricFormsEntity {
   
    
    protected double area;
    protected double perimeter;

    public GeometricFormsEntity() {
    }

    
    public GeometricFormsEntity(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return " The results are : Area=" + area + ", Perimeter=" + perimeter + '}';
    }
    
    
}
