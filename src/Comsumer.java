public class Comsumer  implements Send,Recive {

    @Override
    public void send() {
        System.out.println("发送订单");
    }
    @Override
    public void recive() {
        System.out.println("收到到货通知");
        System.out.println("拿到货品");
    }
}
