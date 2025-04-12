public class Array_Ex {
    public static void main(String[] args) {
        String[] students= new String[5];
        students[2]="Peter";
        students[1]="David";
        students[0]="Bob";
        students[3]="Charles";
        students[4]="John";
        students[2]="Mark";
        students[0]="Kevin";
    /*    System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);*/
        System.out.println(students.length);
        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i]);
        }
    }
}
