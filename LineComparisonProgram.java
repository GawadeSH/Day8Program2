package line;

public class LineComparisonProgram
{
    int x1 = 2, y1 = 5;         //point 1=(x1,y1)=(1,1)
    int x2 = 1, y2 = 4;         //point 2=(x2,y2)=(4,4)
    int x3 = 4, y3 = 5;          //point 3=(x3,y3)=(4,5)
    Double len1,len2;
    void length()
    {
        len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("length between point 1 and 2:-" + len1);

        len2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        System.out.println("length between point2 and 3:-"+len2);

        System.out.println(len1 + " .equals " + len2 + ": " + len1.equals(len2));

        int a=(len1.compareTo(len2));
        System.out.println(a);

    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Line Comparison Program");
        LineComparisonProgram l=new LineComparisonProgram();
        l.length();
    }
}
