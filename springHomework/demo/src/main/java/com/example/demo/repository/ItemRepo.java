package com.example.demo.repository;

import com.example.demo.entity.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ItemRepo {
    static final Logger log =
            LoggerFactory.getLogger(ItemRepo.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 8. insert는 데이터를 입력함
// insert는 데이터를 입력함
// board는 create table로 만든 내용
// board에 있는 title, content, writer에
// 특정값 3 개를 삽입하기 위해 ?, ?, ?를 셋팅한 상태
    public void create(Item item) throws Exception {
        log.info("Repository create()");
        String query = "insert into Item(" +
                "id, name, price, ex) values(?, ?, ?, ?)";
        // 아래 getter를 이용해서 ? 부분들의 값을 채운다.
        // 즉 물음표가 2개면 getter도 2개를 사용하면 된다.
        jdbcTemplate.update(query, item.getId(),
                item.getName(), item.getPrice(), item.getEx());
    }

    public List<Item> list() throws Exception {
        log.info("Repository list()");
        // select는 값을 선택해오는 녀석이고
        // board, title ... 등등은 board에 있는 정보들
        // 조건을 줄 때 where를 사용한다.
        // board_no가 0 보다 크다는 조건을 가지고 있음
        // order by는 정렬 조건에 해당한다.
        // board_no, reg_date에 대해 정렬 조건을 줬음
        List<Item> results = jdbcTemplate.query(
                "select Item_no, name, price, ex from Item " +
                        "where Item_no > 0 order by " +
                        "item_no desc",
                //9. RowMapper board에 대한 행값을 뽑아옴
                // 메모리 할당 위해 new
                // 타이틀 값을 읽어와서 데이터
                // 세팅이 다 되었으면 세팅하세요 -> 모든 정보는 result에
                // 리턴한 보드로
                // 서비스 리스트에 db다 가져오게 됨
                new RowMapper<Item>() {
                    @Override
                    public Item mapRow(ResultSet rs, int rowNum)
                            throws SQLException {
                        Item item = new Item();
                        item.setItemNo(rs.getInt("Item_no"));
                        item.setName(rs.getString("name"));
                        item.setPrice(rs.getInt("price"));
                        item.setEx(rs.getString("ex"));
                        return item;
                    }
                });
        return results;
    }

}