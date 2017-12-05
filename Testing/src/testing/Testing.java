/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author cbaumgardner
 */
class Person {

    String name;
    int age;
    String knifeStatement;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
        
        if (age >= 15) {
            this.knifeStatement = "I can use a knife!";
        } else {
            this.knifeStatement = "I can not use a knife. I would hurt myself.";
        }
    }

    void speak() {
        System.out.println("Hello my name is " + name + " and I am " + age + " years old.");
        System.out.println(knifeStatement);

    }

}






public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Person person1 = new Person("Cameron", 25);
        person1.speak();
        // Debug
     //   System.out.println(person1.getKnifeAbility());

        Person person2 = new Person("Jason", 14);
        person2.speak();
        // Debug
   //     System.out.println(person2.getKnifeAbility());

    }

}
