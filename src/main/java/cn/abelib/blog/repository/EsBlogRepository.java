package cn.abelib.blog.repository;

import cn.abelib.blog.domain.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by abel on 2018/1/17.
 * Blog的es的资源库接口
 */
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog, String>{
    Page<EsBlog> findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContainingOrTagsContaining(String title, String summary, String content, String tags, Pageable pageable);

    EsBlog findEsBlogByBlogId(Long blogId);
}