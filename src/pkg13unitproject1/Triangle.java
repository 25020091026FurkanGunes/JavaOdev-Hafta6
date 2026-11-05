package pkg13unitproject1;
import java.util.Scanner;

 
public class Triangle extends GeometricObject2 {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this(1.0,1.0,1.0);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getSide1() {
        return side1;
    }

 
    public void setSide1(double side1) {
        this.side1 = side1;
    }

 
    public double getSide2() {
        return side2;
    }

    
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    
    public double getSide3() {
        return side3;
    }

    
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    @Override
     public double getArea(){
         return side1*side2/2;
     }
    @Override
       public double getPerimeter(){
         return side1+side2+side3;
     }
       @Override
     public String toString(){
     return "side 1="+side1+" side 2="+side2+" side 3="+side3 ;
     }
     
    
    
    public static void main(String[] args) {
    
    Scanner s1=new Scanner(System.in);
        System.out.println("Renk ve dogruluk degerini girin");
                  String renk=s1.nextLine();
                     boolean dogruluk = s1.nextBoolean();

        System.out.println("Kenar uzunluklarini girin");

            double k1=s1.nextDouble();
             double k2=s1.nextDouble();
             double k3=s1.nextDouble();

            Triangle k = new Triangle(k1,k2,k3);
            k.setColor(renk);
            k.setFilled(dogruluk);
            
              System.out.println("Alan= "+k.getArea()+" Cevre= "+k.getPerimeter()+
                                "Renk= "+k.getColor()+"Doluluk= "+k.isFilled());
             System.out.println();
              

    }
}
