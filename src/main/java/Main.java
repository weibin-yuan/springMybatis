import com.ywb.dao.CardDao;
import com.ywb.dao.RandomCard;
import com.ywb.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @title:
 * @package
 * @description:
 * @author: Yuan
 * @date:
 * @version: V1.0
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("mylog");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardDao card = (CardDao)context.getBean("cardMapper");
//        User user = card.selectById(2);
//        System.out.println(user);
//        int a = card.count();
//        System.out.println(a);

//        List<User> users;
//        users = card.getAll();
//        System.out.println(users);

//        try {
//            for (int i=1; i<=1; i++) {
//                User rc = new RandomCard();
//                card.add(rc);
//                System.out.println("第"+ i +"条插入成功");
//                System.out.println(rc.getId());
//            }
//        }catch (Exception e) {
//            System.out.println("插入失败");
//        }

        try {
            card.del(17);
            System.out.println(true);
            logger.error("trace level");
        }catch (Exception e) {
            System.out.println(false);
            logger.error("error level");
        }
    }
}
