package com.example.todoList_api.repository;

import java.util.List;

import javax.persistence.EntityManager;

import com.example.todoList_api.domain.QTodoBoard;
import com.example.todoList_api.domain.TodoBoard;
import com.querydsl.jpa.impl.JPAQueryFactory;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class TodoBoardRepositorySupportImpl extends QuerydslRepositorySupport implements TodoBoardRepositorySupport {

    private final JPAQueryFactory jpaQueryFactory;

    public TodoBoardRepositorySupportImpl(EntityManager entityManager) {
        super(TodoBoard.class);
        super.setEntityManager(entityManager);
        jpaQueryFactory = new JPAQueryFactory(entityManager);
    }

    @Override
    public List<TodoBoard> todoBoardList() {

        final QTodoBoard todoBoard = QTodoBoard.todoBoard;

        return jpaQueryFactory.select(todoBoard)
                .from(todoBoard)
                .fetch();
    }

}
