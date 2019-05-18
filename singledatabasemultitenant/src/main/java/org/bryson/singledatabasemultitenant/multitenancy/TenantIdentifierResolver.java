package org.bryson.singledatabasemultitenant.multitenancy;

import org.bryson.singledatabasemultitenant.constant.GlobalContext;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

@Component
public class TenantIdentifierResolver implements CurrentTenantIdentifierResolver {
    @Override
    public String resolveCurrentTenantIdentifier() {
        String tenantId =TenantContext.getCurrentTenant();
//        System.out.println("tenantId: " + tenantId);
        if(tenantId != null) {
            return tenantId;
        }
        return GlobalContext.DEFAULT_TENANT_ID;
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
