package org.Jan.jfs.day7;

enum ReportType {
    HTML, CSV, EXCEL, PDF
}

public class Assignment2 {
    public static void main(String[] args) {
        generateReport(ReportType.CSV);
        generateReport(ReportType.PDF);
        generateReport(ReportType.HTML);
        generateReport(ReportType.EXCEL);
    }
    public static void generateReport(ReportType type){
        switch (type){
            case HTML:
                System.out.println("Generating HTML Report ");
                break;
            case CSV:
                System.out.println("Generating CSV Report ");
                break;
            case EXCEL:
                System.out.println("Generating Excel Report");
                break;
            case PDF:
                System.out.println("Generating PDF Report ");
                break;
        }
    }
}
