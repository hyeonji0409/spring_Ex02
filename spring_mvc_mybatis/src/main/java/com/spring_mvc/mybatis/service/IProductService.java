package com.spring_mvc.mybatis.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_mvc.mybatis.model.ProductVO;

public interface IProductService {
	// ���� Ŭ�������� �������̵��� �߻� �޼ҵ� ���� (�԰�: �ݵ�� �����ؾ� �� �޼ҵ� ����)
	ArrayList<ProductVO> listAllProduct(); 		// ��ü ��ǰ ��ȸ
	void insertProduct(ProductVO prdVo); 		// ��ǰ ���� ���
	void updateProduct(ProductVO prdVo); 		// ��ǰ ���� ����
	void deleteProduct(String prdNo); 			// ��ǰ �ۼ�
	ProductVO detailViewProduct(String prdNo);  // �� ��ǰ ��ȸ
	String prdNoCheck(String prdNo); // ��ǰ �ߺ� üũ
	ArrayList<ProductVO> productSearch(HashMap<String, Object> map); // ��ǰ �˻�
}
