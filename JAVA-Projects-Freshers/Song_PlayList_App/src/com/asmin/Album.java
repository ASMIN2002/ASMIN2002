package com.asmin;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String name,String artist,ArrayList<Song> songs) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	public Album() {
		
	}
	public Song findSong(String title) {
		for(Song checkedSong : songs) {
			if(checkedSong.getTitle().equals(title)) return checkedSong;
		}
		return null;
	}
	public boolean addSong(String title, double duration) {
		if(findSong(title) == null) {
			songs.add(new Song(title,duration));
			System.out.println(title+ "Successfully added to the List");
			return true;
		}else {
			System.out.println("Song with name "+title+"already exixt in the List");
			return false;
		}
	}
}
	
//	public boolean addToPlayList(int trackNumber, LinkedList) {
//		int index = trackNumber-1;
//		if(index > 0 && index <= this.songs.size()) {
//		
//		}
//	}
//	
//}
