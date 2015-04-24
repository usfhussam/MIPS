package main;

import registers.RegisterFile;

public class Main {
	public static void main(String [] args) {
		String instructions = "addi $t2,$0,2;sll $t2,$t2,2";
		Simulator sim = new Simulator(instructions);
		sim.runAllInstructions();
		System.out.println(RegisterFile.getRegister("$t2").getValue());
	}
}
