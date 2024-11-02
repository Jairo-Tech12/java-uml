public class timemain{
    public static void main(String[]args){
        time t1=new time(01,02,03);
        System.out.println(t1.tostring());
        t1.sethour(4);
        t1.setminute(5);
        t1.setsecond(6);
        System.out.println(t1.tostring());
    }
}