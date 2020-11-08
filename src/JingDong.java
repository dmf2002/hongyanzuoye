public class JingDong  implements Recive{
    @Override
    public void recive() {
        System.out.println("接受到订单");
        try {Thread.sleep(3000); }
        catch (InterruptedException e)
        { e.printStackTrace();
        }
        System.out.println("到货通知");
    }
}
