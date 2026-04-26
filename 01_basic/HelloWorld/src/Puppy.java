public class Puppy {
    private int age;
    private String name;
    //构造器
    public Puppy(){

    }
    public Puppy(String name){
        //这个构造器仅有一个参数
        this.name = name;
        System.out.println("小狗的名字：" + name);
    }
    //设置age的值
    public void setAge(int age){
        this.age = age;
    }
    //获取age的值
    public int getAge(){
        return age;
    }
    //获取name的值
    public String getName(){
        return name;
    }
    //主方法
    public static void main(String[] args){
        //创建对象
        Puppy myPuppy = new Puppy("jack");
        //通过方法来设定age
        myPuppy.setAge(2);
        //调用另一个方法获取age
        int age = myPuppy.getAge();
        System.out.println("小狗的年龄为：" + age);
        System.out.println("变量名：" + myPuppy.getAge());
    }
}
