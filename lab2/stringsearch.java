class Search{
  static int BinarySearch(int arr[],int num){
    int start=0,end=arr.length-1,mid;
    while(start<=end){
      mid=(start+end)/2;
      if(arr[mid]<num){
        start=mid+1;
      }else if(arr[mid]>num){
        end=mid-1;
      }else{
        return mid;
      }
    }
    return -1;
  }
  static int[] getMinAndMax(int arr[]){
    int res[]=new int[2];
    res[0]=0;
    res[1]=arr.length;
    for(int i=0;i<arr.length;i++){
	    if(arr[i]<res[1]) res[1]=arr[i];
	    if(arr[i]>res[0]) res[0]=arr[i];
	  }
	  return res;
  }
	static public void main(String[] args){
	  long start,end;
	  int size=1000;
	  int arr[]=new int[size];
	  for(int i=0;i<size;i++){
	    arr[i]=(int)(Math.random()*size);
	  }
    start=System.nanoTime();
    int res[]=getMinAndMax(arr);
	  end=System.nanoTime();
    System.out.println("Max= " + res[0]+"\nMin= "+res[1]);
    System.out.println("\nTake time= "+(end-start));
    int arr1[]=new int[size];
	  for(int i=0;i<size;i++){
	    arr1[i]=i+1;
	  }
	  start=System.nanoTime();
	  int result=BinarySearch(arr1,40);
	  end=System.nanoTime();
	  System.out.println("\nindex result= " +result);
	  System.out.println("\nTake time= "+(end-start));
	} 
}
