package org.Jan.jfs.collections.set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class EmployeeService{
    private int pid;
    private String pname;
    private String dept;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeService that)) return false;
        return pid == that.pid && Objects.equals(pname, that.pname) && Objects.equals(dept, that.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid, pname, dept);
    }

    public void showEmployeeDetails(){
        String data ="1001-krish-DEV,1002-Manoj-DEV,1001-Krish-DEV,1001-John-HR,1003-John-HR,1004-Smith-UI,1005-Krish-HR,1003-John-HR";
        String[] arr=data.split(",");
        Set<String> set =new HashSet<>();
        for (String ele:arr){
            String a= Arrays.toString(ele.split("-"));
            set.add(a);
        }
        System.out.println(set);
    }
}
public class AssignmentOnSet {
    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeService();
        employeeService.showEmployeeDetails();
    }

}
