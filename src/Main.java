public class Main {
  public static void main(String[] args) {
    AbstractFactory gameBoyFactory = new GameBoyItemFactory();
    AbstractFactory nintendoDSFactory = new NintendoDSItemFactory();

    Coin gameBoyCoin = gameBoyFactory.createCoin();
    QuestionMark gameBoyQuestionMark = gameBoyFactory.createQuestionMark();

    Coin nintendoDSCoin = nintendoDSFactory.createCoin();
    QuestionMark nintendoDSQuestionMark = nintendoDSFactory.createQuestionMark();

    System.out.println("\nGameBoy Factory's Production:");
    System.out.println(gameBoyCoin.getInfo());
    System.out.println(gameBoyQuestionMark.getInfo());

    System.out.println("\nNintendoDS Factory's Production:");
    System.out.println(nintendoDSCoin.getInfo());
    System.out.println(nintendoDSQuestionMark.getInfo());
  }
}
