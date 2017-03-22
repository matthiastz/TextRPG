package test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.character.Hyena;

public class GameProgressTest {

	@Before
	public void setUp() throws Exception {
	}

	
	/**
	 * 
	 * TODO: use mocking or stubbing? 
	 * 
	 * mock a list of enemies or a hero etc.
	 * 
	 *    -> we need dependency injection
	 * 
	 */
	
	@Test
	public void first_mock_test() {
		// mock creation
		List mockedList = mock(List.class);

		// using mock object - it does not throw any "unexpected interaction" exception
		mockedList.add("one");
		mockedList.clear();

		// selective, explicit, highly readable verification
		verify(mockedList).add("one");
		verify(mockedList).clear();
	}
	
	
}
