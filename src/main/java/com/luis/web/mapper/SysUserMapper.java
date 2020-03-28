package com.luis.web.mapper;

import com.luis.web.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author luis
 * @date 2020/3/28
 */
@Mapper
public interface SysUserMapper {


    /**
     * 根据姓名查询
     * @param sysUser 用户对象
     * @return 返回
     */
    SysUser getByName(SysUser sysUser);
}
