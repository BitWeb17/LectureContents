package com.example.board.repository;

import com.example.board.entity.VueBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class VueBoardRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(VueBoard board) throws Exception {
        String query = "insert into board (title, content, writer) values (?, ?, ?)";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(
            new PreparedStatementCreator() {
                @Override
                public PreparedStatement createPreparedStatement(Connection con)
                        throws SQLException {
                    PreparedStatement ps = con.prepareStatement(query, new String[] {"boardNo"});
                    ps.setString(1, board.getTitle());
                    ps.setString(2, board.getContent());
                    ps.setString(3, board.getWriter());
                    return ps;
                }
            }, keyHolder);

        board.setBoardNo(keyHolder.getKey().longValue());
    }

    public VueBoard read(Long boardNo) throws Exception {
        List<VueBoard> results = jdbcTemplate.query(
            "select board_no, title, content, writer, reg_date " +
                    "from board where board_no = ?",
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

                    System.out.println("VueBoardRepository: " + board);

                    return board;
                }
            }, boardNo
        );

        return results.isEmpty() ? null : results.get(0);
    }

    public void update(VueBoard board) throws Exception {
        String query = "update board set title = ?, content = ? " +
                "where board_no = ?";
        jdbcTemplate.update(query, board.getTitle(),
                board.getContent(), board.getBoardNo());
    }

    public void delete(Long boardNo) throws Exception {
        String query = "delete from board where board_no = ?";
        jdbcTemplate.update(query, boardNo);
    }

    public List<VueBoard> list() throws Exception {
        List<VueBoard> results = jdbcTemplate.query(
                "select board_no, title, content, writer, reg_date from board " +
                        "where board_no > 0 order by board_no desc, reg_date desc",
                new RowMapper<VueBoard>() {
                    @Override
                    public VueBoard mapRow(ResultSet rs, int rowNum) throws SQLException {
                        VueBoard board = new VueBoard();

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
