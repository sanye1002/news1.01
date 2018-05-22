package cn.popo.news.core.entity.common;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author: popo
 * @computer：Administrator
 * @create 2018-05-18 下午 2:54
 * @Description description
 */
@Data
@Entity
@Table(name = "category_info")
public class CategoryInfo {

    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 列别名称 头条   科技   娱乐  游戏   搞笑  文史   视频
     */
    private String categoryName;
    /**
     * 创建时间
     */
    private long createTime;
    /**
     * 更新时间
     */
    private long updateTime;
}
