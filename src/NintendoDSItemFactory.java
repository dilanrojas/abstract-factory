public class NintendoDSItemFactory extends AbstractFactory {
  @Override
  public NintendoDSCoin createCoin() {
    return new NintendoDSCoin();
  }

  @Override
  public NintendoDSQuestionMark createQuestionMark() {
    return new NintendoDSQuestionMark();
  }
}
