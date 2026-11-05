package pkg13unitproject6;


public  class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }
    @Override
    public int compareTo(ComparableCircle c){
    if(this.getArea()>c.getArea()){
    return 1;
    }
    if(this.getArea()==c.getArea()){
    return 0;
    }
    else{
    return -1;
    }
    }
    
    public static ComparableCircle max(ComparableCircle c1,ComparableCircle c2){
    if(c1.compareTo(c2)>=0 ){
    return c1;
    }
    else{
    return c2;
    }
    }

  
    
    
}
