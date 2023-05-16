package basic;

public class MaxandMin {

	public static void main(String[] args) {
		int [] numb = {15, 86, 96, 26};
		 int maxnumb = numb[0];
		 int minnumb = numb[0];
		
		for (int i=1; i<numb.length; i++) {
			if (numb[i]> maxnumb) {
				maxnumb = numb[i];
			}
			if (numb[i]<maxnumb){
				minnumb = numb[0];
			}
		}
		System.out.println("The maximun value is: "+maxnumb);
		System.out.println("The minimub value is: "+minnumb);

	}

}
