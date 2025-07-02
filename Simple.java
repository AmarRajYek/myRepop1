class Simple{

    void Odd(){
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

     public static void main(String args[]){
        Simple sc  = new Simple();
        sc.Odd();
        sc.Even();
    }
}