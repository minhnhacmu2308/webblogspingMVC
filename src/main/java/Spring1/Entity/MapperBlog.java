package Spring1.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperBlog implements RowMapper<blog>{

	public blog mapRow(ResultSet rs, int rowNum) throws SQLException {
		blog bl = new blog();
		bl.setId(rs.getInt("id"));
		bl.setDetail(rs.getString("detail"));
		bl.setImage(rs.getString("image"));
		bl.setAuthor(rs.getString("author"));
		bl.setCreateTime(rs.getString("create_time"));
		bl.setTitle(rs.getString("title"));
		// TODO Auto-generated method stub
		return bl;
	}

}
