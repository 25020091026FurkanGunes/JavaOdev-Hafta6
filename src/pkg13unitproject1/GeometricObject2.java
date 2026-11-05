package pkg13unitproject1;
import java.util.Date;

public abstract class GeometricObject2 {
    private String color;
    private boolean filled;
    private Date gun;

    public GeometricObject2() {
        color="white";
        filled=true;
        gun= new Date();
    }

    public GeometricObject2(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    
    public  String getColor() {
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

    public Date getGun() {
        return gun;
    }
     public abstract double getArea();
       public abstract double getPerimeter();
    @Override
    public String toString(){
        return "created on="+gun+" color="+color+" +filled="+filled;
    
    }
    
     
}
