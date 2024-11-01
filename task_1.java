import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Program {

    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        // Напиши код здесь
        assertEquals("19 лет - совершеннолетний возраст",true,isAdult);
    }
}