import java.util.*;
public class firstProg{
  public static void main (String[] args){
      String [] things = {"eggs", "niggers", "kikes", "fags"};
      List<String> list = new ArrayList<String>();

      for(String x: things)
        list.add(x);

      String [] things2 = {"eggs", "kikes"};
      List<String> list2 = new ArrayList<String>();
      
      for(String y: things2)
        list2.add(y);

      for(int i = 0; i < list.size(); i++){
        System.out.println(list.get(i));
      }

      editList(list, list2);
      System.out.println("");
      System.out.println("");

      for(int i = 0; i< list.size(); i++){
        System.out.println(list.get(i));
      }
  }

  public static void editList(Collection<String> l1, Collection<String> l2){
    Iterator<String> it = l1.iterator();
    while(it.hasNext()){
      if(l2.contains(it.next()))
        it.remove();
    }
  }
}
