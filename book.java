public class book{
    double heigth;
    int pages;
    String author;
    String title;
    book(double heigth,int pages,String author,String title){
        this.heigth=heigth;
        this.pages=pages;
        this.author=author;
        this.title=title;
    }
    public double getheigth(){
        return heigth;
    }
    public int getpages(){
        return pages;
    }
    public String getauthor(){
        return author;
    }
    public String gettitle(){
    return title;
    }
    public void setheigth(double newheigth){
        this.heigth=newheigth;
    }
     public void setpages(int newpages){
        this.pages=newpages;
    }
     public void setauthor(String newauthor){
        this.author=newauthor;
    }
     public void settitle(String newtitle){
        this.title=newtitle;
    }
    public String tostring(){
        return"Heigth"+ getheigth()+"\n"+
        "Pages"+ getpages()+"\n"+
        "author"+getauthor()+"\n"+
        "Title"+ gettitle();

    }
}