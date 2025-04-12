public class Greatest3Operator {
    public static void main(String[] args) {
        int a=320;
        int b=420;
        int c=45;

        if(a>b & a >c)
            System.out.println(a+" is greater");
        else if(b>c)
            System.out.println(b+" is greater");
        else
            System.out.println(c+" is greater");
    }
}
