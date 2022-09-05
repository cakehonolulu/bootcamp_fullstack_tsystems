package com.cakehonolulu.researchers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakehonolulu.researchers.dao.PieceDAO;
import com.cakehonolulu.researchers.dto.Piece;

@Service
public class PieceSvcImpl implements PieceService{

	@Autowired
	PieceDAO iPieceDAO;

	@Override
	public List<Piece> listAllPieces() {
		
		return iPieceDAO.findAll();
	}

	@Override
	public Piece savePiece(Piece p) {
		
		return iPieceDAO.save(p);
	}

	@Override
	public Piece pieceById(Long id) {
		
		return iPieceDAO.findById(id).get();
	}

	@Override
	public Piece updatePiece(Piece p) {

		return iPieceDAO.save(p);
	}

	@Override
	public void deletePiece(Long id) {
		iPieceDAO.deleteById(id);
	}
	
	
}
