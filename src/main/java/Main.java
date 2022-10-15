import lombok.*;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

@Getter
@Setter
public class Main {
    public static void main(String[] args) {
        // ця помітка для логіну і паролю просто для того щоб ви бачили що потрібно вводити
        //  логін = log = "lg1505";
        //  пароль = password = "GradleAdel";

        // вивід "Hello!", і його введеня з клавыатури для перевырки (проводиться перевірка, просто потрібно ввести Hello)

        Service service = new Service();

        String actualStr = service.getStr();

        service.setMessage("Hello");

        System.out.println(service.getMessage());

        Scanner in = new Scanner(System.in);
        String exprectedStr = in.nextLine();
        assertEquals(exprectedStr, actualStr);

        Login login = new Login();

        // введеня логіну
        System.out.println("Enter your login: ");
        String logNew = in.nextLine();

        // перевірка логіну через цикл
        while (!logNew.equals(login.getLog())) {
            System.out.println("It is incorrect, try again.");
            System.out.println("Enter your login: ");
            logNew = in.nextLine();
        }

        // введеня паролю
        System.out.println("Enter your password: ");
        String passwordNew = in.nextLine();

        // авнвлогічна перевірка для паролю
        while (!passwordNew.equals(login.getPassword())) {
            System.out.println("It is incorrect, try again.");
            System.out.println("Your password: ");
            passwordNew = in.nextLine();
        }

        in.close();

        // просте вітання і вивід данних
        System.out.printf("This is your name: ");
        System.out.println(service.getName());
        System.out.printf("This is your age: ");
        System.out.println(service.getAge());
        System.out.printf("This is your age: ");
        System.out.println(service.getHeight());
        System.out.printf("This is your dick size: ");
        System.out.println(service.getDickSize());
    }

}
