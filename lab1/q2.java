class Q2{
	static public void main(String[] args){
	  int countArgs = args.length;
	  if(countArgs==0)
	    System.out.println("No Argument Entered");
	  else{
	    System.out.println("List of argument:");
	    for(int i=0;i<countArgs;i++){
	      System.out.println(args[i]);
	    }
	  }
	}
}
