/*package com.rohit.aws;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import com.amazonaws.services.lambda.runtime.Context;
//import com.amazonaws.services.lambda.runtime.RequestHandler;


import java.net.URLDecoder;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
//import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.event.S3EventNotification;
import com.amazonaws.services.s3.event.S3EventNotification.S3EventNotificationRecord;


public class MySqlTest implements RequestHandler<S3EventNotification ,String>{

	 public String handleRequest(S3EventNotification s3event, Context context) {
	        try {
	            System.out.println("EVENT CALLED");
	        	S3EventNotificationRecord record = s3event.getRecords().get(0);

	            // Retrieve the bucket & key for the uploaded S3 object that
	            // caused this Lambda function to be triggered
	            String bkt = record.getS3().getBucket().getName();
	            String key = record.getS3().getObject().getKey().replace('+', ' ');
	            key = URLDecoder.decode(key, "UTF-8");

	            // Read the source file as text
	            AmazonS3 s3Client = new AmazonS3Client();
	            String body = s3Client.getObjectAsString(bkt, key);
	            System.out.println("Body: " + body);
	            return "ok";
	        } catch (Exception e) {
	            System.err.println("Oh No...  Exception: " + e);
	            return "error";
	        }
	    }
	
	
//	public ResponseDetails handleRequest(RequestDetails request, Context arg1) {
//		ResponseDetails response = new ResponseDetails();
//	  try {
//		
//		  insertDetails(request,response);
//		  
//	  }catch(Exception e) {
//		  e.printStackTrace();
//		  response.setMessageId("999");
//		  response.setMessageReason("Unable to register" + e);
//	  }
//	
//	return response;
//	
//	}

//	private void insertDetails(RequestDetails request, ResponseDetails response) throws SQLException {
//
//		String url = "jdbc:mysql://rohitjain.ch1zigykfyol.ap-south-1.rds.amazonaws.com:3306/rohitjain?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=GMT";
//		String username = "rohitjain";
//		String password = "rohitjain";
//		Connection conn = DriverManager.getConnection(url, username, password);
//		String query = "insert into rohitjain.employee values('" + request.getEmpId() + "','" + request.getEmpName() + "');" ;
//		System.out.println("Query : " + query);
//		Statement stmt = (Statement) conn.createStatement();
//		int respCode = stmt.executeUpdate(query);
//	
//		if(1 == respCode) {
//			response.setMessageId("1");
//			response.setMessageReason("Successfully update the value");
//		}
//		
//	}
}
*/