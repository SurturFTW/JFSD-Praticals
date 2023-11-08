package practical7a;

import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class SportsDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertSportsRecord(String name, String type, int noOfPlayers) {
		String sql = "INSERT INTO sports (name, type, no_of_players) VALUES  (?, ?, ?)";
		jdbcTemplate.update(sql, name, type, noOfPlayers);
	}

	public void deleteSportsRecord(int id) {
		String sql = "DELETE FROM sports WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

	public void updateSportsRecord(int id, String name, String type, int noOfPlayers) 
	{
	String sql = "UPDATE sports SET name = ?, type = ?, no_of_players = ? WHERE id = ?";
	jdbcTemplate.update(sql, name, type, noOfPlayers, id);
	}

	public List<Sport> getAllSportsRecords() {
		String sql = "SELECT * FROM sports";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Sport.class));
	}

	public void displayAllSportsRecords() {
		List<Sport> sports = this.getAllSportsRecords();
		for (Sport sport : sports) {
			System.out.println("Sport " + sport.getId() + " Name: " + sport.getName() + " Type: " + sport.getType()
					+ " Number of players " + sport.getNoOfPlayers());
		}
	}
}