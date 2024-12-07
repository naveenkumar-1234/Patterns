class Main{
    public void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
    public void pattern7(int n){
        for(int i=0;i<n;i++){
            //for printing space
            for(int j=n-1;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i*2+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern8(int n){
        for(int i=0;i<n;i++){
            //for printing space
            for(int j=0;j<i;j++)
                System.out.print("_");


            System.out.println();
        }
    }
    public static void main(String[] args) {
        Main obj = new Main();
//        obj.pattern1(5);
//          obj.pattern2(5);
//           obj.pattern3(5);
//          obj.pattern4(5);
//            obj.pattern5(5);
            obj.pattern8(5);
    }


}
