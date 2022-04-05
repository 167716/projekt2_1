class Main {
  public static void main(String[] args) {
    int s=1;
   /* for(int i=5;i!=1;i--){
      for(int k=i-2;k!=0;k--)System.out.print(" ");
     for(int n=1;n<5;n++){
       
       if(n>=s){
         System.out.print("*");
         s++;
       }
       else System.out.println();
     }*/
    for(int i=5;i!=1;i--) {
      for(int k=i-2;i!=1;i--)System.out.print(" ");
      System.out.println("*");
    }
       
    
    for(int i=1;i<5;i++){ 
      System.out.print("   ");
      for(int n=0;n<i;n++) System.out.print("*");
      System.out.println();
      }
  }
}