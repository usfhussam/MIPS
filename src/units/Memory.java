package units;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Memory {
	byte[] memory;
	
	public Memory() {
		memory = new byte[4096];
	}
	
	public byte[] getMemory() {
		return memory;
	}
	
	public void setMemory(byte[] memory) {
		this.memory = memory;
	}
	

	public void store(int index, byte[]array){
		
		for(int i=index; i-index < array.length; i++){
			memory[i] = array[i-index];
		}
		
	}
	public byte[] read(int start, int end) {
		
		return Arrays.copyOfRange(memory, start, end);
	}
	public int load_word(int index) {
		byte[] array = read(index, index + 4);
		return ByteBuffer.wrap(array).getInt();
	}
	public int load_byte(int index) {
		byte[] array = read(index, index+1);
		return (byte) array[0];
	}
	public void store_word(int index, int value) {
		byte[] array = break_word(value);
		write(index,array);
	}
}
