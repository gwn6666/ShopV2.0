package service;

import java.util.List;
import domain.Commodity;

/**
 * @author ����
 * @date 2017��7��4��14:33:44
 * @description ��Ʒ��ع��ܽӿڶ��壬������
 * @modify BUPT
 *
 */
public interface IShowTypeService {
	public List<Commodity> findCommodityByType(String type,boolean flag);
}

