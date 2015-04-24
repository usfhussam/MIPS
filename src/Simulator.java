import registers.RegisterFile;




public class Simulator {
 private int[] memory = new int[1024];
 private RegisterFile regs = new RegisterFile();
 private IFID instructionFetchDecode = new IFID();
 private IDEX instructionDecodeExecute = new IDEX();
 private EXMEM executeMemory = new EXMEM();
 private MEMWB memoryWriteBack =  new MEMWB();
 public Simulator() {
	 
 }
 public void fetch(int Instruction) {
	 instructionFetchDecode.setInstruction(Instruction);
 }
 
 public void decode() {
	instructionDecodeExecute.setInstruction(instructionFetchDecode.getInstruction());
	instructionDecodeExecute.setRd((instructionFetchDecode.getInstruction()>>>11)& 0x1F);
	instructionDecodeExecute.setRs((instructionFetchDecode.getInstruction()>>>21)& 0x1F);
	instructionDecodeExecute.setRt((instructionFetchDecode.getInstruction()>>>16)& 0x1F);
	instructionDecodeExecute.setRegister1Value(instructionDecodeExecute.getRs());
	instructionDecodeExecute.setRegister2Value(instructionDecodeExecute.getRt());
	instructionDecodeExecute.setIncrementedPc(instructionFetchDecode.getIncrementedPC());
 }
	public static boolean CheckRFormat(int i) {
		if (((i >>> 26) & 0x3f) == 0) {
			return true;
		}
		return false;
	}
}
