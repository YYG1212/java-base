package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //poly.childMethod();//컴파일 오류
        
        //다운 캐스팅 부모 -> 자식
        Child child = (Child) poly;
        child.childMethod();

        //일시적 다운캐스팅
        ((Child) poly).childMethod();
    }
}
