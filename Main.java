/**
 *Finds the factors for the interger in the parameter
 * @author Jackson
 */
public class Main {

  public static void factors(int num){
    for(int i = 1; i <= num; i++){
      if(num % i == 0){
        System.out.println(i);
      }
    }

  }


  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    factors(30);
    
  }
}
