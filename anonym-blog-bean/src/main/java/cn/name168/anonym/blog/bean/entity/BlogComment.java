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
 * 文章评论
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
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


    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    public Integer getOppose() {
        return oppose;
    }

    public void setOppose(Integer oppose) {
        this.oppose = oppose;
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
        return this.commentId;
    }

    @Override
    public String toString() {
        return "BlogComment{" +
        ", commentId=" + commentId +
        ", sid=" + sid +
        ", userId=" + userId +
        ", pid=" + pid +
        ", status=" + status +
        ", ip=" + ip +
        ", lng=" + lng +
        ", lat=" + lat +
        ", address=" + address +
        ", content=" + content +
        ", remark=" + remark +
        ", support=" + support +
        ", oppose=" + oppose +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
