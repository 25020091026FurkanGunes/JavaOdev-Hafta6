package pkg13unitproject6;
class Main {

  
    public static void main(String[] args) {
        ComparableCircle c=new ComparableCircle(5);
        ComparableCircle c2=new ComparableCircle(6);
        Rectangle r1=new Rectangle(6,7);
        ComparableCircle enBuyuk=ComparableCircle.max(c, c2);
        System.out.println(enBuyuk.getArea());
        if (c.getArea() > r1.getArea()) {
            System.out.println("Daire Dikdortgenden daha buyuktur.");
        } 
        else if (c.getArea() < r1.getArea()) {
            System.out.println(" Dikdortgen Daireden daha buyuktur.");
        } 
        else {
            System.out.println(" iki seklin alani birbirine esittir.");
        }
        
    }
    
}
