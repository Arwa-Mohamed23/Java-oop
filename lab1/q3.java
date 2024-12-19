class Q3{
  static boolean isNumber(String s){
    for(int i=0;i<s.length();i++){
      if(!(s.charAt(i)>='0'&&s.charAt(i)<='9'))
        return false;
    }
    return true;
  }
  static int convertToNumber(String s){
    int num=0;
    for(int i=0;i<s.length();i++){
      num*=10;
      num+=(s.charAt(i)-'0');
    }
    return num;
  }
	static public void main(String[] args){
	  int countArgs = args.length;
	  if(countArgs!=2)
	    System.out.println("You should enter 2 arguments");
	  else{
	    if(isNumber(args[0])){
	      int x=convertToNumber(args[0]);
	      while(x!=0){
	        System.out.println(args[1]);
	        x--;
	      }  
	    }else{
	      System.out.println("you should enter Number then word");
	    }
	  }
	}
}
