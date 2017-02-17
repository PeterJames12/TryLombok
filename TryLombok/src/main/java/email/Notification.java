package email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author igor on 28.11.16.
 */
public class Notification {

    public static void main(String[] args) {

        instructorMail("destination email", "Hello");
    }

    private static void instructorMail(String to, String message) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        SenderMail instructorsMail = (SenderMail) context.getBean("notification");

        instructorsMail.sendMailToInstructors("from email", to, "subject", message);
    }
}
