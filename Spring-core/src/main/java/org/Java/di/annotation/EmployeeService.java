package org.Java.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("employeeSearch")
public class EmployeeService {
    String[] names ={"King","Yash","Raj","Mukesh"};
    private SearchTechnique searchTechnique;
@Autowired
    EmployeeService(@Qualifier("linearSearch") SearchTechnique searchTechnique){
        this.searchTechnique =searchTechnique;
    }

    public void searchName(String name){
        int index =searchTechnique.search(names,name);
        if(index ==-1){
            System.out.println("Name : " + name + " not found");
        }else {
            System.out.println("Name : " + name + " found at index : " + index);
        }
    }
}
