package units;

import registers.Register;
import instructions.Instruction;

public class ArithmeticLogicUnit {
	public int output;
	public void execute(Instruction instruction) {

		int format = instruction.getFormat();
		switch(format) {
		case 0:
			output = executeRTypeInstruction(instruction);
			break;
		case 1:
			output = instruction.getRs().getValue() + instruction.getImmediateConstant();
			break;
		case 2:
		case 3:
			output = executeMemoryTypeInstruction(instruction);
		}
	}
	
	public int executeRTypeInstruction(Instruction instruction) {
		int result = 0;
		String type = instruction.getType();
		Register rs = instruction.getRs();
		Register rt = instruction.getRt();
		switch(type) {
			case "add":
				result = rs.getValue() + rt.getValue();
				break;
			case "sub":
				result = rs.getValue() - rt.getValue();
				break;
			case "and":
				result = rs.getValue() & rt.getValue();
				break;
			case "nor":
				result = ~(rs.getValue() | rt.getValue());
				break;
			case "slt":
				result = rs.getValue() < rt.getValue() ? 1 : 0;
				break;
			case "sll":
				result = rs.getValue() << instruction.getShiftAmount();
				break;
			case "srl":
				result = rs.getValue() >> instruction.getShiftAmount();
				break;
		}
		return result;
	}
	
	public int executeMemoryTypeInstruction(Instruction instruction) {
		int result = 0;
		String type = instruction.getType();
		Register rs = instruction.getRs();
		int immediateConstant = instruction.getImmediateConstant();
		switch(type){
			case "sw":
			case "sb":
			case "lb":
			case "lw":
				result = (immediateConstant * 4) + rs.getValue();
				break;
			case "lui":
			case "lbu":
				System.out.println("LUI and LBU yet to be implemented");
				break;
			
		}
		return result;
	}
}
