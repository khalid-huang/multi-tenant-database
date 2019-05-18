package org.bryson.singledatabasemultitenant.dao.impl;

import org.bryson.singledatabasemultitenant.dao.RenCapabilityEntityDao;
import org.bryson.singledatabasemultitenant.entity.RenCapabilityEntity;
import org.bryson.singledatabasemultitenant.repository.RenCapabilityEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RenCapabilityEntityDaoImpl implements RenCapabilityEntityDao {

    @Autowired
    RenCapabilityEntityRepository renCapabilityEntityRepository;

    @Override
    public RenCapabilityEntity saveOrUpdate(RenCapabilityEntity renCapabilityEntity) {
        return renCapabilityEntityRepository.save(renCapabilityEntity);
    }

    @Override
    public void deleteById(String id) {
        renCapabilityEntityRepository.deleteById(id);
    }

    @Override
    public RenCapabilityEntity findById(String id) {
        return renCapabilityEntityRepository.findById(id);
    }

    @Override
    public List<RenCapabilityEntity> findAll() {
        return renCapabilityEntityRepository.findAll();
    }
}
