public class Main {
    public static void main(String[] args) {
        Comsumer kangkang = new Comsumer();
        JingDong jingDong = new JingDong();
        kangkang.send();
        jingDong.recive();
        kangkang.recive();
    }
}
