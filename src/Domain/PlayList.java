package Domain;

import java.util.ArrayList;

public class PlayList {

	/**
	 * esta variable contiene el nombre de la playList
	 */
	private String name;
	/**
	 * Esta variable contiene las canciones de la playList
	 */
	private ArrayList<Song> songs = new ArrayList<Song>();

	/**
	 * 
	 * este es el costructor de la playList el cual va a cargar la playList ya
	 * funcional
	 * 
	 * @param name  String es el nombre de la playList
	 * @param songs ArrayList<Song> son las canciones de la playlist
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-08
	 */

	public PlayList(String name, ArrayList<Song> songs) {
		this.name = name;
		this.songs = songs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}

}
