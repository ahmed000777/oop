package tr.edu.maltepe.oop;

public class profesor {

     String prof_name;

     profesor(String name){
          prof_name = name;
     }

     void teaches(){
          System.out.println("Prof " + prof_name +" is teaching now");
     }
}