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
 * 公告管理
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Data
@TableName("sys_notice")
public class SysNotice extends Model<SysNotice> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "notice_id", type = IdType.AUTO)
    private Long noticeId;
    /**
     * 被通知的用户ID
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 通知状态 0:失败1:成功
     */
    private Integer status;
    /**
     * 通知的标题
     */
    private String title;
    /**
     * 通知的内容
     */
    private String content;
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
        return this.noticeId;
    }

}
