package main;

import registers.RegisterFile;

public class Main {
	public static void main(String [] args) {
		String instructions = "addi $t0,$0,2;addi $t0,$t0,2;j L1;addi $t0,$t0,2;L1:;add $t3,$0,$t0";
		Simulator sim = new Simulator(instructions);
		sim.runAllInstructions();
		System.out.println(RegisterFile.getRegister("$t3").getValue());
	
	}
}
