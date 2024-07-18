package works.mrr.gli;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Number16Test {
    @Test
    @DisplayName("Mendapatkan Angka Unik Pertama")
    void getFirstUnique() {
        List<Integer> data = Arrays.asList(5, 1, 5, 2, 1, 3, 4);
        Integer unique = Number16.getFirstUnique(data);
        assertEquals(new Integer(2), unique);
    }
}
