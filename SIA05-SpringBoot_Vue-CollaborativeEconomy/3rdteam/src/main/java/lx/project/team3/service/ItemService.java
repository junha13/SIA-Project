package lx.project.team3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lx.project.team3.dao.ItemDAO;
import lx.project.team3.vo.ItemVO;
import lx.project.team3.vo.LocationVO;

@Service
public class ItemService {

	@Autowired
	ItemDAO dao;

	@Transactional  // 메서드 실행 전 하나의 트랜잭션을 시작하고, 메서드가 정상적으로 끝나면 커밋한다. 오류생기면 롤백함
	public boolean insertItem(ItemVO item, LocationVO location) {
		int num = dao.insertLocationDB(location);
		if(num == 0) System.out.println("못가져옴");
		
		// location pk 추가
		item.setLocationNo(location.getLocationNo());
		// category pk 추가
		item.setCategoryNO(123);
		
		num = dao.insertItemDB(item);
		if (num == 0) {
			return false;
		}
		return true;
	}
	
	public List<ItemVO> selectListItem() {
		return dao.selectItemList();
	}
	
	public ItemVO selectOneItem(int pkId) {
		return dao.selectItemByItemNo(pkId);
	}
	
	public boolean updateItem(ItemVO item) {
		int num = dao.updateDBByitem(item);
		if (num == 0) {
			return false;
		}
		return true;
	}
	
	public boolean deleteItem(int pkId) {
		int num = dao.deleteDBByitemNo(pkId);
		if (num == 0) {
			return false;
		}
		return true;
	}
}


