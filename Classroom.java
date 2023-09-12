import java.util.ArrayList;
import java.util.Scanner;
public class Classroom {
   private int classId;
   private int numberOfStudent ;
   ArrayList<Student> listStudents = new ArrayList<>();

    public Classroom() {
    }

    public Classroom(int classId, int numberOfStudent) {
        this.classId = classId;
        this.numberOfStudent = numberOfStudent;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap Class ID : ");
        classId = s.nextInt();
         System.out.println("Nhap so hoc sinh : ");
         numberOfStudent = s.nextInt();
          ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap hoc sinh thu " + (i + 1) + ": ");
            Student student = new Student();
            student.input();
            students.add(student);

        }
    }
    public void output(){
         System.out.println("ClassID la : "+classId);
          System.out.println("So hoc sinh la : "+numberOfStudent);
          
    }
    public ArrayList<Student> searchByName(String name ){
        
    }
           
}
