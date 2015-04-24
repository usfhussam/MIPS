public class MEMWB {
	private int ALUResult;
	private int memoryWord;
	private int writeBackRegister;
	
	//WB Signals
	private boolean regWrite;
	private boolean memToReg;
	
	public MEMWB() {
		
	}
	public int getALUResult() {
		return ALUResult;
	}
	public void setALUResult(int aLUResult) {
		ALUResult = aLUResult;
	}
	public int getMemoryWord() {
		return memoryWord;
	}
	public void setMemoryWord(int memoryWord) {
		this.memoryWord = memoryWord;
	}
	public int getWriteBackRegister() {
		return writeBackRegister;
	}
	public void setWriteBackRegister(int writeBackRegister) {
		this.writeBackRegister = writeBackRegister;
	}
	public boolean isRegWrite() {
		return regWrite;
	}
	public void setRegWrite(boolean regWrite) {
		this.regWrite = regWrite;
	}
	public boolean isMemToReg() {
		return memToReg;
	}
	public void setMemToReg(boolean memToReg) {
		this.memToReg = memToReg;
	}
}