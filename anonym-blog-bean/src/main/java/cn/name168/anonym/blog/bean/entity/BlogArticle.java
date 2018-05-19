package cn.name168.anonym.blog.bean.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 文章内容
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Data
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


    @Override
    protected Serializable pkVal() {
        return this.articleId;
    }
}
