package Basic;

/**
 * this，可以省略
 */
public class Dog {
    String name;
    double weight;
    public void fly(){
        System.out.println("fly\n");
    }
    public void run(){
        this.jump();
        System.out.println("run\n");
    }

    public Dog(){
        super();
        System.out.println("create dog");
    }
    public Dog(String name,double weight){
        this.name=name;
        this.weight=weight;
        System.out.println("name: "+name+"\nweight: "+weight+"g");
    }
}
