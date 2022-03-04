package service;

import entity.GeometricFormsEntity;

public interface GeometricFormsService {

    final double numeroPi = Math.PI;

    public double calculateArea(GeometricFormsEntity newGeoForm);

    public double calculatePerimeter(GeometricFormsEntity newGeoForm);

}
