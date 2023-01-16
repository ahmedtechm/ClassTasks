package ClassTask;

/* Find the stock which was most profitable ?! */

public class Stock {
	

	public static void main(String[] args) {
		
		 int[] riseStock= {900,1200,1200,1210,900,750,1050};
		 int[] wheatStock= {100,1900,1500,1500,1500,1500,1400};
		 int[] cottonStock= {200,700,300,290,600,750,350};
		 int profitRice=riseStock[0];
		 int profitwheat=riseStock[0];
		 int profitcotton=riseStock[0];
		
		 for(int i = 0; i < 6;i++) {
		 
			 int findDeffrnce=riseStock[i]-riseStock[i+1];
			 riseStock[i]=findDeffrnce;
		 }
		 
		 for(int i = 0; i < 6;i++) {
		 
			 if(profitRice>riseStock[i+1]) {
				 profitRice=riseStock[i+1];
		 }
	 }

		 for(int i = 0; i < 6;i++) {
		 
			 int findDeffrnce=wheatStock[i]-wheatStock[i+1];
			 wheatStock[i]=findDeffrnce;
		 }
		 
		 for(int i = 0; i < 6;i++) {
		 if(profitwheat>wheatStock[i+1]) {
		 profitwheat=wheatStock[i+1];
		 }
	 }

		 for(int i = 0; i < 6;i++) {
		 
			 int findDeffrnce=cottonStock[i]-cottonStock[i+1];
			 cottonStock[i]=findDeffrnce;
		 }
		 
		 for(int i = 0; i < 6;i++) {
		 
			 if(profitcotton>cottonStock[i+1]) {
				 profitcotton=cottonStock[i+1];
		 }
		}
		 System.out.println("The Most Profitable of Rice = "+profitRice);
		 System.out.println("The Most Profitable of Wheat = "+profitwheat);
		 System.out.println("The Most Profitable of Cotton = "+profitcotton);
			}
		}