package org.bryson.singledatabasemultitenant.service;

import java.util.HashMap;

/**
 * 组织架构管理服务
 */
public interface OrgDataService {

    /** capability */
    HashMap<String, Object> retrieveAllCapability();
}
