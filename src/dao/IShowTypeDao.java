package dao;

import java.util.List;

import domain.Commodity;

/**
 * @author ����
 * @date 2017��7��3�� 14:36
 * @description	��Ʒ��Ϣ�־ò�ӿڶ��壬������Ʒ��ѯ
 * @modify BUPT
 * @modifyDate 
 */

public interface IShowTypeDao {
	public List<Commodity> findCommodityByType(String type,boolean flag);

}