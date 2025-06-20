package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 助农脱贫
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-08 17:32:26
 */
@TableName("zhunongtuopin")
public class ZhunongtuopinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhunongtuopinEntity() {
		
	}
	
	public ZhunongtuopinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 文章编号
	 */
					
	private String wenzhangbianhao;
	
	/**
	 * 文章标题
	 */
					
	private String wenzhangbiaoti;
	
	/**
	 * 文章分类
	 */
					
	private String wenzhangfenlei;
	
	/**
	 * 文章照片
	 */
					
	private String wenzhangzhaopian;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 文章简介
	 */
					
	private String wenzhangjianjie;
	
	/**
	 * 文章详情
	 */
					
	private String wenzhangxiangqing;
	
	/**
	 * 评论数
	 */
					
	private Integer discussnum;
	
	/**
	 * 收藏数
	 */
					
	private Integer storeupnum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：文章编号
	 */
	public void setWenzhangbianhao(String wenzhangbianhao) {
		this.wenzhangbianhao = wenzhangbianhao;
	}
	/**
	 * 获取：文章编号
	 */
	public String getWenzhangbianhao() {
		return wenzhangbianhao;
	}
	/**
	 * 设置：文章标题
	 */
	public void setWenzhangbiaoti(String wenzhangbiaoti) {
		this.wenzhangbiaoti = wenzhangbiaoti;
	}
	/**
	 * 获取：文章标题
	 */
	public String getWenzhangbiaoti() {
		return wenzhangbiaoti;
	}
	/**
	 * 设置：文章分类
	 */
	public void setWenzhangfenlei(String wenzhangfenlei) {
		this.wenzhangfenlei = wenzhangfenlei;
	}
	/**
	 * 获取：文章分类
	 */
	public String getWenzhangfenlei() {
		return wenzhangfenlei;
	}
	/**
	 * 设置：文章照片
	 */
	public void setWenzhangzhaopian(String wenzhangzhaopian) {
		this.wenzhangzhaopian = wenzhangzhaopian;
	}
	/**
	 * 获取：文章照片
	 */
	public String getWenzhangzhaopian() {
		return wenzhangzhaopian;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：文章简介
	 */
	public void setWenzhangjianjie(String wenzhangjianjie) {
		this.wenzhangjianjie = wenzhangjianjie;
	}
	/**
	 * 获取：文章简介
	 */
	public String getWenzhangjianjie() {
		return wenzhangjianjie;
	}
	/**
	 * 设置：文章详情
	 */
	public void setWenzhangxiangqing(String wenzhangxiangqing) {
		this.wenzhangxiangqing = wenzhangxiangqing;
	}
	/**
	 * 获取：文章详情
	 */
	public String getWenzhangxiangqing() {
		return wenzhangxiangqing;
	}
	/**
	 * 设置：评论数
	 */
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
	/**
	 * 设置：收藏数
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
