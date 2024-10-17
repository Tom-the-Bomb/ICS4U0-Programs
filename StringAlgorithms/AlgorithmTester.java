package StringAlgorithms;

public class AlgorithmTester {
    public static void main(String[] args) {
        StringAlgorithms.reverse("Hello World");

        StringAlgorithms.replace(
            "abab",
            'a', 'c'
        );

        System.out.println(
            StringAlgorithms.countChars(
                "aaa bbb aaa ccc a",
                'a'
            )
        );
    }
}
