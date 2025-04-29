public class method {
    int num=123;
    String name ="Aishu";
    void drive(){//with parameter without return type
        System.out.println("Aadhi");
    }
    String play()
    {
        return num+" "+name;
    }
    public static void main(String[] args) {
        method c=new method();
        c.drive();
       String m = c.play();
       System.out.println(m);
    }
    
}
