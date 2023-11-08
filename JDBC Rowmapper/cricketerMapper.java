package practical7b;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class cricketerMapper implements RowMapper<cricketer> {
	@Override
	public cricketer mapRow(ResultSet rs, int rowNum) throws SQLException {
		cricketer c = new cricketer();
		c.setName(rs.getString("name"));
		c.setRuns(rs.getInt("runs"));
		c.setBestRuns(rs.getInt("bestScore"));
		return c;
	}
}