import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

import lombok.*;

@Setter
@Getter

public class ServiceTest {

    @Test
    public void getStrTest(){
        Scanner in = new Scanner(System.in);

        String exprectedStr = in.nextLine();

        Service service = new Service();
        String actualStr = service.getStr();

        assertEquals(exprectedStr, actualStr);




    }
}
