package hibernatedemo.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorys")
public class Catogory implements Serializable{ // nghiêm cứu thêm
	@Id // chỉ định khóa chính
	@GeneratedValue(strategy = GenerationType.IDENTITY) // nếu id tự tặng thì sử dụng
	
	@Column(name = "id") // nếu trùng tên có thể bỏ @colum này
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String text;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}

