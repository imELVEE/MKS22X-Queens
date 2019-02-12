public class mydriver{
  public static void main(String[] args){
    QueenBoard test = new QueenBoard(4);
    System.out.println(test + "\n" + test.solve());

    test = new QueenBoard(5);
    System.out.println(test + "\n" + test.solve());

    test = new QueenBoard(6);
    System.out.println(test + "\n" + test.solve());

    test = new QueenBoard(8);
    System.out.println(test + "\n" + test.solve());

    System.out.println();
    test = new QueenBoard(0);
    System.out.println("Board of 0 = " + test.countSolutions() + "\n");
    test = new QueenBoard(1);
    System.out.println("Board of 1 = " + test.countSolutions() + "\n");
    test = new QueenBoard(2);
    System.out.println("Board of 2 = " + test.countSolutions() + "\n");
    test = new QueenBoard(3);
    System.out.println("Board of 3 = " + test.countSolutions() + "\n");
    test = new QueenBoard(4);
    System.out.println("Board of 4 = " + test.countSolutions() + "\n");
    test = new QueenBoard(5);
    System.out.println("Board of 5 = " + test.countSolutions() + "\n");
    test = new QueenBoard(6);
    System.out.println("Board of 6 = " + test.countSolutions() + "\n");
    test = new QueenBoard(7);
    System.out.println("Board of 7 = " + test.countSolutions() + "\n");
    test = new QueenBoard(8);
    System.out.println("Board of 8 = " + test.countSolutions() + "\n");
    test = new QueenBoard(9);
    System.out.println("Board of 9 = " + test.countSolutions() + "\n");
    test = new QueenBoard(10);
    System.out.println("Board of 10 = " + test.countSolutions() + "\n");

    test = new QueenBoard(5);
    test.solve();
    System.out.println(test);
    try{
    test.solve();
    System.out.println(test);
    }
    catch(IllegalStateException e){
      System.out.println("It threw it!");
    }
    try{
    test.countSolutions();
    }
    catch(IllegalStateException e){
      System.out.println("It threw it! Again!");
    }
  }
}
