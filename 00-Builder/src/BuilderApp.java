public class BuilderApp {

    public static void main(String[] args) {

        Resources resources = new Resources.Builder(2, 1)
                                           .stone(0)
                                           .cloth(0)
                                           .gold(0)
                                           .build();
        System.out.println(resources);
    }
}
