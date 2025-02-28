import java.util.ArrayList;
import java.util.List;

public class ArrayuniqueElem {

        public static void main(String[] args) {
            int [] b= {4,7,13,7,12,7,12,6,7};
            List<Integer> c = new ArrayList<>();
            int count=1;
            for(int i=0;i<b.length;i++)
            {

                for(int j=i+1;j<b.length;j++)
                {
                    if(b[j]==b[1])
                    {
                        count++;
                    }
                }
            if(count==1)
            {
                int d=b[i];
                c.add(d);

            }
            System.out.println(c);
        }
    }

}
