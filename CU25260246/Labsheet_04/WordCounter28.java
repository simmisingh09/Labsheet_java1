// 28. WordCounter
class WordCounter28 {
    static String language = "English";

    void countWords(String sentence) {
        String text = sentence.trim();
        String[] words = text.split("\\s+");
        int wordCount = words.length;

        System.out.println("Language: " + language);
        System.out.println("Sentence: " + sentence);
        System.out.println("Number of Words: " + wordCount);
    }
}
