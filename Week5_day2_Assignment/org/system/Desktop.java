package org.system;

public class Desktop extends Computer{
	public void desktopsize() {
		String displayName ="oled";
		int screenSize=19;
		System.out.println(displayName +" display");
		System.out.println(screenSize+"inchs");
	}
	public static void main(String[] args) {
		Desktop pc = new Desktop();
		pc.modelName();
		pc.desktopsize();
		
	}

}
