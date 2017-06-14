package com.example.elsayedfahmy_pc.provider.provider;

import ckm.simple.sql_provider.UpgradeScript;
import ckm.simple.sql_provider.annotation.ProviderConfig;
import ckm.simple.sql_provider.annotation.SimpleSQLConfig;


/**
 * Created by MarwaTalaat on 10/29/2016.
 */

@SimpleSQLConfig(
        name = "MyContactProvider",
        authority = "eng.marwa.myprovider.authority",
        database = "mycontact.db",
        version = 1)
public class MyContactConfig implements ProviderConfig {
    @Override
    public UpgradeScript[] getUpdateScripts() {
        return new UpgradeScript[0];
    }
}
