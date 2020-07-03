package com.dxctechnology.synchrozied;

class PrintTables{
	synchronized void printTables(int min, int max) {
		for(int i = min; i<=max; i++) {
			System.out.println("printing tables "+i);			
		}
	}
}

class PrintTablesThread extends Thread{
	int min; 
	int max;
	PrintTables tables;
	PrintTablesThread(PrintTables tables, int min, int max){
		this.tables=tables;
		this.min = min;
		this.max = max;
	}

	public void run() {
		tables.printTables(min, max);
	}
}

public class SynchroziedMainDemo {

	public static void main(String[] args) {

		PrintTables tables = new PrintTables();
		PrintTablesThread thread1= new PrintTablesThread(tables,1,10);
		PrintTablesThread thread2= new PrintTablesThread(tables,100,110);
		thread1.start();
		thread2.start();

	}


}
