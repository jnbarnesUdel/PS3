package pkgRunner;

import static org.junit.Assert.*;

import java.awt.print.Book;
import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBook {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Date d = 2000-10-01;
		Book myBook = new Book("bk101","Gambardella, Matthew", "XML Developer's Guide", "Computer", 44.95, d, "An in-depth look at creating applicationswith XML.");
		
		assertEquals(myBook.addBook() == cat.getBooks());
		
	}

}
