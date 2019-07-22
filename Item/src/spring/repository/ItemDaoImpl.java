package spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import spring.entity.ItemDto;

public class ItemDaoImpl implements ItemDao{
	//JdbcTemplate ½½·Ô
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void regist(ItemDto itemDto) {
		String sql = "insert into item values(item_seq.nextval, ?, ?, ?)";
		Object[] param = new Object[]{itemDto.getName(), itemDto.getType(), itemDto.getPrice()};
		jdbcTemplate.update(sql, param);
	}
	
	private RowMapper<ItemDto> mapper = new RowMapper<ItemDto>() {
		@Override
		public ItemDto mapRow(ResultSet rs, int index) throws SQLException {
			ItemDto itemDto = ItemDto.builder()
												.no(rs.getInt("no"))
												.name(rs.getString("name"))
												.type(rs.getString("type"))
												.price(rs.getInt("price"))
											.build();
			return itemDto;
		}
	};
	
	@Override
	public List<ItemDto> list() {
		String sql = "select * from item order by no";
		return jdbcTemplate.query(sql, mapper);
	}
	
	@Override
	public ItemDto get(int no) {
		String sql ="select * from item where no=?";
		Object[] param = {no};
		

		List<ItemDto> list = jdbcTemplate.query(sql, mapper);
		return list.get(0);
	}
	
	

	
	
	
}
