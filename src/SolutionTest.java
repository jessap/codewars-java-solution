import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public static void main(String[] args) {
        
      //Testing the sum(int[] numbers) method; throws an error if assertion's failed
      assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 8, 10}));
      System.out.println("1st assertion's passed.");
      assertEquals(6, Kata.sum(new int[] { 1, 1, 11, 2, 3 }));
      System.out.println("2nd assertion's passed.");
      assertEquals(14, Kata.sum(new int[] { 3, 4, 9, 2, 7 }));
      System.out.println("3rd assertion's passed.");
    }
    
}
