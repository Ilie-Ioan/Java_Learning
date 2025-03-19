import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String Artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        Artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String SongName, double duration) {

        if (findSong(SongName) == null) {
            songs.add(new Song(SongName, duration));
            System.out.println("The song " + SongName + " was added succesfully");
            return true;
        } else {
            System.out.println("The song " + SongName + " is already added");
            return false;
        }
    }

    public Song findSong(String Song_Name){
        for(Song i : songs) {

            if(i.getTitle().equals(Song_Name)){
                return i;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {

        int index = trackNumber - 1;
        if((index >= 0) && (index <= songs.size())){
            playlist.add(songs.get(index));
            System.out.println("The song was added succesfuly in playlist at position " + index);
            return false;
        }
        else{
            System.out.println("The song was already in playlist");
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){

        Song checkedSong = findSong(title);
        if(checkedSong == null){
            playlist.add(checkedSong);
            System.out.println("The song " + title + " was added succescfully in playlist");
            return  true;
        }
        else{
            System.out.println("The song was not added in playlist");
            return false;
        }
    }

}
