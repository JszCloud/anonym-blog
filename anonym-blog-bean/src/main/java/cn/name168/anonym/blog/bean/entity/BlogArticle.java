package cn.name168.anonym.blog.bean.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 文章内容
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@TableName("blog_article")
public class BlogArticle extends Model<BlogArticle> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "article_id", type = IdType.AUTO)
    private Long articleId;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 文章封面图片
     */
    @TableField("cover_image")
    private String coverImage;
    /**
     * 文章专属二维码地址
     */
    @TableField("qrcode_path")
    private String qrcodePath;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 是否置顶
     */
    private Integer top;
    /**
     * 类型
     */
    @TableField("type_id")
    private Long typeId;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 是否推荐
     */
    private Integer recommended;
    /**
     * 是否原创
     */
    private Integer original;
    /**
     * 文章简介，最多200字
     */
    private String description;
    /**
     * 文章关键字，优化搜索
     */
    private String keywords;
    /**
     * 添加时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;


    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getQrcodePath() {
        return qrcodePath;
    }

    public void setQrcodePath(String qrcodePath) {
        this.qrcodePath = qrcodePath;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRecommended() {
        return recommended;
    }

    public void setRecommended(Integer recommended) {
        this.recommended = recommended;
    }

    public Integer getOriginal() {
        return original;
    }

    public void setOriginal(Integer original) {
        this.original = original;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.articleId;
    }

    @Override
    public String toString() {
        return "BlogArticle{" +
        ", articleId=" + articleId +
        ", title=" + title +
        ", userId=" + userId +
        ", coverImage=" + coverImage +
        ", qrcodePath=" + qrcodePath +
        ", content=" + content +
        ", top=" + top +
        ", typeId=" + typeId +
        ", status=" + status +
        ", recommended=" + recommended +
        ", original=" + original +
        ", description=" + description +
        ", keywords=" + keywords +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
