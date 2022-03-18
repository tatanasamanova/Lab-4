import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
// ввод размерности и массива с клавиатуры
        int m = in.nextInt();
        int[] nums=new int[m];
        for(var a=0; a<m; a++)
        {
            nums[a]=in.nextInt();
        }
// поиск минимального элемента
        int min=nums[0];
        for(var a=0; a<m; a++)
        {
            if (min<nums[a])
            {
                min=nums[a];
            }
        }
// поиск среднего арифметического
        int Sum=0;
        for(var a=0; a<m; a++)
        {
            Sum=Sum+nums[a];
        }
        System.out.println(Sum/m);
    }
}
