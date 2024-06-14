package com.april13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path1 = "D:\\\\lec recordings and notes\\\\Placements Questions\\\\db.txt";
//		int b = 66;
		String s = "THE KIRAN ACADEMY";
		Student s1 = new Student(1,"JAY",88);
		
		try {
			
			FileOutputStream fo = new FileOutputStream(path1);

			byte[] n=s.getBytes();
			fo.write(n);
			
			ObjectOutputStream fobj = new ObjectOutputStream(fo);
			fobj.writeObject(s1);
			
			
			
//			fo.write(b);
			System.out.println("file written successfully..");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		System.out.println("file not found..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
