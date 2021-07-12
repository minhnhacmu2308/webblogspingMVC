package Spring1.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Spring1.Entity.blog;

@Repository
public class AdminDao {

	
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public boolean addBlog(blog bl) {
		String sql = "INSERT INTO `blogs`(`detail`, `image`, `author`, `title`) "
				+ "VALUES (?,?,?,?)";
		int result = _jdbcTemplate.update(sql,bl.getDetail(),bl.getImage(),bl.getAuthor(),bl.getTitle());
		if(result == 1) {
			return true;
		}
		return false;
	}
}
