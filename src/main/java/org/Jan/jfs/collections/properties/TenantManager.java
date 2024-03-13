package org.Jan.jfs.collections.properties;

import java.util.List;

public class TenantManager {
    public static void main(String[] args) {
        List<Tenant> tenants=TenantPropertiesUtil.loadAllTenant();
        System.out.println(tenants);
    }
}
