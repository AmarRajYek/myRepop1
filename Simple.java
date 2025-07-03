class Simple{

   public  void Odd(){
        System.err.println("Printing Odd Nums");
        for(int i=1;i<20;i++){
            if(i%2!=0){
                System.out.print(i+ "  ");
            }
        }
        System.out.println();
    }

    void Even(){
        System.err.println("Printing Even Nums");
        for(int i=1;i<20;i++){
            if(i%2==0){
                System.out.print(i+ "  ");
            }
        }
    }

     public int Divby4(int ele){
            if(ele%4==0){
                return ele;
            }else{
                return 0;
            }
        }

        void Version(){
            System.out.println("Upgraded to Version 2.0");
        }

     public static void main(String args[]){
        Simple sc  = new Simple();
        sc.Odd();
        sc.Even();
        sc.Divby4(2);
        sc.Version();
    }
}