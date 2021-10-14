public class JavaDrills {

    public static String flipOuterCase(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++)
            if ((i == 0) || (i == input.length() - 1)) {
                if (Character.isUpperCase(input.charAt(i))) {
                    output += Character.toLowerCase(input.charAt(i));
                } else {
                    output += Character.toUpperCase(input.charAt(i));
                }
            } else {
                output += input.charAt(i);
            }
        return output;

    }

    public static void main(String[] args) {
        System.out.println(flipOuterCase("you"));
        System.out.println(flipOuterCase("cat")); // CaT
        System.out.println(flipOuterCase("CaT")); // cat
        System.out.println(flipOuterCase("caT")); // Cat
        System.out.println(flipOuterCase("cAt")); // CAT
    }
}
