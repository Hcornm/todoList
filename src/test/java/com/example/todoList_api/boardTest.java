package com.example.todoList_api;

import java.util.List;

import javax.transaction.Transactional;

import com.example.todoList_api.domain.TodoBoard;
import com.example.todoList_api.repository.TodoBoardRepositorySupport;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class boardTest {

    @Autowired
    private TodoBoardRepositorySupport todoBoardRepositorySupport;

    @Test
    @DisplayName("테스트")
    void getBoardList() {

        final List<TodoBoard> todoBoard = todoBoardRepositorySupport.todoBoardList();

        System.out.println("todoBoard : " + todoBoard);

        System.out.println("todoBoard : " + todoBoard.get(0).getTitle());

    }
}
