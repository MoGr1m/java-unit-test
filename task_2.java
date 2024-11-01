import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Program {
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
    }

    // Напиши код здесь
    @Test
    public void checkIsAdultWhenAgeIsLessThan18False(){
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        assertEquals("17 - не совершеннолетний",false,isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIs18True(){
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        assertEquals("18 - хорошо", true, isAdult);
    }
}