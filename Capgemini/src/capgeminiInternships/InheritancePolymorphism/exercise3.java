package capgeminiInternships.InheritancePolymorphism;
abstract class Item
{
	private String title;
	private long uniqueId;
	private int noOfCopies;
	public Item()
	{
		
	}
	public Item(String title, long uniqueId, int noOfCopies) {
		this.title = title;
		this.uniqueId = uniqueId;
		this.noOfCopies = noOfCopies;
	}
	abstract public String toString();
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(long uniqueId) {
		this.uniqueId = uniqueId;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public void addItem()
	{
		this.noOfCopies++;
	}
	public void checkIn()
	{
		System.out.println("Checked In");
	}
	public void checkOut()
	{
		System.out.println("Checked Out");
	}
	public boolean equals(Item o)
	{
		if(this.getUniqueId() == o.getUniqueId())
			return true;
		else
			return false;
	}
}
abstract class WrittenItem extends Item
{
	private String author;
	public WrittenItem() {
		super();
	}
	public WrittenItem(String title, long uniqueId, int noOfCopies,String author) {
		super(title, uniqueId, noOfCopies);
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
class Book extends WrittenItem
{
	public Book() {
		super();
	}

	public Book(String title, long uniqueId, int noOfCopies, String author) {
		super(title, uniqueId, noOfCopies, author);
	}
	public String toString() {
		return "Book [title=" + super.getTitle() + ", uniqueId=" + super.getUniqueId() + ", noOfCopies=" + super.getNoOfCopies() + ",Author="+super.getAuthor()+"]";		
	}	
}
class JournalPaper extends WrittenItem
{
	private int yearOfPublish;

	public JournalPaper() {
		super();
	}

	public JournalPaper(String title, long uniqueId, int noOfCopies, String author,int yearOfPublish) {
		super(title, uniqueId, noOfCopies, author);
		this.yearOfPublish = yearOfPublish;
	}

	public int getYearOfPublish() {
		return yearOfPublish;
	}

	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}
	public String toString() {
		return "JournalPaper [yearOfPublish=" + this.yearOfPublish + ", getAuthor()=" + super.getAuthor() + ", getTitle()=" + super.getTitle() + ", getUniqueId()=" + super.getUniqueId() + ", getNoOfCopies()=" + super.getNoOfCopies() + "]";
	}
}
abstract class MediaItem extends Item
{
	private double runTime;

	public MediaItem() {
		super();
	}
	public MediaItem(String title, long uniqueId, int noOfCopies,double runTime) {
		super(title, uniqueId, noOfCopies);
		this.runTime = runTime;
	}
	public double getRunTime() {
		return runTime;
	}
	public void setRunTime(double runTime) {
		this.runTime = runTime;
	}
}
class Video extends MediaItem
{
	private String director;
	private String genre;
	private int yearOfRelease;
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Video(String title, long uniqueId, int noOfCopies, double runTime,String director,String genre,int yearOfRelease) {
		super(title, uniqueId, noOfCopies, runTime);
		this.director = director;
		this.genre = genre;
		this.yearOfRelease = yearOfRelease;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", yearOfRelease=" + yearOfRelease
				+ ", getRunTime()=" + getRunTime() + ", getTitle()=" + getTitle() + ", getUniqueId()=" + getUniqueId() + ", getNoOfCopies()=" + getNoOfCopies() + "]";
	}
}
class CD extends MediaItem
{
	private String artist;
	private String genre;
	public CD() {
		super();
	}
	public CD(String title, long uniqueId, int noOfCopies, double runTime,String artist,String genre) {
		super(title, uniqueId, noOfCopies, runTime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + ", getRunTime()=" + getRunTime() + ", getTitle()=" + getTitle() + ", getUniqueId()=" + getUniqueId()
				+ ", getNoOfCopies()=" + getNoOfCopies() + "]";
	}
}
public class exercise3 {
	public static void main(String a[])throws Exception
	{
		
	}
}
