package com.trainingbasket.loginapp.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.trainingbasket.loginapp.beans.Summary;

@SuppressWarnings("unused")
public class SummaryDAO {

	Connection connection;
	Statement statement;
	PreparedStatement pStatement;
	ResultSet resultSet;

	public SummaryDAO() {
		try {
			Class.forName(DbConfig.sqlDriverName);
			connection = DriverManager.getConnection(DbConfig.connectionUrlBase + DbConfig.user + DbConfig.password);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int InsertCallSummary(Map<String, List<Summary>> map) {
		int insertCTr = 0;
		try {

			Iterator<String> mapIterator = map.keySet().iterator();
			while (mapIterator.hasNext()) {
				String str = mapIterator.next();
				List<Summary> summary = map.get(str);
				String extensionDate[] = str.split(" ");
				Iterator<Summary> summaryIterator = summary.iterator();
				while (summaryIterator.hasNext()) {
					Summary summaryData = summaryIterator.next();
					
			
					//pStatement = connection.prepareStatement(DbConfig.INSERTSUMMARY);
				PreparedStatement ps=	connection.prepareStatement("INSERT INTO [SummerTraining].[dbo].[CallSummary] "
							+ " ([Extension], [Date] ,[TotalCallTime],[TotalCallNumber],[AverageCall],[FirstCall],[LastCall])"
							+ "values (?,?,?,?,?,?,?)"); 
				ps.setString(1, extensionDate[0] );
				ps.setString(2, extensionDate[1]);
				ps.setString(3, summaryData.getTotalCallTime() );
				ps.setString(4, summaryData.getTotalCallNumber());
				ps.setString(5, summaryData.getAverageCall());
				ps.setString(6, "");
				ps.setString(7, "");
				ps.executeUpdate();
					
					insertCTr++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return insertCTr;
	}
}
