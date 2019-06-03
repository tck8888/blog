package com.tck.blog.po;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Description:
 *
 * @author:tck
 * @date:2019/6/3
 **/
@Entity
@Table(name = "t_tag")
@Data
public class Tag {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs = new ArrayList<>();
}
