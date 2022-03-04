
package implement;

import entity.CircleEntity;
import entity.GeometricFormsEntity;

import java.util.Scanner;
import service.GeometricFormsService;

public class CircleServiceImplement implements GeometricFormsService {
    
    Scanner sc;

    public CircleServiceImplement() {
        sc = new Scanner(System.in);
    }
    
    
    
    
    public CircleEntity createCircle(){
        
        CircleEntity newCircle = new CircleEntity();
        
        
        System.out.println("Creating circle : insert radio -> ");
        newCircle.setRadio(sc.nextDouble());
        
        return newCircle;
    }
    

    
    @Override
    public double calculateArea(GeometricFormsEntity newGeoForm) {
        
        CircleEntity newCircle = (CircleEntity)newGeoForm;
        
        return numeroPi * Math.pow(newCircle.getRadio(), 2);
    }

    @Override
    public double calculatePerimeter(GeometricFormsEntity newGeoForm) {
        
        CircleEntity newCircle = (CircleEntity)newGeoForm;
       
        return 2 * numeroPi * newCircle.getRadio();
    }

   
    
    
    
}
