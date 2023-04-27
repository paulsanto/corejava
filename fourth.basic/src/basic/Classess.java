package basic;

public class Classess {
	public static void main(String args[]) {
		 Zoo m= new Zoo();
	     System.out.println(m.coolMethod());
	     Moo M=new Moo();
	     M.useAZoo();
	    
	     
	 }

}
class Zoo{
	 public String coolMethod() {
		 return "Wow baby";
	 }
}

class Moo{
	 public void useAZoo() {
		 Zoo z = new Zoo();
		 System.out.println("A Zoo says, "+z.coolMethod());
	 }
}
class Koo{
	
}
