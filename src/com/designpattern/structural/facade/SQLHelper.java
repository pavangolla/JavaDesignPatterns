package com.designpattern.structural.facade;

import java.sql.Connection;

/**
 * Created by pgangadhar on 6/21/16.
 */
public class SQLHelper {

	public static Connection openDBConnection() {
		return null;
	}

	public void generateHTMLSQLReport(Connection conn, String tableName) {
		// Generate SQL HMTL report
		System.out.println("SQL HTML Report");
	}

	public void generatePDFSQLReport(Connection conn, String tableName) {
		// Generate SQL PDF report
		System.out.println("SQL PDF Report");
	}
}
