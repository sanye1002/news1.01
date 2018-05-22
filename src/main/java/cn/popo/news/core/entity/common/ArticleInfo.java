package cn.popo.news.core.entity.common;


import cn.popo.news.core.utils.KeyUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: popo
 * @computer：Administrator
 * @create 2018-05-18 下午 2:47
 * @Description description
 */
@Data
@Entity
@Table(name = "article_info")
public class ArticleInfo implements Serializable{

    @Id
    private String id;
    /**
     * 标题
     */
    private String title;
    /**
     * 封面图
     */
    private String imgs;

    /**
     * 类型 1-图文 2-多图文 3-文字 4-视频
     */
    private Integer type;

    /**
     * 类型为4 视频
     */
    private String video;

    /**
     * 视频封面图
     */
    private String videoCover;

    /**
     * 文章类容
     */
    private String content;

    /**
     * 类别
     */
    private String categoryId;

    /**
     * 列别名称 头条   科技   娱乐  游戏   搞笑  文史   视频
     */
    private String categoryName;

    /**
     * 用户id
     */
    private String uid;

    /**
     * 人气
     */
    private Integer lookNumber;

    /**
     * 评论数
     */
    private Integer commentNumber;

    /**
     * 创建时间
     */
    private long createTime;
    /**
     * 更新时间
     */
    private long updateTime;


}
