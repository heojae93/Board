package jae.Board.post;


import jae.Board.board.Board;
import jae.Board.comment.Comment;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Post {

    private String title;

    private String content;

    private List<Comment> comments;

    private Board board;

    private int viewCount;

    private int recommendationCount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;



}
