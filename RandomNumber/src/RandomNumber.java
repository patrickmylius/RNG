import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();
        random.setSeed(1234567890);

        System.out.println(random.nextInt());

        System.out.println(random.nextDouble());
        System.out.println(Math.random());

        System.out.println(random.nextFloat());

        byte[] randomByteArray = new byte [100];

        random.nextBytes(randomByteArray);

        System.out.println(Arrays.toString(randomByteArray));

        System.out.println(random.nextBoolean());

        System.out.println(random.nextInt(100));
    }
}
