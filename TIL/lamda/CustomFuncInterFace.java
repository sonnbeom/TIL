package TIL.lamda;

@FunctionalInterface
public interface CustomFuncInterFace <P, R>{
    // 하나의 추상메소드가 존재해야 람다식을 구현할 수 있다.
    abstract R onlyOne(P param);
}


/*
* 제네릭이란?
*
* 클래스, 인터페이스, 메소드의 타입을 매개변수로 사용할 수 있도록 사용하는 기능
* 1. 타입 안정성 컴파일 타임에
*
* */