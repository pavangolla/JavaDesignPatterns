package com.designpattern.structural.facade;

import java.sql.Connection;

/**
 * Created by pgangadhar on 6/21/16.
 */
public class FacadeDemo {

	public static void main(String [] args) {

		String tableName = "Employee";
		//Without Facade
		Connection oracleConn = OracleHelper.openDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateHTMLOracleReport(oracleConn, tableName);

		//With Facade
		//Generate HTML reports
		DBHelperFacade.generateReport(DBHelperFacade.DBTypes.Oracle, DBHelperFacade.ReportTypes.HTML, tableName);
		DBHelperFacade.generateReport(DBHelperFacade.DBTypes.SQL, DBHelperFacade.ReportTypes.HTML, tableName);

		//Generate PDF reports
		DBHelperFacade.generateReport(DBHelperFacade.DBTypes.Oracle, DBHelperFacade.ReportTypes.PDF, tableName);
		DBHelperFacade.generateReport(DBHelperFacade.DBTypes.SQL, DBHelperFacade.ReportTypes.PDF, tableName);

	}
}
