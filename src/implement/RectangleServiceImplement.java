/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.GeometricFormsEntity;
import entity.RectangleEntity;
import java.util.Scanner;
import service.GeometricFormsService;

/**
 *
 * @author Gabi
 */
public class RectangleServiceImplement implements GeometricFormsService {

    Scanner sc;

    public RectangleServiceImplement() {

        sc = new Scanner(System.in);

    }

    public RectangleEntity createRectangle() {

        RectangleEntity newRectangle = new RectangleEntity();

        System.out.println("Creating rectangle : insert height -> ");
        newRectangle.setHeight(sc.nextDouble());

        System.out.println("Creating rectangle : insert width -> ");
        newRectangle.setWidth(sc.nextDouble());

        return newRectangle;

    }

    @Override
    public double calculateArea(GeometricFormsEntity newGeoForm) {

        RectangleEntity newRectangle = (RectangleEntity) newGeoForm;
        return newRectangle.getHeight() * newRectangle.getWidth();

    }

    @Override
    public double calculatePerimeter(GeometricFormsEntity newGeoForm) {

        RectangleEntity newRectangle = (RectangleEntity) newGeoForm;

        return 2 * newRectangle.getHeight() + 2 * newRectangle.getWidth();
    }

}
