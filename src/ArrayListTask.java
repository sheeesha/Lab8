import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class ArrayListTask {
    private ArrayList<String> stringCollection;

    public ArrayList<String> getStringCollection() {
        return stringCollection;
    }

    public ArrayListTask() {
        stringCollection = new ArrayList<>();
    }

    public void addString(String str) {
        stringCollection.add(str);
    }

    public void removeString(String str) {
        stringCollection.remove(str);
    }

    public int countOccurrences(String str) {
        return Collections.frequency(stringCollection, str);
    }

    public void reverseStrings() {
        Collections.reverse(stringCollection);
    }

    public Map<Character, Integer> characterStatistics() {
        Map<Character, Integer> statistics = new HashMap<>();
        for (String str : stringCollection) {
            for (char c : str.toCharArray()) {
                statistics.put(c, statistics.getOrDefault(c, 0) + 1);
            }
        }
        return statistics;
    }

    public boolean searchSubstring(String substring) {
        for (String str : stringCollection) {
            if (str.contains(substring)) {
                return true;
            }
        }
        return false;
    }

    public void loadToXml(String fileName) {
        // Implementation to write to an XML file
        // This depends on the XML library you choose
        // You may use libraries like JAXB, DOM, or others
        // Here's a simple example using FileWriter
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String str : stringCollection) {
                writer.write("<String>" + str + "</String>\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initializeFromFile(String fileName) {
        // Implementation to read from a text file
        // This depends on the format of your text file
        // Here's a simple example assuming one string per line
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringCollection.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void compareInnerObjects(int firstIndex, int secondIndex) {
        String firstStr = stringCollection.get(firstIndex);
        String secondStr = stringCollection.get(secondIndex);
        // Implement your comparison logic here
    }

    public void calculateAndPrintLengths() {
        ArrayList<Integer> lengths = new ArrayList<>();
        for (String str : stringCollection) {
            lengths.add(str.length());
        }
        Collections.sort(lengths);
        System.out.println("Lengths of strings in the collection (ordered): " + lengths);
    }
}
