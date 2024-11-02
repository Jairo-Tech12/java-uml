public class mypointmain{
    public static void main(String[]args){
        mypoint my=new mypoint();
        System.out.println(my.tostring());
        my.setx(6);
        my.sety(4);
        System.out.println("X is:" + my.getx());
        System.out.println("Y is:"+ my.gety());
    
        mypoint my1=new mypoint(33,54);
        System.out.println(my1.tostring());

    }
}