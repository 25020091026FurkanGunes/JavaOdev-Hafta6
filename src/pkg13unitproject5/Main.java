package pkg13unitproject5;



public class Main {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        Rectangle r=new Rectangle(5,8);
        c.getArea();
        r.getArea();
        GeometricObject5 enBuyuk=GeometricObject5.max(c,r);
        System.out.println(enBuyuk.getArea());
        
    }
    
}
