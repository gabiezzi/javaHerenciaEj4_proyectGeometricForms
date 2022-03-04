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
public class CircleEntity extends GeometricFormsEntity {

       
    private double radio;

    public CircleEntity() {
       
    }

    public CircleEntity(double radio, double area, double perimeter) {
        super(area, perimeter);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "CircleEntity{" + "radio=" + radio + "\n }" + super.toString();
    }
    
    
    
    
    
    
}
