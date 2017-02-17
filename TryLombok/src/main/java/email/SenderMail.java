package notification.mail;

import lombok.Setter;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * @author igor on 28.11.16.
 */
@Setter
public class SenderMail {

    private MailSender mailSender;

    void sendMailToInstructors(String from, String to, String subject, String message) {

        SimpleMailMessage notification = new SimpleMailMessage();

        notification.setFrom(from);
        notification.setTo(to);
        notification.setSubject(subject);
        notification.setText(message);
        mailSender.send(notification);
    }
}
