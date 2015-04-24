package registers;

import java.util.Hashtable;

public class RegisterFile {
	private static Hashtable<String, Register> registersHtbl;
	
	public static void init(){
		registersHtbl = new Hashtable<String, Register>();
		registersHtbl.put("$0", new Register());
		registersHtbl.put("$at", new Register());
		registersHtbl.put("$v0", new Register());
		registersHtbl.put("$v1", new Register());
		registersHtbl.put("$a0", new Register());
		registersHtbl.put("$a1", new Register());
		registersHtbl.put("$a2", new Register());
		registersHtbl.put("$a3", new Register());
		registersHtbl.put("$t0", new Register());
		registersHtbl.put("$t1", new Register());
		registersHtbl.put("$t2", new Register());
		registersHtbl.put("$t3", new Register());
		registersHtbl.put("$t4", new Register());
		registersHtbl.put("$t5", new Register());
		registersHtbl.put("$t6", new Register());
		registersHtbl.put("$t7", new Register());
		registersHtbl.put("$s0", new Register());
		registersHtbl.put("$s1", new Register());
		registersHtbl.put("$s2", new Register());
		registersHtbl.put("$s3", new Register());
		registersHtbl.put("$s4", new Register());
		registersHtbl.put("$s5", new Register());
		registersHtbl.put("$s6", new Register());
		registersHtbl.put("$s7", new Register());
		registersHtbl.put("$t8", new Register());
		registersHtbl.put("$t9", new Register());
		registersHtbl.put("$k0", new Register());
		registersHtbl.put("$k1", new Register());
		registersHtbl.put("$gp", new Register());
		registersHtbl.put("$sp", new Register());
		registersHtbl.put("$fp", new Register());
		registersHtbl.put("$ra", new Register());
	}
	
	public static Register getRegister(String registerName) {
		return registersHtbl.get(registerName);
	}

}