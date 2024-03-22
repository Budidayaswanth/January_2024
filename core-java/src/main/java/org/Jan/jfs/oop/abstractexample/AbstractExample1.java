package org.Jan.jfs.oop.abstractexample;

abstract class ReportGenerator {
    public abstract void generateReport();
}

class ExcelReport extends ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating the Excel Report ");
    }
}

class PdfReport extends ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating the Pdf Report ");
    }
}

class CsvReport extends ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating the Csv Report");
    }
}

class ImageReport extends ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating the Image Report ");
    }
}
abstract class Ab {
    abstract void show1();

    abstract void show2();

    void show3() {
        System.out.println("show3");
    }
}

class cd extends Ab {
    @Override
    void show1() {
        System.out.println("show1");
    }

    void show2() {
        System.out.println("show2");
    }
}

public class AbstractExample1 {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = getReportGenerator(ReportType.CSV);
        reportGenerator.generateReport();
        Ab obj =new cd();
        obj.show1();
    }

    public static ReportGenerator getReportGenerator(ReportType type) {
        return switch (type) {
            case EXCEL -> new ExcelReport();
            case CSV -> new CsvReport();
            case PDF -> new PdfReport();
            case IMAGE -> new ImageReport();
        };
    }
}
