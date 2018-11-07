package demo.mvc;

public class SingleInstanceOne {

    public SingleInstanceOne(){
    }

    public static class CreateInstance{
        public  static final SingleInstanceOne instanceOne = new SingleInstanceOne(); //避免内存浪费
    }

    public static SingleInstanceOne returnNewInstance(){
        return  CreateInstance.instanceOne;
    }

    public static void main(String[] args) {
         if(System.out.printf("a")==null){
             System.out.print("a");
         }else{
             System.out.print("b");
         }
    }

}
