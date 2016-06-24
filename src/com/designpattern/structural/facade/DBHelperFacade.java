package com.designpattern.structural.facade;

import java.sql.Connection;

/**
 * Created by pgangadhar on 6/21/16.
 */
public class DBHelperFacade {

	public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
		switch(dbType) {
		case Oracle:
			Connection OrclConn = OracleHelper.openDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch (reportType) {
			case HTML:
				oracleHelper.generateHTMLOracleReport(OrclConn, tableName);
				break;
			case PDF:
				oracleHelper.generatePDFOracleReport(OrclConn, tableName);
				break;
			}
			break;
		case SQL:
			Connection sqlConn = SQLHelper.openDBConnection();
			SQLHelper sqlHelper = new SQLHelper();
			switch (reportType) {
				case HTML:
					sqlHelper.generateHTMLSQLReport(sqlConn, tableName);
					break;
				case PDF:
					sqlHelper.generatePDFSQLReport(sqlConn, tableName);
					break;
			}
			break;
		default:
			System.out.println("To genrate a report select valid DBType and ReportType");
		}
	}

	public enum DBTypes {
		Oracle, SQL;

	}

	public enum ReportTypes {
		HTML, PDF
	}
}
