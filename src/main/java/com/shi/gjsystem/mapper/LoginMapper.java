package com.shi.gjsystem.mapper;



import com.shi.gjsystem.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author
 */

@Mapper
public interface LoginMapper {

    @Select("select * from tb_user where username=#{username} and password=#{password}")
    public User loginUser(@Param("username") String username, @Param("password") String password);
}
