public class mydriver{
  public static void main(String[] args){
    QueenBoard test = new QueenBoard(4);
    System.out.println(test + "\n" + test.solve());
    System.out.println(test.countSolutions() + "\n");

    test = new QueenBoard(5);
    System.out.println(test + "\n" + test.solve());
    System.out.println(test.countSolutions() + "\n");

    test = new QueenBoard(6);
    System.out.println(test + "\n" + test.solve());
    System.out.println(test.countSolutions() + "\n");

    test = new QueenBoard(8);
    System.out.println(test + "\n" + test.solve());
    System.out.println(test.countSolutions() + "\n");

    System.out.println();
    test = new QueenBoard(0);
    System.out.println(test + "\n" + test.solve());
    System.out.println(test.countSolutions() + "\n");
    test = new QueenBoard(1);
    System.out.println(test + "\n" + test.solve());
    System.out.println(test.countSolutions() + "\n");
    test = new QueenBoard(2);
    System.out.println(test + "\n" + test.solve());
    System.out.println(test.countSolutions() + "\n");
    test = new QueenBoard(3);
    System.out.println(test + "\n" + test.solve());
    System.out.println(test.countSolutions() + "\n");
  }
}
