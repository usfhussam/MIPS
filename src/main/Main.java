package main;

import registers.RegisterFile;

public class Main {
	public static void main(String [] args) {
		String instructions = "addi $t0,$0,1;addi $t1,$0,2;sltu $t3,$t1,$t0";
		Simulator sim = new Simulator(instructions);
		sim.runAllInstructions();
		System.out.println(RegisterFile.getRegister("$ra").getValue());
		System.out.println(RegisterFile.getRegister("$t3").getValue());
	
	}
}
