import java.util.*;  
public class LinkedList{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Lux");  
  al.add("Rama");  
  al.add("Raji");  
  al.add("Bharathi");  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  