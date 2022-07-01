public class SortNumbers {

    public static void main(String[] args) {
        int []number={10,20,5,6,8,30};

        for(int i=0;i<number.length-1;i++)
        {
            for (int j=i+1;j<number.length;j++)
            {
                if(number[i]>number[j])
                {
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }

        System.out.println(number[1]);
    }

}
