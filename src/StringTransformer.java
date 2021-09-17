public abstract class StringTransformer {
    protected String str;
    StringTransformer(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    abstract String transform();
}

class ReverseStringTransformer extends StringTransformer {

    ReverseStringTransformer(String str) {
        super(str);
    }

    String transform() {
        char[] try1 = str.toCharArray();
        String reversedString = "";

        for (int i = try1.length - 1; i >= 0; i--)
            reversedString += try1[i];
        return reversedString;
    }
}

class StringTransformerTest {
    public static void main(String[] args) {
        new ReverseStringTransformer("hello");
    }
}
