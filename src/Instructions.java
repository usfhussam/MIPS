
public class Instructions {
	
 private int rs;
 private int rd;
 private int rt;
 private int iConstant;
 private boolean shift;
 private int shamt;
 private int format;
 
 public void decodeInstruction(String instruction) {
	 String[] split = instruction.split(" ");
	 String firstHalf = split[0];
	 String secondHalf = split[1];
	 adjustFormat(firstHalf);
	 String[] registers = secondHalf.trim().split(",");
	 switch(format) {
	 case 0: rd = RegisterFile.getIndex(registers[0].trim());
	     if(shift) {
	    	 rt = RegisterFile.getIndex(registers[1].trim());
	    	 shamt = Integer.parseInt(registers[2].trim());
	     }
	     else{
	         rs = RegisterFile.getIndex(registers[1].trim());
	         rt = RegisterFile.getIndex(registers[2].trim());
	     }
	     break;
	 case 1: 
		 rt = RegisterFile.getIndex(registers[0].trim());
		 rs = RegisterFile.getIndex(registers[1].trim());
		 iConstant = Integer.parseInt(registers[2].trim());
		 break;
		 
	 case 2:
		 rt  = RegisterFile.getIndex(registers[0].trim());
		 String[] offsetSplit = registers[1].split("(");
		 String offset = registers
	 }
	 
 }
 public void adjustFormat(String methodName) {
	 switch(methodName) {
	 case "add": 
	 case "sub":
	 case "and":
	 case "nor":
	 case "slt":
	 case "sltu":
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
 public int registerToWritein() {
	 switch(format) {
	 case 0:
		 return rd;
	 case 1:
	 case 2:
		 return rt;
	 case 5:
		 return RegisterFile.getIndex("ra");
	default: return -1;
	 }
 }
}
