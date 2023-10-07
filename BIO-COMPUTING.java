public class count {
public static void main(String[] args) 
{
String dna = "ATGTACTGA";
char c='T';
int count=0;
for (int i=0;i<dna.length();i++)
	{
		if(c==dna.charAt(i))
		count+=1;
	}	
		System.out.println("Thymine appears "+count+" times in DNA sample");
	}
}
