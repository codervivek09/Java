// - c) Create class Movie having variables (int mid, String title, Director director) 

public class Movie {
    
    private int mid;
    private String title;
    private Director director;


    public void setMid(int mid) {
        this.mid = mid;
    }
    public int getMid () {
        return mid;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle () {
        return title;
    }


    public void setDirector(Director director) {
        this.director = director;
    }

    public Director getDirector() {
        return director;
    }
}
