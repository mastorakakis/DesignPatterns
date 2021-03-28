public class Resources {

    private int food;
    private int wood;
    private int stone;
    private int cloth;
    private int gold;

    public Resources(Builder builder) {
        food = builder.food;
        wood = builder.wood;
        stone = builder.stone;
        cloth = builder.cloth;
        gold = builder.gold;
    }

    public static class Builder {

        private final int food;
        private final int wood;
        private int stone;
        private int cloth;
        private int gold;

        public Builder(int food, int wood) {
            this.food = food;
            this.wood = wood;
        }

        public Builder stone(int val) {
            stone = val;
            return this;
        }

        public Builder cloth(int val) {
            cloth = val;
            return this;
        }

        public Builder gold(int val) {
            gold = val;
            return this;
        }

        public Resources build() {
            return new Resources(this);
        }
    }
    @Override
    public String toString() {
        return "Resources{" +
                "food=" + food +
                ", wood=" + wood +
                ", stone=" + stone +
                ", cloth=" + cloth +
                ", gold=" + gold +
                '}';
    }
}
