package com.cakehonolulu.researchers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cakehonolulu.researchers.dto.Piece;
import com.cakehonolulu.researchers.service.PieceSvcImpl;


@RestController
@RequestMapping("/api")
public class PieceController {
	
	@Autowired
	PieceSvcImpl pieceServiceImpl;
	
	@GetMapping("/pieces")
	public List<Piece> getAllPieces(){
		return pieceServiceImpl.listAllPieces();
	}
	
	@PostMapping("/pieces")
	public Piece savePiece(@RequestBody Piece p) {
		return pieceServiceImpl.savePiece(p);
	}
	
	@GetMapping("/pieces/{id}")
	public Piece getPieceById(@PathVariable(name="id")Long id) {
		return pieceServiceImpl.pieceById(id);
	}
	
	@PutMapping("/pieces/{id}")
	public Piece updatePiece(@PathVariable(name="id")Long id, @RequestBody Piece p) {
		Piece selectedPiece;
		Piece updatedPiece;
		
		selectedPiece = pieceServiceImpl.pieceById(id);
		
		selectedPiece.setName(p.getName());
		selectedPiece.setSupplies(p.getSupplies());
		
		updatedPiece = pieceServiceImpl.savePiece(selectedPiece);
		
		return updatedPiece;
	}
	
	@DeleteMapping("/pieces/{id}")
	public void deletePiece(@PathVariable(name="id")Long id) {
		pieceServiceImpl.deletePiece(id);
	}
}
