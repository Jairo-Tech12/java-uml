   public class Employee{
        int id;
        String firstname;
        String lastname;
        int salary;
        
       Employee(int id,String firstname,String lastname,int salary){
            this.id=id;
            this.firstname=firstname;
            this.lastname=lastname;
            this.salary=salary;
        }
        public int getid(){
            return id;
        }
        public String getfirstname(){
            return firstname;
        }
        public String getlastname(){
            return lastname;
        }
        public int getsalary(){
            return salary;
        }
        public void setid(int newid){
            this.id=newid;
        }
         public void setfirstname(String newfirstname){
            this.firstname=newfirstname;
        }
         public void setlastname(String newlastname){
            this.lastname=newlastname;
        }
         public void setsalary(int newsalary){
            this.salary=newsalary;
        }
        public double annualsalary(){
            return salary*12;
        }
        public String tostring(){
            return"The id is:"+ getid()+"\n"+
            "The first name:"+ getfirstname()+"\n"+
            "The last name:"+ getlastname()+"\n"+
            "The salary is"+ getsalary()+"\n"+
            "The Annual salary is:"+ annualsalary();
        }
    }
