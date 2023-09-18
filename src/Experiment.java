public class Experiment {

    static Experiment Experiment = new Experiment();

    public static void main(String[] args) {
        System.out.println("hello world");

    }

    void replace() {
        Experiment.replaceAll("hello world", "hi world");
    }

    private void replaceAll(String helloWorld, String hiWorld) {
    }
}
