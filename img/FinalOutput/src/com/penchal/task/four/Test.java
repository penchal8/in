package com.penchal.task.four;
//import com.penchal.task.TextFileTest;
public class Test{
	public static void main(String[] args) {
		//example: TextFileTest.modifyFile("/home/penchal/Desktop/file.txt", "Hello boss", "Hi Guest","/home/penchal/fileupdate.docx");
        
		TextFileTest.modifyFile("filePath", "Hello boss", "Hi Guest","createNewFilePath");
        
        System.out.println("Done.");
	}

}
