package lb_1;

public class How {
    public static void main(String[] args) {
        String[] pets1 = {"фидо", "Зевс", "Бин"};
        String[] pets2 = {"додо", "Посейдоневс", "Пин"};
        String[] pets3 = {"тито", "Аид", "Вин"};

        int x = pets1.length;
        int y = pets2.length;
        int z = pets3.length;

        int rand1 = (int) (Math.random() * x);
        int rand2 = (int) (Math.random() * y);
        int rand3 = (int) (Math.random() * z);

        String s = pets1[rand1] + " " + pets2[rand2] + " " + pets3[rand3];

        System.out.println(s);
    }
}
