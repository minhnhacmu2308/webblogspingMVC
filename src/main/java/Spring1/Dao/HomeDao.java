package Spring1.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Spring1.Entity.MapperBlog;
import Spring1.Entity.blog;

@Repository
public class HomeDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	public List<blog> getListBlogs(){
		List<blog> list = new ArrayList<blog>(); 
		String sql = "SELECT * FROM `blogs`";
		list = _jdbcTemplate.query(sql, new MapperBlog());
		return list;
	}
	
}
