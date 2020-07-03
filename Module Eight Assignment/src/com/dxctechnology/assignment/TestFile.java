package com.dxctechnology.assignment;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) throws IOException {
		File file = new File("Badmiton");
		if (file.mkdir()) {
			System.out.println("folder Badmiton created");
		}
		File file1 = new File("Badmiton", "Singles.txt");
		if(file1.createNewFile()) {
			System.out.println("Singles.txt is created in badmiton folder");
		}
		File file2 = new File("Badmiton", "Dobbles.txt");
		if(file2.createNewFile()) {
			System.out.println("Dobbles.txt is created in badmiton folder");
		}
		File file3 = new File("Badmiton", "Court");
		if (file3.mkdir()) {
			System.out.println("Court is created in court which is in Badmiton folder");
		}
		File file4 = new File("Badmiton\\Court", "Smarsh.dat");
		if (file4.createNewFile()) {
			System.out.println("Smash.dat is created in court folder");
		}
		File newFileName = new File ("Doubles.txt");
		if(file2.renameTo(newFileName)) {
			System.out.println("Renamed successfully completed");
		}else {
			System.out.println("Renamed is unsuccessfully");
		}
		if(file1.delete()) {
			System.out.println("Singles.txt is deleted successfully");
		}
	}

}
