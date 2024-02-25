public class Employee {
    private String Id;
    private String name;
    private int salary;

    Employee(){

    }
    Employee(String Id,String name,int salary){
        this.Id=Id;
        this.name=name;
        this.salary=salary;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name=name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        int annsal=salary * 12;
        return annsal ;
    }
    public int raisedSalary(int percent){
        salary=salary*percent/100;
        return salary;
    }

    public String toString() {
       return Id+name+salary;
    }
}
