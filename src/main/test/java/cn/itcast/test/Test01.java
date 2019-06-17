package cn.itcast.test;

import cn.itcast.start.dao.TUserMapper;

import cn.itcast.start.pojo.TUser;

import cn.itcast.start.pojo.TUserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-dao-service.xml")
public class Test01 {
    @Autowired
    private TUserMapper userMapper;
    @Test
    public void test01() {
        //根据id查询对象
      /*  TUser tUser = userMapper.selectByPrimaryKey(1);
        System.out.println(tUser.getName());
        //根据条件查询  TUserExample（封装查询条件）
        TUserExample tUserExample = new TUserExample();
        TUserExample.Criteria criteria = tUserExample.createCriteria();
        //调用方法封装查询条件
        criteria.andNameEqualTo("admin");
        criteria.andPasswordEqualTo("admin");
       // criteria.andNameLike("%a%");
        //select id, name, password from t_user WHERE ( name = ? and password = ? )
        List<TUser> tUsers = userMapper.selectByExample(tUserExample);
        System.out.println(tUsers);*/

        //userMapper.deleteByPrimaryKey(3);
       /* TUser tUser = new TUser();
        tUser.setName("zhangsan");
        tUser.setPassword("123");
        userMapper.insert(tUser);*/

        TUser tUser = userMapper.selectByPrimaryKey(4);
        tUser.setPassword("456");
        userMapper.updateByPrimaryKey(tUser);
        //update t_user set name = ? ,password = ? where id = ?
        System.out.println("wwh123");
    }
}
