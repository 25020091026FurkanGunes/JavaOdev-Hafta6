package pkg13unitproject6;


 public class Circle  {
    double radius;
    
    public Circle(double radius){
        super();
    this.radius=radius;
    }
    
   public double getArea(){
   return Math.PI*radius*radius;
   }
        
   public double getPerimeter(){
   return 2*Math.PI*radius;
   }

   


    
}
