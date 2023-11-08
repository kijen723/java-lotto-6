package lotto;

public class GameMessage {
    public GameMessage() {

    }

    public void priceInputRequestMessage() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public void lottoCountMessage(int lottoCount) {
        System.out.printf("%d개를 구매했습니다.\n", lottoCount);
    }

    public void lottoNumbersInputMessage() {
        System.out.println("당첨 번호를 입력해 주세요.");
    }

    public void lottoBonusInputMessage() {
        System.out.println("보너스 번호를 입력해 주세요.");
    }

}
