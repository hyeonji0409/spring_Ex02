package com.boot.projectEx.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.boot.projectEx.dao.ICartDAO;
import com.boot.projectEx.model.CartVO;
import com.boot.projectEx.model.MemberVO;

@Service
public class CartService implements ICartService {
	@Autowired
	@Qualifier("ICartDAO")
	ICartDAO dao;	
	
	@Override
	public void insertCart(CartVO vo) {
		dao.insertCart(vo);
		
	}

	@Override
	public int checkPrdInCart(String prdNo, String memId) {
		// 전달받은 prdNo와 memId를 map에 넣어 Mapper에게 전달
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("prdNo", prdNo);
		map.put("memId", memId);
		
		return dao.checkPrdInCart(map);
	}

	@Override
	public void updateQtyInCart(CartVO vo) {
		dao.updateQtyInCart(vo);		
	}

	@Override
	public ArrayList<CartVO> cartList(String memId) {
		return dao.cartList(memId);
	}

	@Override
	public void updateCart(CartVO vo) {
		dao.updateCart(vo);
	}

	@Override
	public void deleteCart(String cartNo) {
		dao.deleteCart(cartNo);
	}

	@Override
	public MemberVO getMemberInfo(String memId) {
		return dao.getMemberInfo(memId);
	}

}
