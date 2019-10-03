package com.ywb.dao;

import com.ywb.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @title:
 * @package
 * @description:
 * @author: Yuan
 * @date:
 * @version: V1.0
 */
class CardDaoTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    CardDao card = (CardDao)context.getBean("cardMapper");

    @Test
    void add() {
        try {
            for (int i=1; i<=1; i++) {
                User rc = new RandomCard();
                card.add(rc);
                System.out.println("第"+ i +"条插入成功");
                System.out.println(rc.getId());
            }
        }catch (Exception e) {
            System.out.println("插入失败");
        }
    }

    @Test
    void del() {
        try {
            card.del(17);
            System.out.println(true);
        }catch (Exception e) {
            System.out.println(false);
        }
    }

    @Test
    void update() {
        User user = card.selectById(1);
        user.setName("隔壁老王");
        card.update(user);
    }

    @Test
    void getAll() {
        List<User> users;
        users = card.getAll();
        System.out.println(users);
    }

    @Test
    void selectById() {
        User user = card.selectById(2);
        System.out.println(user);
    }
}