import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                random = new Random();
                return random.nextInt(max - min) + min;
            }
        };
    }
}