package p01_JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar<Pickle> jarOfPickles = new Jar<>();

        jarOfPickles.add(new Pickle("Miro", 24));
        jarOfPickles.add(new Pickle("Atanas", 26));

        Pickle pickle = jarOfPickles.remove();
        System.out.println(pickle.getName());
    }
}
