public class customer{
    int id;
    String name;
    int discount;
    customer(int id,String name,int discount){
        this.id=id;
        this.name=name;
        this.discount=discount;
   }
   public int getid(){
    return id;
   }
   public String getname(){
    return name;
   }
   public int getdiscount(){
    return discount;
   }
   public void setid(int newid){
    this.id=newid;
   }
   public void setdiscount(int newdiscount){
    this.discount=newdiscount;
   }
   public String tostring(){
    return" id :"+ getid()+"\n"+
    "Name:"+ getname()+"\n"+
    "Discount"+ getdiscount();
   }   

}