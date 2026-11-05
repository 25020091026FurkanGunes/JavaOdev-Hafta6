package pkg13unitproject7;



public class Rectangle extends GeometricObject {
    double side1;
    double side2;
    
    public Rectangle(double side1,double side2){
        super();
    this.side1=side1;
    this.side2=side2;
    }
    
    @Override
    public double getArea(){
    return side1*side2;
    }
    
    @Override
    public  double getPerimeter(){
    return (side1*2)+(side2*2);
            }
}
