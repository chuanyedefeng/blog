package com.yunfan.blog;

import com.yunfan.blog.dao.BlogUserMapper;
import com.yunfan.blog.dto.UserInfoDTO;
import com.yunfan.blog.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author fengyurong
 * @date 2020-08-03 10:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Autowired
    private BlogUserMapper blogUserMapper;

    @Test
    public void test() {
        UserInfoDTO dto = new UserInfoDTO();
        dto.setCode("999111");
        dto.setPhone("18845152436");
        dto.setUserName("fengfengbubu");
        userService.registerAndLogin(dto);
    }

    @Test
    public void blogUserMapper() {
        System.out.println(blogUserMapper.selectAll());
    }
}
