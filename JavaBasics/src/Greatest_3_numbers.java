public class Greatest_3_numbers {

    public static void main(String[] args) {
        int a=30;
        int b=20;
        int c=45;

        if(a>b)
        {
            if(a>c)
            System.out.println(a+" is greater");
            else
                System.out.println(c+" is greater");

        }
        else if(b>c){
            System.out.println(b +" is greater");
        }
        else
            System.out.println(c+" is greater");

    }
}
