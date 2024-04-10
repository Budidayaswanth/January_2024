package org.Java.di.xml;

public class EmployeeService {
String[] arr ={"Krish","Manoj","Charan","Sai","Rajesh","Suresh"};
private SearchTechniques searchTechniques;

EmployeeService(SearchTechniques searchTechniques){
    this.searchTechniques =searchTechniques;
}
public  void searchName(String name){
    int index =searchTechniques.search(arr,name);
    if(index == -1){
        System.out.println("Name : "+name+" not Found");
    }else {
        System.out.println("Name : "+name+" found at index : "+index);
    }
}
}
