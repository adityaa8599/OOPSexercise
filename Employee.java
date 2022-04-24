public class Employee {
      int id;
      int salary;
      String FirstName;
      String LastName;

      public Employee(int i,String Fn,String Ln,int s)
      {
           id=i;
           FirstName=Fn;
           LastName=Ln;
           salary=s;
      }
      public int getID(){
            return id;
      }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
    public  String getName(){
          return  FirstName+LastName;
      }
    public int getSalary() {
        return salary;

    }
    public void  setSalary(int  newSalary) {
        salary=newSalary;
    }
    public int getAnnualSalary() {
        return salary*12;}

    public int raiseSalary(int x) {

          salary=salary+((salary*x)/100);
          return salary;
    }
    public String toString() {
        return "Employee[id="+id+",name="+FirstName+" "+LastName+",salary="+salary+"]";
    }






































    }
