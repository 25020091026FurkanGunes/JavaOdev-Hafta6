package pkg13unitproject5;


 class Circle extends GeometricObject5 {
    double radius;
    
    public Circle(double radius){
        super();
    this.radius=radius;
    }
    @Override
   public double getArea(){
   return Math.PI*radius*radius;
   }
     @Override
   public double getPerimeter(){
   return 2*Math.PI*radius;
   }


   


    
}
