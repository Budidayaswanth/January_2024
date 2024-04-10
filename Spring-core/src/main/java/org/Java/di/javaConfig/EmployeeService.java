package org.Java.di.javaConfig;

public class EmployeeService {
    String[] names ={"King","Manoj","yash","vinod"};

    private SearchTechniques searchTechniques;

    EmployeeService(SearchTechniques searchTechniques){
        this.searchTechniques =searchTechniques;
    }

    public void searchName(String name){
        int index =searchTechniques.Search(names,name);
            if(index == -1){
                System.out.println("Name : "+name+"is Not Found");
            }else {
                System.out.println("Names :"+name+" is Found index is :"+index);
            }
    }
}
