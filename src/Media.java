public abstract class Media {
    public void beginUsing() {
        System.out.println("I have begun using this form.");
    };

    abstract void consume();
}

class book extends Media{

    @Override
    void consume() {
        System.out.println("I'm reading a page");
    }
}


