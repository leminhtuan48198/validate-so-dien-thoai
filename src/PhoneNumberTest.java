import java.util.Scanner;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;

    public static void main(String[] args) {
        phoneNumber =new PhoneNumber();
        System.out.println("Mời bạn nhập số điện thoại");
        Scanner scanner=new Scanner(System.in);
        String name = scanner.nextLine();
        boolean isvalid= phoneNumber.validate(name);
        System.out.println(isvalid);

    }
}