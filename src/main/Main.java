package main;

import registers.RegisterFile;

public class Main {
	public static void main(String [] args) {
		String instructions = "addi $t0,$0,2;nor $t2,$t0,$t0";
		Simulator sim = new Simulator(instructions);
		sim.runAllInstructions();
		System.out.println(RegisterFile.getRegister("$t2").getValue());
	
	}
}
