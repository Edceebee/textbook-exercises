package chapter14;

/*
(Random Sentences) Write an application that uses random-number generation to create
sentences. Use four arrays of strings called article, noun, verb and preposition. Create a sentence
by selecting a word at random from each array in the following order: article, noun, verb, preposition,
article and noun. As each word is picked, concatenate it to the previous words in the sentence.
The words should be separated by spaces. When the final sentence is output, it should start with a
capital letter and end with a period. The application should generate and display 20 sentences.
The article array should contain the articles "the", "a", "one", "some" and "any"; the noun
array should contain the nouns "boy", "girl", "dog", "town" and "car"; the verb array should contain
the verbs "drove", "jumped", "ran", "walked" and "skipped"; the preposition array should
contain the prepositions "to", "from", "over", "under" and "on".
 */

public class RandomSentenceGenerator {
    public static void main(String[] args) {
        String []article = {"the", "a", "one", "some", "any"};
        String []noun = {"boy", "girl", "dog", "town", "car"};
        String []verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String []preposition = {"to", "from", "over", "under", "on"};

        generateSentence(article, noun, verb, preposition );
    }

    private static void generateSentence(String[] article, String[] noun, String[] verb, String[] preposition) {

    }

}
