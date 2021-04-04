package cool.kar.demo20210405.service;

import cool.kar.demo20210405.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceTest {
    @Autowired
    UserService userService;
    @Test
    public void findAll(){
        List<User> all = userService.findAll();
//        System.out.println(all);
        all.forEach(System.out::println);
    }


    @Test
    public void findEmailLikeQQ(){
        List<User> all = userService.findEmailLikeKey("qq");
        all.forEach(System.out::println);
    }

    @Test
    public void findEmailLikeSina(){
        List<User> all = userService.findEmailLikeKey("sina");
        all.forEach(System.out::println);
    }

    @Test
    public void findEmailLikeBaomidou(){
        List<User> all = userService.findEmailLikeKey("baomidou");
        all.forEach(System.out::println);
    }
    @Test
    public void findByAge(){
        List<User> users = userService.findByAge(24);
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void findByName(){
//        查询姓名为A开头的所有人
        List<User> users = userService.findByName("A");
        for (User user : users) {
            System.out.println(user);
        }
    }

}