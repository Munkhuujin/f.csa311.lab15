package lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverse_empty() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void reverse_singleChar() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    void reverse_ascii() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    void reverse_null() {
        assertNull(StringUtils.reverse(null));
    }
}