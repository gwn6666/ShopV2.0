package dao;

import domain.Commodity;
import domain.Shop;

/**
 * @author ����
 * @date 2015��10��11�� ����2:46
 * @description	�û���Ϣ�־ò�ӿڶ��壬�����û����ӣ����棬��ѯ
 * @modify BUPT-TC
 * @modifyDate 
 */
public interface IShopDao {
	public boolean addShop(Shop shop);
	public Shop findShopById(Integer id);
}
