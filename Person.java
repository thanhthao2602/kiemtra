import java.util.Scanner;
public class Person {
  protected String name;
 protected int age ;
 protected String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void input(){
       Scanner s = new Scanner(System.in);
       System.out.println("Nhap ten : ");
       name = s.nextLine();
       System.out.println("Nhap tuoi : ");
       age = s.nextInt();
       System.out.println("Nhap gioi tinh : ");
       gender = s.nextLine();
    }
    public void output(){
        System.out.println("Ten la : "+name);
        System.out.println("Tuoi la : "+age);
        System.out.println("Gioi tinh la : "+gender);
    }   
}
