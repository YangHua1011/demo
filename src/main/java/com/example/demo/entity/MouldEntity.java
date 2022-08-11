package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Table(name="mould")
@Document(indexName = "mould")
public class MouldEntity implements Serializable{

	@Id
    @Column(name = "id")
	@Field(name = "id")
	private Integer id;//素材id

    @Column(name = "cat3_id")
	@Field(name = "cate_id",index = false,type = FieldType.Keyword)
	private Integer cat3Id;//第三级分类id

    @Column(name = "name")
	@Field(type = FieldType.Text,analyzer = "ik_max_word")
	private String name;//素材名称

    @Column(name = "vimg")
	@Field(name = "vimg",index = false,type = FieldType.Keyword)
	private String vimg;//预览竖图

    @Column(name = "himg")
	@Field(name = "himg",index = false,type = FieldType.Keyword)
	private String himg;//预览横图

    @Column(name = "big_img")
	@Field(name = "big_img",index = false,type = FieldType.Keyword)
	private String bigImg;//详情大图

    @Column(name = "author")
	@Field(name = "author",index = false,type = FieldType.Keyword)
	private String author;//作者

    @Column(name = "copyright_desc")
	@Field(name = "copyright_desc",index = false,type = FieldType.Keyword)
	private String copyrightDesc;//版权说明，默认为空

    @Column(name = "commercial_desc")
	@Field(name = "commercial_desc",index = false,type = FieldType.Keyword)
	private String commercialDesc;//商用说明，默认为空

    @Column(name = "software")
	@Field(name = "software",index = false,type = FieldType.Keyword)
	private String software;//打开软件

    @Column(name = "format")
	@Field(name = "format",index = false,type = FieldType.Keyword)
	private String format;//格式

    @Column(name = "size")
	@Field(name = "size",index = false,type = FieldType.Keyword)
	private String size;//大小

    @Column(name = "upload_time")
	@Field(name = "upload_time",index = false,type = FieldType.Keyword)
	private Date uploadTime;//素材上传时间，秒级时间戳

    @Column(name = "tags")
	@Field(name = "tags",type = FieldType.Text,analyzer = "ik_max_word")
	private String tags;//标签，逗号(,)分隔

    @Column(name = "default_sort")
	@Field(name = "default_sort",index = false,type = FieldType.Keyword)
	private String defaultSort;//综合排序权值

    @Column(name = "popular_sort")
	@Field(name = "popular_sort",index = false,type = FieldType.Keyword)
	private String popularSort;//热门排序权值

    @Column(name = "download_url")
	@Field(name = "download_url",index = false,type = FieldType.Keyword)
	private String downloadUrl;//素材下载url

    @Column(name = "update_time")
	@Field(name = "update_time",index = false,type = FieldType.Keyword)
	private Date updateTime;//更新时间

    @Column(name = "cat2_id")
	@Field(name = "cat2_id",index = false,type = FieldType.Keyword)
	private Integer cat2Id;//

    @Column(name = "cat1_id")
	@Field(name = "cat1_id",index = false,type = FieldType.Keyword)
	private Integer cat1Id;//

	public MouldEntity() {
	}

	@Override
	public String toString() {
		return "MouldEntity{" +
				"id=" + id +
				", cat3Id=" + cat3Id +
				", name='" + name + '\'' +
				", vimg='" + vimg + '\'' +
				", himg='" + himg + '\'' +
				", bigImg='" + bigImg + '\'' +
				", author='" + author + '\'' +
				", copyrightDesc='" + copyrightDesc + '\'' +
				", commercialDesc='" + commercialDesc + '\'' +
				", software='" + software + '\'' +
				", format='" + format + '\'' +
				", size='" + size + '\'' +
				", uploadTime=" + uploadTime +
				", tags='" + tags + '\'' +
				", defaultSort='" + defaultSort + '\'' +
				", popularSort='" + popularSort + '\'' +
				", downloadUrl='" + downloadUrl + '\'' +
				", updateTime=" + updateTime +
				", cat2Id=" + cat2Id +
				", cat1Id=" + cat1Id +
				'}';
	}

