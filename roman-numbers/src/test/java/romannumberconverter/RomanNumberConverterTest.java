package romannumberconverter;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverterTest {

  RomanNumberConverter romanNumberConverter;


  @Before
  public void setup() {
    romanNumberConverter= new RomanNumberConverter();
  }

  @Test
  public void check() {
    assertThat(romanNumberConverter.convert("X"))
      //.isNotEmpty()
      .isEqualTo(10);
  }

  @Test
  public void check_null() {
    assertThatThrownBy(() -> romanNumberConverter.convert(""))
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessageContaining("romanNumber cannot be null");
  }
}
