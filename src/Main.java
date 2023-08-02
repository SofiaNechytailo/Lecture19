import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String[]> translate = new HashMap<Integer, String[]>();
        translate.put(1, new String[]{"абетка", "alphabet","アルファベット","Alphabet"});
        translate.put(2, new String[]{"бабуїн", "baboon","ヒヒ","Pavian"});
        translate.put(3, new String[]{"вона", "she","彼女","sie"});
        translate.put(4, new String[]{"гарбуз", "pumpkin","かぼちゃ","Kürbis"});
        translate.put(5, new String[]{"дім", "House","家","Haus"});
        translate.put(6, new String[]{"екзотика", "exotic","エキゾチック","exotisch"});
        translate.put(7, new String[]{"єнот", "raccoon","ラクーン","Waschbär"});
        translate.put(8, new String[]{"жилетка", "waistcoat","チョッキ","Weste"});
        translate.put(9, new String[]{"забіяка", "bully","いじめっ子","Weste"});
        translate.put(10, new String[]{"інтрига", "intrigue","陰謀","Intrigen"});

        System.out.println("Hello enter number of word");
        translate.forEach((key, value) ->{
            System.out.println(key+". "+value[0]);
        });
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        translate.forEach((key, value) ->{
            if(key == num){
                System.out.println(value[1]+", "+value[2]+", "+value[3]);
            }
        });
    }
}