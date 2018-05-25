package com.lfire.host.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	/**
	 * 
	 * @function ����
	 * @author lyl
	 * @time 2016-2-14 ����3:30:17
	 */
	public boolean insert(T t);
	/**
	 * 
	 * @function ɾ��
	 * @author lyl
	 * @time 2016-2-14 ����3:30:26
	 */
	public boolean delete(T t);
	/**
	 * 
	 * @function ����
	 * @author lyl
	 * @time 2016-2-14 ����3:30:32
	 */
	/**
	 * 
	 * @function ����ɾ��
	 * @author lyl
	 * @time 2016-2-14 ����3:30:26
	 */
	public boolean deleteAll(String ids);
	public boolean update(T t);
	/**
	 * 
	 * @function ����
	 * @author lyl
	 * @time 2016-2-14 ����3:30:39
	 */
	public T findById(Serializable id);
	/**
	 * 
	 * @function ȫ�б�
	 * @author lyl
	 * @time 2016-2-14 ����3:30:46
	 */
	public List<T> findAll();
	/**
	 * 
	 * @function ��ҳ�б�
	 * @author lyl
	 * @time 2016-2-14 ����3:28:06
	 */
	public List<T> getListByPage(Integer pageNo,Integer pageSize);
	/**
	 * 
	 * @function ��ҳ�б���������
	 * @author lyl
	 * @time 2016-2-14 ����3:28:22
	 */
	public Integer getListCount();
	
	/**
	 * 
	 * @function ��ҳ��ģ��
	 * @author lyl
	 * @time 2016-2-14 ����3:28:38
	 */
	public List<T> getQueryListByPage(Integer pageNo,Integer pageSize,String ... queryEle);
	
	/**
	 * 
	 * @function ģ����ѯ�б�����
	 * @author lyl
	 * @time 2016-2-14 ����3:28:52
	 */
	public Integer getQueryListCount(String ... queryEle);
}
