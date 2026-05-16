package lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isBlank_null() { assertTrue(StringUtils.isBlank(null)); }

    @Test
    void isBlank_empty() { assertTrue(StringUtils.isBlank("")); }

    @Test
    void isBlank_whitespace() { assertTrue(StringUtils.isBlank("   ")); }

    @Test
    void isBlank_nonEmpty() { assertFalse(StringUtils.isBlank("hello")); }

    @Test
    void capitalize_simple() { assertEquals("Hello", StringUtils.capitalize("hello")); }

    @Test
    void capitalize_null() { assertNull(StringUtils.capitalize(null)); }

    @Test
    void reverse_empty() { assertEquals("", StringUtils.reverse("")); }

    @Test
    void reverse_ascii() { assertEquals("olleh", StringUtils.reverse("hello")); }

    @Test
    void reverse_null() { assertNull(StringUtils.reverse(null)); }
}