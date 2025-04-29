public class inheritence {
  
    class car{
        void engine(){
            System.out.println("Fast");
        }
    }
    class driver extends car{
        void brake(){
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        car c = new car();
        c.engine();
        c.brake();
        
        
    }
}
