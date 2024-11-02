public class circle{
    double radius;
    String color;
 circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double getradius(){
        return radius;
    }
    public String getcolor(){
        return color;
    }
    public void setradius(double newradius){
        this.radius=newradius;
    }
    public void setcolor(String newcolor){
        this.color=newcolor;
    }
    public double area(){
        return 3.142*radius*radius;
    }
    public String tostring(){
        return " The radius is:"+ getradius()+"\n"+
        "The color is:"+ getcolor()+"\n"+
        "The area is:"+ area();
    
    
    }
}