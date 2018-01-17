package cn.javacodes.blogwaver.core.annotation.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * com.jd.ump.screen.util
 *
 * @author huzhanfei
 * @since 17-9-28
 */
public class ChooseDataSource extends AbstractRoutingDataSource {
    /**
     * 获取与数据源相关的key
     * 此key是Map<String,DataSource> resolvedDataSources 中与数据源绑定的key值
     * 在通过determineTargetDataSource获取目标数据源时使用
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return HandleDataSource.getDataSource();
    }

}
