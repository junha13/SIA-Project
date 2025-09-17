package lx.project.team3.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lx.project.team3.service.ItemService;
import lx.project.team3.vo.ItemVO;
import lx.project.team3.vo.LocationVO;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	ItemService service;
	
	// ========== item 작성하고 DB에 insert ==========
	@RequestMapping("insert-access.do")
	public Map<String, Object> insertItem(ItemVO item, LocationVO location) {
		boolean result = service.insertItem(item, location);
		return Map.of("result", result);
	}
	
	// ========== item list 받아오기 ==========
	@RequestMapping("select-itemList.do")
	public Map<String, Object> selectListItem() {
		List<ItemVO> list = service.selectListItem();
		return Map.of("result", list);
	}

	// ========== update를 위해 itemNo으로 item 하나 받아오기 ==========
	@RequestMapping("select-item.do") // or select-item
	public Map<String, Object> selectOneItem(int itemNo) {
		ItemVO item = service.selectOneItem(itemNo);
		return Map.of("result", item);
	}
	
	// ========== update 접근 ==========
	@RequestMapping("update-access.do")
	public Map<String, Object> updateItem(ItemVO item) {
		boolean result = service.updateItem(item);
		return Map.of("result", result);
	}
	
	// ========== delete ==========
	@RequestMapping("delete-access.do")
	public Map<String, Object> deleteItem(int itemNo) {
		boolean result = service.deleteItem(itemNo);
		return Map.of("result", result);
	}
	
}



