public class circlemain{
    public static void main(String[]args){
        circle cir=new circle(1,"red");
        System.out.println(cir.tostring());
        circle cir1=new circle(3,"blue");
        System.out.println(cir1.tostring());

        cir.setradius(2);
        System.out.println("the radius is"+ cir.getradius());
    System.out.println(cir.tostring());
    }
}