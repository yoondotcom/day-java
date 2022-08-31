class Main{
  public static void main(String[] args){
    try {
      for (String i: args) {
        System.out.println(i);
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
  }
}

