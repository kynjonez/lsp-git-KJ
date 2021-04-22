package org.howard.edu.lsp.exam.question42;

import java.util.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class SongsDatabase {
	
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
				
	/* Add a song title to a genre */
	public void addSong(String sGenre, String sTitle) {
		if(!map.containsKey(sGenre)) {
			// this is the hashset for this particular genre
			map.put(sGenre, new HashSet<String>());
		}
	//Code it!!
		map.get(sGenre).add(sTitle);
	}
			   
	/* Return the Set that contains all songs for a genre */
	public void getSongs(String sGenre) {
	// Code it!!
		
	}
				
	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String sTitle) {
	// Code it!!
		for(Map.Entry<String,Set<String>> x : map.entrySet()) 
		{
			if(x.getValue().contains(sTitle)) 
			{
				return x.getKey();
			}
		}
		return null;
		
	}
}


