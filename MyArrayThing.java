class MyArrayThing{
  public static void main(String args[]){
   int r;
   int randomNum[] = new int[100];
   for(int i = 0; i <= 99; i++){
     r = (int) Math.round(Math.random() * 10000);
     randomNum[i] = r;
     System.out.println(randomNum[i]);
   }
  }
}
