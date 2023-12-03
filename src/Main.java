import java.util.Map;

class Main {
    public static void main(String[] args) {
        ArrayListTask collection = new ArrayListTask();

        collection.addString("PISM");
        collection.addString("SHESHKO");
        collection.addString("174001");
        collection.addString("BEST");

        collection.removeString("PISM");
        System.out.println("Occurrences of 'Hello': " + collection.countOccurrences("BEST"));

        System.out.println("Original state of the collection: " + collection.getStringCollection());

        collection.reverseStrings();
        System.out.println("Reversed state of the collection: " + collection.getStringCollection());

        Map<Character, Integer> charStats = collection.characterStatistics();
        System.out.println("Character statistics: " + charStats);

        System.out.println("Search for 'SHESHKO': " + collection.searchSubstring("SHESHKO"));

        collection.loadToXml("output.xml");

        collection.initializeFromFile("input.txt");

        collection.compareInnerObjects(0, 1);

        collection.calculateAndPrintLengths();

        System.out.println("Current state of the collection: " + collection.getStringCollection());
    }
}