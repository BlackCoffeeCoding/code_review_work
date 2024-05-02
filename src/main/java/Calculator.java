public class Calculator {
    public int add(int a, int b){
        System.out.println(a+b);
        return 0;
    }
    public int dif(int a, int b){
        System.out.println(a-b);
        return 0;
    }
    public int div(int a, int b){
        System.out.println(a*b);
        return 0;
    }
    public int times(int a, int b){
        System.out.println(a/b);
        return 0;
    }
    public int solver(){
        int a=3;
        int b=6;
        return dif(a,b)+b;
    }
}
