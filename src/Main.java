public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("小瓜",18,"male");
        Person person2 = new Person("小美",17,"female");
        Person p3 = new Person();
        person1.name = "小瓜";
        person1.age = 1;
        person1.gender = "male";
        person1.hello();
        person2.hello();
        p3.hello();

        int result = person1.sum(3, 4);
        System.out.println(result);

        char i = person1.test(1);
        System.out.println(i);

        person2.say(6);

        person1.modify(person1);
        System.out.println(person1.name);

        person1.square(2, 10);
        person1.setName("hi");
        System.out.println(person1.name);

        System.out.println(person1.sum(2.6, 7.8));

        person1.hi();
        person1.together();

        System.out.println(person1.add(100));

        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.gender);

    }
}