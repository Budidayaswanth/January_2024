package org.Jan.jfs.day11;

import java.util.List;

public class EmployeeDetailsService {

    public static void main(String[] args) {
        Employee emp1 =new Employee(1,"yash",34000,"Hyderabad");
        Employee emp2 =new Employee(2,"hemanth",45000,"Bangalore");
        Employee emp3 =new Employee(3,"uma",55000,"Manoj");
        Employee emp4 =new Employee(4,"teja",34000,"hyderabad");
        List<Employee> empList =List.of(emp1,emp2,emp3,emp4);
        System.out.println(getHtmlResponse(empList));
    }
    public static String getHtmlResponse(List<Employee> list){
        String Styles = """
                <style>
                    table{
                    font-family :arial,sans-serif;
                    border-collapse:collapse;
                    width:100%;
                   }
                   td,th{
                   border:1px solid #dddddd;
                   text-align : left;
                   padding:8px;
                   }
                   tr:nth-child(even){
                   background-color:#dddddd;
                   }
                   </style>
                """;
        StringBuilder sb=new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Employees</title>");
        sb.append(Styles);
        sb.append("</head>");
        sb.append("<body");
        sb.append("<h1>Employee Details</h1>");
        sb.append("<table border='1'>");
        sb.append("<tr>");
        sb.append("<th>Empno</th>");
        sb.append("<th>Name</th>");
        sb.append("<th>Salary</th>");
        sb.append("<th>Location</th>");
        sb.append("</tr>");
        for (Employee emp :list){
            sb.append("<tr>");
            sb.append("<td>").append(emp.getEmpno()).append("<td>");
            sb.append("<td>").append(emp.getEname()).append("<td>");
            sb.append("<td>").append(emp.getSalary()).append("<td>");
            sb.append("<td>").append(emp.getLocation()).append("<td>");
            sb.append("</tr>");
        }
        sb.append("</table>");
        sb.append("</body>");
        sb.append("</html>");
       return sb.toString();
    }
}