	public MouldEntity(Integer id, Integer cat3Id, String name, String vimg, String himg, String bigImg, String author, String copyrightDesc, String commercialDesc, String software, String format, String size, Date uploadTime, String tags, String defaultSort, String popularSort, String downloadUrl, Date updateTime, Integer cat2Id, Integer cat1Id) {
		this.id = id;
		this.cat3Id = cat3Id;
		this.name = name;
		this.vimg = vimg;
		this.himg = himg;
		this.bigImg = bigImg;
		this.author = author;
		this.copyrightDesc = copyrightDesc;
		this.commercialDesc = commercialDesc;
		this.software = software;
		this.format = format;
		this.size = size;
		this.uploadTime = uploadTime;
		this.tags = tags;
		this.defaultSort = defaultSort;
		this.popularSort = popularSort;
		this.downloadUrl = downloadUrl;
		this.updateTime = updateTime;
		this.cat2Id = cat2Id;
		this.cat1Id = cat1Id;
	}

	//get方法
	public Integer getId() {
		return id;
	}

	//set方法
	public void setId(Integer id) {
		this.id = id;
	}
	//get方法
	public Integer getCat3Id() {
		return cat3Id;
	}

	//set方法
	public void setCat3Id(Integer cat3Id) {
		this.cat3Id = cat3Id;
	}
	//get方法
	public String getName() {
		return name;
	}

	//set方法
	public void setName(String name) {
		this.name = name;
	}
	//get方法
	public String getVimg() {
		return vimg;
	}

	//set方法
	public void setVimg(String vimg) {
		this.vimg = vimg;
	}
	//get方法
	public String getHimg() {
		return himg;
	}

	//set方法
	public void setHimg(String himg) {
		this.himg = himg;
	}
	//get方法
	public String getBigImg() {
		return bigImg;
	}

	//set方法
	public void setBigImg(String bigImg) {
		this.bigImg = bigImg;
	}
	//get方法
	public String getAuthor() {
		return author;
	}

	//set方法
	public void setAuthor(String author) {
		this.author = author;
	}
	//get方法
	public String getCopyrightDesc() {
		return copyrightDesc;
	}

	//set方法
	public void setCopyrightDesc(String copyrightDesc) {
		this.copyrightDesc = copyrightDesc;
	}
	//get方法
	public String getCommercialDesc() {
		return commercialDesc;
	}

	//set方法
	public void setCommercialDesc(String commercialDesc) {
		this.commercialDesc = commercialDesc;
	}
	//get方法
	public String getSoftware() {
		return software;
	}

	//set方法
	public void setSoftware(String software) {
		this.software = software;
	}
	//get方法
	public String getFormat() {
		return format;
	}

	//set方法
	public void setFormat(String format) {
		this.format = format;
	}
	//get方法
	public String getSize() {
		return size;
	}

	//set方法
	public void setSize(String size) {
		this.size = size;
	}
	//get方法
	public Date getUploadTime() {
		return uploadTime;
	}

	//set方法
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
	//get方法
	public String getTags() {
		return tags;
	}

	//set方法
	public void setTags(String tags) {
		this.tags = tags;
	}
	//get方法
	public String getDefaultSort() {
		return defaultSort;
	}

	//set方法
	public void setDefaultSort(String defaultSort) {
		this.defaultSort = defaultSort;
	}
	//get方法
	public String getPopularSort() {
		return popularSort;
	}

	//set方法
	public void setPopularSort(String popularSort) {
		this.popularSort = popularSort;
	}
	//get方法
	public String getDownloadUrl() {
		return downloadUrl;
	}

	//set方法
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	//get方法
	public Date getUpdateTime() {
		return updateTime;
	}

	//set方法
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	//get方法
	public Integer getCat2Id() {
		return cat2Id;
	}

	//set方法
	public void setCat2Id(Integer cat2Id) {
		this.cat2Id = cat2Id;
	}
	//get方法
	public Integer getCat1Id() {
		return cat1Id;
	}

	//set方法
	public void setCat1Id(Integer cat1Id) {
		this.cat1Id = cat1Id;
	}


}
