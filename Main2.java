public class Main2 {
    public static void main(String[] args) {
        
        int n=14;
        System.out.println("--------------------------Q.NO.1--------------------------------");
        System.out.println();
        for(int i=0;i<n;i++){
        // I
            for(int j=0;j<n;j++){

            if(

                (i==0) || (i==n-1) || (j==n/2)

            ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            // N
            System.out.print("  ");
            System.out.print("  ");
            
            for(int j=0;j<n;j++){

                if(

                    (j==0) || (i==j) || (j==n-1)

                ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            // E
            System.out.print("  ");
            System.out.print("  ");
            
            for(int j=0;j<n;j++){

                if(

                    (j==0) || (i==0) || (i==n-1) || (i==(n/2))

                ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            // U
            System.out.print("  ");
            System.out.print("  ");
            
            for(int j=0;j<n;j++){

                if(

                    (j==0 && i<n-1)|| (i==n-1 && j>0 && j<(n-1)) || (j==n-1 && i<n-1)

                ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.print("  ");
            System.out.print("  ");
            
            for(int j=0;j<n;j++){

                if(

                    (j==0) || (i==0 && j<(n-1)/2) || (j==(n-1)/2 && i>0 && i<n/2) || (i==n/2 && j<(n-1)/2) ||(i-j==(n-1)/2)

                ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
        
            // O
            
            
            for(int j=0;j<n;j++){

                if(

                    (j==0 && i>0 && i<n-1) || (j==n-1 && i>0 && i<n-1) || (i==0 && j>0 && j<n-1) || (i==n-1 && j>0 && j<n-1)

                ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
                  // N
                  System.out.print("  ");
                  System.out.print("  ");
                  
                  for(int j=0;j<n;j++){
      
                      if(
      
                          (j==0) || (i==j) || (j==n-1)
      
                      ){
                          System.out.print("*");
                      }
                      else{
                          System.out.print(" ");
                      }
      
                  }
        System.out.println();
    }
        System.out.println("--------------------------Q.NO.2--------------------------------");
        System.out.println();        
        int m=4;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------Q.NO.s -3,4,5--------------------------------");
        System.out.println();

        for(int i=0;i<n;i++){
        System.out.print(" ");
        System.out.print(" ");
        // WAP: 3
        for(int j=0;j<n;j++){

            if(

               (i+j<=(n-1)/2) ||(j==0)||(i==0) || (j-i>=(n-1)/2+1) || (j==n-1) || (i==n-1)

            ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        }


        // WAP 4
        System.out.print(" ");
        System.out.print(" ");
       
        for(int j=0;j<n;j++){

            if(

               (i-j>=(n-1)/2)|| (i==n-1) ||(j==0 && i>(n-1)/2) || (i+j>=(n-1)+(n-1)/2) || (j==n-1 && i>(n-1)/2)

            ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        }
        // WAP 5
        System.out.print(" ");
        System.out.print(" ");
       
        for(int j=0;j<n;j++){

            if(

               (i==0) || (i==n-1) || (i+j<=(n-1)/2) || (j==0) || (i-j>=(n-1)/2)

            ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        }
        System.out.println();
    }

    }
}
