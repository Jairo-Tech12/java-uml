public class invoice{
    int id;
    String desc;
    int  qty;
    double unitprice;
    invoice(int id,String desc,int qty,double unitprice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitprice=unitprice;
    }
    public int getid(){
        return id;
    }
    public String getdesc(){
        return desc;
    }
    public int getqty(){
        return qty;
    }
    public double getunitprice(){
        return unitprice;
    }
    public void setid(int newid){
        this.id=newid;
    }
    public void setdesc(String newdesc){
        this.desc=newdesc;
  }
   public void setqty(int newqty){
        this.qty=newqty;
  }
   public void setunitprice(double newunitprice){
        this.unitprice=newunitprice;
}
public String tostring(){
    return"The id:"+ getid()+"\n"+
    "The desc id:"+ getdesc()+"\n"+
    "The qty is"+ getqty()+"\n"+
    "The unit price is"+ getunitprice();
    }
}