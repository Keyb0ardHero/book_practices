package chap03;

class Hobbits{
	String name;
}

class HobbitsTestDrive {
	public static void main(String[] args) {
		Hobbits[] h=new Hobbits[3];
		
		int z=-1;
		while(z<2) {
			z=z+1;
			h[z]=new Hobbits();
			h[z].name="bilbo";
			if(z==1) 
				h[z].name="frodo";	
			if(z==2)
				h[z].name="sam";
			System.out.println(h[z].name+" is a good Hobbit name");
		}
	}
}
