import java.util.Scanner;
public class Student extends Person {
  private int id ;
  private Address address;
  private double gpa; 

    public Student() {
    }

    public Student(int id, Address address, double gpa) {
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }

    public Student(int id, Address address, double gpa, String name, int age, String gender) {
        super();
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }
    public void input(){
        
        super.input();
          Scanner s = new Scanner(System.in);
        System.out.println("Nhap GPA : ");
        gpa = s.nextDouble();
          System.out.println("Nhap dia chi : "); 
        address = new Address();
        address.input();
        System.out.println("Nhap id : ");
        id = s.nextInt();
    }
    public void output(){
        super.output();
        System.out.println("ID la : "+id);
         
          System.out.println("GPA la : "+gpa);
           
          
    }
}
 


