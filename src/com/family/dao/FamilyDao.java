package com.family.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.family.model.Family;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service @Transactional
public class FamilyDao {
	@Resource SessionFactory factory;
	//添加“family”信息
	public void AddFamily(Family family)throws Exception{
		Session s=factory.getCurrentSession();//啥子意思哟？
		s.save(family);
	}
	//删除“family”信息
    public void DeleteFamily (Integer familyId) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object family = s.load(Family.class, familyId);
        s.delete(family);
	}
	//更新“family”信息
	public void UpdateFamily(Family family)throws Exception{
		Session s=factory.getCurrentSession();
		s.update(family);
	}
	 /*查询所有Food信息*/
    public ArrayList<Family> QueryAllFamily() {
        Session s = factory.getCurrentSession();
        String hql = "From Family";
        Query q = s.createQuery(hql);
        List familyList = q.list();
        return (ArrayList<Family>) familyList;
    }

    /*根据主键获取对象*/
    public Family GetFamilyById(Integer familyid) {
        Session s = factory.getCurrentSession();
        Family family = (Family)s.get(Family.class, familyid);
        return family;
    }
    
    /*根据查询条件查询*/
    public ArrayList<Family> QueryFamilyInfo(String familyname) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Family family where 1=1";
    	if(!familyname.equals("")) hql = hql + " and family.familyname like '%" + familyname + "%'";
    	Query q = s.createQuery(hql);
    	List familyList = q.list();
    	return (ArrayList<Family>) familyList;
    }
}
