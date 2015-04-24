
public class Test {
 public static void main(String args[]) {
	 int x = 0x21073820;
	 int y = (x >>> 28) & 0xF;
	 System.out.println(y);
	 
	 int [] result = new int[3];
	 result[0] = 0;
	 result[1] = 1;
	 result[2] = 0;
	 String resulttext = "";
	 for(int i = 0; i < result.length; i++) {
		 resulttext += result[i];
	 }
	 int z = Integer.parseInt(resulttext,2);
	 System.out.println(resulttext);
 }
}
