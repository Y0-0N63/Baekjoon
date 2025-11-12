import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 단어 입력받을 HashSet (중복 제거 위해 HashSet으로)
        Set<String> words = new HashSet<>();

        // 단어 입력받기
        for (int i = 0; i < n; i++) {
            words.add(sc.next());
        }

        // 정렬을 위해 Set을 ArrayList로 변환하기
        List<String> wordsArr =  new ArrayList<>();
        for (String word : words) {
            wordsArr.add(word);
        }

        // 정렬 적용
        Collections.sort(wordsArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 문자열의 길이가 짧은 순서대로
                o1.length();
                o2.length();

                // 문자열의 길이가 같다면 > 사전순(compareTo()사용)
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }

                // 문자열의 길이가 같지 않다면 > 짧은 것을 앞으로
                return o1.length() - o2.length();
            }
        });

        for(String word : wordsArr) {
            System.out.println(word);
        }
    }
}
