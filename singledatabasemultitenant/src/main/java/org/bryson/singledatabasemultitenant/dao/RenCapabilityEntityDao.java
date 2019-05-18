package org.bryson.singledatabasemultitenant.dao;


import org.bryson.singledatabasemultitenant.entity.RenCapabilityEntity;

import java.util.List;

public interface RenCapabilityEntityDao {
    RenCapabilityEntity saveOrUpdate(RenCapabilityEntity renCapabilityEntity);

    void deleteById(String id);

    RenCapabilityEntity findById(String id);

    List<RenCapabilityEntity> findAll();
}
