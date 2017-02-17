package try_lombok;

import lombok.*;

import java.util.List;

/**
 * @author Igor Gnes on 17.02.17.
 */

/*
* Анотації говорять самі за себе, генерація getter setter EqualsAndHashCode AllArgsConstructor ToString
* */
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
/*
* цю всю простиню анотацій заміняє @Data
* */
//@Data
@Builder
public class User {

    /*
    * Спершу потрібно установити плагін для IDEA lombok, та увімкнути Annotation processing
    * */

    private String name;
    private String skills;
    private int age;
}
