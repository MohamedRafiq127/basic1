/*Basic strings*/
public class Main
{
	public static void main(String[] args) {
		String s1="Rafi";
		String s2="java";
		char ch[]={'l','o','v','e','s'};
		String s4="java is highlevel program";
		char ch1[]=s1.toCharArray();
		String rev=" ";
		String a[]= s1.split(" ");
		String s3=new String(ch);
		byte ab[]=s1.getBytes();
		String joinstr=String.join("",s1,s3,s2);
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.contains("Ra"));
		System.out.println(s1+" "+s3+" "+s2);
		for(int i=s1.length()-1;i>=0;i--){
		    rev=rev+s1.charAt(i);
		}
		System.out.println("Reversed string is: "+rev);
		System.out.println(s1.concat(" "+s2));
		System.out.println(s1.substring(0,3));
		for (int j=0;j<a.length;j++)
		System.out.println(a[j]);
		System.out.println(s1.isEmpty());
		System.out.println(s1.replace("Ra","ra"));
		System.out.println(s1.format("Name:"+s1));
		for (int i=0;i<ch1.length;i++)
		System.out.print(ch1[i]);
		System.out.println("\n"+joinstr);
		for(int i=0;i<ab.length;i++)
		System.out.print(ab);
		System.out.println("\n"+s1.compareTo(s2));
		System.out.println(s4.indexOf("is"));
		int y=s4.indexOf("program");
		System.out.println(y);
		
	}
}
