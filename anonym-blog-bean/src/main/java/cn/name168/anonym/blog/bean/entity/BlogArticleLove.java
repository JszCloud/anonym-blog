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
 * 文章点赞
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Data
@TableName("blog_article_love")
public class BlogArticleLove extends Model<BlogArticleLove> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 文章ID
     */
    @TableField("article_id")
    private Long articleId;
    /**
     * 已登录用户ID
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 用户IP
     */
    @TableField("user_ip")
    private String userIp;
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
        return this.id;
    }
}
