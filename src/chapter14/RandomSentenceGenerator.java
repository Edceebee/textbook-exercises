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

import java.util.Random;

class RandomSentenceGenerator{
    private static String[] article ={"the","a","one","some","any"};
    private static String[] noun={" boy"," girl"," dog"," town"," car"};
    private static String[] verb={" drove"," jumped"," ran"," walked","    skipped"};
    private static String[] preposition={" to"," from"," over"," under"," on"};


    public static void main(String args[]){
        //order to make a sent: a,n,v,p,a,n

        System.out.println("the sentences picked at random are:");
        System.out.println();
        //loop to generate 20 sentences
        for(int i=0;i<=9;i++){
            System.out.println(makeSentence());
        }
    }

    public static String makeSentence(){
        Random rand = new Random();
        int[] index = new int[6];
        String sent = new String();

        for(int i=0;i<6;i++){
            index[i]= rand.nextInt(5);
        }
        sent = sent.concat(article[index[0]].concat(noun[index[1]].concat(verb[index[2]].concat(preposition[index[3]].concat(article[index[4]].concat(noun[index[5]]))))));
        return sent;
    }
}