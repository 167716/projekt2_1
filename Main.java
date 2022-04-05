class Main {
  public static void main(String[] args) {
    int s=1;
    int a=3;
    for(int i=5;i!=1;i--){
      for(int k=3;k!=a;k--) System.out.print(" ");
       
       for(int l=0;l!=s;l++) System.out.print("*");
      
      System.out.println();
      s++;
      a--;
      }
       
    
    for(int z=1;z<5;z++){ 
      System.out.print("   ");
      for(int n=0;n<z;n++) System.out.print("*");
      System.out.println();
      }
  }
}