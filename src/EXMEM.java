public class EXMEM {
	private int branchAddress;
	private boolean zero;
	private int ALUResult;
	private int registerValueToMemory;
	private int writeBackRegister;
	private int incrementedPc;
	private boolean jump;
	private int jumpAddress;
	
	// MEM Signals
	private boolean memRead;
	private boolean memWrite;
	private boolean branch;
	
	// WB Signals
	private boolean regWrite;
	private boolean memToReg;
	public EXMEM() {
		
	}
	public int getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(int branchAddress) {
		this.branchAddress = branchAddress;
	}
	public boolean isZero() {
		return zero;
	}
	public void setZero(boolean zero) {
		this.zero = zero;
	}
	public int getALUResult() {
		return ALUResult;
	}
	public void setALUResult(int aLUResult) {
		ALUResult = aLUResult;
	}
	public int getRegisterValueToMemory() {
		return registerValueToMemory;
	}
	public void setRegisterValueToMemory(int registerValueToMemory) {
		this.registerValueToMemory = registerValueToMemory;
	}
	public int getWriteBackRegister() {
		return writeBackRegister;
	}
	public void setWriteBackRegister(int writeBackRegister) {
		this.writeBackRegister = writeBackRegister;
	}
	public int getIncrementedPc() {
		return incrementedPc;
	}
	public void setIncrementedPc(int incrementedPc) {
		this.incrementedPc = incrementedPc;
	}
	public boolean isJump() {
		return jump;
	}
	public void setJump(boolean jump) {
		this.jump = jump;
	}
	public int getJumpAddress() {
		return jumpAddress;
	}
	public void setJumpAddress(int jumpAddress) {
		this.jumpAddress = jumpAddress;
	}
	public boolean isMemRead() {
		return memRead;
	}
	public void setMemRead(boolean memRead) {
		this.memRead = memRead;
	}
	public boolean isMemWrite() {
		return memWrite;
	}
	public void setMemWrite(boolean memWrite) {
		this.memWrite = memWrite;
	}
	public boolean isBranch() {
		return branch;
	}
	public void setBranch(boolean branch) {
		this.branch = branch;
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