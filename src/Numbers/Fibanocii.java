package Numbers;//1,
// 1,2,
// 3, 5, 8,
// 13, 21, 34,
// 55, 89, 144

public class Fibanocii {

    public static void main(String[] args) {
        fibonacii(15);
    }




    public static void fibonacii(int count)
    {
        int number=1;
        int prevoiusNumber=1;
        int Sum=0;
        Integer []AllFibanocii=new Integer[count];

            for(int i=1;i<count;i++)
            {
//                System.out.println(number+prevoiusNumber);
                Sum=number+prevoiusNumber;
                AllFibanocii[i]=Sum;
                prevoiusNumber=number;
                number=Sum;
            }
             int temp=0;
//            for()
            for(int i=0;i<AllFibanocii.length;i++)
            {
                for(int j=0;j<i+1;j++)
                {
                    System.out.print(AllFibanocii[i]+" ");
                    temp=j;
                }
                System.out.println();
                i=temp;
            }
    }
}
