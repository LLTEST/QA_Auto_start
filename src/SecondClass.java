import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

    public class SecondClass {

    @Test
    public void start(){
        FirstClass driver = new FirstClass();
        System.out.println(driver.trurr(5));
    }

}
