public class course{
    String unitcode;
    String unittitle;
    public course(String unitcode,String unittitle){
        this.unitcode=unitcode;
        this.unittitle=unittitle;
    }
    public String getunitcode(){
        return unitcode;
    }
    public String getunittitle(){
        return unittitle;
    }
    public void setunitcode(String newunitcode){
        this.unitcode=newunitcode;
    }
    public void setunittitle( String newunittitle){
        this.unittitle=newunittitle;
    }
    public String tostring(){
        return"Unitcode:"+getunitcode()+"\n"+
        "unittitle:"+getunittitle();
    }
}
