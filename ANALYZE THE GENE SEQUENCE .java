
 class DNA
 {
public static void main(String[] args) 
{
String dna1 = "ATGTACTGA";
String dna = dna1;
int ATG = dna.indexOf("ATG");
int TGA = dna.indexOf("TGA");
int sequenceDifference = ATG - TGA;
if (dna.contains("ATG") && dna.contains("TGA") && (sequenceDifference % 3) == 0)
 {
System.out.println(dna+" contain protein!");
}
 else 
{
System.out.println(dna+" does not contain protein!");
}
}
}

