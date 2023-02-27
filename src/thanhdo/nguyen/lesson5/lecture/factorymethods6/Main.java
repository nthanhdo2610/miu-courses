package thanhdo.nguyen.lesson5.lecture.factorymethods6;
import java.util.*;

import thanhdo.nguyen.lesson5.lecture.factorymethods6.otherpackage.DataRecord;
import thanhdo.nguyen.lesson5.lecture.factorymethods6.otherpackage.Database;
import thanhdo.nguyen.lesson5.lecture.factorymethods6.studreport.GradeReport;
import thanhdo.nguyen.lesson5.lecture.factorymethods6.studreport.StudentAndReport;
import thanhdo.nguyen.lesson5.lecture.factorymethods6.studreport.StudentGradeReportFactory;


public class Main {

	public static void main(String[] args) {
		printTopStudents();		
	}
	public static void printTopStudents() {
		Collection<DataRecord> data = Database.h.values();
		List<GradeReport> reports = new ArrayList<>();
		for(DataRecord d : data) {
			StudentAndReport sr 
			  = StudentGradeReportFactory
			      .createStudentAndReport(d.getName(), d.getGrade());
			reports.add(sr.getReport());	
		}
		
		Collections.sort(reports);
		Iterator<GradeReport> it = reports.iterator();
		System.out.println("A Students:");
		GradeReport next = null;
		while((next =it.next()) != null && next.getGrade().equals("A")) {
			System.out.println(next.getStudent().getName() + " ");
		}
		//Another way to print
//		for(GradeReport report : reports) {
//			if (report.getGrade().equals("A")) {
//				System.out.println(report.getStudent().getName()+":"+report.getGrade());
//			}
//		}
	}
	

}
