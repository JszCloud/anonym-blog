package cn.name168.anonym.blog.service.service.impl;
import cn.name168.anonym.blog.bean.entity.BlogComment;
import cn.name168.anonym.blog.service.mapper.BlogCommentMapper;
import cn.name168.anonym.blog.service.service.IBlogCommentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章评论 服务实现类
 * </p>
 *
 * @author Mr.Li   ℗Hide-Community
 * @since 2018-05-19
 */
@Service
public class BlogCommentServiceImpl implements IBlogCommentService {
    /**
     * 添加
     *
     * @param blogComment
     * @return
     */
    @Override
    public Integer save(BlogComment blogComment) {
        return null;
    }

    /**
     * 删除
     *
     * @param blogComment
     * @return
     */
    @Override
    public Integer romove(BlogComment blogComment) {
        return null;
    }

    /**
     * 修改
     *
     * @param blogComment
     * @return
     */
    @Override
    public Integer edit(BlogComment blogComment) {
        return null;
    }
}
