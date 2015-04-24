package main;

import java.util.ArrayList;
import java.util.Hashtable;

import registers.Register;
import registers.RegisterFile;
import instructions.Instruction;
import units.*;

public class Simulator {
	Instruction currentInstruction; // instruction being consumed
	String currentRawInstruction; // string representation of currentInstruction
	int currentStage; // 0: fetch, 1: decode, 2: execute, 3:memory, 4:writeBack
	ArrayList<String> rawInstructions; 
	int currentInstructionIndex; // index of current instruction in instructionsArrayList
	int pc;
	int writeBackValue;
	ArithmeticLogicUnit alu;
	Memory memoryUnit;
	Hashtable<String, Integer> hooksHtbl; // Loop:, Branch: etc. vs their index in rawInstructions;
	public Simulator(String semiColonSeperatedInstructions) {
		rawInstructions = new ArrayList<String>();
		currentInstruction = new Instruction();
		alu = new ArithmeticLogicUnit();
		memoryUnit = new Memory();
		hooksHtbl = new Hashtable<String, Integer>();
		initInstructions(semiColonSeperatedInstructions); // populates instructionsArrayList
		RegisterFile.init(); // populates register file with named registers;
		
	}
	
	public void initInstructions(String semiColonSeperatedInstructions) {
		int index = 0;
		String[] rawInstructions = semiColonSeperatedInstructions.split(";");
		for(String rawInstruction : rawInstructions) {
			
			if(rawInstruction.contains(":")) {
				hooksHtbl.put(rawInstruction.substring(0, rawInstruction.length()-1), index);
			} else {
				this.rawInstructions.add(rawInstruction);
				index += 4;
			}
			
		}
	}
	
	public void runCurrentInstruction() {
		fetch();
		decode();
		execute();			
		memory();
		writeBack();
	}
	public void runAllInstructions() {

		while((pc >> 2)  < rawInstructions.size() ) {
			runCurrentInstruction();
		}
	}
	public void fetch() {
//		System.out.println(pc);
		currentInstructionIndex = pc >> 2; // divide pc by 4
		pc += 4;
		currentRawInstruction = rawInstructions.get(currentInstructionIndex);
	}
	
	public void decode() {
		currentInstruction = new Instruction(currentRawInstruction, hooksHtbl);
	}
	
	public void execute() {
		alu.execute(currentInstruction);
		writeBackValue = alu.output;
		if(alu.branch) {			
			pc = currentInstruction.getImmediateConstant(); 
		}
	}
	
	public void memory() {
		
		// check if instruction format is 2 or 3 which uses the memory
		int format = currentInstruction.getFormat();
		String type = currentInstruction.getType();
		int aluResult = alu.output;
		int rtValue = currentInstruction.getRt().getValue();
		if(format == 2 || format == 3) {
			switch(type) {
				case "lw":
					writeBackValue = memoryUnit.loadWord(aluResult);
					break;
				case "lb":
					writeBackValue = memoryUnit.loadByte(aluResult);
					break;
				case "sw":
					memoryUnit.storeWord(aluResult, rtValue);
					break;
				case "sb":
					memoryUnit.storeByte(aluResult, rtValue);
					break;
				
			}
		}
	}
	
	public void writeBack() {
		Register writingRegister = currentInstruction.getRegisterToWriteIn();
		if(currentInstruction.getFormat() != 3 && currentInstruction.getFormat() !=4) {
			writingRegister.setValue(writeBackValue);
		}
	}
}
