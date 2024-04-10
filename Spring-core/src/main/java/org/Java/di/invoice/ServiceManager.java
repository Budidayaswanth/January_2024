package org.Java.di.invoice;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceManager {

    public List<ServiceInfo>getActiveService(){
        return List.of(
                ServiceInfo.builder().id(101).name("Netflex").amount(200).build(),
                ServiceInfo.builder().id(102).name("hostar").amount(100).build(),
                ServiceInfo.builder().id(103).name("Zee5").amount(50).build(),
                ServiceInfo.builder().id(104).name("JioCinema").amount(40).build(),
                ServiceInfo.builder().id(105).name("Etv").amount(15).build()
        );
    }
}
