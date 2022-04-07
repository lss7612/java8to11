package me.whiteship.java8to11;

@FunctionalInterface
//위 어노테이션이 있으면, 추상메서드가 여러개가 되면 런타임 에러를 날린다.
public interface RunSomething {

    //추상메서드가 하나인 인터페이스를 함수형 인터페이스라고 한다.
    void doIt();

    //인터페이스에 스태틱 메서드를 정의할 수 있다. (자바 8? 11?이후)
    static void printName() {
        System.out.println("sangsung");
    }

    //디폴트 메서드를 정의할 수 있다. (니중에 배움)
    default void printAge() {
        System.out.println("33");
    }

    //추상메서드가 하나이므로, 이것은 함수형 인터페이스다.

}
