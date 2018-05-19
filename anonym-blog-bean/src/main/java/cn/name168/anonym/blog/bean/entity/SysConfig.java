package cn.name168.anonym.blog.bean.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 系统配置信息表
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Data
@TableName("sys_config")
public class SysConfig extends Model<SysConfig> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * key
     */
    @TableField("param_key")
    private String paramKey;
    /**
     * value
     */
    @TableField("param_value")
    private String paramValue;
    /**
     * 状态   0：隐藏   1：显示
     */
    private Integer status;
    /**
     * 备注
     */
    private String remark;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
