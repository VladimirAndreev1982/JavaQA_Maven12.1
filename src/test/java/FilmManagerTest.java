import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
//import org.mockito.Mockito;
//import static org.mockito.Mockito.*;

public class FilmManagerTest {

    @Test // вывод всех фильмов в порядке добавления
    public void test1_1() {
        FilmManager manager = new FilmManager();
        manager.add("Фильм1");
        manager.add("Фильм2");
        manager.add("Фильм3");
        manager.add("Фильм4");
        manager.add("Фильм5");
        String[] expected = {"Фильм1", "Фильм2", "Фильм3", "Фильм4", "Фильм5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
        //assertArrayEquals(expected, actual);
    }

    @Test // вывод последних фильмов в обратном порядке, кол-во фильмов больше чем введённый лимит
    public void test2_1() {
       FilmManager manager = new FilmManager(3);
        manager.add("Фильм1");
        manager.add("Фильм2");
        manager.add("Фильм3");
        manager.add("Фильм4");
        manager.add("Фильм5");

       String[] expected = {"Фильм5", "Фильм4", "Фильм3"};
       String[] actual = manager.findLast();
       Assertions.assertArrayEquals(expected, actual);
       System.out.println("Фактический результат: " + Arrays.toString(actual));
    }
    @Test // вывод последних фильмов в обратном порядке, кол-во фильмов меньше чем введённый лимит
    public void test2_2() {
        FilmManager manager = new FilmManager(10);
        manager.add("Фильм1");
        manager.add("Фильм2");
        manager.add("Фильм3");
        manager.add("Фильм4");
        manager.add("Фильм5");
        String[] expected = {"Фильм5", "Фильм4", "Фильм3", "Фильм2", "Фильм1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
        System.out.println("Фактический результат: " + Arrays.toString(actual));
    }
    @Test // вывод последних фильмов в обратном порядке, без ввода лимита
    public void test2_3() {
        FilmManager manager = new FilmManager();
        manager.add("Фильм1");
        manager.add("Фильм2");
        manager.add("Фильм3");
        manager.add("Фильм4");
        manager.add("Фильм5");
        String[] expected = {"Фильм5", "Фильм4", "Фильм3", "Фильм2", "Фильм1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
        System.out.println("Фактический результат: " + Arrays.toString(actual));
    }
    @Test // вывод последних фильмов в обратном порядке, с лимитом 0
    public void test2_4() {
        FilmManager manager = new FilmManager(0);
        manager.add("Фильм1");
        manager.add("Фильм2");
        manager.add("Фильм3");
        manager.add("Фильм4");
        manager.add("Фильм5");
        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
        System.out.println("Фактический результат: " + Arrays.toString(actual));
    }
    @Test // вывод последних фильмов в обратном порядке, с лимитом 1
    public void test2_5() {
        FilmManager manager = new FilmManager(1);
        manager.add("Фильм1");
        manager.add("Фильм2");
        manager.add("Фильм3");
        manager.add("Фильм4");
        manager.add("Фильм5");
        String[] expected = {"Фильм5"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
        System.out.println("Фактический результат: " + Arrays.toString(actual));
    }
}