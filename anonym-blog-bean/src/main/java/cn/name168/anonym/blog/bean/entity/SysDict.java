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
 * 数据字典表
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Data
@TableName("sys_dict")
public class SysDict extends Model<SysDict> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 字典名称
     */
    private String name;
    /**
     * 字典类型
     */
    private String type;
    /**
     * 字典码
     */
    private String code;
    /**
     * 字典值
     */
    private String value;
    /**
     * 排序
     */
    @TableField("order_num")
    private Integer orderNum;
    /**
     * 备注
     */
    private String remark;
    /**
     * 删除标记  -1：已删除  0：正常
     */
    @TableField("del_flag")
    private Integer delFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
