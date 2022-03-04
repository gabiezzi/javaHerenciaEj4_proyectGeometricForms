/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.CircleEntity;
import entity.RectangleEntity;
import java.util.Scanner;

/**
 *
 * @author Gabi
 */
public class GeometricFormsMenu {
    
    CircleServiceImplement newServiceCircle ;
    RectangleServiceImplement newServiceRectangle;
    Scanner sc ;

    public GeometricFormsMenu() {
    newServiceCircle = new CircleServiceImplement();
    newServiceRectangle = new RectangleServiceImplement();
    sc = new Scanner(System.in);
    }
    
    
    public void menu(){
        
        System.out.println("---     menu        ---\n"
                + "1. create circle.\n"
                + "2. create rectangle.\n"
                + "3. finish program.");
        
        
        int optionMenu = 0;
        
        while (optionMenu!=3) {
            
           optionMenu = sc.nextInt();
           
            switch (optionMenu) {
            case 1:
                
                CircleEntity newCircle = newServiceCircle.createCircle();
                
                newCircle.setArea(newServiceCircle.calculateArea(newCircle));
                newCircle.setPerimeter(newServiceCircle.calculatePerimeter(newCircle));
                System.out.println(newCircle.toString());
                
                
                break;
            
            case 2:
                
                RectangleEntity newRectangle = newServiceRectangle.createRectangle();
                newRectangle.setArea(newServiceRectangle.calculateArea(newRectangle));
                newRectangle.setPerimeter(newServiceRectangle.calculatePerimeter(newRectangle));
                System.out.println(newRectangle.toString());
                
                break;
            
            case 3:
                
                System.out.println("The program has finished.");
                
                break;
            
           
            
        }
            
            
            
        }
        
        
        
        
    }
    
}
