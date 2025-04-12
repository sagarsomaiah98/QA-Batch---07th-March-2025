public class continueKeyword {
    public static void main(String[] args) {
        int a=3;
        for(int i=1;i<10;i++)
        {
            if(a<i)
                continue;//skip
            System.out.println(i);
        }
    }
}
