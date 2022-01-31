import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  int testDay = 1;
  int testMonth = 2;
  int testYear = 2000;
  Date date = new Date(testMonth, testDay, testYear);

  @Test
  public void testgetDay() {
    Assert.assertTrue(date.getDay() == testDay);
  }

  @Test
  public void testgetMonth() {
    Assert.assertTrue(date.getMonth() == testMonth);
  }

  @Test
  public void testgetYear() {
    Assert.assertTrue(date.getYear() == testYear);
  }

  @Test
  public void testmonthString() {
    Assert.assertTrue(date.monthString(2).equalsIgnoreCase("February"));
  }

  @Test
  public void testMonthOK() {
    String testMonth2 = "July";
    Assert.assertTrue(date.monthOK(testMonth2) == true);
  }
}
