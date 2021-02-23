package com.example.demo.service.vue;

import com.example.demo.entity.vue.VueBoard;
import com.example.demo.repository.vue.VueBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueBoardServiceImpl implements VueBoardService {
    @Autowired
    private VueBoardRepository vBoardRepo;

    @Override
    public void register(VueBoard board) throws Exception {
        vBoardRepo.create(board);
    }

    @Override
    public VueBoard read(Long boardNo) throws Exception {
        return vBoardRepo.read(boardNo);
    }

    @Override
    public void modify(VueBoard board) throws Exception {
        vBoardRepo.update(board);
    }

    @Override
    public void remove(Long boardNo) throws Exception {
        vBoardRepo.delete(boardNo);
    }

    @Override
    public List<VueBoard> list() throws Exception {
        return vBoardRepo.list();
    }
}
