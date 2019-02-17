package JavaBasics;

public class arrayconceptsinjava {

	public static void main(String[] args) {
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i.length);	
		//for(int j=0;j<i.length;j++) {
			//System.out.println(i[j]);
		//}
		//2.double array;
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=13.44;
		d[2]=45.55;
		System.out.println(d[2]);
		//char array;
		char c[]=new char[3];
		c[0]='q';
		c[1]=2;
		c[2]='$';
		//bulean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		//string array;
		String s[]=new String[3];
		s[0]="test";
		s[1]="Hellow";
		s[2]="world";
		System.out.println(s.length);
		System.out.println(s[1]);
		
		
		
		

	}

}
