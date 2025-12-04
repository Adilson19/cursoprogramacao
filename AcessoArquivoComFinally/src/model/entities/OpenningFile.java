package model.entities;

import java.io.File;
import java.util.Scanner;

public class OpenningFile {
	public String name;
	
	public OpenningFile(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void openFile(String name){
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
	}
}
