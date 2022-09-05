package com.cakehonolulu.researchers.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakehonolulu.researchers.dto.Piece;

public interface PieceDAO extends JpaRepository<Piece, Long>{

}
