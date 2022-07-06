package praCTISE;

public class bubblesearch {

	public static void main(String[] args) {
		

		 {
			
			int a[]= {1,2,3,4,5,6,7,9,};
			int lower=0;
			int key =6;	
			int higher =a.length-1;
			boolean flag= false;
			
			
			
			 while(lower<=higher)
			 {
				 int m=(lower+higher)/2;
				 if(a[m]==key)
				 {
					 System.out.println("elemnt found");
				//flag= true;
							 break;			 
				 }
				 
				 if (a[m]<key)

				 {
					 lower= lower+1;
					 
				 }
				 
				 if (a[m]>key)

				 {
					 higher=m-1;
					 
				 }
			 }
			if(flag==false)
			{
				System.out.println("not found");

		}
		}
		}





	}


