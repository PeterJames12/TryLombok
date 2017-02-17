package email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author igor on 28.11.16.
 */
public class InstructorsMail {

    public void instructorMail(String to, String message) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        SenderMail instructorsMail = (SenderMail) context.getBean("instructorsMail");

        instructorsMail.sendMailToInstructors("projectpatriotdefence@gmail.com", to, "Project Patriot Defence", message);
    }
}
