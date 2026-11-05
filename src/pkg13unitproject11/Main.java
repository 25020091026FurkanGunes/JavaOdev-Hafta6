/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13unitproject11;
import java.util.Date;

// ==========================================
// 1. GeometricObject Sınıfı (Soyut Taban Sınıf)
// ==========================================
abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Oluşturulma tarihi: " + dateCreated + "\nRenk: " + color + " ve Dolu mu: " + filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}

// ==========================================
// 2. Octagon Sınıfı (GeometricObject, Comparable & Cloneable)
// ==========================================
class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon() {
        this(0.0);
    }

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    /** Düzgün sekizgen alan formülü: (2 + 4 / √2) * side * side */
    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    /** Düzgün sekizgen çevre formülü: 8 * side */
    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    /** Kenar uzunluğuna (dolayısıyla alana) göre karşılaştırma */
    @Override
    public int compareTo(Octagon o) {
        if (this.side > o.side)
            return 1;
        else if (this.side < o.side)
            return -1;
        else
            return 0;
    }

    /** Shallow copy (sadece ilkel veri tipi içerdiği için super.clone yeterlidir) */
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nKenar Uzunluğu: " + side + ", Alan: " + getArea() + ", Çevre: " + getPerimeter();
    }
}

// ==========================================
// 3. Main Sınıfı (Test Alanı)
// ==========================================
public class Main {
    public static void main(String[] args) {
        System.out.println("=== OCTAGON TEST ===");
        
        // Kenar uzunluğu 5 olan Octagon nesnesi oluşturuluyor
        Octagon oct1 = new Octagon(5.0, "kırmızı", true);
        
        System.out.println("Orijinal Sekizgen (oct1):");
        System.out.println("Alan: " + oct1.getArea());
        System.out.println("Çevre: " + oct1.getPerimeter());
        System.out.println("----------------------------------------");

        // clone() metodu ile yeni nesne klonlanıyor
        Octagon oct2 = (Octagon) oct1.clone();
        System.out.println("Klonlanan Sekizgen (oct2):");
        System.out.println("Alan: " + oct2.getArea());
        System.out.println("Çevre: " + oct2.getPerimeter());
        System.out.println("----------------------------------------");

        // compareTo metodu ile iki nesne karşılaştırılıyor
        int compareResult = oct1.compareTo(oct2);
        System.out.println("oct1.compareTo(oct2) sonucu: " + compareResult);

        if (compareResult == 0) {
            System.out.println("Sonuç: İki sekizgen tamamen eşit büyüklükte.");
        } else if (compareResult > 0) {
            System.out.println("Sonuç: oct1, oct2 nesnesinden daha büyük.");
        } else {
            System.out.println("Sonuç: oct1, oct2 nesnesinden daha küçük.");
        }
    }
}