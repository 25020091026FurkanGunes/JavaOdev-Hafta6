    package pkg13unitproject5;
    import java.util.Date;

    public abstract class GeometricObject5 implements Comparable <GeometricObject5>
    {
        private String color;
        private boolean filled;
        private Date gun;

        public GeometricObject5() {
            color="white";
            filled=true;
            gun= new Date();
        }

        public GeometricObject5(String color, boolean filled) {
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
        @Override
        public int compareTo(GeometricObject5 g){
            if(this.getArea()>g.getArea()){
            return 1;
            }
            else if(this.getArea()==g.getArea()){
            return 0;
            }
            else {
            return -1;
            }
        }
        public static GeometricObject5 max(GeometricObject5 g1, GeometricObject5 g2){
        if(g1.compareTo(g2)>=0){
        return g1;
        }
        else{
        return g2;
        }
        }


    }
