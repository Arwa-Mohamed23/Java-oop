import java.util.StringTokenizer;
import java.util.regex.Pattern;
class IpAddress{

  static boolean isValidIPAddress(String ip) {
        String ipRegex = "^\\d{1,3}(\\.\\d{1,3}){3}$";
        Pattern pattern = Pattern.compile(ipRegex);
        return pattern.matcher(ip).matches();
  }
  
	static public void main(String[] args){
	  int countArgs = args.length;
        if (countArgs == 0) {
            System.out.println("No Argument Entered");
        } else {
            System.out.println("List of IP Addresses:");
            for (int i = 0; i < countArgs; i++) {
                System.out.println("IP Address " + (i + 1) + " :");
                if (isValidIPAddress(args[i])) {
                    StringTokenizer tokenizer = new StringTokenizer(args[i], ".");
                    while (tokenizer.hasMoreTokens()) {
                        System.out.println(tokenizer.nextToken());
                    }
                } else {
                    System.out.println("Invalid IP Address");
                }
            }
      }
	} 
}
