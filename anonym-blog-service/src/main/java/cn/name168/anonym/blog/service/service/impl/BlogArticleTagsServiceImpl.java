package cn.name168.anonym.blog.service.service.impl;

import cn.name168.anonym.blog.bean.entity.BlogArticleTags;
import cn.name168.anonym.blog.service.mapper.BlogArticleTagsMapper;
import cn.name168.anonym.blog.service.service.IBlogArticleTagsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章与标签关联 服务实现类
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Service
public class BlogArticleTagsServiceImpl  implements IBlogArticleTagsService {
    /**
     * 添加
     *
     * @param blogArticleTags
     * @return
     */
    @Override
    public Integer save(BlogArticleTags blogArticleTags) {
        return null;
    }

    /**
     * 删除
     *
     * @param blogArticleTags
     * @return
     */
    @Override
    public Integer romove(BlogArticleTags blogArticleTags) {
        return null;
    }

    /**
     * 修改
     *
     * @param blogArticleTags
     * @return
     */
    @Override
    public Integer edit(BlogArticleTags blogArticleTags) {
        return null;
    }
}
