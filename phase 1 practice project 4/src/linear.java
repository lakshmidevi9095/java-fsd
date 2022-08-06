public class linear {
   public static void main(String args[]){
      int array[] = {54, 83, 18, 98, 12, 57};
      int size = array.length;
      int value =18;
         for (int i=0 ;i< size-1; i++){
         if(array[i]==value){
            System.out.println("Element found index is :"+ i);
         }
         else{
            System.out.println("Element not found");
         }
      }
   }
}