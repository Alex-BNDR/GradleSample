import lombok.*;

@Getter
@Setter

public class Service {
    public String getStr(){
        return "Hello";
    }

    // тут подані ім'я, вік і висота людини
    public String name = "Alex Bondar";
    public String age = "21";
    public String height = "180";
    public String dickSize = "hahaha";
    // message - просте вітання, коли людина ввійде через логін і пароль
    public String message;
}
