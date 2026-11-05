package pkg13unitproject6;



public class Rectangle  {
    double side1;
    double side2;
    
    public Rectangle(double side1,double side2){
        
    this.side1=side1;
    this.side2=side2;
    }
    
    public double getArea(){
    return side1*side2;
    }
    
    public  double getPerimeter(){
    return (side1*2)+(side2*2);
            }
}
