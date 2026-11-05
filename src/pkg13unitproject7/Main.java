package pkg13unitproject7;

public class Main {

    
    public static void main(String[] args) {
        GeometricObject[] sayilar=new GeometricObject[5];
        sayilar[0]=new Square(4);
        sayilar[1]=new Rectangle(4,5);
        sayilar[2]=new Circle(8);
        sayilar[3]=new Square(9);
           for(int i=0;i<sayilar.length;i++){
               System.out.println("seklin alani: " + sayilar[i].getArea());
               if(sayilar[i] instanceof Colorable){
                   ((Colorable) sayilar[i]).howToColor();
                   System.out.println("-------------------------");
               }
               
    }

     

}    
}
