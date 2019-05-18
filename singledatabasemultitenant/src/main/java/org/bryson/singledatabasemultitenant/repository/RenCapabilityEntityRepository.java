package org.bryson.singledatabasemultitenant.repository;

import org.bryson.singledatabasemultitenant.entity.RenCapabilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RenCapabilityEntityRepository extends JpaRepository<RenCapabilityEntity, String> {
    void deleteById(String id);

    RenCapabilityEntity findById(String id);

}
