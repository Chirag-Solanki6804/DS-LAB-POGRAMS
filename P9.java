/*9. Create array of object of class Student_Detail with attributes Enrollment_no,
Name, Sem, CPI for 5 students, scan their information and print it. (Home Work)*/
import java.util.*;
class Student_Detail{
	double enrollment_no;
    String name;
    int sem;
    double cpi;
    Student_Detail(double enrollment_no,String name,int sem,double cpi){
    	this.enrollment_no=enrollment_no;
    	this.name=name;
    	this.sem=sem;
    	this.cpi=cpi;
    }
    Student_Detail(){
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter Enrollment_no : ");
    	this.enrollment_no=sc.nextDouble();
    	System.out.print("Enter Name : ");
    	this.name=sc.nextLine();
    	System.out.print("Enter Semester : ");
    	this.sem=sc.nextInt();
    	System.out.print("Enter CPI : ");
    	this.cpi=sc.nextDouble();
    }
    void print_Stu_Detail(){
        System.out.println("Enrollment_no :"+this.enrollment_no);
        System.out.println("Name :"+this.name);
        System.out.println("Semester :"+this.sem);
        System.out.println("CPI :"+this.cpi);
    }

}
public class P9{
	public static void main(String[] args) {
		Student_Detail[] s=new Student_Detail[5];
		for(int i=1;i<6;i++){
			System.out.println("           Student Detail "+i);
			s[i]=new Student_Detail();
			System.out.println("----------------------------------------------------------");
		    s[i].print_Stu_Detail();
		    System.out.println("\n\n");
		}
	}
}
