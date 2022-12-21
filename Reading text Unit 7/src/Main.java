import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static int count = 0; //counter for how many times the word appears
    public static void main (String[] args) throws IOException {
        String fileName = "ProgrammingHistory.txt"; //the file we are reading
        String word = "it"; //the word we are searching for
        ArrayList<String> text = createLines(fileName);
        ArrayList<Integer> out = wordSearch(text, word);

        if (out.isEmpty()) {
            System.out.println("Not found in text file");
            return; //prevents latter code from running in the case of empty an arraylist
        }
        System.out.println(word + " " + "found in index position(s) of ArrayList text: " + out);

        System.out.println(word + " " + "appears" + " " + count + " "+ "time(s) in the text file");
    }

    //reads the ProgrammingHistory.txt and copies each line in paragraph into its own element of an arraylist
    public static ArrayList<String> createLines (String fileName) throws IOException {
        ArrayList<String> paragraph = new ArrayList<>(); //initialize arraylist to store paragraph
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        String line;
        //reads file, adding each line in paragraph to arraylist
        while((line = br.readLine()) != null) {
            paragraph.add(line); //add line into arraylist lines
        }
        br.close(); //close file once done reading it
        return paragraph;
    }
    public static ArrayList<Integer> wordSearch (ArrayList<String> text, String word) { //takes String search (a word) and checks each element in arraylist to see if word is present
        ArrayList<Integer> out = new ArrayList<>();
        for (int i = 0; i < text.size(); i++) {
            if (text.get(i).contains(word)) { //search each line in paragraph to see if it contains the word
                out.add(i);
                count++;
            }
        }
        return out; //return all indexes where the search term is
    }

}