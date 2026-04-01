public class UC6{
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }
        String result;
        if (nameBuilder.length() > 0) {
            result = "Hello, " + nameBuilder.substring(0, nameBuilder.length() - 2) + "!";
        } else {
            result = "Hello, World!";
        }
        System.out.println(result);
    }
}