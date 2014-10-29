/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmu.edu.knn;

import java.awt.List;
import java.awt.Point;
import java.util.ArrayList;


public class Coordinate {
    
    private static final int padding = 30;
    private int width;
    private int height;
    
    Point origin;
    ArrayList<Point> pointsList;
    
    public Coordinate(int height, int width, int scale, ArrayList<DataSet> p1, ArrayList<DataSet> p2){
        
        ArrayList<DataSet> train = new ArrayList<DataSet>();
        ArrayList<DataSet> test = new ArrayList<DataSet>();
        train = p1;
        test = p2;
        
        origin = new Point(padding, height - padding);
        pointsList = new ArrayList<Point>();
        
        int total = 0;
        if (train != null) {
            total = train.size();
        }
        
        ArrayList<double[]> trainData = new ArrayList<double[]>();
                
        
        for (int i = 0; i < total; i++) {
            trainData.add(i, train.get(i).getdata());           
        }
        
    }
    
    public void addPoint(Point newPoint) {
		pointsList.add(newPoint);
                
    }
    
    public int[] projectPoint(double[] point) {
        return null;
    }
    
}
