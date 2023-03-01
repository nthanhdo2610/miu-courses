package prob2a;

import java.util.Date;

public class GradeReport {
    private Date reportDate;

    public GradeReport(Date reportDate, Student student) {

        if (student == null) {
            throw new RuntimeException("Invalid Student!");
        }
        this.reportDate = reportDate;
        student.setGradeReport(this);
    }

    public GradeReport(Student student) {
        if (student == null) {
            throw new RuntimeException("Invalid Student!");
        }
        this.reportDate = new Date();
        student.setGradeReport(this);
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
