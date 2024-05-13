// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.Arrays;

public class Method {
  public static void main(String[] args) {
    char vowels[] = { 'e', 'u', 'a', 'o', 'i' };
    int startingIndex = 1;
    int endingIndex = 4;
    Arrays.sort(vowels, startingIndex, endingIndex);
    System.out.println(Arrays.toString(vowels));

    char key = 'o';

    int foundItemIndex = Arrays.binarySearch(vowels, key);

    System.out.println(foundItemIndex);
  }
}