public class mydriver{
  public static void main(String[] args){
    QueenBoard test = new QueenBoard(8);
    System.out.println(test);
    test.addQueen(1,3);
    test.addQueen(4,7);
    test.addQueen(4,3);
    System.out.println(test);
    test.removeQueen(1,3);
    System.out.println(test);
  }
}
