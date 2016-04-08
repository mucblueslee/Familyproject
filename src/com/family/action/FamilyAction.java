package com.family.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.family.dao.FamilyDao;
import com.family.model.*;
import com.opensymphony.xwork2.ActionSupport;

@Controller @Scope("prototype")
public class FamilyAction extends ActionSupport {
	
	/*ҵ������*/
	@Resource FamilyDao familyDao;
	
	
	private Family family;

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}
	private List<Family> familyList;

	public List<Family> getFamilyList() {
		return familyList;
	}

	public void setFamilyList(List<Family> familyList) {
		this.familyList = familyList;
	}
	
private String keyWords;
	
	public String getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	/*���Family*/
	public String addFamily() throws Exception{
		System.out.println(family.getFamilyname());
		familyDao.AddFamily(family);
		return "message";
		
	}
	/*��ʾ����Family*/
    public String showFamily() {
        familyList = familyDao.QueryAllFamily();
        return "show_view";
    }
    /*��ʾĳһFamily����ϸ��Ϣ*/
    public String showDetail() {
    	family = familyDao.GetFamilyById(family.getFamilyid());
        return "detail_view";
    }
    /*��ʾfamily���޸���*/
    public String showEdit() throws Exception {
    	family = familyDao.GetFamilyById(family.getFamilyid());
        return "edit_view";
    }

    /*�༭family*/
    public String editFamily() throws Exception {
    	familyDao.UpdateFamily(family);
        return "edit_message";
    }
    
    /*ɾ��Family*/
    public String deleteFamily() throws Exception {
    	familyDao.DeleteFamily(family.getFamilyid());
        return "delete_message";
    }
    
    /*��ѯFamily*/
    public String queryFamilys() throws Exception {
    	familyList = familyDao.QueryFamilyInfo(keyWords);
        return "show_view";
    }

}
