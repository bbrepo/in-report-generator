package com.infosys.demo;

public class PDFReportGenerator implements ReportGenerator{

	@Override
	public String generateReport(int recordsPerPage) {
		return "Generated PDF report with "+recordsPerPage+" records.";
	}

}
