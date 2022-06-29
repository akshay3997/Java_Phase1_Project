package com.company.lockers;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class LockedMe {

	static final String ProjectPath = "E:\\FULL STACK JAVA DEV CLASS\\main course class recording\\Implement OOPS using JAVA with Data Structures and Beyond\\Java_Phase1_Project\\LockedMeFiles";
	
	public static void main(String[] args) {
		
		
			
		
		
		Scanner obj = new Scanner (System.in);
		int ch;
		do {
			DisplayMenu();
		System.out.println("Enter your choice");
		 ch = obj.nextInt();
		switch(ch) {
		case 1: GetAllFiles();
		break;
		
		case 2: CreateFile();
		break;
		
		case 3: DeleteFile();
		break;
		
		case 4: SearchFile();
		break;
		
		case 5: System.exit(0);//for closing console window.
		break;
		
		default: System.out.println("Invalid Option");
		break;
		}
		}
		while(ch>0);
	}
	
	public static void DisplayMenu() {
		System.out.println("***************************************************");
		System.out.println("\tWelcome to Company Locker - LockeedMe.com");
		System.out.println("Developer Name : Akshay Kumthekar");
		System.out.println("***************************************************");
		System.out.println("\t1. Display all the files ");
		System.out.println("\t2. Add files to existing dierectory ");
		System.out.println("\t3. Delete a file ");
		System.out.println("\t4. Search a file ");
		System.out.println("\t5. Exit");
		System.out.println("***************************************************");
	}

	public static void GetAllFiles() {
File[] listOfFile = new File(ProjectPath).listFiles();

if(listOfFile.length==0) {
	System.out.println("No file exist in the directory");
}
else {
	for(File l:listOfFile) {
		System.out.println(l.getName());
	}
}

	}
	
	public static void CreateFile() {
		try {
			Scanner obj = new Scanner (System.in);
			String FileName;
			int lineCount;
			System.out.println("Enter File Name");
			FileName = obj.nextLine();
			System.out.println("Enter how many line do you want to add in files");
			lineCount= Integer.parseInt(obj.nextLine());
			FileWriter fw= new FileWriter(ProjectPath+"\\"+FileName);
			
			for(int i=1;i<=lineCount;i++) {
				System.out.println("Enter file content line: ");
				fw.write(obj.nextLine()+"\n");
			}
			System.out.println("File Created Sucessfully");
			fw.close();
		}
		catch(Exception ex){
			System.out.println("Some Error Occured.");
		}
}
	
	public static void DeleteFile() {
		Scanner obj = new Scanner (System.in);
		try {
			String FileName;
			System.out.println("Enter file name to be deleted");
			FileName=obj.nextLine();
			File fl = new File(ProjectPath+"\\"+FileName);
			if(fl.exists()) {
				fl.delete();
				System.out.println("File deleted sucessfully");
			}
			else {
				System.out.println("File does not exist");
			}
		}
		catch(Exception ex) {
			System.out.println("Some error occure");
		}
	}
	
	public static void SearchFile() {
		Scanner obj = new Scanner (System.in);
		
		
			
			try {
				String FileName;
				System.out.println("Enter file name to be searched");
				FileName=obj.nextLine();
				File fl = new File(ProjectPath+"\\"+FileName);
				if(fl.exists()) {
					
					System.out.println("File is available");
				}
				else {
					System.out.println("File does not available");
				}
			
		}
		catch(Exception ex){
			System.out.println("Exception is occuered");
		}
	}
}
