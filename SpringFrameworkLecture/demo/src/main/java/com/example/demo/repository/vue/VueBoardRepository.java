package com.example.demo.repository.vue;

import com.example.demo.entity.vue.VueBoard;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Log
@Repository
public class VueBoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(VueBoard board) throws Exception {
        log.info("VueBoardRepo create()");

        String query = "insert into board(" +
                "title, content, writer) values(?, ?, ?)";

        jdbcTemplate.update(query, board.getTitle(),
                board.getContent(), board.getWriter());
    }

    public List<VueBoard> list() throws Exception {
        log.info("VueBoardRepo list()");

        List<VueBoard> results = jdbcTemplate.query(
            "select board_no, title, content, " +
                    "writer, reg_date from board " +
                    "where board_no > 0 order by " +
                    "board_no desc, reg_date desc",
            new RowMapper<VueBoard>() {
                @Override
                public VueBoard mapRow(ResultSet rs, int rowNum)
                        throws SQLException {

                    VueBoard board = new VueBoard();
                    board.setBoardNo(rs.getInt("board_no"));
                    board.setTitle(rs.getString("title"));
                    board.setContent(rs.getString("content"));
                    board.setWriter(rs.getString("writer"));
                    board.setRegDate(rs.getDate("reg_date"));

                    return board;
                }
            });

        return results;
    }

    public VueBoard read(Long boardNo) throws Exception {
        log.info("VueBoardRepo read()");

        List<VueBoard> results = jdbcTemplate.query(
                "select board_no, title, content, " +
                        "writer, reg_date from board " +
                        "where board_no = ?",
                new RowMapper<VueBoard>() {
                    @Override
                    public VueBoard mapRow(ResultSet rs, int rowNum)
                            throws SQLException {

                        VueBoard board = new VueBoard();
                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));
                        board.setRegDate(rs.getDate("reg_date"));

                        return board;
                    }
                }, boardNo);

        return results.isEmpty() ? null : results.get(0);
    }

    public void delete(Long boardNo) throws Exception {
        String query = "delete from board where board_no = ?";
        jdbcTemplate.update(query, boardNo);
    }

    public void update(VueBoard board) throws Exception {
        String query = "update board set title = ?, content = ? " +
                "where board_no = ?";

        jdbcTemplate.update(query, board.getTitle(),
                board.getContent(), board.getBoardNo());
    }
}
