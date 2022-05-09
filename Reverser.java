import java.util.ArrayDeque;
import java.util.Scanner;
import java.io.*;

class Reverser
{
  //declare member variables
  private ArrayDeque<String> poem;

  //constructor
  public Reverser()
  {
    poem = new ArrayDeque<String>();
  }
  
  //load file into stack
  public void fileToStack(String filename)
  {
    try
    {
      File file = new File(filename);

    Scanner read = new Scanner(file);

    while(read.hasNextLine())
    {
      poem.addFirst(read.nextLine());
    }
    read.close();
    }
    catch(FileNotFoundException e)
    {
      System.out.println("File " + filename + " not found.");
    }
    
  }

  //unload stack into file
  public void stackToFile(String filename)
  {
    try
    {
      PrintWriter write = new PrintWriter(filename);

      while(!poem.isEmpty())
      {
        write.print(poem.removeFirst());
        if(!poem.isEmpty())
          write.println();
      }
      write.close();
    }
    catch(FileNotFoundException e)
    {
      System.out.println("File " + filename + " not found.");
    }
  }
}