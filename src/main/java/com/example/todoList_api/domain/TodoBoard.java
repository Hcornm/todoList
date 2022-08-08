package com.example.todoList_api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TodoBoard {

    @Id
    @GeneratedValue
    @Column
    private Long boardId;

    @Column
    private String title;

    /**
     * 생성자
     * 
     * @param boardId
     * @param title
     */
    public TodoBoard(Long boardId, String title) {
        this.boardId = boardId;
        this.title = title;
    }

}