package com.revature.model;

import javax.persistence.*;

@Entity(name = "BOARD_USER_JOIN")
public class BoardUserJoin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int boardId;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private ScrumUser scrumUser;

    public BoardUserJoin() {}

    public BoardUserJoin(int boardId, ScrumUser scrumUser) {
        this.boardId = boardId;
        this.scrumUser = scrumUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public ScrumUser getScrumUser() {
        return scrumUser;
    }

    public void setScrumUser(ScrumUser scrumUser) {
        this.scrumUser = scrumUser;
    }
}
