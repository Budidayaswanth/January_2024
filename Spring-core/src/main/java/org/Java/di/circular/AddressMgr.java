package org.Java.di.circular;

import org.springframework.stereotype.Service;

@Service
public class AddressMgr {
    public String getAddress(){
        return "Bangalore, India";
    }
}
