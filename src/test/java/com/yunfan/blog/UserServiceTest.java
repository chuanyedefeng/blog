package com.yunfan.blog;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.yunfan.blog.dao.BlogUserMapper;
import com.yunfan.blog.dao.UserTestMapper;
import com.yunfan.blog.dto.UserInfoDTO;
import com.yunfan.blog.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.transaction.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

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

    @Resource
    private UserTestMapper userTestMapper;

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
        System.out.println(blogUserMapper.sewlectAll());
    }

    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        long[] array = new long[size*3];
        Arrays.sort(array);
        int index = 0;
        while(scanner.hasNext()) {
            array[index++] = scanner.nextLong();
        }

        for(int i = 0;i < array.length -2;i += 3) {
            List<Long> list = Arrays.asList(array[i], array[i + 1], array[i + 2]);
            list.sort(Comparator.comparing(Long::longValue));
            System.out.println(Math.max((list.get(i) + list.get(i+1) + list.get(i+2) + 2)/3,(list.get(i+2) +1)/2));
        }


    }


}
