
package module3;

import io.jitpack.Module1Util;
import io.jitpack.Module2Util;

public class Main {
	public static void main(String[] args) {
		Module1Util module1Util = new Module1Util();
		String result = module1Util.testMethod();
		System.out.println(result);
		
		Module2Util module2Util = new Module2Util();
		 module1Util.testMethod();
	}
	

}
