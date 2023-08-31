class Main {
  // Global variable Num_levels //
  public static int NUM_LEVELS=10;
  // main method//
  public static void main(String[] args) {
    //calls top, middle, and bottom methods//
    Top();
    Middle();
    Bottom();
  }
  public static void Top(){
    //Generates the |""""""| section//
    System.out.print("|");
      for (int i = 2*NUM_LEVELS+2; i>=1; i--){
        System.out.print("\"");
      }
    System.out.print("|");
    System.out.println();
    //Generates \::/ part with nested for loop//
    for (int x = NUM_LEVELS;x>=1; x--){
      //spacing before section//
      for (int g=NUM_LEVELS; g>x-1; g--)
        {
          System.out.print(" ");
        }
      //left end of the piece//
      System.out.print("\\");
      //colons//
      for (int j =2*x; j>=x+1; j--){
        System.out.print("::");
      }
      //right end//
      System.out.println("/");

    }  
  }
  //Middle section//
  public static void Middle(){
    //generates number of spaces before || and then prints it//
    for (int i=NUM_LEVELS;i>=0; i--){
      System.out.print(" ");
    }
    System.out.println("||");
  }
  //Bottom section//
  public static void Bottom(){
    //nested loop//
    for (int i = 1; i<=NUM_LEVELS;i++){
      //spacing before piece//
      for(int j=NUM_LEVELS; j>=i; j--){
        System.out.print(" ");
      }
      System.out.print("/");
      for(int x=1;x<=i;x++){
        System.out.print("::");
      }
      System.out.println("\\");
      
    }
    //bottom section of the bottom section |"""""|//
    System.out.print("|");
    for(int g=NUM_LEVELS*2 + 2; g>=1; g--){
      System.out.print("\"");
    }
    System.out.print("|");
    
    
  }
}