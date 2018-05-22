package cn.name168.anonym.blog.service.service;

import cn.name168.anonym.blog.bean.entity.SysRole;

/**
 * Created by Nominal on 2018/5/19 0019.
 * 微博：@Mr丶Li_Anonym
 */
public interface BaseService<T> {

    /**
     * 添加
     * @param t
     * @return
     */
    Integer save(T t);

    /**
     * 删除
     * @param t
     * @return
     */
    Integer romove(T t);

    /**
     * 修改
     * @param t
     * @return
     */
    Integer edit(T t);


}
