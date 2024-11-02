public class coursestudent{
    String regno;
    String name;
    String course;
    coursestudent(String regno,String name,String course){
        this.regno=regno;
        this.name=name;
        this.course=course;
        }
        public String getregno(){
            return regno;
        }
          public String getname(){
            return name;
        }
          public String getcourse(){
            return course;
        }
        public void setregno(String newregno){
            this.regno=newregno;
        }
          public void setname(String newname){
            this.name=newname;
        }
          public void setcourse(String newcourse){
            this.course=newcourse;
        }
        public String tostring(){
            return"Reg No is:"+ getregno()+"\n"+
            "Name:"+ getname()+"\n"+
            "Course:"+ getcourse();
        }
}
