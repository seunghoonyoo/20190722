package spring.repository;

import java.util.List;

import spring.entity.ItemDto;

public interface ItemDao {
	void regist(ItemDto itemDto);
	List<ItemDto> list();
	ItemDto get(int no);
}
