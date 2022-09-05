package com.cakehonolulu.researchers.service;

import java.util.List;

import com.cakehonolulu.researchers.dto.Piece;

public interface PieceService {
	
	/**
	 * Lists all the Piece
	 * @return
	 */
	public List<Piece> listAllPieces();
	
	/**
	 * Saves an Piece
	 * @param p
	 * @return
	 */
	public Piece savePiece(Piece p);
	
	/**
	 * Gets the Box by ID
	 * @param id
	 * @return
	 */
	public Piece pieceById(Long id);
	
	/**
	 * Updates the Piece
	 * @param p
	 * @return
	 */
	public Piece updatePiece(Piece p);
	
	/**
	 * Deletes the Piece
	 * @param id
	 */
	public void deletePiece(Long id);

}
