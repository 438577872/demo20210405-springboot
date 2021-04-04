package cool.kar.demo20210405.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cool.kar.demo20210405.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface UserMapper extends BaseMapper<User> {


}
