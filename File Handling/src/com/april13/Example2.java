package com.april13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "D:\\lec recordings and notes\\Placements Questions\\File Handling.txt";
		String path1 = "Database.tka";
		
		try {
			FileInputStream fd = new FileInputStream(path);
			
			
			int data;
			while((data=fd.read())!=-1) {
				System.out.print((char)data);
			}
			
			
			System.out.println("file found on given location..");
			//file mdhe atul lihila aahe
//			int data1=fd.read();
//			int data2=fd.read();
//			int data3=fd.read();
//			int data4=fd.read();
//			int data5=fd.read();
//			int data6=fd.read();
//			System.out.println(data1);//ASCII value of A
//			System.out.println((char)data2);//typecaast
//			System.out.println(data3);//ASCII value of u
//			System.out.println(data4);//ASCII value of l
//			System.out.println(data5);//kahich nhi(-1 reutrns)
//			System.out.println(data6);//-1 mhnje End Of File
		    
			
			//space chi ASCII val 32 aahe
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		System.out.println("file not found..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
