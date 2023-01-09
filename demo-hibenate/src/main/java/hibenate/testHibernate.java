package hibenate;

import java.util.List;

import org.hibernate.Session;
import javax.persistence.Query;

import hibernatedemo.pojo.Catogory;

public class testHibernate {
	public static void main(String[] args) {

		Session session = hibenatejava.getFactory().openSession();
		
		Query q =  session.createQuery("FROM Catogory");
		
		List<Catogory> cate = q.getResultList();
		
		cate.forEach(c -> System.out.printf("%d - %s\n", c.getId(), c.getName()));
		
		// cập nhật or xóa
//		Catogory a = session.get(Catogory.class, 1);
//		a.setName("cập nhật duwjw liệu");
//		session.getTransaction().begin(); // sử dụng để xử lý trong chường hợp hai người cùng cập nhật( hoặc xóa)	
//		session.save(a);// cập nhật
//		session.delete(a);// xóa
		// data cùng một lúc thì nó sẽ không biết cập nhật thằng nào trước.
//		session.getTransaction().commit(); // hoặc khi người này cập nhật còn người kia thì xóa
		
		
		// Thêm dữ liệu
//		Catogory c = new Catogory();
//		c.setName("tinh");
//		c.setText("tinhgnuyen11");
//		session.save(c);
		session.close();
	}

}
