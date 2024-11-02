public class mydate{
    int day;
    int month;
    int year;
    mydate(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public int getday(){
        return day;
    }
public int getmonth(){
    return month;
}
public int getyear(){
    return year;
}
public void setday(int newday){
    this.day=newday;
}
public void setmonth(int newmonth){
    this.month=newmonth;
}
public void setyear(int newyear){
    this.day=newyear;
}
public String tostring(){
    return"Date:"+getday()+"\n"+
    "month:"+getmonth()+"\n"+
    "year:"+getyear();
}
}