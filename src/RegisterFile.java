

public class RegisterFile {
 private  static Register[] registers;
 
 public RegisterFile() {
	registers  = new Register[32];
	registers[0] = new Register(0, "$0");
	registers[1] = new Register(0, "$at");
	registers[2] = new Register(0, "$v0");
	registers[3] = new Register(0, "$v1");
	registers[4] = new Register(0, "$a0");
	registers[5] = new Register(0, "$a1");
	registers[6] = new Register(0, "$a2");
	registers[7] = new Register(0, "$a3");
	registers[8] = new Register(0, "$t0");
	registers[9] = new Register(0, "$t1");
	registers[10] = new Register(0, "$t2");
	registers[11] = new Register(0, "$t3");
	registers[12] = new Register(0, "$t4");
	registers[13] = new Register(0, "$t5");
	registers[14] = new Register(0, "$t6");
	registers[15] = new Register(0, "$t7");
	registers[16] = new Register(0, "$s0");
	registers[17] = new Register(0, "$s1");
	registers[18] = new Register(0, "$s2");
	registers[19] = new Register(0, "$s3");
	registers[20] = new Register(0, "$s4");
	registers[21] = new Register(0, "$s5");
	registers[22] = new Register(0, "$s6");
	registers[23] = new Register(0, "$s7");
	registers[24] = new Register(0, "$t8");
	registers[25] = new Register(0, "$t9");
	registers[26] = new Register(0, "$k0");
	registers[27] = new Register(0, "$k1");
	registers[28] = new Register(0, "$gp");
	registers[29] = new Register(0, "$sp");
	registers[30] = new Register(0, "$fp");
	registers[31] = new Register(0, "$ra");
 }
 public static Register[] getRegisters() {
	 return registers;
 }
 public static void setRegisters(Register[] registers) {
	 RegisterFile.registers = registers;
 }
  public static int getIndex(String registerName) {
	  for(int i = 0; i< 32; i++) {
		  if(registers[i].getName().equals(registerName)) {
			  return i;
		  }
	  }
	  return -1;
  }
}