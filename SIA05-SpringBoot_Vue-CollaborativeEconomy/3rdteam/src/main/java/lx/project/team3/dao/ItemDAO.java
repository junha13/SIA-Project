package lx.project.team3.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lx.project.team3.vo.ItemVO;
import lx.project.team3.vo.LocationVO;

@Repository
public class ItemDAO {

	@Autowired
	SqlSession session;
	
	public ItemVO selectItemByItemNo(int itemNo) {
		return session.selectOne("selectItemByItemNo", itemNo);
	}
	
	public List<ItemVO> selectItemList() {
		return session.selectList("selectItemList");
	}
	
	// ========== item DB 업로드 ==========
	public int insertItemDB(ItemVO item) {
		return session.insert("insertItemDB", item);
	}
	
	// ========== item DB 업로드 전 location DB 업로드 ==========
	public int insertLocationDB(LocationVO location) {
		return session.insert("insertLocationDB", location);
	}

	public int updateDBByitem(ItemVO item) {
		return session.update("updateItem", item);
	}
	
	public int deleteDBByitemNo(int itemNo) {
		return session.update("updateItem", itemNo);
	}
}
