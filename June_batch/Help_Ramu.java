import java.util.*;
public class Main {

    public static int solve(int c1, int c2, int c3, int c4, int []rickshaw,
                              int [] cabs, int n, int m){

         int priceR=0;

         for(int i=0; i<n;i++){

             int curr= Math.min(rickshaw[i]*c1, c2);
             priceR+=curr;
         }
         priceR= Math.min(c3, priceR);

         int priceC=0;

         for(int i=0; i<m;i++){

              int curr= Math.min(cabs[i]*c1, c2);

              priceC+=curr;
         }    

         priceC= Math.min(priceC, c3);

         return Math.min(priceC+ priceR, c4);

   }
    public static void main(String args[]) {


        Scanner s= new Scanner(System.in);

        int t= s.nextInt();

        while(t>0){
           
            int c1,c2,c3,c4;

            c1= s.nextInt();
            c2= s.nextInt();
            c3= s.nextInt();
            c4= s.nextInt();

            int n=0,m=0;

            n=s.nextInt();
            m=s.nextInt();
           
           int rickshaw [] = new int [n];
           int cabs[]= new int[m];

           for(int i=0; i<n;i++){

               rickshaw[i]= s.nextInt();
              
           }

           for(int i=0; i<m;i++){

                cabs[i]= s.nextInt();
           }

         int ans= solve(c1,c2,c3,c4, rickshaw, cabs, n, m);

         System.out.println(ans);






            t--;
        }

    }
}
