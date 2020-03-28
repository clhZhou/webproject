package com.luis.web.service;

import com.luis.web.pojo.SysUser;
import org.springframework.stereotype.Service;

/**
 * @author luis
 * @date 2020/3/28
 */
public interface ISysUserService {


    SysUser getByName(SysUser sysUser);
}
