package com.designpattern.structural.facade;

import java.sql.Connection;

/**
 * Created by pgangadhar on 6/21/16.
 */
public class OracleHelper {

	public static Connection openDBConnection() {
		return null;
	}

	public void generateHTMLOracleReport(Connection conn, String tableName) {
		//Generate HTML report for Oracle DB and for a specific table
		System.out.println("Oracle HTML report");
	}

	public void generatePDFOracleReport(Connection conn, String tableName) {
		//Generate Oracle PDF report for a specific table
		System.out.println("Oracle PDF report");
	}
}
