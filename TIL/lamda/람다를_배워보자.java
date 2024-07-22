package TIL.lamda;

public class 람다를_배워보자 {
    public static void main(String[] args) {


        CustomFuncInterFace<String, String> lambdaFunc1 = (String param) -> {
            return "람다 예시 1로 구현한 결과" + param;
        };
        CustomFuncInterFace<String, String> lambdaFunc2 = (param) -> {
            return "파라티머의 자료형을 입력하지 않아도 컴파일과정에서 추론한다." + param;
        };
        CustomFuncInterFace<String, String> impl = new CustomFuncInterFace<String, String>() {
            @Override
            public String onlyOne(String param) {
                return "구현체로 구현한 결과" + param;
            }
        };

        String result1 = lambdaFunc1.onlyOne("1번입니다.");
        String result2 = lambdaFunc1.onlyOne("2번입니다.");
        String result3 = impl.onlyOne("3번입니다.");
    }
}
