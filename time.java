public class time{
    int hour;
    int minute;
    int second;

    time(int hour,int minute,int second) {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int gethour(){
        return hour;
    }
    public int getminute(){
        return hour;
    }
    public int getsecond(){
        return second;
    }
    public void sethour(int newhour){
        this.hour=newhour;
    }
     public void setminute(int newminute){
        this.minute=newminute;
    }
     public void setsecond(int newsecond){
        this.second=newsecond;
    }
    public String tostring(){
        return"Time:"+ gethour()+getminute()+getsecond();
    }
}