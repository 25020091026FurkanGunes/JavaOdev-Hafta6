/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13unitproject7;

class Circle extends GeometricObject {
    double radius;
    
    public Circle(double radius){
        super();
    this.radius=radius;
    }
    @Override
   public double getArea(){
   return Math.PI*radius*radius;
   }
     @Override
   public double getPerimeter(){
   return 2*Math.PI*radius;
   }


   


    
}
