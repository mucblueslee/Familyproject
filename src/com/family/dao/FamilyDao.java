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
	//��ӡ�family����Ϣ
	public void AddFamily(Family family)throws Exception{
		Session s=factory.getCurrentSession();//ɶ����˼Ӵ��
		s.save(family);
	}
	//ɾ����family����Ϣ
    public void DeleteFamily (Integer familyId) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object family = s.load(Family.class, familyId);
        s.delete(family);
	}
	//���¡�family����Ϣ
	public void UpdateFamily(Family family)throws Exception{
		Session s=factory.getCurrentSession();
		s.update(family);
	}
	 /*��ѯ����Food��Ϣ*/
    public ArrayList<Family> QueryAllFamily() {
        Session s = factory.getCurrentSession();
        String hql = "From Family";
        Query q = s.createQuery(hql);
        List familyList = q.list();
        return (ArrayList<Family>) familyList;
    }

    /*����������ȡ����*/
    public Family GetFamilyById(Integer familyid) {
        Session s = factory.getCurrentSession();
        Family family = (Family)s.get(Family.class, familyid);
        return family;
    }
    
    /*���ݲ�ѯ������ѯ*/
    public ArrayList<Family> QueryFamilyInfo(String familyname) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Family family where 1=1";
    	if(!familyname.equals("")) hql = hql + " and family.familyname like '%" + familyname + "%'";
    	Query q = s.createQuery(hql);
    	List familyList = q.list();
    	return (ArrayList<Family>) familyList;
    }
}
