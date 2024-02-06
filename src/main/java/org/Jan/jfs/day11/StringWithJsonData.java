package org.Jan.jfs.day11;

public class StringWithJsonData {
    public static void main(String[] args) {
        String empJson= """
                {
                "empno" :101,
                "empname" :"king",
                "salary" :10000
                }
                """;
        System.out.println(empJson);
        String htmlTxt = getHtmlTxt();
        System.out.println(htmlTxt);
    }
    public static String getHtmlTxt(){
        return """
                {
                <html>
                 <head>
                 <title> dataTable<title>
                 </head>
                 <body> <h1>the data of the table and king</h1>
                 </body>
                 </html>
                }
               """;
    }
}
