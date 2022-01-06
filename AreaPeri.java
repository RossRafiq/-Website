import java.io.*;
class AreaPeri {
    public static void main(String args[])
    {
        String s;
        float radi,area,peri;
        final double pi=3.147;
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the Radius value");
            s=br.readLine();
            radi=Float.parseFloat(s);
            area=(float)(pi*radi*radi);
            peri=(float)(2.0*pi*radi);
            System.out.println("Area="+area);
            System.out.println("Perimeter="+peri);
            }
            catch(IOException e)
            {
                System.out.println("Input Error"+e);
            }
    }
}
