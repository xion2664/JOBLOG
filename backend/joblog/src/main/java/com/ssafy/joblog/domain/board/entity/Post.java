package com.ssafy.joblog.domain.board.entity;

import com.ssafy.joblog.domain.user.entity.User;
import com.ssafy.joblog.global.entity.BaseEntity;
import com.ssafy.joblog.global.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.xml.stream.events.Comment;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.*;

@Entity
@Getter
@Setter
public class Post extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private int id;

    //연관관계 주인(=외래키 갖고있음)
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private PostCategory category; //게시판 종류 [WORKER, APPLICANT, QNA]

    private String title;
    private String content;

    @ColumnDefault("0")
    private int hit;

    //cascade를 하면 post만 persist하면됨
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<PostLike> postLikes = new ArrayList<>();

    //cascade를 하면 post만 persist하면됨
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<PostComment> comments = new ArrayList<>();

}
