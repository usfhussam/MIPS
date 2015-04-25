package main;

import registers.RegisterFile;

public class Main {
	public static void main(String [] args) {
		String instructions = "addi $t2,$0,0;sb $t2,4($t3);lb $t0,4($t3) $";
		Simulator sim = new Simulator(instructions);
		sim.runAllInstructions();
		System.out.println(RegisterFile.getRegister("$t0").getValue());
	
	}
}
