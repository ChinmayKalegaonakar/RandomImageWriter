package util;

public class Util {
	
	public static int ensureRange(int value, int min, int max) {
		   return Math.min(Math.max(value, min), max);
		}
	public static int moreThan2(int i) {
		if(i<=2) return 3; else return i;
	}
	public static boolean inBetween(int number,int start,int end) {
		if(number>=start && number <= end) return true; else return false;
	}

}
