package com.example.demo.service.impl;

import com.example.demo.po.Permission;
import com.example.demo.dao.PermissionMapper;
import com.example.demo.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author aAron
 * @since 2020-01-15
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
