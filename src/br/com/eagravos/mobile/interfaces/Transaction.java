/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.eagravos.mobile.interfaces;

/**
 *
 * @author barbosa
 */
public interface Transaction {

	public void execute() throws Exception;
	
	public void atualizarView();
}
