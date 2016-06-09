package br.com.ggdio.zssn.util;

public class CharacterUtil {

	public static Character getFirstChar(String val) {
		if(val == null || val.length() == 0) return null;
		
		return val.charAt(0);
	}
	
	public static Character getBoolean(Boolean value) {
		if(value != null && value) return 'Y';
		return 'N';
	}
	
}
