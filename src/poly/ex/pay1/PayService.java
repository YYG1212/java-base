package poly.ex.pay1;

public class PayService {

    //클라이언트
    public void processPay(String option, int amount){
        System.out.println("결제를 시작합니다 : option =" + option + " ,amount = " + amount);

        //인스턴스를 변수에 복사
        Pay pay = PayStore.findPay(option);

        //인스턴스의 리턴값을 result에 복사
        boolean result = pay.pay(amount);

        if(result){
            System.out.println("결제 성공");
        } else{
            System.out.println("결제 실패");
        }

    }

}
