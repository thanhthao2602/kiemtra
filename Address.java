import java.util.Scanner;
public class Address {
    private String city;
    private String district;

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }
    public void input(){
         Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten thanh pho : ");
        city  = s.nextLine();
        System.out.println("Nhap ten quan/huyen : ");
        district = s.nextLine();
    }
    public void output(){
        System.out.println("Ten thanh pho la : "+city);
        System.out.println("Ten quan/huyen la : "+district);
    }
}
