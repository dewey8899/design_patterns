import java.util.ArrayList;
import java.util.List;

/**
 * @auther dewey
 * @date 2022/7/3 13:40
 */
public class JulyThird {
    public static void main(String[] args) {
        List<People> longs = new ArrayList<>();
        longs.add(new People(59L, "a"));
        longs.add(new People(18L, "a"));
        longs.add(new People(53L, "a"));
        longs.add(new People(75L, "a"));
        longs.add(new People(5L, "a"));
        Long aLong = longs.stream().map(People::getAge).min(Long::compareTo).get();
        System.out.println(aLong);
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue / (24 * 12 * 365));
        System.out.println(maxValue);
    }
    static class People{
        private Long age;
        private String name;

        public People(Long age, String name) {
            this.age = age;
            this.name = name;
        }

        public Long getAge() {
            return age;
        }

        public void setAge(Long age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
