import java.util.ArrayList;
import java.util.*;

public class Main {

    /**
     * записує в створений ArrayList значення [-1000; 1000] й виводить,
     * міняє місцями елменти та виводить змінений порядок
     */
    public static void changeDirection() {
        List<String> numbers = new ArrayList<>();
        for (int i = -1000; i <= 1000; i++) {
            numbers.add(String.valueOf(i));
        }
        System.out.print("Direct order: ");
        for (String number : numbers) {
            System.out.print(number + ", ");
        }
        int last = numbers.size() - 1;
        for (int i = 0; i < numbers.size(); i++) {
            if (i == last) {
                break;
            }
            Collections.swap(numbers, i, last);
            last--;
        }

        System.out.print("\nReverse order: ");
        for (String number : numbers) {
            System.out.print(number + ", ");
        }
    }

    /**
     * Розбиває текст на слова, які записує спочатку у масив, а потім у HashSet
     * Створює другий HashSet, у який записуються значення, з першого крім тих, що не є однаковими, але з різним регстром
     * @param text
     */
    public static void differentWords(String text) {
        String[] w = text.split("[ .,]");
        Set<String> words = new HashSet<>();
        for (int i = 0; i < w.length; i++) {
            words.add(w[i]);
        }
        words.remove("");
        Set<String> newWords = new HashSet<>();
        int indexOne = 0;
        for (String word : words) {
            int indexTwo = 0;
            boolean isSame = false;
            for (String wordTwo : words) {
                if (word.equalsIgnoreCase(wordTwo) && indexTwo != indexOne) {
                    isSame = true;
                    break;
                }
                indexTwo++;
            }
            if (!isSame) {
                newWords.add(word);
            }
            indexOne++;
        }
        System.out.println("Different words: ");
        for (String word : newWords) {
            System.out.println(word + " ");
        }
    }

    /**
     * Розбиває текст на слова, які записує спочатку у масив, а потім у HashMap,
     * де ключ - слово, а значення - його зустрічаємість
     * виводить слова, що мають ключ 1 - зустрічаються один раз
     * виводить слово та знайдену частоту
     * @param text
     */
    public static void wordsPeriodicity(String text) {
        String[] w = text.split("[ .,]");
        Map<String, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < w.length; i++) {
            int n = 1;
            for (int j = 0; j < w.length; j++) {
                if (Objects.equals(w[i], w[j]) && i != j) {
                    n++;
                }
                wordMap.put(w[i], n);
            }
        }
        wordMap.remove("");

        System.out.println("Different words: ");
        for (Map.Entry<String, Integer> word : wordMap.entrySet()) {
            if (word.getValue() == 1) {
                System.out.println(word.getKey() + " ");
            }
        }

        for (Map.Entry<String, Integer> word : wordMap.entrySet()) {
            double periodicity = ((double) word.getValue()) / wordMap.size();
            System.out.println("Word: " + word.getKey() + ", Periodicity: " + periodicity);
        }
    }

    /**
     * Розбиває текст на речення, які записує спочатку у масив, а потім у ArrayList
     * Виконує сортування та виводить відсортнований ArrayList
     * @param text
     */
    public static void sortText(String text) {
        String[] sentenceArray = text.split("\\.");
        List<String> sentences = new ArrayList<>();
        for (String s : sentenceArray) {
            sentences.add(s);
        }
        Collections.sort(sentences);
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }

    /**
     * "Точка входу" в програму
     * @param args
     */
    public static void main(String[] args) {
        changeDirection();
        String text = "Old there any widow law rooms. Agreed but expect repair she nay sir silent person. Direction can dependent one bed situation attempted. His she are man their spite avoid. Her pretended fulfilled extremely education yet. Satisfied did one admitting incommode tolerably how are. Not him old music think his found enjoy merry. Listening acuteness dependent at or an. Apartments thoroughly unsatiable terminated sex how themselves. She are ten hours wrong walls stand early. Domestic perceive on an ladyship extended received do. Why jennings our whatever his learning gay perceive. Is against no he without subject. Bed connection unreserved preference partiality not unaffected. Years merit trees so think in hoped we as. Smile spoke total few great had never their too. Amongst moments do in arrived at my replied. Fat weddings servants but man believed prospect. Companions understood is as especially pianoforte connection introduced. Nay newspaper can sportsman are admitting gentleman belonging his. Is oppose no he summer lovers twenty in. Not his difficulty boisterous surrounded bed. Seems folly if in given scale. Sex contented dependent conveying advantage can use. Expenses as material breeding insisted building to in. Continual so distrusts pronounce by unwilling listening. Thing do taste on we manor. Him had wound use found hoped. Of distrusts immediate enjoyment curiosity do. Marianne numerous saw thoughts the humoured. His having within saw become ask passed misery giving. Recommend questions get too fulfilled. He fact in we case miss sake. Entrance be throwing he do blessing up. Hearts warmth in genius do garden advice mr it garret. Collected preserved are middleton dependent residence but him how. Handsome weddings yet mrs you has carriage packages. Preferred joy agreement put continual elsewhere delivered now. Mrs exercise felicity had men speaking met. Rich deal mrs part led pure will but. Breakfast agreeable incommode departure it an. By ignorant at on wondered relation. Enough at tastes really so cousin am of. Extensive therefore supported by extremity of contented. Is pursuit compact demesne invited elderly be. View him she roof tell her case has sigh. Moreover is possible he admitted sociable concerns. By in cold no less been sent hard hill. Unpleasant astonished an diminution up partiality. Noisy an their of meant. Death means up civil do an offer wound of. Called square an in afraid direct. Resolution diminution conviction so mr at unpleasing simplicity no. No it as breakfast up conveying earnestly immediate principle. Him son disposed produced humoured overcame she bachelor improved. Studied however out wishing but inhabit fortune windows. It if sometimes furnished unwilling as additions so. Blessing resolved peculiar fat graceful ham. Sussex on at really ladies in as elinor. Sir sex opinions age properly extended. Advice branch vanity or do thirty living. Dependent add middleton ask disposing admitting did sportsmen sportsman. Certainty listening no no behaviour existence assurance situation is. Because add why not esteems amiable him. Interested the unaffected mrs law friendship add principles. Indeed on people do merits to. Court heard which up above hoped grave do. Answer living law things either sir bed length. Looked before we an on merely. These no death he at share alone. Yet outward the him compass hearted are tedious. To sorry world an at do spoil along. Incommode he depending do frankness remainder to. Edward day almost active him friend thirty piqued. People as period twenty my extent as. Set was better abroad ham plenty secure had horses. Admiration has sir decisively excellence say everything inhabiting acceptance. Sooner settle add put you sudden him.";
        differentWords(text);
        wordsPeriodicity(text);
        sortText(text);
    }
}