package main;

import registers.RegisterFile;

public class Main {
	public static void main(String [] args) {
		String instructions = "addi $t2,$0,2;addi $t0,$0,4;addi $t1,$0,0;Loop:;add $t2,$t2,$t2;addi $t1,$t1,1;bne $t1,$t0,Loop";
		Simulator sim = new Simulator(instructions);
		sim.runAllInstructions();
		System.out.println(RegisterFile.getRegister("$t2").getValue());
	}
}
