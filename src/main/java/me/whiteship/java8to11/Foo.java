package me.whiteship.java8to11;

public class Foo {

    public static void main(String[] args) {
        //익명 내부 클래스
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };
        runSomething.doIt();

        //람다 형태는 아래와 같다.
        //아래의 함수 ()-> 어쩌구 부분은 자바의 오브젝트이므로,
        //함수를 아규먼트로 전달 가능하고, 함수를 리턴하는 것도 가능하다. (고차원함수로 쓸 수 있다.)
        RunSomething runSomethingTwo = () -> System.out.println("Hello");
        runSomethingTwo.doIt();

        //순수함수형 프로그래밍을 해야한다.
        //함수는 같은 값을 받았을 때 항상 같은 값을 리턴해야 한다.
        //함수 내부에서 다른 변수를 참조하거나, 변경하게 되면 같은 값을 리턴하지 않을 수 있는 여지가 생기므로 함수형 프로그래밍이 아니다.
    }

}
