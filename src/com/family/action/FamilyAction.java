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
	
	/*业务层对象*/
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
	/*添加Family*/
	public String addFamily() throws Exception{
		System.out.println(family.getFamilyname());
		familyDao.AddFamily(family);
		return "message";
		
	}
	/*显示所有Family*/
    public String showFamily() {
        familyList = familyDao.QueryAllFamily();
        return "show_view";
    }
    /*显示某一Family的详细信息*/
    public String showDetail() {
    	family = familyDao.GetFamilyById(family.getFamilyid());
        return "detail_view";
    }
    /*显示family的修改项*/
    public String showEdit() throws Exception {
    	family = familyDao.GetFamilyById(family.getFamilyid());
        return "edit_view";
    }

    /*编辑family*/
    public String editFamily() throws Exception {
    	familyDao.UpdateFamily(family);
        return "edit_message";
    }
    
    /*删除Family*/
    public String deleteFamily() throws Exception {
    	familyDao.DeleteFamily(family.getFamilyid());
        return "delete_message";
    }
    
    /*查询Family*/
    public String queryFamilys() throws Exception {
    	familyList = familyDao.QueryFamilyInfo(keyWords);
        return "show_view";
    }

}
