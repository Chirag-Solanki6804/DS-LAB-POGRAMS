/*8. Create class Employee_Detail with attributes Employee_id, Name, Designation, and Salary.
Write a program to read the detail from user and print it.*/
import java.util.Scanner;
class Employee_Detail{
    int employee_id;
    String name;
    String designation;
    double salary;

    Employee_Detail(int employee_id,String name,String designation,double salary){
        this.employee_id=employee_id;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }
    Employee_Detail(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Id : ");
        this.employee_id=sc.nextInt();
        System.out.print("Enter Name : ");
        this.name=sc.nextLine();
        System.out.print("Enter Designation : ");
        this.designation=sc.nextLine();
        System.out.print("Enter Salary : ");
        this.salary=sc.nextDouble();
    }

    void print_Emp_Detail(){
        System.out.println("Employee Id :"+this.employee_id);
        System.out.println("Name :"+this.name);
        System.out.println("Designation :"+this.designation);
        System.out.println("salary :"+this.salary);
    }
}
public class P8{
    public static void main(String[] args) {
        Employee_Detail ed1=new Employee_Detail(101,"Chirag solanki","CEO",5000000);
        ed1.print_Emp_Detail();
        Employee_Detail ed2=new Employee_Detail();
        System.out.println("\n\n\n");
        ed2.print_Emp_Detail();
    }
}