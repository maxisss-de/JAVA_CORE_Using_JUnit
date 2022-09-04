package ru.netology;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    Main main;

    @BeforeAll
    public static void beforeAllMethod() {
        System.out.println("BeforAll");

    }

    @BeforeEach
    public void beforeEachMethod() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    public void afterEachMethod() {
        System.out.println("AfterEach");
    }

    @AfterAll
    public static void afterAllMethod() {
        System.out.println("AfterAll");
    }

    @Test // Проверяем, совпадают данные пользователей с пользователями из метода getUsers()
    public void testGetUsers() {
        System.out.println("Test №1");

        User user1 = new User("Дон", "Don111", "1234D", "don@mail.com", Sex.MAN, 18);
        User user2 = new User("Мики", "Mili_May", "M4321", "miki@gmail.de", Sex.WOMAN, 17);
        User user3 = new User("Коля", "Kolya_tik-tok", "111KKK", "kolya@mail.ru", Sex.MAN, 27);

        List<User> expected = main.getUsers();      // Передаём пользователей из метода getUsers() в expected. expected - желаемый результат

        List<User> actual = new ArrayList<>();      // actual - фактический результат
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);

        // Была ошибка в тесте №1: что сделал: В классе User этого объекта нужно переопределить equals и hashcode: В классе User, правая кнопка мыши "Generate" -> "Override methods" -> далее всё next и появлятся два метода с Override: "public boolean equals(Object o)" и "public int hashCode()"
        assertEquals(expected, actual);  // Сравниваем: "expected" - желаемый результат с "actual" - фактическим результатом
    }

    @Test  // Проверяем логин и пароль
    public void testGetUserByLoginAndPassword() throws UserNotFoundException {
        System.out.println("Test №2");

        String login = "Don111";
        String password = "1234D";

        User expected = main.getUserByLoginAndPassword("Don111", "1234D");

        User result = main.getUserByLoginAndPassword(login, password);

        assertEquals(expected, result);
    }

    @Test // Проверяем суммируем возраст пользователей, совпадёт или нет
    public void testGetAllAgeUsers() {
        System.out.println("Test №3");

        int expected = main.getAllAgeUsers();

        int actual = 18 + 17 + 27;

        assertEquals(expected, actual);
    }
}
