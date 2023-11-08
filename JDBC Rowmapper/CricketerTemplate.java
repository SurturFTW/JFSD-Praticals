package practical7b;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class CricketerTemplate implements cricketerDAO {
	private DataSource ds;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource ds) {
		this.ds = ds;
		this.jdbcTemplate = new JdbcTemplate(ds);
	}

@Override
public void insert(String name, Integer runs, Integer bestRuns) {
String SQL = "INSERT INTO cricketer(name, runs, bestScore) VALUES(?,?,?)";
jdbcTemplate.update(SQL, name, runs, bestRuns);
System.out.println("Created Record Name = " + name + " runs = " + runs + " Best Score = " + bestRuns);
}

	@Override
	public List<cricketer> listCricketers() {
		String SQL = "SELECT * FROM cricketer";
		List<cricketer> cricketers = jdbcTemplate.query(SQL, new cricketerMapper());
		return cricketers;
	}
}