//Aditya Subramanian and Sabastian Mugazambi
import java.io.*;
import java.util.Scanner;
public class Spellcheck{
public static void main(String[] args) {

BagInterface bag = new ArrayBag(109582);

// adding all the words
try{
FileInputStream fstream = new FileInputStream("words.txt");
DataInputStream in = new DataInputStream(fstream);
BufferedReader br = new BufferedReader(new InputStreamReader(in));
String strLine;
while ((strLine = br.readLine()) != null) {
bag.add(strLine);
}
in.close();
}catch (Exception e){//Catch exception if any
System.err.println("Error: " + e.getMessage());
}

System.out.println( "Type in 'QUIT' to quit" );
while(true){
    System.out.print( "Enter a word to spellcheck: " );
    Scanner in = new Scanner(System.in);
    String input = in.next();
    if (input.equals("QUIT")){
        System.out.println( "Goodbye!" );
        break;
    }
    if(bag.contains(input)){
            System.out.println(input + " is spelled correctly");
    } else {
        System.out.println(input + " isn't spelled correctly");
    }
    


}


}
}