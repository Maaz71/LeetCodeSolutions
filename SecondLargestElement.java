public class SecondLargestElement {
    public static void main(String[] args) {

        int num[] = {1,7,56,20,54,66,79};
        int max=num[0];
        int secMax=num[1];

        for(int i=0;i<num.length;i++)
        {
            if(num[i]>max)
            {
                secMax=max;
                max=num[i];
            }
        }
        System.out.println("max: "+max);
        System.out.println("second max: "+secMax);

    }
}
