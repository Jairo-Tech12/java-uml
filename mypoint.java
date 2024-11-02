public class mypoint{
    int x;
    int y;
    mypoint(){
        x=0;
        y=0;
    }
    mypoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public void setx(int newx){
        this.x=newx;
    }
    public void sety(int newy){
        this.y=newy;
    }
    public String tostring(){
        return" x:"+getx()+"y:"+gety();
    }
    }