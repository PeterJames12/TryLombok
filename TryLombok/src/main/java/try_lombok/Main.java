package try_lombok;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.Value;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Igor Gnes on 17.02.17.
 */
// робить immutable
@Value
public class Main {

    private static String name = "Alex";

    public static void main(String[] args) {

        User alex = User.builder().name("Alex").skills("Java and Linux").age(21).build(); // owing to builder

//        name = "Bob"; // compile error because name is final owing to Value

        User user = new User("Alex", "Java", 21);

        user.setName("Bob");
        user.setSkills("Linux");
        user.setAge(22);

        System.out.println(user.getName());
        System.out.println(user.getSkills());
        System.out.println(user.getAge());
    }

    public static void doSomethingExtraOrdinary() {

        // генерує try catch finally тобто метод close виконається
        @Cleanup
        Scanner scanner = new Scanner(System.in);

        readFromFile();
    }

    // exception наприклад не хочемо писати try catch бо точно впевнені що шлях до файлу правильний
    @SneakyThrows
    private static void readFromFile() {

        String path = "path";

        Files.lines(Paths.get(path)).collect(Collectors.toList());
    }
}
