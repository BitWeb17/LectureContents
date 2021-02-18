package com.example.demo.repository;

import com.example.demo.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Board> list() throws Exception {
        List<Board> results = jdbcTemplate.query(
            "select board_no, title, content, writer, " +
                    "reg_date from board where board_no > 0 " +
                    "order by board_no desc, reg_date desc",

            new RowMapper<Board>() {
                @Override
                public Board mapRow(ResultSet rs, int rowNum)
                        throws SQLException {

                    Board board = new Board();
                    board.setBoardNo(rs.getInt("board_no"));
                    board.setTitle(rs.getString("title"));
                    board.setContent(rs.getString("content"));
                    board.setWriter(rs.getString("writer"));
                    board.setRegDate(rs.getDate("reg_date"));

                    return board;
                }
            }
        );

        return results;
    }
}
