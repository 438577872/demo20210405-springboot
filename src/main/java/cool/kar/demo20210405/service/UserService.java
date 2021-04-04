package cool.kar.demo20210405.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import cool.kar.demo20210405.entity.User;
import cool.kar.demo20210405.mapper.UserMapper;
import cool.kar.demo20210405.vo.DeleteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> findAll() {
//        mapper里面的selectList里面传入一个条件对象,如果是无条件则传入null即可
        return userMapper.selectList(null);
    }


    public List<User> findEmailLikeKey(String key) {
//       QueryWrapper 是条件构造类,先new一个 然后开始构建我们需要的条件
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        like表示构建一个模糊查找  select * from user where age like "%#{age}%";
        queryWrapper.like("email", key);
        return userMapper.selectList(queryWrapper);
    }


    public List<User> findByAge(int age) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//       eq表示构建一个等于条件.  这里表示age=传入的参数 也就相当于  select * from user where age = #{age};
        queryWrapper.eq("age", age);
        return userMapper.selectList(queryWrapper);
    }
    public List<User> findByAgeOlder(int age) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//       gt表示构建一个大于条件. 相当于select * from user where age > #{age};
//       注意一下 ， ge表示大于等于
        queryWrapper.gt("age", age);
        return userMapper.selectList(queryWrapper);
    }

    public List<User> findByAgeYounger(int age) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//       lt表示构建一个小于条件. 相当于select * from user where age < #{age};
//       le表示小于等于  这里就不演示了
        queryWrapper.lt("age", age);
        return userMapper.selectList(queryWrapper);
    }



    public List<User> findByName(String name) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//       likeLeft表示构建一个左等于条件.相当于  select * from user where name like "%#{name}";
        queryWrapper.likeLeft("name", name);
        return userMapper.selectList(queryWrapper);
    }


    public User findById(int id) {
//        通过主键查询一个对象 id表示主键而不是id列
        return userMapper.selectById(id);
    }


    public DeleteVo deleteById(int id) {
//        这个i表示删除的个数 如果i>0 说明有删除 否则说明没有人被删除
        int i = userMapper.deleteById(id);
        DeleteVo deleteVo = new DeleteVo();
//        那么这里有删除则返回true 反之返回true
        if (i > 0) {
            deleteVo.setStatus(true);
        } else {
            deleteVo.setStatus(false);
        }
        return deleteVo;
    }

}