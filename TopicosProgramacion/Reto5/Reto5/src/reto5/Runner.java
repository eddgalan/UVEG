/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

/**
 *
 * @author eddga
 */
public class Runner {
    private String name;
    private double speed;
    
    public Runner(String name){
        this.name = name;
        this.speed = this.getRandomIntBetweenRange(0, 30);
    }
    
    public double getRandomIntBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return x;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getSpeed(){
        return this.speed;
    }
    
}
