package Lec1;

public class pattern1 {
	
	public static int sum(int [] arr, int l, int r) {
		
		int sum=0;
		
		for(int i=l; i<=r;i++) {
			sum+=arr[i];
		}
		
		return sum;
	}
	public static int lightCoin(int [] arr, int l, int r) {
		
		
		   
		    if(l==r) {
		    	return l;
		    }
		    
		    if(l==r+1) {
		    	
		    	if(arr[l]<arr[r]) {
		    		return l;
		    	}else {
		    		return r;
		    	}
		    }
	   
		    
		    int mid1=l+ (r-l+1)/3;
		    int mid2= mid1+1+ ((r-l+1)/3);
		    
		    System.out.println(l+" "+r+" ");
		    
		    
		    int sum1= sum(arr, l, mid1);
		    int sum2= sum(arr, mid1+1, mid2);
		    int sum3= sum(arr, mid2+1, r);
		    
//		    System.out.println(sum1+" "+sum2+" "+sum3);
		    
		    if(sum1==sum2) {
		    	
		    	return lightCoin(arr, mid2+1,r);
		    }else if(sum1<sum2){
		    	
		    	return lightCoin(arr, l,mid1);
		    }else {
		    	
		    	return lightCoin(arr,mid1+1, mid2);
		    }
		    
		    
		    
		   
		  
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 int [] arr= {1,1,1,1,1,1,0,1};
		 
		 System.out.println(lightCoin(arr, 0, arr.length-1));
		 
		 

	}

}
