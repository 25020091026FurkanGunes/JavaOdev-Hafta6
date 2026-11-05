/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13unitproject7;


public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
    }

    
    public Square(double side) {
        super();
        this.side = side;
    }
    
    

    public double getSide() {
        return side;
    }

   
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
    return side*side;   
    }

    @Override
    public double getPerimeter() {
    return 4*side;
    }

    @Override
    public String howToColor() {
    return "4 Kenarıda renklendir";
    }
    
}
