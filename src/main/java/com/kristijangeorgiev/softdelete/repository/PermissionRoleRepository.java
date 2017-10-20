package com.kristijangeorgiev.softdelete.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kristijangeorgiev.softdelete.model.entity.PermissionRole;
import com.kristijangeorgiev.softdelete.model.entity.pk.PermissionRolePK;

/**
 * <h2>PermissionRoleRepository</h2>
 * 
 * @author Kristijan Georgiev
 * 
 *         Plain repository for the PermissionRole object that has all the
 *         methods from the {@link SoftDeletesRepository}
 *
 */

@Repository
@Transactional
public interface PermissionRoleRepository extends SoftDeletesRepository<PermissionRole, PermissionRolePK> {

}
