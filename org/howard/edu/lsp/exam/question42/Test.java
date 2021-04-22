package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Set;

import org.howard.edu.lsp.assignment6.junit.IntegerSet;
import org.junit.jupiter.api.DisplayName;

public class Test {
		// TODO Auto-generated method stub
		private final SongsDatabase db = new SongsDatabase();
					
		@Test
		@DisplayName("Test")
		public void songTest() {
			SongsDatabase db = new SongsDatabase();
			db.getSong(“Rap”, “Savage”);
			db.getSongs(“Rap”, “Gin and Juice”);
			db.getSongs(“Jazz”, “Always There”)
			
			Set<String> songs = db.getSongs(“Rap”);
			System.out.println( db.getGenreOfSong(“Savage”) );// prints “Rap”
			System.out.println( db.getGenreOfSong(“Always There”) );// prints 
			“Jazz”

			assertEquals(db.isEmpty());	
		}
		
	

	}

}
