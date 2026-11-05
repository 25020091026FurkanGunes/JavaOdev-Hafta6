package pkg13unitproject8;
import java.util.ArrayList;
public class Stack implements Cloneable {
    
    
    private ArrayList<Object> liste=new ArrayList<>();
   
    public boolean isEmpty(){
    return liste.isEmpty();
    }
    public void ekleme(Object eleman){
    liste.add(eleman);
    }
    
    @Override
    public Object clone(){
    try{
        Stack s=(Stack) super.clone();
        s.liste=(ArrayList<Object>) this.liste.clone();
        return s;
    }
    catch (CloneNotSupportedException ex) {
            return null; 
        }
    }
    
    public static void main(String[] args) {
        Stack s=new Stack();
        s.ekleme("elma");
        s.ekleme("armut");
        s.ekleme("erik");
        Stack s1=(Stack) s.clone();
        s1.ekleme("kivi");
        System.out.println("orijinal="+s.liste);
        System.out.println("klon="+s1.liste);
    }
    
}
