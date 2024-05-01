
public class Park {
    public static class Attractions {
        private String name;
        private String time;
        private int cost;

        public Attractions(String name, String time, int cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }
        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }
        public String getCost() {
            return cost;
        }
    }
}