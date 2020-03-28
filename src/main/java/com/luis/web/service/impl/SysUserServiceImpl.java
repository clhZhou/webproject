package com.luis.web.service.impl;

import com.luis.web.mapper.SysUserMapper;
import com.luis.web.pojo.SysUser;
import com.luis.web.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luis
 * @date 2020/3/28
 */
@Service
public class SysUserServiceImpl implements ISysUserService {


    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser getByName(SysUser sysUser) {
        return sysUserMapper.getByName(sysUser);
    }
}
