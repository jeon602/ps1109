//package com.example.ps1109.Service;
//
//import com.example.ps1109.Domain.Board;
//import com.example.ps1109.Mapper.MP;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class BS {
//
//    private final MP mapper;
//
//    public boolean save(Board board) {
//        return mapper.insert(board) == 1;
//    }
//
//    public boolean validate(Board board) {
//        if (board == null) {
//            return false;
//        }
//
//        if (board.getArtist() == null || board.getArtist().isBlank()) {
//            return false;
//        }
//
//        if (board.getTitle() == null || board.getTitle().isBlank()) {
//            return false;
//        }
//
//        if (board.getReleaseDate() == null || board.getReleaseDate().isBlank()) {
//            return false;
//        }
//        if (board.getProduction() == null || board.getProduction().isBlank()) {
//            return false;
//        }
//        if (board.getCost() == null || board.getCost().toString().isEmpty()) {
//            return false;
//        }
//
//        return true;
//    }
//
//    public List<Board> list() {
//        return mapper.selectAll();
//    }
//
//    public Board get(String) {
//        return mapper.selectByArtist(id);
//    }
//
//    public boolean remove(String Artist) {
//        return mapper.deleteById(Artist) == 1;
//    }
//}
