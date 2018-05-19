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
 * 文章分类
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Data
@TableName("blog_type")
public class BlogType extends Model<BlogType> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "type_id", type = IdType.AUTO)
    private Long typeId;
    /**
     * 文章类型名
     */
    @TableField("type_name")
    private String typeName;
    /**
     * 类型介绍
     */
    private String description;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 图标
     */
    private String icon;
    /**
     * 是否可用0:否 1:是
     */
    private Integer available;
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
        return this.typeId;
    }

}
