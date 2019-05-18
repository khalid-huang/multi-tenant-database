package org.bryson.singledatabasemultitenant.service.impl;

import org.bryson.singledatabasemultitenant.dao.RenCapabilityEntityDao;
import org.bryson.singledatabasemultitenant.entity.RenCapabilityEntity;
import org.bryson.singledatabasemultitenant.service.OrgDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;

@Service
public class OrgDataServiceImpl implements OrgDataService {
    @Autowired
    RenCapabilityEntityDao renCapabilityEntityDao;

    @Override
    public HashMap<String, Object> retrieveAllCapability() {
        HashMap<String, Object> result = new HashMap<>();
        List<RenCapabilityEntity> renCapabilityEntities = renCapabilityEntityDao.findAll();
        result.put("data", renCapabilityEntities);
        result.put("status", "success");
        return result;
    }
}
