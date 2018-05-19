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
 * 文章评论
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Data
@TableName("blog_comment")
public class BlogComment extends Model<BlogComment> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "comment_id", type = IdType.AUTO)
    private Long commentId;
    /**
     * 被评论的文章或者页面的ID
     */
    private Long sid;
    /**
     * 评论人的ID
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 父级评论的id
     */
    private Long pid;
    /**
     * 评论的状态
     */
    private Integer status;
    /**
     * 评论时的ip
     */
    private String ip;
    /**
     * 经度
     */
    private String lng;
    /**
     * 纬度
     */
    private String lat;
    /**
     * 评论时的地址
     */
    private String address;
    /**
     * 评论的内容
     */
    private String content;
    /**
     * 备注（审核不通过时添加）
     */
    private String remark;
    /**
     * 支持（赞）
     */
    private Integer support;
    /**
     * 反对（踩）
     */
    private Integer oppose;
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
        return this.commentId;
    }

}
