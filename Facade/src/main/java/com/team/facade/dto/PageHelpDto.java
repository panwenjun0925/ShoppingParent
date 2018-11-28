package com.team.facade.dto;

import java.io.Serializable;
import java.util.List;

public class PageHelpDto<T,V> implements Serializable {
	private static final long serialVersionUID = -2846155696593126170L;
	private Integer pageIndex;//当前页
	private Integer pageCount;//共多少页
	private Integer totalCount;//共多少条
	private Integer pageSize;//页面显示条数

	private List<T> list;//查询的集合
	private V bean;//查询条件实体
	
	private Integer startNum;
	private Integer endNum;
	public Integer getStartNum() {
		return startNum;
	}
	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}
	public Integer getEndNum() {
		return endNum;
	}
	public void setEndNum(Integer endNum) {
		this.endNum = endNum;
	}
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public V getBean() {
		return bean;
	}
	public void setBean(V bean) {
		this.bean = bean;
	}
	public PageHelpDto(Integer pageIndex, Integer totalCount, Integer pageSize, Integer pageCount, List<T> list, V bean) {
		super();
		this.pageIndex = pageIndex;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.pageCount = pageCount;
		this.list = list;
		this.bean = bean;
		
		
		if (pageCount<10) {
			this.startNum = 1;
			this.endNum = this.pageCount;
		}else {
			this.startNum=this.pageIndex-4;
			this.endNum=this.pageIndex+5;
			if (this.startNum<1) {
				this.startNum=1;
				this.endNum = 10;
			}
			if (this.endNum>=this.pageCount) {
				this.endNum=this.pageCount;
				this.startNum=this.pageCount-9;
			}
		}
		
		
	}
	public PageHelpDto() {
		super();
	}


}
