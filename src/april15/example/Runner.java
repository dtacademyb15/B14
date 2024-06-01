package april15.example;

public class Runner {


    public static void main(String[] args) {

        new HomePageTests().performUrlValidation();
        new LoginTests().loginTest();
        new SignUpTests().signUpTest();
    }
}
