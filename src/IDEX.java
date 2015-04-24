public class IDEX {
	private int incrementedPc;
	private int jumpAddress;
	private int register1Value;
	private int register2Value;
	private int signExtendedOffset;
	private int rt;
	private int rd;
	private int rs;
	private int shamt;
    private int instruction;
	// EX Signals
	private boolean aluSrc;
	private boolean regDest;
	private int aluOpt;
	private boolean jump;
	private boolean jumpRegister;

	// MEM Signals
	private boolean memRead;
	private boolean memWrite;
    private boolean branch;
	
	// WB Signals
	private boolean regWrite;
	private boolean memToReg;
	
	public IDEX() {
		
	}
	public int getIncrementedPc() {
		return incrementedPc;
	}
	public void setIncrementedPc(int incrementedPc) {
		this.incrementedPc = incrementedPc;
	}
	public int getJumpAddress() {
		return jumpAddress;
	}
	public void setJumpAddress(int jumpAddress) {
		this.jumpAddress = jumpAddress;
	}
	public int getRegister1Value() {
		return register1Value;
	}
	public void setRegister1Value(int register1Value) {
		this.register1Value = register1Value;
	}
	public int getRegister2Value() {
		return register2Value;
	}
	public void setRegister2Value(int register2Value) {
		this.register2Value = register2Value;
	}
	public int getSignExtendedOffset() {
		return signExtendedOffset;
	}
	public void setSignExtendedOffset(int signExtendedOffset) {
		this.signExtendedOffset = signExtendedOffset;
	}
	public int getRt() {
		return rt;
	}
	public void setRt(int rt) {
		this.rt = rt;
	}
	public int getRd() {
		return rd;
	}
	public void setRd(int rd) {
		this.rd = rd;
	}
	public int getShamt() {
		return shamt;
	}
	public void setShamt(int shamt) {
		this.shamt = shamt;
	}
	public boolean isAluSrc() {
		return aluSrc;
	}
	public void setAluSrc(boolean aluSrc) {
		this.aluSrc = aluSrc;
	}
	public boolean isRegDest() {
		return regDest;
	}
	public void setRegDest(boolean regDest) {
		this.regDest = regDest;
	}
	public int getAluOpt() {
		return aluOpt;
	}
	public void setAluOpt(int aluOpt) {
		this.aluOpt = aluOpt;
	}
	public boolean isJump() {
		return jump;
	}
	public void setJump(boolean jump) {
		this.jump = jump;
	}
	public boolean isJumpRegister() {
		return jumpRegister;
	}
	public void setJumpRegister(boolean jumpRegister) {
		this.jumpRegister = jumpRegister;
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
	public int getInstruction() {
		return instruction;
	}
	public void setInstruction(int instruction) {
		this.instruction = instruction;
	}
	public int getRs() {
		return rs;
	}
	public void setRs(int rs) {
		this.rs = rs;
	}
}