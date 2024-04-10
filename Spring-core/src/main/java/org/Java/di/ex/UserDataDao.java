package org.Java.di.ex;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDataDao {
 private final DbConfiguration dbConfiguration;
 public String getDbConfiguration(){
     return dbConfiguration.getDbVersion();
 }
}
