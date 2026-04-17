public class GameBoyItemFactory extends AbstractFactory {
  @Override
  public GameBoyCoin createCoin() {
    return new GameBoyCoin();
  }

  @Override
  public GameBoyQuestionMark createQuestionMark() {
    return new GameBoyQuestionMark();
  }
}
