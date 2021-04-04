package cool.kar.demo20210405.controller;

import cool.kar.demo20210405.entity.User;
import cool.kar.demo20210405.service.UserService;
import cool.kar.demo20210405.vo.DeleteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/findByAge/{age}")
    public List<User> findByAge(@PathVariable("age") int age) {
        return userService.findByAge(age);
    }

    @RequestMapping("/findByName/{name}")
    public List<User> findByName(@PathVariable("name") String name) {
        return userService.findByName(name);
    }


    @RequestMapping("/findByEmail/{key}")
    public List<User> findEmailLikeKey(@PathVariable(value = "key") String key) {
        return userService.findEmailLikeKey(key);
    }


    @RequestMapping("/findById/{id}")
    public User findById(@PathVariable("id") int id) {
        return userService.findById(id);
    }

    @RequestMapping("/deleteById/{id}")
    public DeleteVo deleteById(@PathVariable("id") int id) {
        return userService.deleteById(id);
    }


    @RequestMapping("/findByAgeOlder/{age}")
    public List<User> findByAgeOlder(@PathVariable("age") int age) {
        return userService.findByAgeOlder(age);
    }
    @RequestMapping("/findByAgeYounger/{age}")
    public List<User> findByAgeYounger(@PathVariable("age") int age) {
        return userService.findByAgeYounger(age);
    }

}
