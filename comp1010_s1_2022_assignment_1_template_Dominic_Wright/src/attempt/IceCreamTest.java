package attempt;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IceCreamTest {
	public static int score = 0;
	public static String result = "";
	public static String currentMethodName = null;
	ArrayList<String> methodsPassed = new ArrayList<String>();

	IceCreamPrices data_1;
	IceCreamPrices data_2;

	@BeforeEach
	public void run() throws IOException {
		currentMethodName = null;
		data_1 = new IceCreamPrices("data_set_1.csv");
		data_2 = new IceCreamPrices("data_set_2.csv");
	}

	@Test @Order(1)
	@Graded(description = "validIndex", marks = 10)
	public void testValidIndex() {
		int len = 33; //there are 33 records in first dataset
		for (int i = -100; i < 0; i++) {
			assertFalse(data_1.validIndex(i), "failed (true instead of false) on index "+i);
		}
		for (int i = 0; i < len; i++) {
			assertTrue(data_1.validIndex(i), "failed (false instead of true) on index "+i);
		}
		for (int i = len; i < 100; i++) {
			assertFalse(data_1.validIndex(i), "failed (true instead of false) on index "+i);
		}
		
		assertTrue(data_2.validIndex(len)); //second data set has even more items
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(2)
	@Graded(description = "totalCost", marks = 10)
	public void testTotalCost() {
		assertEquals(314.370, data_1.totalCost(), 0.001);
		assertEquals(268.8, data_2.totalCost(), 0.001);
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(3)
	@Graded(description = "averageCostSize", marks = 10)
	public void testAverageCostSize() {
		assertEquals(9.5, data_1.averageCostSize(3), 0.001);
		assertEquals(5.54, data_1.averageCostSize(1), 0.001);
		assertEquals(7.71, data_1.averageCostSize(2), 0.001);
		assertEquals(21.964, data_1.averageCostSize(4), 0.001);
		
		assertEquals(4.611, data_2.averageCostSize(1), 0.001);
		assertEquals(5.955, data_2.averageCostSize(2), 0.001);
		assertEquals(7.859, data_2.averageCostSize(3), 0.001);
		assertEquals(9.51, data_2.averageCostSize(4), 0.001);
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(4)
	@Graded(description = "getIndex", marks = 10)
	public void testGetIndex() {
		assertEquals(0, data_1.getIndex("Cow & the Moon"));
		assertEquals(18, data_1.getIndex("Haagen-Dazs"));
		assertEquals(3, data_1.getIndex("Cone"));
		assertEquals(27, data_1.getIndex("Smoothies"));
		assertEquals(19, data_1.getIndex("Butter Peacan Ice Cream"));
		assertEquals(12, data_1.getIndex("Raspberry Cheesecake(G)"));
		assertEquals(28, data_1.getIndex("Haagen-Dazs Special"));
		assertEquals(-1, data_1.getIndex("Doesn't exist"));
		assertEquals(-1, data_1.getIndex("Mandorla Affogato"));

		assertEquals(3, data_1.getIndex("cone"));
		assertEquals(18, data_1.getIndex("haAgen-Dazs"));
		
		assertEquals(5, data_2.getIndex("testing"));
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(5)
	@Graded(description = "countOccurances", marks = 10)
	public void testCountOccurances() {
		assertEquals(21, data_1.countOccurances("Cow & the Moon"));
		assertEquals(12, data_1.countOccurances("Haagen-Dazs"));
		assertEquals(9, data_1.countOccurances("Cone"));
		assertEquals(4, data_1.countOccurances("Smoothies"));
		assertEquals(1, data_1.countOccurances("Butter Peacan Ice Cream"));
		assertEquals(8, data_1.countOccurances("Raspberry Cheesecake(G)"));
		assertEquals(1, data_1.countOccurances("Haagen-Dazs Special"));
		assertEquals(0, data_1.countOccurances("Doesn't exist"));

		assertEquals(12, data_1.countOccurances("hAagen-dazs"));
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(6)
	@Graded(description = "averageCostCompany", marks = 10)
	public void testAverageCostCompany() {
		assertEquals(7.731, data_1.averageCostCompany("Cow & the Moon"), 0.001);
		assertEquals(12.668, data_1.averageCostCompany("Haagen-Dazs"), 0.001);
		assertEquals(-1, data_1.averageCostCompany("Doesn't exist"), 0.001);
		
		assertEquals(6.625, data_2.averageCostCompany("Ciccone & Sons"), 0.001);
		assertEquals(6.818, data_2.averageCostCompany("Mapo"), 0.001);
		assertEquals(6.35, data_2.averageCostCompany("Gelato Messina"), 0.001);
		assertEquals(12.333, data_2.averageCostCompany("testing"), 0.001);
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(7)
	@Graded(description = "toString", marks = 10)
	public void testToString() {
		assertNull(data_1.toString(-1));
		assertNull(data_1.toString(33));
		assertNotNull(data_1.toString(0));
		assertEquals("Cow & the Moon, Passionfruit Cream, Cup - Kids $6.0", data_1.toString(0));
		assertNotNull(data_1.toString(1));
		assertEquals("Cow & the Moon, Passionfruit Cream, Cup - Small $7.8", data_1.toString(1));
		assertNotNull(data_1.toString(2));
		assertEquals("Cow & the Moon, Passionfruit Cream, Cup - Normal $9.5", data_1.toString(2));
		assertNotNull(data_1.toString(24));
		assertEquals("Haagen-Dazs, Birthday Cake, Ice Cream Cakes - Jumbo $32.24", data_1.toString(24));
		assertNotNull(data_1.toString(31));
		assertEquals("Cow & the Moon, \"edge, case\", Smoothies - Jumbo $7.05", data_1.toString(31));
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(8)
	@Graded(description = "minCost", marks = 10)
	public void testMinCost() {
		assertEquals(-1, data_1.minCost(0, "Cup"));
		assertEquals(-1, data_1.minCost(5, "Cone"));
		
		assertEquals(9.5, data_1.minCost(3, "Cup"), 0.001);
		assertEquals(9.5, data_1.minCost(3, "Cone"), 0.001);
		assertEquals(7.80, data_1.minCost(2, "Cup"), 0.001);
		assertEquals(6.00, data_1.minCost(1, "Cone"), 0.001);
		assertEquals(4.49, data_1.minCost(1, "Ice Cream & Sorbet Cups and Cones"), 0.001);
		assertEquals(7.05, data_1.minCost(2, "Smoothies"), 0.001);
		
		assertEquals(4, data_2.minCost(1, "Gelato"), 0.001);
		assertEquals(5, data_2.minCost(2, "Gelato"), 0.001);
		assertEquals(6.8, data_2.minCost(3, "Gelato"), 0.001);
		assertEquals(8.5, data_2.minCost(4, "Gelato"), 0.001);
		assertEquals(8, data_2.minCost(3, "Sorbetto"), 0.001);
		assertEquals(9.5, data_2.minCost(4, "Sorbetto"), 0.001);
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(9)
	@Graded(description = "D getUniqueCompanies", marks = 10)
	public void testGetUniqueCompanies() {
		assertNotNull(data_1.getUniqueCompanies());
		assertEquals("[Cow & the Moon, Haagen-Dazs]", Arrays.toString(data_1.getUniqueCompanies()));
		
		assertNotNull(data_2.getUniqueCompanies());
		assertEquals("[Ciccone & Sons, Mapo, testing, Gelato Messina]", Arrays.toString(data_2.getUniqueCompanies()));
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(10)
	@Graded(description = "D/HD minDiffPrice", marks = 5)
	public void testMinDiffPrice() {
		assertNotNull(data_1.minDiffPrice());
		assertEquals("Cow & the Moon", data_1.minDiffPrice());
		assertNotNull(data_2.minDiffPrice());
		assertEquals("Mapo", data_2.minDiffPrice());
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(11)
	@Graded(description = "HD uniqueIceCreamsCompany", marks = 5)
	public void testUniqueIceCreamCompanies() {
		assertNotNull(data_1.uniqueIceCreamsCompany());
		assertEquals("[4, 12]", Arrays.toString(data_1.uniqueIceCreamsCompany()));
		//since there are 4 flavours at Cow and Moon and 12 flavours at Haagen-Dazs
		//and Cow and Moon is before Haagen-Dazs in the dataset
		
		assertNotNull(data_2.uniqueIceCreamsCompany());
		assertEquals("[4, 3, 3, 2]", Arrays.toString(data_2.uniqueIceCreamsCompany()));
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test @Order(12)
	@Graded(description = "Unassessed sameSize", marks = 0)
	public void testSameSize() {
		assertEquals(11, data_1.sameSize(1, 1));
		assertEquals(10, data_1.sameSize(1, 2));
		assertEquals(7, data_1.sameSize(1, 3));

		assertEquals(5, data_1.sameSize(1, 4));
		assertEquals(10, data_1.sameSize(2, 4));
		assertEquals(10, data_1.sameSize(3, 4));
		assertEquals(5, data_1.sameSize(4, 4));
		assertEquals(1, data_1.sameSize(5, 4));

		assertEquals(21, data_1.sameSize(2, 3));
		assertEquals(35, data_1.sameSize(3, 3));

		assertEquals(462, data_1.sameSize(5, 1));
		
		assertEquals(126, data_2.sameSize(5, 2));
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@AfterEach
	public void logSuccess() throws NoSuchMethodException, SecurityException {
		if (currentMethodName != null && !methodsPassed.contains(currentMethodName)) {
			methodsPassed.add(currentMethodName);
			Method method = getClass().getMethod(currentMethodName);
			Graded graded = method.getAnnotation(Graded.class);
			score += graded.marks();
			result += graded.description() + " passed. Marks awarded: " + graded.marks() + "\n";
		}
	}

	@AfterAll
	public static void wrapUp() throws IOException {
		if (result.length() != 0) {
			result = result.substring(0, result.length() - 1); // remove the last "\n"
		}
		System.out.println(result);
		System.out.println("Indicative mark: " + score);
	}
}
