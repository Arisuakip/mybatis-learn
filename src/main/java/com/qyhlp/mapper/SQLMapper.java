package com.qyhlp.mapper;

import com.qyhlp.po.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author liangcheng12
 * @date 2023/08/14
 * @description
 */
public interface SQLMapper {

    /**
     * 模糊查询
     * @param username
     * @return
     */
    List<User> getUserByLike(@Param("username") String username);

    /**
     * 批量删除
     */
    int deleteByIdList(@Param("ids")String ids);

    int insertUser(User user);

}
