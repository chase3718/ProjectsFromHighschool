/**
 * @(#)Stuff.java
 *
 *
 * @author
 * @version 1.00 2014/12/2
 */


public class Stuff {

    public static void main (String [] args) {
    	int ca = 17;
    	int cb = 76;
    	double c = (double)ca/cb;
    	String t = ca + "/" + cb;
    	double lownum = 0;
    	double hinum = 1;
    	String lt = "";
    	String ht = "";
    	for (int b = 1; b <= 100; b++) {
    		for (int a = 1; a <= b; a++) {
    			if ((double)a/b < c && (double)a/b > lownum) {
    				lownum = (double)a/b;
    				lt = a + "/" + b;
    			}
    		}
    	}
    	for (int b = 1; b <= 100; b++) {
    		for (int a = 1; a <= b; a++) {
    			if ((double)a/b > c && (double)a/b < hinum) {
    				hinum = (double)a/b;
    				ht = a + "/" + b;
    			}
    		}
    	}

    	System.out.print(lt + " < " + t + " < " + ht);
    }

}