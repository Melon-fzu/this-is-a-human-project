public class Person {
    String name;
    int age = 1;   //这里的初始化在构造方法之前
    String gender;
    {
        System.out.println("我是代码块" + age);   //新建一个代码块会在初始后，构造前执行
    }
    Person(String name ,int age ,String gender){ //构造方法(初始化)
        System.out.println("我出生啦！");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    Person(){}
    Person(String name,int age){
        this(name,age,null);
    }

    void hello() {
        if (name == null) return;
        System.out.print("我叫"+ name+"，我今年"+age+"岁啦");
        if (gender == "male") System.out.println(",我是男生");
        else {
            System.out.println(",我是女生");
        }
    }

    int sum(int a,int b){     //括号内接受参数要定义一下
        int c = a + b ;
        return c;    //返回结果，与开头的类型要匹配
    }
    double sum(double a,double b){     //方法的重载
        return a + b;
    }

    char test(int a){
        if(a>1){
            return 'A';  //return后的语句不会到达
        }
        return 'B';
    }

    void say(int a){
        for (int i = 0 ;i <10;i++){
            if(i==a)return;
            System.out.println("你好！");
        }
    }
    void modify(Person p1) {
        p1.name = "nbnbnb";
    }
    void square(int a,int b){
        int res = a;
        for (int i = 1;i<b;i++){
            res =res * a ;
        }
        System.out.println(res);
    }

    void setName(String name){
        this.name = name;    //this代表当前对象本身(出现变量名与属性重复时使用)
    }
    void hi(){
        System.out.println("hi");
        this.play();
    }
    void goodbye(){
        System.out.println("goodbye");
    }
    void play(){
        System.out.println("play");
        this.goodbye();
    }
    void together(){
        this.hi();
        this.goodbye();
        this.play();
    }
    int add(int a){
        if(a==0)return 0;
        return add(a-1)+a;
    }
}
