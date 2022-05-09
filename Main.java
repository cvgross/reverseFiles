

class Main 
{
  public static void main(String[] args) 
  {
    Reverser reversedpoem = new Reverser();
    reversedpoem.fileToStack("poem.txt");
    reversedpoem.stackToFile("reversedpoem.txt");
  }
}

