package cn.javacodes.blogwaver.core.repository;


import cn.javacodes.blogwaver.core.annotation.mybatis.MybatisMapper;
import cn.javacodes.blogwaver.core.model.Media;
import org.springframework.stereotype.Repository;

/**
 * blogwaver
 * cn.javacodes.blogwaver.core.repository
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/01/20
 */
@Repository
public interface MediaRepository {

    int deleteByPrimaryKey(Long id);

    int insert(Media record);

    int insertSelective(Media record);

    Media selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Media record);

    int updateByPrimaryKey(Media record);
}