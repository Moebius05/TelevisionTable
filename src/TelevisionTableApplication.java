public class TelevisionTableApplication {
    public static void main(String[] args) {
        TelevisionTableBuilder  televisionTableBuilder  = new TelevisionTableBuilder();
        TelevisionTable         televisionTable         = televisionTableBuilder.build();
        System.out.println(televisionTable);

    }
}
