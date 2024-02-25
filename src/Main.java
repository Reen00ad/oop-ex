import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
       // employee
//        Employee e1=new Employee("1","Reenad",10000);
//        System.out.println("Id: "+e1.getId());
//        System.out.println("Name : "+e1.getName());
//        System.out.println("salary : "+e1.getSalary());
//        System.out.println("Annual salary : "+e1.getAnnualSalary());
////        System.out.println("enter percent for salary : ");
//       // e1.raisedSalary(50)
//
//        System.out.println("raised salary : "+e1.raisedSalary(2));


        //Account
        Account ac1=new Account("1","Reenad",20000);
        Account ac2=new Account("2","nouf",30000);
        ac2.debit(5000);
        ac1.credit(1000);
        System.out.println("Id : "+ac1.getId());
        System.out.println("Name : "+ac1.getName());
        System.out.println("balance : "+ac1.getBalance());
        System.out.printf("------------------------------");
        System.out.println();

        System.out.println("Id : "+ac2.getId());
        System.out.println("Name : "+ac2.getName());
        System.out.println("balance : "+ac2.getBalance());
        System.out.printf("------------------------------");
        System.out.println();

        ac1.transferTo(ac2,500);
        System.out.println("After transfer:");
        System.out.println("Sender's account balance: " + ac1.getBalance());
        System.out.println("Recipient's account balance: " + ac2.getBalance());



    }
}