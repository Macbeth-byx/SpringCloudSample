package com.sdwfqin.serviceauth.dao;

import com.sdwfqin.serviceauth.domain.RoleDo;
import com.sdwfqin.serviceauth.domain.UserRoleDo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserRoleDao {

    List<RoleDo> listRoleByUserId(Long userId);

    int save(UserRoleDo userRoleDo);

}
