package instructions;
import registers.Register;
import registers.RegisterFile;


public class Instruction {

	private Register rs, rt, rd;
	private int iConstant;
	private boolean shift;
	private int shamt;
	private int format;
	private String type;
	public Instruction(String inst) {
		rs = new Register();
		rt = new Register();
		rd = new Register();
		decodeInstruction(inst);
	}
	public void decodeInstruction(String instruction) {
		String[] split = instruction.split(" ");
		String firstHalf = split[0];
		String secondHalf = split[1];
		adjustFormat(firstHalf);
		String[] registers = secondHalf.trim().split(",");
		switch(format) {
		case 0: 
			rd = RegisterFile.getRegister(registers[0].trim());
			if(shift) {
				rt = RegisterFile.getRegister(registers[1].trim());
				shamt = Integer.parseInt(registers[2].trim());
			}
			else{
				rs = RegisterFile.getRegister(registers[1].trim());
				rt = RegisterFile.getRegister(registers[2].trim());
			}
			break;
		case 1: 
			rt = RegisterFile.getRegister(registers[0].trim());
			rs = RegisterFile.getRegister(registers[1].trim());
			iConstant = Integer.parseInt(registers[2].trim());
			break;

		case 2:
		case 3:
			rt  = RegisterFile.getRegister(registers[0].trim());
			String[] offsetSplit = registers[1].trim().split("(");
			iConstant = Integer.parseInt(offsetSplit[0].trim());
			rs = RegisterFile.getRegister(registers[1].trim().substring(0,registers[1].length()-1));
		}

	}
	public void adjustFormat(String methodName) {
		type = methodName;
		switch(methodName) {
			case "add": 
			case "sub":
			case "and":
			case "nor":
			case "slt":
			case "sltu":
			
				format = 0;
				
				break;
			case "sll":
			case "srl":
				format = 0;
				shift = true;
				break;
			case "addi":
	
				format = 1;
				break;
			case "lui":
			case "lw":
			case "lb":
			case "lbu":
				format = 2;
				break;
			case "sw":
			case "sb":
				format = 3;
				break;
			case "beq":
			case "bneq":
				format = 4;
				break;
			case "j":
			case "jal":
				format = 5;
				break;
			case "jr":
				format = 6; 
				break;
			default:
				format = -1;
				break;

		}
	}
	public Register registerToWritein() {
		switch(format) {
		case 0:
			return rd;
		case 1:
		case 2:
			return rt;
		case 5:
			return RegisterFile.getRegister("$ra");
		default: return null;
		}
	}
	public int getFormat() {
		return format;
	}

	public String getType() {
		return type;
	}
	
	public Register getRd() {
		return rd;
	}
	
	public Register getRt() {
		return rt;
	}
	
	public Register getRs() {
		return rs;
	}
	
	public int getShiftAmount() {
		return shamt;
	}
	
	public int getImmediateConstant() {
		return iConstant;
	}

}
