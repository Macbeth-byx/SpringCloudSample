package com.sdwfqin.serviceauth.dao;

import com.sdwfqin.serviceauth.domain.RoleDo;

import java.util.List;
import java.util.Map;

/**
 * 角色
 * <p>
 *
 * @author 张钦
 * @date 2019/12/23
 */
public interface RoleDao {

    RoleDo get(Long id);

    List<RoleDo> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(RoleDo roleDo);

    int update(RoleDo roleDo);

    int remove(Long id);

}
