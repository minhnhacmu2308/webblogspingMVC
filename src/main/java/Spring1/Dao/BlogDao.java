package Spring1.Dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import Spring1.Entity.MapperBlog;
import Spring1.Entity.blog;

@Repository
public class BlogDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	public List<blog> getListBlogs(){
		List<blog> list = new ArrayList<blog>(); 
		String sql = "SELECT * FROM `blogs`";
		list = _jdbcTemplate.query(sql, new MapperBlog());
		return list;
	}
	
	public blog getDetailBlog(int id) {
		
		String sql= "select * from blogs where id=?";
		return _jdbcTemplate.queryForObject(sql, new Object[]{id},new RowMapper<blog>() {

			public blog mapRow(ResultSet rs, int rowNum) throws SQLException {
				blog bl = new blog();
				bl.setId(rs.getInt("id"));
				bl.setDetail(rs.getString("detail"));
				bl.setImage(rs.getString("image"));
				bl.setAuthor(rs.getString("author"));
				bl.setCreateTime(rs.getString("create_time"));
				bl.setTitle(rs.getString("title"));
				return bl;
			}
			
		});
		
	}
}
