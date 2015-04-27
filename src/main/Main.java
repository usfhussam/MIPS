package main;

import registers.RegisterFile;

public class Main {
	public static void main(String [] args) {
		//Loop program
		
		//String instructions = "main:;addi $t0,$0,10;addi $t1,$0,2;addi $t2,$0,0;Loop:;addi $t1,$t1,1;addi $t2,$t2,1;slt $t3,$t2,$t0;bne $0,$t3,Loop";
		//Simulator sim = new Simulator(instructions);
		//sim.runAllInstructions();
		//System.out.println("Register $t0 has the value: "+RegisterFile.getRegister("$t0").getValue());
		//System.out.println("Register $t2 has the value: "+RegisterFile.getRegister("$t2").getValue());
		//System.out.println("Register $t1 has the value: "+RegisterFile.getRegister("$t1").getValue());
		//System.out.println("Register $t3 has the value: "+RegisterFile.getRegister("$t3").getValue());
		
		//Load/Store program
		//String instructions ="main:;addi $t2,$t2,6;addi $t3,$t2,-3;sw $t2,0($t5);sw $t3,4($t5);lw $t0,0($t5);addi $t5,$t5,4;lw $t1,0($t5);add $t6,$t1,$t0";
		//Simulator sim = new Simulator(instructions);
		//sim.runAllInstructions();
		//System.out.println("Register $t0 has the value: "+RegisterFile.getRegister("$t0").getValue());
		//System.out.println("Register $t1 has the value: "+RegisterFile.getRegister("$t1").getValue());
		//System.out.println("Register $t6 has the value: "+RegisterFile.getRegister("$t6").getValue());
		
		//function call
		//String instructions ="j main;double:;add $t2,$t2,$t2;jr $ra;main:;addi $t2,$0,4;jal double;";
		//Simulator sim = new Simulator(instructions);
		//sim.runAllInstructions();
	   //System.out.println("Register $t2 has the value: "+RegisterFile.getRegister("$t2").getValue());
		
	}
}
