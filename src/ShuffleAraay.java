import java.util.Random;

public class ShuffleAraay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int mark[] = {88,95,15,10};
		 
		 int index;
		 Random ran = new Random();
		 for(int w= mark.length-1; w>0 ; w--) {
			 index = ran.nextInt(w+1);
			 mark[index]= mark[w];
			 mark[w]= index;
			 System.out.println(mark[w]);
		 }
		
		
				}
	}