package org.Java.jfs.migrate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MigratePlayerDataTest {
    MigratePlayerData migratePlayerData;

    @BeforeEach
    public void init(){
        migratePlayerData =new MigratePlayerData();
    }

    @Test
    void migrate() {
        migratePlayerData.migrate();
        int count =migratePlayerData.playerCount();
        assertEquals(188,count);
    }
}