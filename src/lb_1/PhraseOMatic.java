package lb_1;

public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"бежать", "прыгать", "спать", "кушать", "любить", "играть", "учиться", "узнавать", "терпеть", "радоваться"};

        String[] wordListTwo = {"аккуратно", "неопрятно", "радостно", "поздно", "печально", "грустно", "превосходно", "весело", "горестно", "ужасно"};

        String[] wordListThree = {"бремя", "время", "вымя", "знамя", "имя", "пламя", "племя", "семя", "стремя", "темя"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Все, что нам нужно, - это " + phrase);
    }
}
