package com.infosys.demo;

public class HTMLReportGenerator implements ReportGenerator{

	@Override
	public String generateReport(int recordsPerPage) {
		return "Generated HTML report with "+recordsPerPage+" records.";
	}

}
