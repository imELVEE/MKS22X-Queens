public class mydriver{
  public static void main(String[] args){
    QueenBoard test = new QueenBoard(4);
    test.solve();
    System.out.println(test);

    test = new QueenBoard(5);
    test.solve();
    System.out.println(test);

    test = new QueenBoard(6);
    test.solve();
    System.out.println(test);

    test = new QueenBoard(8);
    test.solve();
    System.out.println(test);
  }
}
