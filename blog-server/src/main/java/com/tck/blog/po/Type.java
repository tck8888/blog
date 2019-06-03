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
@Table(name = "t_type")
@Data
public class Type {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "type")
    private List<Blog> blogs = new ArrayList<>();
}
