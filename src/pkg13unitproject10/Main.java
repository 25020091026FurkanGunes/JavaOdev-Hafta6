/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13unitproject10;

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
// 2. Rectangle Sınıfı (GeometricObject & Comparable)
// ==========================================
class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    /** Alanlarına göre karşılaştırma işlemi */
    @Override
    public int compareTo(Rectangle o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    /** Alanları eşitse true döner */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            return this.getArea() == ((Rectangle) o).getArea();
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenişlik: " + width + ", Yükseklik: " + height + ", Alan: " + getArea();
    }
}

// ==========================================
// 3. Main Sınıfı (Test Alanı)
// ==========================================
public class Main {
    public static void main(String[] args) {
        System.out.println("=== RECTANGLE TEST ===");
        
        Rectangle r1 = new Rectangle(4.0, 5.0, "sarı", true);  // Alan = 20.0
        Rectangle r2 = new Rectangle(2.0, 10.0, "mavi", false); // Alan = 20.0
        Rectangle r3 = new Rectangle(3.0, 5.0, "yeşil", true);  // Alan = 15.0

        System.out.println("r1 Alanı: " + r1.getArea());
        System.out.println("r2 Alanı: " + r2.getArea());
        System.out.println("r3 Alanı: " + r3.getArea());
        System.out.println("----------------------------------------");

        System.out.println("r1.equals(r2) (Boyutlar farklı ama alanlar eşit): " + r1.equals(r2));
        System.out.println("r1.equals(r3) (Alanlar farklı): " + r1.equals(r3));
        System.out.println("r1.compareTo(r3) sonucu: " + r1.compareTo(r3));
        System.out.println("r3.compareTo(r1) sonucu: " + r3.compareTo(r1));
    }
}