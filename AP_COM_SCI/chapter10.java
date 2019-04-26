public class chapter10{
	public static void main(String []args) {
		/*String date = "2/4/2015";
    	String c = "";
    	for (int n = 0; n < date.length(); n++) {
    		if (date.charAt(n) == '/') {
    			for (int o = n; o < date.length(); o++) {
    				if (date.charAt(o) == '/' || o == date.length()) {
    					c += date.substring(n,o);
    				}
    			}
    		}
    	}
    c = c.replace("/","-");
    System.out.print(c);*/
    String date = "01/02/3456";
    String d, m, y;
    m = date.substring(0,date.indexOf("/"));
    d = date.substring(date.indexOf("/")+1,date.lastIndexOf("/"));
    y = date.substring(date.lastIndexOf("/")+1);
    System.out.print(d + "-" + m + "-" + y);
	}
}