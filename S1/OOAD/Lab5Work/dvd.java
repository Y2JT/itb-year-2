public class dvd{

	private String title;
	private String director;
	private String duration;

	public void setTitle(String title){
		this.title = title;
	}//end setTitle

	public void setDirector(String director){
		this.director = director;
	}//end setDirector

	public void setDuration(String duration){
		this.duration = duration;
	}//end setDuration

	public String getTitle(){
		return title;
	}//end getTitle

	public String getDirector(){
		return director;
	}//end getDirector

	public String getDuration(){
		return duration;
	}//end getDuration

	public String toString(){
		return "\nTitle: " + title + "\nDirector: " + director + "\nDuration: " + duration + "\n\n";
	}//end toString

}//end class