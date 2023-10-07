import java.io.*;
class AppFile
{
    public static void main(String[]args)
    {
        String strFilePath="c:\\users\\arunk\\sample.txt";
        try
        {
            FileOutputStream fos=new FileOutputStream(strFilePath,true);
            String strContent=" Append output to file example ";
            fos.write(strContent.getBytes());
            fos.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("FileNotFoundException:"+ex);
        }
        catch(IOException ioe)
        {
            System.out.println("IOExcetion:"+ioe);
        }
    }
}
