package pair;

class Pair<F, S>{
    private F first;
    private S second;

    public Pair(F first, S second){
        this.first=first;
        this.second=second;
    }


    public F getFirst(){
        return first;
    }
    public S getSecond(){
        return second;
    }

    public void setFirst(F first){
        this.first=first;
    }

    public void setSecond(S second){
        this.second=second;
    }

    @Override
    public String toString(){
        return "(" + first+ ","+second +")";
    }

}

public class question {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 42);
        Pair<Double, String> pair2 = new Pair<>(3.14, "Pi");

        System.out.println(pair1.getFirst());   // Output: Hello
        System.out.println(pair1.getSecond());  // Output: 42
        System.out.println(pair2.getFirst());   // Output: 3.14
        System.out.println(pair2.getSecond());  // Output: Pi

        pair1.setFirst("World");
        pair1.setSecond(99);

        System.out.println(pair1.getFirst());   // Output: World
        System.out.println(pair1.getSecond());  // Output: 99

        System.out.println(pair1);  // Output: (World, 99)
        System.out.println(pair2);  // Output: (3.14, Pi)
    }
}
