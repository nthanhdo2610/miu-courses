package lesson2.lab2.prob2a;

import java.util.Date;

public class GradeReport {
    private Date reportDate;
    private Student student;

    public GradeReport(Date reportDate, Student student) {

        if (student == null) {
            throw new RuntimeException("Invalid Student!");
        }
        this.reportDate = reportDate;
        this.student = student;
        student.setGradeReport(this);
    }

    public GradeReport(Student student) {
        if (student == null) {
            throw new RuntimeException("Invalid Student!");
        }
        this.reportDate = new Date();
        this.student = student;
        student.setGradeReport(this);
    }

    public Student getStudent() {
        return student;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public String toString() {
        return "GradeReport{" +
                "reportDate=" + reportDate +
                '}';
    }
}
