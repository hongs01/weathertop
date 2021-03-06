package xyz.wongs.weathertop.akkad.webmagic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.wongs.weathertop.base.persistence.mybatis.entity.BaseEntity;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmsContent extends BaseEntity<Long> {

    private Long id;

    private String title;

    private Date releaseDate;

    private String content;

}