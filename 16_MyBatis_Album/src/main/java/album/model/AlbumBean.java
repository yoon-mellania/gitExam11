package album.model;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class AlbumBean {
	private int num;
	
	@NotEmpty(message = "제목 누락")
	private String title;
	
	@NotEmpty(message = "가수명 누락")
	//@Size(min = 3, max = 7, message = "size 3자리에서 7자리 입력")
	@Length(min = 3, max = 7, message = "@Length3~7글자로 입력하세요")
	private String singer;
	
	@Min(value=1000, message="최소 1000원 이상입니다.")
	private String price; // 왜 String으로 했을까??
	
	private String day;
	
	public AlbumBean() { // 언제 호출되나?
		System.out.println("AlbumBean()");
	}
	
	public AlbumBean(int num, String title, String singer, String price, String day) {
		super();
		this.num = num;
		this.title = title;
		this.singer = singer;
		this.price = price;
		this.day = day;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		System.out.println("getTitle()");
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
}
