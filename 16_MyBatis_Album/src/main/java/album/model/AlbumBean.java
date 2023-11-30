package album.model;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class AlbumBean {
	private int num;
	
	@NotEmpty(message = "���� ����")
	private String title;
	
	@NotEmpty(message = "������ ����")
	//@Size(min = 3, max = 7, message = "size 3�ڸ����� 7�ڸ� �Է�")
	@Length(min = 3, max = 7, message = "@Length3~7���ڷ� �Է��ϼ���")
	private String singer;
	
	@Min(value=1000, message="�ּ� 1000�� �̻��Դϴ�.")
	private String price; // �� String���� ������??
	
	private String day;
	
	public AlbumBean() { // ���� ȣ��ǳ�?
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
