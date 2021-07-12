package Spring1.Entity;

public class blog {
	private int id;
	private String detail;
	private String image;
	private String author;
	private String createTime;
	private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public blog(int id, String detail, String image, String author, String createTime) {
		super();
		this.id = id;
		this.detail = detail;
		this.image = image;
		this.author = author;
		this.createTime = createTime;
	}
	public blog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public blog(int id, String detail, String image, String author, String createTime, String title) {
		super();
		this.id = id;
		this.detail = detail;
		this.image = image;
		this.author = author;
		this.createTime = createTime;
		this.title = title;
	}
	@Override
	public String toString() {
		return "blog [id=" + id + ", detail=" + detail + ", image=" + image + ", author=" + author + ", createTime="
				+ createTime + ", title=" + title + "]";
	}
	
	
	
}
